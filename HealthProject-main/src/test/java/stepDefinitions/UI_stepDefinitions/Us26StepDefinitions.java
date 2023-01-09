package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Us26StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici Medunna sayfasina gider Ag.")
    public void kullaniciMedunnaSayfasinaGiderAg() { Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanici Contact butonuna tiklar Ag.")
    public void kullaniciContactButonunaTiklarAg() {
        medunnaPage.agContactButton.click();
    }

    @Then("Kullanici sayfayi asagi indirir Ag.")
    public void kullaniciSayfayiAsagiIndirirAg() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // build() olmadan PAGE_DOWN kullanılamadı.
    }

    @Then("Kullanici name textboxina tiklar ve erisebildigini dogrular Ag.")
    public void kullaniciNameTextboxinaTiklarVeErisebildiginiDogrularAg() {
        medunnaPage.agNameTextbox.click();
        assert medunnaPage.agNameTextbox.isEnabled();
    }

    @Then("Kullanici name textboxina ismini girer Ag.")
    public void kullaniciNameTextboxinaIsminiGirerAg() {
        medunnaPage.agNameTextbox.sendKeys("Ayse");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici email textboxina tiklar ve erisebildigini dogrular Ag.")
    public void kullaniciEmailTextboxinaTiklarVeErisebildiginiDogrularAg() {
        medunnaPage.agEmailTextbox.click();
        assert medunnaPage.agEmailTextbox.isEnabled();
    }

    @Then("Kullanici email textboxina adresini girer Ag.")
    public void kullaniciEmailTextboxinaAdresiniGirerAg() {
        medunnaPage.agEmailTextbox.sendKeys("ayse@gmail.com");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici subject textboxina tiklar ve erisebildigini dogrular Ag.")
    public void kullaniciSubjectTextboxinaTiklarVeErisebildiginiDogrularAg() {
        medunnaPage.agSubjectTextbox.click();
        assert medunnaPage.agSubjectTextbox.isEnabled();
    }

    @Then("Kullanici subject textboxina konuyu girer Ag.")
    public void kullaniciSubjectTextboxinaKonuyuGirerAg() {
        medunnaPage.agSubjectTextbox.sendKeys("randevu");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici message textboxina tiklar ve erisebildigini dogrular Ag.")
    public void kullaniciMessageTextboxinaTiklarVeErisebildiginiDogrularAg() {
        medunnaPage.agMessageTextbox.click();
        assert medunnaPage.agMessageTextbox.isEnabled();
    }

    @Then("Kullanici message textboxina mesajini girer Ag.")
    public void kullaniciMessageTextboxinaMesajiniGirerAg() {
        medunnaPage.agMessageTextbox.sendKeys("randevularımı göremiyorum, yardimci olabilir misiniz");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Send butonuna tiklar Ag.")
    public void kullaniciSendButonunaTiklarAg() {
        ReusableMethods.jsclick(medunnaPage.agSendButton);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici mesajinin basari ile gonderildigini dogrular Ag.")
    public void kullaniciMesajininBasariIleGonderildiginiDogrularAg() {
        assert medunnaPage.agYourMessageHasBeenReceived.isDisplayed();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici sayfayi kapatir Ag.")
    public void kullaniciSayfayiKapatirAg() { Driver.closeDriver();
    }

    @Then("Kullanici Name textboxina ismini girer AG.")
    public void kullaniciNameTextboxinaIsminiGirerAG() {
        ReusableMethods.jsclick(medunnaPage.agNameTextbox);
        medunnaPage.agNameTextbox.sendKeys("Ceyda Gürbüz");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Email textboxina adresini girer AG.")
    public void kullaniciEmailTextboxinaAdresiniGirerAG() {
        medunnaPage.agEmailTextbox.sendKeys("medunnaproje12@gmail.com");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Subject textboxina konuyu girer AG.")
    public void kullaniciSubjectTextboxinaKonuyuGirerAG() {
        medunnaPage.agSubjectTextbox.sendKeys("test sonuclari");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Message textboxina mesajini girer AG.")
    public void kullaniciMessageTextboxinaMesajiniGirerAG() {
        medunnaPage.agMessageTextbox.sendKeys("Test sonuclarimi goremiyorum, yardimci olabilir misiniz");
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Name textboxini bos birakir Ag.")
    public void kullaniciNameTextboxiniBosBirakirAg() {
        medunnaPage.agNameTextbox.sendKeys(" ");
        medunnaPage.agNameTextbox.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Name is required uyarisini aldigini dogrular Ag.")
    public void kullaniciNameIsRequiredUyarisiniAldiginiDogrularAg() {
        assert medunnaPage.agNameRequired.isDisplayed();
    }

    @Then("Kullanici Email textboxini bos birakir Ag.")
    public void kullaniciEmailTextboxiniBosBirakirAg() {
        medunnaPage.agEmailTextbox.sendKeys(" ");
        medunnaPage.agEmailTextbox.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Your email is required uyarisini aldigini dogrular Ag.")
    public void kullaniciYourEmailIsRequiredUyarisiniAldiginiDogrularAg() {
        assert medunnaPage.agEmailRequired.isDisplayed();
    }

    @Then("Kullanici Subject textboxini bos birakir Ag.")
    public void kullaniciSubjectTextboxiniBosBirakirAg() {
        medunnaPage.agSubjectTextbox.sendKeys(" ");
        medunnaPage.agSubjectTextbox.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici This field is required uyarisini aldigini dogrular Ag.")
    public void kullaniciThisFieldIsRequiredUyarisiniAldiginiDogrularAg() {
        assert medunnaPage.agSubjectRequired.isDisplayed();
    }

    @Then("Kullanici mesajini yazar Ag.")
    public void kullaniciMesajiniYazarAg() {
        medunnaPage.agMessageTextbox.sendKeys(".... konusunda yardimci olabilir misiniz");
    }

    @Then("Kullanici sendd butonuna tiklar Ag.")
    public void kullaniciSenddButonunaTiklarAg() {
        ReusableMethods.jsclick(medunnaPage.agSendButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Name, Email, Subject textboxlarini doldurmadan mesaj gonderemedigini gorur Ag.")
    public void kullaniciNameEmailSubjectTextboxlariniDoldurmadanMesajGonderemediginiGorurAg() throws IOException {
        ReusableMethods.getScreenshotWebElement("Your message has been received", medunnaPage.agSayfaResmi);
    }
}
