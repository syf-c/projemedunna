package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;

public class Us02StepDefinitions {
    MedunnaPage loginPage = new MedunnaPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici Username alanina herhangi bir karakter girdiginde uyari mesaji almadigini dogrular")
    public void kullanici_username_alanina_herhangi_bir_karakter_girdiginde_uyari_mesaji_almadigini_dogrular() {
        loginPage.registrationUserName.sendKeys("A");
        boolean uyariYazisi = true;
        try {
            loginPage.firstNameRequiredWarning.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }

    @And("Kullanici Username alanina herhangi bir karakter iceren Username girdiginde uyari almadigini dogrular")
    public void kullaniciUsernameAlaninaHerhangiBirKarakterIcerenUsernameGirdigindeUyariAlmadiginiDogrular() {

    }

    @And("Kullanici Email alanina @ ve . Karakterleri iceren bir mail adresi girdiginde This field is invalid uyarisi almamali")
    public void kullaniciEmailAlaninaVeKarakterleriIcerenBirMailAdresiGirdigindeThisFieldIsInvalidUyarisiAlmamali() {
        loginPage.registrationEmail.sendKeys(faker.internet().emailAddress());
        boolean uyariYazisi = true;
        try {
            loginPage.emailInvalidWarning.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }

    @And("Kullanici email alanina gecersiz email formati girdiginde This field is invalid Uyarisi aldigini dogrular")
    public void kullaniciEmailAlaninaGecersizEmailFormatiGirdigindeThisFieldIsInvalidUyarisiAldiginiDogrular() {
        loginPage.registrationEmail.sendKeys("a@bcom");
        loginPage.registrationFirstPassword.click();
        assert loginPage.emailInvalidWarning.isDisplayed();
    }

    @And("Kullanici email alanini bos biraktiginda Your email is required. uyarisi aldigini dogrular")
    public void kullaniciEmailAlaniniBosBiraktigindaYourEmailIsRequiredUyarisiAldiginiDogrular() {
        loginPage.registrationEmail.click();
        actions.sendKeys(Keys.TAB).perform();
        assert loginPage.emailRequiredWarning.isDisplayed();
    }
}












