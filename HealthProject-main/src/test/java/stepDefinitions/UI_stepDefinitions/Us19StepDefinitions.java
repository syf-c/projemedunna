package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.JsReusable;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Methodlar.*;

public class Us19StepDefinitions extends ReusableMethods{

    MedunnaPage obje=new MedunnaPage();

    Faker faker = new Faker();
   
    Actions actions = new Actions(Driver.getDriver());

    String expectedPhone;
    String expectedAddress;
    String expecteddescription;
    String expectedcountry;
    String expectedstateCity;


    @Given("Admin19 {string} adresine gider")
    public void adminAdresineGider(String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));


    }

    @Then("Admin19 Giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {
        obje.userIcon.click();


    }

    @And("Admin19 Sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        obje.yysign.click();

    }

    @And("Admin19 Username alanina gecerli bir username {string} girer")
    public void adminUsernameAlaninaGecerliBirGirer(String username) {
        obje.yyusurname.sendKeys(username);

    }

    @And("Admin19 Password alanina gecerli bir password {string} girer")
    public void adminPasswordAlaninaGecerliBirGirer(String password) {
        obje.yypassword.sendKeys(password);

    }

    @And("Admin19 Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        obje.yysign2.click();

    }

    @And("Admin19 Items&Titles sekmesine tiklar")
    public void adminItemsTitlesSekmesineTiklar() {
        obje.itemsTitlesYY.click();

    }

    @And("Admin19 Admin Staff secenegini tiklar")
    public void adminAdminStaffSeceneginiTiklar() {
        obje.staffButtonYY.click();


    }

    @And("Admin19 Create a new Staff butonuna tiklar")
    public void adminCreateANewStaffButonunaTiklar() {
        obje.createANewStaffYY.click();

    }

    @And("Admin19 Use Search box suna tiklar")
    public void adminUseSearchBoxSunaTiklar() {
        obje.useSearchCheckBoxYY.click();


    }

    @And("Admin19 SSN alanina staff in {string} i girer")
    public void adminSSNAlaninaStaffInIGirer(String ssn) {
        obje.ssnSearchBoxYY.sendKeys(ssn);


    }

    @And("Admin19 Search User butonunu tiklar")
    public void adminSearchUserButonunuTiklar() {
        obje.searchUserYY.click();


    }

    @Then("Admin19 User found with search SSN mesajini gorur")
    public void adminUserFoundWithSearchSSNMesajiniGorur() {
        assertTrue(obje.userFoundBasariMesajiYY.isDisplayed());


    }

    @And("Admin19 bos olan {string} {string} {string} {string} {string} alanlarini doldurur")
    public void adminBosOlanAlanlariniDoldurur(String phone, String address, String description, String country, String stateCity) {


        expectedPhone = phone;
        expectedAddress = address;
        expecteddescription = description;
        expectedcountry = country;
        expectedstateCity = stateCity;

        ReusableMethods.waitFor(1);
        obje.staffPhoneYY.sendKeys(phone);
        ReusableMethods.waitFor(1);
        obje.addressYY.sendKeys(address);
        ReusableMethods.waitFor(1);
        obje.descriptionYY.sendKeys(description);
        ReusableMethods.waitFor(1);
        obje.countryYY.sendKeys(country);
        ReusableMethods.waitFor(1);
        obje.stateCityYY.sendKeys(stateCity);
        ReusableMethods.waitFor(1);


    }

    @And("Admin19 Save butonuna tiklar")
    public void adminSaveButonunaTiklar() {

        obje.yysaveButonu.click();


    }

    @Then("Admin19 tum bilgilerin dolduruldugu dogrular")
    public void adminTumBilgilerinDoldurulduguDogrular() {

        String actualPhone = obje.staffPhoneYY.getAttribute("value");
        System.out.println(actualPhone);

        String actualAddress = obje.addressYY.getAttribute("value");
        System.out.println(actualAddress);

        String actualDescription = obje.descriptionYY.getAttribute("value");
        System.out.println(actualDescription);

        WebElement countrySelect = obje.countryYY;
        Select options = new Select(countrySelect);
        String actualCountry = options.getFirstSelectedOption().getText();
        System.out.println(actualCountry);

        WebElement citySelect = obje.stateCityYY;
        Select options2 = new Select(citySelect);
        String actualStateCity = options2.getFirstSelectedOption().getText();
        System.out.println(actualStateCity);

        assertEquals(expectedPhone, actualPhone);
        assertEquals(expectedAddress, actualAddress);
        assertEquals(expecteddescription, actualDescription);
        assertEquals(expectedcountry, actualCountry);
        assertEquals(expectedstateCity, actualStateCity);



    }

    @And("Admin19 Administratiton sekmesine tiklar")
    public void adminAdministratitonSekmesineTiklar() {
        ReusableMethods.waitFor(2);
       obje.administrationYY.click();


    }

    @And("Admin19 User management sekmesine tiklar")
    public void adminUserManagementSekmesineTiklar() {
        ReusableMethods.waitFor(2);
       obje.userManagementYY.click();
    }

    @And("Admin19 sececegi kullanicinin  View butonuna tiklar")
    public void adminSececegiKullanicininViewButonunaTiklar() {
        ReusableMethods.waitFor(2);
        obje.viewButtonYY.click();

    }

    @Then("Admin19 kullaniciyi sectigini dogrular")
    public void adminKullaniciyiSectiginiDogrular() {
        ReusableMethods.waitFor(2);
        assertTrue(obje.userBilgisiYY.isDisplayed());

    }


    @And("Admin19 kullanici bilgileri duzenler")
    public void adminKullaniciBilgileriDuzenler() {

        obje.phoneYY.clear();
        obje.phoneYY.sendKeys("0123456798");
        obje.addressYY.clear();
        obje.addressYY.sendKeys(faker.address().fullAddress());
        JsReusable.jsScrollClick(obje.saveYY);

    }


    @Then("Admin19 kullanici bilgilerinin duzenledigine dair basari mesajini gorur")
    public void adminKullaniciBilgilerininDuzenledigineDairBasariMesajiniGorur() throws IOException {

        try {

            assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast--success toastify-toast']")).isDisplayed());

        } catch (NoSuchElementException e) {
            ReusableMethods.getScreenshotWebElement("Internal server error", obje.internalServerYY);
            Assert.fail("Bilgiler doldruruldu ama Internal server error verdi");
        }

    }

    @Then("Admin19 silmek istedigi personelin delete butonuna tiklar")
    public void adminSilmekIstedigiPersonelinDeleteButonunaTiklar() {

        staffOlusturmaMethodu();
        staffsilmeMethodu();

    }

    @And("Admin19 silindi mesajini dogrular")
    public void adminSilindiMesajiniDogrular() {

        Assert.assertTrue(obje.staffSilindiBasariMesajiYY.isDisplayed());
        Driver.quitDriver();
    }


    @And("Admin19 sayfayi kapatir")
    public void Admin19sayfayikapatir() {

        Driver.quitDriver();
    }



    @Then("Kullanici {string} duzenleme yaparyy")
    public void kullaniciDuzenlemeYaparyy(String id) {


        String url = "https://medunna.com/staff?page=2&sort=id,asc";
        Driver.getDriver().get(url);
        obje.yyusurname.sendKeys("team12");
        obje.yypassword.sendKeys("team12B81");
        obje.yysign2.click();
        WebElement specialCountryIdDeleteButon = Driver.getDriver().findElement(By.xpath("//a[@href='/staff/"+id+"/edit?page=3&sort=id,asc']"));

        JsReusable.jsScrollClick(specialCountryIdDeleteButon);
        JsReusable.jsScrollClick(obje.editYY);


    }
}
