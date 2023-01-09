package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us10StepDefinitions {
    MedunnaPage doctorPage=new MedunnaPage();

    @Given("US10 Doktor url gider")
    public void doktorUrlGider(){
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("US10 Doktor Kisi ikonuna  tiklar")
    public void doktorKisiIkonunaTiklar() {
        ReusableMethods.waitForVisibility(doctorPage.PhysiciankisiIconu,20);
        doctorPage.PhysiciankisiIconu.click();
    }

    @And("US10 Doktor sigin buttonuna tiklar")
    public void doktorSiginButtonunaTiklar() throws InterruptedException {
        ReusableMethods.waitForVisibility(doctorPage.PhysiciansignIn,20);
        doctorPage.PhysiciansignIn.click();


    }

    @When("US10 Doktor rolu ile gecerli username {string} girer")
    public void doktorRoluIleGecerliUsernameGirer(String userName) {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianuserName,20);
        doctorPage.PhysicianuserName.sendKeys(userName);

    }

    @And("US10 Doktor rolu ile gecerli password {string} girer")
    public void doktorRoluIleGecerliPasswordGirer(String password) {
        ReusableMethods.waitForVisibility(doctorPage.Physicianpassword,20);
        doctorPage.Physicianpassword.sendKeys(password);
    }

    @And("US10 Doktor Sign 'i tiklar")
    public void doktorSignITıklar() {
        ReusableMethods.waitForVisibility(doctorPage.PhysiciansignInButton,20);
        doctorPage.PhysiciansignInButton.click();
    }

    @And("US10 My Pages buttonuna tiklar")
    public void myPagesButtonunaTiklar() {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyPages,20);
       doctorPage.PhysicianMyPages.click();
    }

    @And("US10 My Appointment buttonuna tiklar")
    public void myAppointmentButtonunaTiklar() {
        ReusableMethods.waitForVisibility( doctorPage.PhysicianMyAppointments,20);
        doctorPage.PhysicianMyAppointments.click();

    }

    @Given("US10 Zaman araligini gorur")
    public void zamanAraliginiGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsFrom.isDisplayed());
        Assert.assertTrue(doctorPage.PhysicianMyAppointmentsTo.isDisplayed());

    }
    @Then("US10 Doktor randevu tarihini onbes gun aralikla belirler")
    public void doktorRandevuTarihiniOnbesGunAraliklaBelirler(){
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsFrom,20);
        WebElement date = doctorPage.PhysicianMyAppointmentsFrom;
        String day = "09";
        String month = "/11";
        String year = "/2022";
        date.sendKeys(day);
        date.sendKeys(month);
        date.sendKeys(year);

        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsTo,10);
        WebElement dateTo =doctorPage.PhysicianMyAppointmentsTo;
        String dayTo = "20";
        String monthTo = "/11";
        String yearTo = "/2022";
        dateTo.sendKeys(dayTo);
        dateTo.sendKeys(monthTo);
        dateTo.sendKeys(yearTo);

    }


    @Then("US10 Randevu takvimini gorur")
    public void randevuTakviminiGorur() {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsFrom,20);
     Assert.assertTrue(doctorPage.PhysicianMyAppointmentsId.isDisplayed());
    }
    @Then("US10 Doktor Sayfayi kapatir")
    public void doktorSayfayiKapatir()  {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

    @Then("US10 Doktor uzerine kayitli olan randevularin detaylarini gorebilir")
    public void doktorUzerineKayitliOlanRandevularinDetaylariniGorebilir() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsId,10);
      Assert.assertTrue(doctorPage.PhysicianMyAppointmentsId.isDisplayed());
      Assert.assertTrue(doctorPage.PhysicianMyAppointmentsEndDateTime.isDisplayed());
      Assert.assertTrue(doctorPage.PhysicianMyAppointmentsStartDateTime.isDisplayed());
      Assert.assertTrue(doctorPage.PhysicianMyAppointmentsStatus.isDisplayed());
    }

    @Then("US10 Doktor randevu olmayan bir aralik girer")
    public void doktorRandevuOlmayanBirAralikGirer() {
        //doctorPage.PhysicianMyAppointmentsFrom.sendKeys("13.01.2023");
        //doctorPage.PhysicianMyAppointmentsTo.sendKeys("15.01.2023");
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsFrom,20);
        WebElement date = doctorPage.PhysicianMyAppointmentsFrom;
        String day = "13";
        String month = "/01";
        String year = "/2023";
        date.sendKeys(day);
        date.sendKeys(month);
        date.sendKeys(year);
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsTo,10);
        WebElement dateTo =doctorPage.PhysicianMyAppointmentsTo;
        String dayTo = "15";
        String monthTo = "/01";
        String yearTo = "/2023";
        dateTo.sendKeys(dayTo);
        dateTo.sendKeys(monthTo);
        dateTo.sendKeys(yearTo);
    }

    @Then("US10 Doktor secilen aralikta randevu yoksa {string} uyarisini gorur")
    public void doktorSecilenAraliktaRandevuYoksaUyarisiniGorur(String mesaj) {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianRandevuUyariMesaji,20);
     Assert.assertEquals(mesaj,doctorPage.PhysicianRandevuUyariMesaji.getText());
    }

    @Then("US10 Doktor Zaman araligini onbes gunden fazla secer")
    public void doktorZamanAraliginiOnbesGundenFazlaSecer() {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsFrom,20);
        WebElement date = doctorPage.PhysicianMyAppointmentsFrom;
        String day = "09";
        String month = "/12";
        String year = "/2022";
        date.sendKeys(day);
        date.sendKeys(month);
        date.sendKeys(year);
        ReusableMethods.waitForVisibility(doctorPage.PhysicianMyAppointmentsTo,10);
        WebElement dateTo = doctorPage.PhysicianMyAppointmentsTo;
        String dayTo = "30";
        String monthTo = "/12";
        String yearTo = "/2022";
        dateTo.sendKeys(dayTo);
        dateTo.sendKeys(monthTo);
        dateTo.sendKeys(yearTo);
    }

    @Then("US10 Doktor uyari mesajini alir")
    public void doktorUyariMesajiniAlir() {
        ReusableMethods.waitForVisibility(doctorPage.PhysicianHataMesaji,10);
        Assert.assertTrue(doctorPage.PhysicianHataMesaji.isDisplayed());
    }
}
