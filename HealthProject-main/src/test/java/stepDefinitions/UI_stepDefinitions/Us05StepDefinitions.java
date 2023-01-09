package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Us05StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @Given("Kullanici Medunna sayfasina gider AG")
    public void kullaniciMedunnaSayfasinaGiderAG() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici Make an Appointment butonuna tiklar AG")
    public void kullaniciMakeAnAppointmentButonunaTiklarAG() {
        medunnaPage.agMakeAnAppointment.click();
    }

    @Then("Kullanici First Name textboxina ismini girer AG")
    public void kullaniciFirstNameTextboxinaIsminiGirerAG() {
        medunnaPage.agFirstName.sendKeys("Ceyda");
    }

    @Then("Kullanici Last Name textboxina soyismini girer AG")
    public void kullaniciLastNameTextboxinaSoyisminiGirerAG() {
        medunnaPage.agLastName.sendKeys("Gürbüz");
    }

    @Then("Kullanici SSN textboxina kayitli SSN i girer AG")
    public void kullaniciSSNTextboxinaKayitliSSNIGirerAG() {
        medunnaPage.agSsn.sendKeys("277-57-1524");
    }

    @Then("Kullanici Email textboxina Email adresini girer AG")
    public void kullaniciEmailTextboxinaEmailAdresiniGirerAG() {
        medunnaPage.agEmail.sendKeys("medunnaproje12@gmail.com");
    }

    @Then("Kullanici  ucuncu ve altinci rakamdan sonra tire isareti olan on rakamli tel no sunu girer AG")
    public void kullaniciUcuncuVeAltinciRakamdanSonraTireIsaretiOlanOnRakamliTelNoSunuGirerAG() {
        medunnaPage.agPhone.sendKeys("541-617-7171");
    }
    @Then("Kullanici gecerli kullanıcı bilgilerini girdigini dogrular AG")
    public void kullaniciGecerliKullanıcıBilgileriniGirdiginiDogrularAG() {
        assert medunnaPage.agRegisterForm.isDisplayed();
    }

    @And("Kullanici sayfayi kapatir AG")
    public void kullaniciSayfayiKapatirAG() {
        Driver.closeDriver();
    }

    @And("Kullanici First Name alanini bos birakir AG")
    public void kullaniciFirstNameAlaniniBosBirakirAG() {
        medunnaPage.agFirstName.sendKeys(" ");
        medunnaPage.agFirstName.sendKeys(Keys.TAB);
    }

    @And("Kullanici Your FirstName is required. uyarisi aldigini dogrular AG")
    public void kullaniciYourFirstNameIsRequiredUyarisiAldiginiDogrularAG() {
        assert medunnaPage.agFirstNameRequired.isDisplayed();
        ReusableMethods.waitFor(2);

    }

    @And("Kullanici Last Name alanini bos birakir AG")
    public void kullaniciLastNameAlaniniBosBirakirAG() {
        medunnaPage.agLastName.sendKeys(" ");
        medunnaPage.agLastName.sendKeys(Keys.TAB);
    }

    @And("Kullanici Last NAme is required. uyarisi aldigini dogrular AG")
    public void kullaniciLastNAmeIsRequiredUyarisiAldiginiDogrularAG() {
        assert medunnaPage.agLastNameRequired.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici SSN alanini bos birakir AG")
    public void kullaniciSSNAlaniniBosBirakirAG() {
        medunnaPage.agSsn.sendKeys(" ");
        medunnaPage.agSsn.sendKeys(Keys.TAB);
    }

    @And("Kullanici SSN is required. uyarisi aldigini dogrular AG")
    public void kullaniciSSNIsRequiredUyarisiAldiginiDogrularAG() {
        assert medunnaPage.agSsnRequired.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici Email alanini bos birakir AG")
    public void kullaniciEmailAlaniniBosBirakirAG() {
        medunnaPage.agEmail.sendKeys(" ");
        medunnaPage.agEmail.sendKeys(Keys.TAB);
    }

    @And("Kullanici Email is required. uyarisi aldigini dogrular AG")
    public void kullaniciEmailIsRequiredUyarisiAldiginiDogrularAG() {
        assert medunnaPage.agEmailRequired.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici phone alanini bos birakir AG")
    public void kullaniciPhoneAlaniniBosBirakirAG() {
        medunnaPage.agPhone.sendKeys(" ");
        medunnaPage.agPhone.sendKeys(Keys.TAB);
    }

    @And("Kullanici phone is required. uyarisi aldigini dogrular AG")
    public void kullaniciPhoneIsRequiredUyarisiAldiginiDogrularAG() {
        assert medunnaPage.agPhoneRequired.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici Send An Appointment Request butonuna tiklar AG")
    public void kullaniciSendAnAppointmentRequestButonunaTiklarAG() {
        ReusableMethods.jsclick(medunnaPage.agSendAnAppointmentRequest);

    }

    @Then("Kullanici basarili bir sekilde randevu olusturdugunu gorur AG")
    public void kullaniciBasariliBirSekildeRandevuOlusturdugunuGorurAG() {
        medunnaPage.agBasariliYazisi.isDisplayed();
    }

    @Then("Kullanici ana sayfada user ikonuna tiklar AG")
    public void kullaniciAnaSayfadaUserIkonunaTiklarAG() {
        medunnaPage.agUserIconu.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SignIn giris butonuna tiklar AG")
    public void kullaniciSignInGirisButonunaTiklarAG() {
        medunnaPage.agIlkSignIn.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Username textboxina kullanici ismini girer AG")
    public void kullaniciUsernameTextboxinaKullaniciIsminiGirerAG() {
        medunnaPage.agUsername.sendKeys("CeydaGrbz");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password textboxina sifresini girer AG")
    public void kullaniciPasswordTextboxinaSifresiniGirerAG() {
        medunnaPage.agPassword.sendKeys("2775724a");
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanici SignIn butonuna tiklar AG")
    public void kullaniciSignInButonunaTiklarAG() {
        medunnaPage.agSignInButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici anasayfada profilinin gorunurlugunu dugrular AG")
    public void kullaniciAnasayfadaProfilininGorunurlugunuDugrularAG() {
        assert medunnaPage.agProfilSekmesi.isDisplayed();
    }

    @Then("Kullanici MY PAGES\\(PATIENT) butonuna tiklar AG")
    public void kullaniciMYPAGESPATIENTButonunaTiklarAG() {
        medunnaPage.agMyPagesButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici My Appointments butonuna tiklar AG")
    public void kullaniciMyAppointmentsButonunaTiklarAG() {
        medunnaPage.agMyAppointmentsButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanici aldigi randevuyu profil sayfasinda gorur AG")
    public void kullaniciAldigiRandevuyuProfilSayfasindaGorurAG() {
        medunnaPage.agMyAppointmentsPage.isDisplayed();
        ReusableMethods.waitFor(5);

    }



}
