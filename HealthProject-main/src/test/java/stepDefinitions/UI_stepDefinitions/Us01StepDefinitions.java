package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import groovy.util.logging.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us01StepDefinitions {
    MedunnaPage loginPage = new MedunnaPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici Medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici user icon simgesine tiklar")
    public void kullanici_user_icon_simgesine_tiklar() {
        loginPage.userIcon.click();
    }

    @Then("Kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        loginPage.RegisterButton.click();
    }

    @Then("Kullanici registration formunu doldurur ve register submit butonuna tiklar")
    public void kullanici_registration_formunu_doldurur_ve_register_submit_butonuna_tiklar() {
        loginPage.registrationSSN.click();
        actions.sendKeys(faker.number().digits(3)).sendKeys("-")
                .sendKeys(faker.number().digits(2)).sendKeys("-")
                .sendKeys(faker.number().digits(4)).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().username()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("abcd").sendKeys(Keys.TAB).sendKeys("abcd").sendKeys(Keys.TAB, Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
    }



    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @And("Kullanici Registration sayfasinin acildigini dogrular")
    public void kullaniciRegistrationSayfasininAcildiginiDogrular() {
        assert loginPage.registrationPage.isDisplayed();
    }

    @And("Kullanici SSN alanini bos biraktiginda {string} uyarisi aldigini dogrular")
    public void kullaniciSSNAlaniniBosBiraktigindaUyarisiAldiginiDogrular(String arg1) {
        loginPage.registrationSSN.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstName.click();
        ReusableMethods.waitFor(1);
        assert loginPage.ssnRequiredWarning.isDisplayed();
    }

    @And("Kullanici First Name alanini bos birakir")
    public void kullaniciFirstNameAlaniniBosBirakir() {
        loginPage.registrationFirstName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationLastName.click();
        ReusableMethods.waitFor(1);
    }


    @And("Kullanici {string} uyarisi aldigini dogrular.")
    public void kullaniciUyarisiAldiginiDogrular(String arg2) {
        assert loginPage.firstNameRequiredWarning.isDisplayed();
    }

    @And("Kullanici Last Name alanini bos birakir")
    public void kullaniciLastNameAlaniniBosBirakir() {
        loginPage.registrationLastName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationUserName.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici last name alanini bos biraktiginda {string} uyarisi aldigini dogrular.")
    public void kullaniciLastNameAlaniniBosBiraktigindaUyarisiAldiginiDogrular(String arg0) {
        assert loginPage.lastNameRequiredWarning.isDisplayed();
    }

    @And("Kullanici Username alanini bos biraktiginda Your username is required. uyarisi aldigini dogrular")
    public void kullaniciUsernameAlaniniBosBiraktigindaYourUsernameIsRequiredUyarisiAldiginiDogrular() {
        loginPage.registrationUserName.click();
        ReusableMethods.waitFor(1);
        loginPage.registrationEmail.click();
        ReusableMethods.waitFor(1);
        assert loginPage.userNameRequiredWarning.isDisplayed();
    }

    @And("Kullanici First Name alanina herhangi bir karakter girdiginde uyari mesaji almadigini dogrular")
    public void kullaniciFirstNameAlaninaHerhangiBirKarakterGirdigindeUyariMesajiAlmadiginiDogrular() {
        loginPage.registrationFirstName.sendKeys("*");
        boolean uyariYazisi = true;
        try {
            loginPage.firstNameRequiredWarning.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }

    @And("Kullanici SSN kismina {string} girdiginde SSN invalid uyarisi alir")
    public void kullaniciSSNKisminaGirdigindeSSNInvalidUyarisiAlir(String gecersizSSN) {
        loginPage.registrationSSN.sendKeys(gecersizSSN);
        loginPage.registrationFirstName.click();
        assert loginPage.ssnInvalidwarning.isDisplayed();
    }

    @And("Kullanici Last Name alanina herhangi bir karakter girdiginde uyari mesaji almadigini dogrular")
    public void kullaniciLastNameAlaninaHerhangiBirKarakterGirdigindeUyariMesajiAlmadiginiDogrular() {
        loginPage.registrationLastName.sendKeys("*");
        boolean uyariYazisi = true;
        try {
            loginPage.lastNameRequiredWarning.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }

    @And("Kullanici gecerli SSN numarasi girdiginde uyari almadigini dogrular")
    public void kullaniciGecerliSSNNumarasiGirdigindeUyariAlmadiginiDogrular() {
        loginPage.registrationSSN.sendKeys(faker.idNumber().ssnValid());
        ReusableMethods.waitFor(1);
        boolean uyariYazisi = true;
        try {
            loginPage.ssnInvalidwarning.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }
}


