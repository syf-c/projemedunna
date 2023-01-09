package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

import static utilities.ReusableMethods.getFaker;

public class Us27StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public Us27StepDefinitions() throws AWTException {
    }

    @Given("Kullanici medunna sayfasina gider.zsg")
    public void kullaniciMedunnaSayfasinaGiderZsg() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kisi ikonuna tiklar.")
    public void kisiIkonunaTiklar() {
        medunnaPage.yysign2.click();
    }

    @Then("Sign in butonuna tiklar.")
    public void signInButonunaTiklar() {
        medunnaPage.yysign2.click();
    }

    @Then("Admin username bilgilerini {string} girer.")
    public void adminUsernameBilgileriniGirer(String username) {
        medunnaPage.yyusurname.sendKeys(username);
    }

    @Then("Admin password bilgilerini {string} girer.")
    public void adminPasswordBilgileriniGirer(String password) {
        medunnaPage.yypassword.sendKeys(password);
    }

    @Then("Items&Titles butonuna tiklar.")
    public void itemsTitlesButonunaTiklar() {
        medunnaPage.itemTitlesMenuZSG.click();
    }

    @Then("Messages butonuna tiklar.")
    public void messagesButonunaTiklar() {
        ReusableMethods.waitFor(2);
        medunnaPage.messagesButtonZSG.click();
    }

    @Then("Tum mesajlari gorebilmelidir.")
    public void tumMesajlariGorebilmelidir() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunnaPage.mesajPortalMesajSutunZSG.isDisplayed());

    }

    @Then("Tum yazarlarini gorebilmelidir.")
    public void tumYazarlariniGorebilmelidir() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunnaPage.mesajPortalIsimSutunZSG.isDisplayed());
    }

    @Then("Tum emaillerini gorebilmelidir.")
    public void tumEmailleriniGorebilmelidir() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunnaPage.mesajPortalEmailSutunZSG.isDisplayed());
    }

    @Then("Create a new message box'a tiklar.")
    public void createANewMessageBoxATiklar() {
        medunnaPage.createANewMessageButtonZSG.click();
    }

    @Then("Name kismini doldurur.")
    public void nameKisminiDoldurur() {
        medunnaPage.adminMessageNameBoxZSG.sendKeys(getFaker().name().fullName());
    }

    @Then("Email kismini doldurur.")
    public void emailKisminiDoldurur() {
        medunnaPage.adminMessageEmailBoxZSG.sendKeys(getFaker().internet().emailAddress());
    }

    @Then("Subject kismini doldurur.")
    public void subjectKisminiDoldurur() {
        medunnaPage.adminMessageSubjectBoxZSG.sendKeys(getFaker().lorem().word());
    }

    @Then("Message kismini doldurur.")
    public void messageKisminiDoldurur() {
        medunnaPage.adminMessageYazBoxZSG.sendKeys(getFaker().lorem().sentence(4));
    }

    @Then("Save boxa tiklar.")
    public void saveBoxATiklar() {
        ReusableMethods.waitFor(3);
        medunnaPage.messageSavedButtonZSG.click();
    }

    @Then("Mesajin kaydedildigini dogrular.")
    public void mesajinKaydedildiginiDogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(medunnaPage.mesajCreatedTextZSG.getText().contains("A new Message is created with identifier"));
    }

    @Then("Sutundaki id okuna tiklar.")
    public void sutundakiIdOkunaTiklar() {
        medunnaPage.idOkBoxZSG.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kendi olusturdugu mesajin edit bolumune tiklar.")
    public void kendiOlusturduguMesajinEditBolumuneTiklar() {
            medunnaPage.mesajEditBoxZSG.click();
            ReusableMethods.waitFor(3);

    }

    @Then("Mesajina guncelleme yapar.")
    public void mesajinaGuncellemeYapar() {
        medunnaPage.adminMessageYazBoxZSG.clear();
        ReusableMethods.waitFor(2);
        medunnaPage.adminMessageYazBoxZSG.sendKeys("MESAJ UPDATE EDILDI...");
    }

    @Then("Mesajin update isleminin basarili sekilde yapildigibi dogrular.")
    public void mesajinUpdateIslemininBasariliSekildeYapildigibiDogrular() {
        ReusableMethods.waitForVisibility(medunnaPage.mesajUpdatedTextZSG, 5);
        Assert.assertTrue(medunnaPage.mesajUpdatedTextZSG.getText().contains("A Message is updated with identifier"));
    }

    @Then("Kendi olusturdugu mesajin delete bolumune tiklar.")
    public void kendiOlusturduguMesajinDeleteBolumuneTiklar() {
        ReusableMethods.waitFor(3);
        medunnaPage.mesajDeleteBoxZSG.click();
    }


    @Then("Silme islemini onaylamak icin gelen Delete butonuna tiklar.")
    public void silmeIsleminiOnaylamakIcinGelenDeleteButonunaTiklar() {
        ReusableMethods.waitFor(3);
        medunnaPage.deleteButtonOnayZSG.click();
    }

    @Then("Mesajin silindigini test eder.")
    public void mesajinSilindiginiTestEder() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(medunnaPage.mesajDeletedTextZSG.getText().contains("A Message is deleted with identifier"));
    }
}