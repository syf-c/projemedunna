package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us09StepDefinitions {
    MedunnaPage fatma = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();



    @Given("Belirtilen url'e gidilir FC.")
    public void belirtilenUrlEGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Giris icon'una tiklanir FC.")
    public void girisIconUnaTiklanir() {
        fatma.login.click();
        ReusableMethods.waitFor(1);
    }

    @And("Sign in'e tiklanir FC.")
    public void signInETiklanir() {
        fatma.logSignin9.click();
    }

    @And("Personel username girilir FC.")
    public void personelUsernameGirilir() {
        fatma.signinUsername9.sendKeys(ConfigReader.getProperty("staffUsername"));
    }

    @And("Personel password girilir FC.")
    public void personelPasswordGirilir() {
        fatma.signinPassword9.sendKeys(ConfigReader.getProperty("staffPassword"));
    }

    @And("Sign in butonuna tiklanir FC.")
    public void signInButonunaTiklanir() {
        fatma.signInButton9.click();
    }

    @And("My pages'a tiklanir FC.")
    public void myPagesATiklanir() {
        fatma.dropDownMyPages9.click();
    }

    @And("Search patient'e tiklanir FC.")
    public void searchPatientETiklanir() {
        fatma.dropDownMyPagesSearchPatient9.click();
    }

    @And("Patient ssn box'a ssn girilir FC.")
    public void patientSsnBoxASsnGirilir() {
        fatma.patientSSNBox9.sendKeys(ConfigReader.getProperty("hastaSSN"));
    }

    @And("View'e tiklanir FC.")
    public void viewETiklanir() {

        fatma.patientView9.click();

    }

    @Then("Hasta bilgilerinin goruldugu test edilir FC.")
    public void hastaBilgilerininGorulduguTestEdilir() {
        Assert.assertTrue(fatma.patientViewTrue9.isDisplayed());
    }

    @And("Edit butonuna tiklanir FC.")
    public void editButonunaTiklanir() {
        fatma.patientEdit9.click();
    }

    @And("firstname lastname birthdate email phone gender blood group address description user country and state city bilgileri duzenlenir FC.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgileriDuzenlenir() throws InterruptedException {

        fatma.patientEditFirstname9.clear();
       /* actions.click(medunnaPages.patientEditFirstname).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("25").sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
                .sendKeys("f").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .click().sendKeys("s").sendKeys(Keys.TAB).sendKeys("a")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();*/
        actions.click(fatma.patientEditFirstname9).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).perform();
        Thread.sleep(2000);
        fatma.patientEditEmail9.clear();
        fatma.patientEditEmail9.sendKeys(faker.internet().emailAddress());
        fatma.patientEditPhone9.clear();
        fatma.patientEditPhone9.sendKeys("2589631265");
        actions.sendKeys(Keys.TAB).
                sendKeys("F").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(15)).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

    @And("Save butonuna tiklanir FC.")
    public void saveButonunaTiklanir() throws InterruptedException {
        actions.click(fatma.patientEditSave9);
        Thread.sleep(2000);
    }

    @Then("firstname lastname birthdate email phone gender blood group address description user country and state city bilgilerin düzenlenebildigi test edilir FC.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgilerinDuzenlenebildigiTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(fatma.patientEditSaveBasarili9.isDisplayed());
    }

    @And("Ssn girilerek aranabildiği test edilir FC.")
    public void ssnGirilerekAranabildigiTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        fatma.patientSSNBox9.sendKeys(ConfigReader.getProperty("hastaSSN"));

    }


    @Then("Tum kayit bilgilerinin dolduruldugu test edilir FC.")
    public void tumKayitBilgilerininDoldurulduguTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(fatma.patientViewTrue9.isDisplayed());

    }

    @And("Sayfa kapatilir FC.")
    public void sayfaKapatilir() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
