package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us17StepDefinitions {
    MedunnaPage loginPage = new MedunnaPage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @And("Kullanici user profiline simgesine tiklar")
    public void kullaniciUserProfilineSimgesineTiklar() {
        loginPage.profilButonu.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici giris yapmak icin sign in butonuna basar")
    public void kullaniciGirisYapmakIcinSignInButonunaBasar() {


        actions.moveToElement(loginPage.SignIn1).click().perform();
    }

    @And("Kullanici username ile sifresini girer")
    public void kullaniciUsernameIleSifresiniGirer() {

        loginPage.userNameSign.sendKeys(ConfigReader.getProperty("email"));
        loginPage.passwordSign.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Kullanici sign in butonuna basar")
    public void kullaniciSignInButonunaBasar() {
        ReusableMethods.jsclick(loginPage.SignIn2);
    }

    @And("Kullanici Item-Titles butonuna tiklar")
    public void kullaniciItemTitlesButonunaTiklar() {
        loginPage.itemsTitles.click();

    }

    @And("Kullanici Test Item butonuna tiklar")
    public void kullaniciTestItemButonunaTiklar() {
        loginPage.testItem.click();
    }

    @Then("Kullanici acilan sayfada Create a new Test Item butonuna tiklar")
    public void kullaniciAcilanSayfadaCreateANewTestItemButonunaTiklar() {
        loginPage.createNewTestItem.click();
    }

    @And("Kullanici \"test items; Name, Description, price Default min value Default max value ve created date bilgilerini girer")
    public void kullaniciTestItemsNameDescriptionPriceDefaultMinValueDefaultMaxValueVeCreatedDateBilgileriniGirer() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        loginPage.Name.sendKeys("İdrar2");
        ReusableMethods.waitFor(2);
        loginPage.Description.sendKeys("Glikoz");
        ReusableMethods.waitFor(2);
        loginPage.Price.sendKeys("15");
        ReusableMethods.waitFor(2);
        loginPage.defaultValMin.sendKeys("17");
        ReusableMethods.waitFor(2);
        loginPage.defaultValMax.sendKeys("25");
        ReusableMethods.waitFor(2);
        loginPage.createdDate.sendKeys("01.12.2022 14:12");
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanici Save butonuna tiklar ve A Test Item is cerated with identifier gorunurlugunu test eder")
    public void kullaniciSaveButonunaTiklarVeATestItemIsCeratedWithIdentifierGorunurlugunuTestEder() {
        loginPage.SaveButonu.click();
        ReusableMethods.waitFor(4);
        actions.moveToElement(loginPage.TestItemCreated).perform();
        Assert.assertTrue(loginPage.TestItemCreated.isDisplayed());
    }


    @Then("Kullanici Save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        loginPage.SaveButonu.click();
    }

    @Then("Kullanici test items bilgilerini gunceller")
    public void kullaniciTestItemsBilgileriniGunceller() throws InterruptedException {
        ReusableMethods.waitFor(3);
        actions.moveToElement(loginPage.nameUpdate).click().perform();
        loginPage.Name.clear();

        loginPage.Name.sendKeys("Hemotoloji");
        ReusableMethods.waitFor(2);
        loginPage.Description.clear();
        loginPage.Description.sendKeys("Trombosit");
        ReusableMethods.waitFor(2);
        loginPage.Price.clear();
        loginPage.Price.sendKeys("150");
        ReusableMethods.waitFor(2);

        loginPage.defaultValMin.clear();
        loginPage.defaultValMin.sendKeys("110");
        ReusableMethods.waitFor(2);
        loginPage.defaultValMax.clear();
        loginPage.defaultValMax.sendKeys("400");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

        loginPage.createdDate.sendKeys("03.12.2022 14:12");
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici daha once kaydedilmis herhangi bir test items a ait Edit butonuna tiklar")
    public void kullaniciDahaOnceKaydedilmisHerhangiBirTestItemsAAitEditButonunaTiklar() {

        actions.moveToElement(loginPage.firstClassfirstEdit).click().perform();

    }

    @And("Kullanici Save butonuna tiklar ve A Test Item is updated with identifier gorunurlugunu test eder")
    public void kullaniciSaveButonunaTiklarVeATestItemIsUpdatedWithIdentifierGorunurlugunuTestEder() {
        loginPage.SaveButonu.click();
        ReusableMethods.waitFor(3);
        actions.moveToElement(loginPage.testItemUpdated).perform();
        Assert.assertTrue(loginPage.testItemUpdated.isDisplayed());
    }

    @Then("Kullanici istedigi test items a ait View butonuna tiklar")
    public void kullaniciIstedigiTestItemsAAitViewButonunaTiklar() {
        loginPage.firstClassfirstView.click();
ReusableMethods.waitFor(2);}
    @And("Kullanici istedigi test ogelerinin gorulebildigini test eder")
    public void kullaniciIstedigiTestOgelerininGorulebildiginiTestEder() {

        String id1401TestItem = loginPage.id1401TestItem.getText();
        System.out.println("id1401TestItem = " + id1401TestItem);
        String id1401View = loginPage.id1401View.getText();
        System.out.println("id1401View = " + id1401View);
        Assert.assertEquals(id1401TestItem, id1401View);
    }

    @Then("Kullanici istedigi test items a ait Delete butonuna tiklar")
    public void kullaniciIstedigiTestItemsAAitDeleteButonunaTiklar() {

        ReusableMethods.waitFor(2);
        ReusableMethods.jsclick(loginPage.sayfaDoksansekiz);
        ReusableMethods.waitFor(1);
        ReusableMethods.jsclick(loginPage.sayfaDoksansekizDorduncuDelete);

    }

    @And("Kullanici cikan ekranda tekrar Delete butonuna tiklar ve delete islemiminin yapilabildigini test eder")
    public void kullaniciCikanEkrandaTekrarDeleteButonunaTiklarVeDeleteIslemimininYapilabildiginiTestEder() {
        loginPage.tekrarDeleteButonu.click();
        ReusableMethods.waitFor(3);
        actions.moveToElement(loginPage.testItemDeleted).perform();
        Assert.assertTrue(loginPage.testItemDeleted.isDisplayed());
    }
}
