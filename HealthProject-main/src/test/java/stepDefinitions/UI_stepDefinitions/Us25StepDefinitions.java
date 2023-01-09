package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Us25StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();

    public static String tarih_Uret(int gun) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, gun);
        String date = sdf.format(calendar.getTime());
        return date;
    }
    @Given("Kullanici Medunna sayfasina gider Ag")
    public void kullaniciMedunnaSayfasinaGiderAg() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici user ikonuna tiklar Ag")
    public void kullaniciUserIkonunaTiklarAg() {
        medunnaPage.agUserIconu.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici acilan dropdown da Sign In butonuna tiklar Ag")
    public void kullaniciAcilanDropdownDaSignInButonunaTiklarAg() {
        medunnaPage.agIlkSignIn.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Username textboxina ismini girer Ag")
    public void kullaniciUsernameTextboxinaIsminiGirerAg() {
        medunnaPage.agUsername.sendKeys("CeydaGrbz");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Paswword textboxina parolasini girer Ag")
    public void kullaniciPaswwordTextboxinaParolasiniGirerAg() {
        medunnaPage.agPassword.sendKeys("2775724a");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Sign In butonuna tiklar Ag")
    public void kullaniciSignInButonunaTiklarAg() {
        medunnaPage.agSignInButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici MY PAGES\\(PATIENT) butonuna tiklar Ag")
    public void kullaniciMYPAGESPATIENTButonunaTiklarAg() {
        medunnaPage.agMyPagesButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici acilan dropdown da Make an Appointment butonuna tiklar Ag")
    public void kullaniciAcilanDropdownDaMakeAnAppointmentButonunaTiklarAg() {
        medunnaPage.agMakeAppointmentDropDown.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici Phone textboxina telefon numarasini girer Ag")
    public void kullaniciPhoneTextboxinaTelefonNumarasiniGirerAg() {
        medunnaPage.agPhone.sendKeys("541-617-7171");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici guncel tarih ile randevu almak icin Send an Appointment Request butonuna tiklar Ag")
    public void kullaniciGuncelTarihIleRandevuAlmakIcinSendAnAppointmentRequestButonunaTiklarAg() {
        medunnaPage.agSendAnAppointmentRequest.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici kendi portalini kullanarak basarili bir sekilde randevu alabildigini dogrular Ag")
    public void kullaniciKendiPortaliniKullanarakBasariliBirSekildeRandevuAlabildiginiDogrularAg() {
        assert medunnaPage.agBasariliYazisi.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Appointment Date Time textboxına ileri bir tarih girer Ag")
    public void kullaniciAppointmentDateTimeTextboxınaIleriBirTarihGirerAg() {
        String ileriTarih = tarih_Uret(5);
        System.out.println("ileriTarih = " + ileriTarih);
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys(ileriTarih);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Send an Appointment Request butonuna tiklar Ag")
    public void kullaniciSendAnAppointmentRequestButonunaTiklarAg() {
        medunnaPage.agSendAnAppointmentRequest.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici kendi portalini kullanarakk basarili bir sekilde randevu alabildigini dogrular Ag")
    public void kullaniciKendiPortaliniKullanarakkBasariliBirSekildeRandevuAlabildiginiDogrularAg() {
        assert medunnaPage.agBasariliYazisi.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici sayfayi kapatir Ag")
    public void kullaniciSayfayiKapatirAg() { Driver.closeDriver();
    }

    @Then("Kullanici Appointment Date Time textboxına gecmis bir tarih girer Ag")
    public void kullaniciAppointmentDateTimeTextboxınaGecmisBirTarihGirerAg() {
        String gecmisTarih = tarih_Uret(-5);
        System.out.println("gecmisTarih = " + gecmisTarih);
        medunnaPage.agDateBox.clear();
        medunnaPage.agDateBox.sendKeys(gecmisTarih);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Appointment date can not be past date! yazısını görür Ag")
    public void kullaniciAppointmentDateCanNotBePastDateYazısınıGörürAg() {
        medunnaPage.agGirilemezUyarisi.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Send an Appointment Request butonuna tikladiginda basarili yazisini görmemeli Ag")
    public void kullaniciSendAnAppointmentRequestButonunaTikladigindaBasariliYazisiniGörmemeliAg() {
        medunnaPage.agSendAnAppointmentRequest.click();
        Assert.assertFalse(medunnaPage.agBasariliYazisi.isDisplayed());
        ReusableMethods.waitFor(3);
        // Geçmiş tarih girilmesine ve "Appointment date can not be past date!" uyarı verilmesine rağmen
        // "Send An Appointment Request" butonu tıklanabiliyor
        // ve ekranda "Appointment Registiration Saved!" yazısı görülüyor
    }
}
