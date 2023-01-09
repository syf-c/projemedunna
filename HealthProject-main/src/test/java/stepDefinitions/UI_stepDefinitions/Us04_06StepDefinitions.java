package stepDefinitions.UI_stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;


public class Us04_06StepDefinitions {
    MedunnaPage obj=new MedunnaPage();

    @Given("Kullanici medunna sayfasina gider US04")
    public void KullanicimedunnasayfasinagiderUS04() {Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Then("kullanci sign in butonuno tiklar  US04")
    public void kullancisigninbutonunotiklarUS04() {obj.userIcon.click();
        obj.yysign.click();
    }

    @Then("kullanici gecerli usurname girer US04")
    public void kullanicigecerliusurnamegirerUS04()  {obj.yyusurname.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici gecerli password girer US04")
    public void kullanicigecerlipasswordgirerUS04() {
        obj.yypassword.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);

    }

    @Then("kullanici signinnn butonuna tiklar US04")
    public void kullanicisigninnnbutonunatiklarUS04() throws IOException {
        obj.yysign2.click();
       // Assert.assertTrue("succes to message uyarisi goruntulenemedi",Driver.getDriver().getPageSource().contains("success to  message"));
       ReusableMethods.waitFor(2);
       ReusableMethods.getScreenshotWebElement("succes to message", obj.yyekranresmi);
    }

    @Then("kullanici Remember me secenegi dogrular US04")
    public void kullaniciRemembermesecenegidogrularUS04(){
        ReusableMethods.waitFor(2);

        Assert.assertTrue(obj.yyremember.isDisplayed());
    }
    @Then("kullanici Did you forget  password secenegini dogrular US04")
    public void kullaniciDidyouforgetpasswordseceneginidogrularUS04() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yydidYouForgetPass.isDisplayed());

    }
    @Then("kullanici You dont have an account get Register a new account secenegini dogrularr US04")
    public void kullaniciYoudonthaveanaccountgetRegisteranewaccountseceneginidogrularrUS04() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyregistirnewAccount.isDisplayed());
    }


    @Then("kullanici hatali giris yapar US04")
    public void kullanicihataligirisyaparUS04() throws IOException {
        obj.yyusurname.sendKeys("team1111");
        obj.yypassword.sendKeys("team89668");
        obj.yysign2.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        ReusableMethods.getScreenshotWebElement("popMessage",obj.yyhataliGirisUyarisi);
        wait.until(ExpectedConditions.visibilityOf(obj.yyhataliGirisUyarisi));
        Assert.assertTrue(obj.yyhataliGirisUyarisi.isDisplayed());
    }
    @Then("kullanici cancel secenegini dogrular US04")
    public void kullanicicancelseceneginidogrularUS04() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yycancel.isDisplayed());
    }

    @Then("user iconuna tiklaryyy")
    public void usericonunatiklaryyy(){
        ReusableMethods.waitFor(2);

        obj.yymertDemirci.click();
    }
    @Then("kullanci settings butonuna tiklaryyy")
    public void kullancisettingsbutonunatiklaryyy() {
        ReusableMethods.waitFor(2);
        obj.yyseetings.click();

    }

    @Then("kullanici varolan bilgileri listeler US06")
    public void kullaniciVarolanBilgileriListelerUS06() {
        ReusableMethods.waitFor(3);
        String valueDegeriTo1=obj.yySettingsfirstName.getAttribute("value");
        System.out.println("valueDegeriTo1 = " + valueDegeriTo1);
        String valueDegeriTo2=obj.yySettingslastName.getAttribute("value");
        System.out.println("valueDegeriTo2 = " + valueDegeriTo2);
        String valueDegeriTo3=obj.yySettingsemail.getAttribute("value");
        System.out.println("valueDegeriTo3 = " + valueDegeriTo3);

    }
    @When("kullanici {string} bilgileri günceller US06")
    public void kullaniciBilgileriGüncellerUS06(String firstName) {
        obj.yySettingsfirstName.clear();
        firstName= Faker.instance().name().username();
        obj.yySettingsfirstName.sendKeys(firstName);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }
    @Then("kullanici {string} bilgileri güncellerr US06")
    public void kullaniciBilgileriGüncellerrUS06(String lastName) {
        obj.yySettingslastName.clear();
        lastName=Faker.instance().name().lastName();
        obj.yySettingslastName.sendKeys(lastName);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }
    @Then("kullanicii {string} bilgileri güncellerr US06")
    public void kullaniciiBilgileriGüncellerrUS06(String Email){
        obj.yySettingsemail.clear();
        Email=Faker.instance().internet().emailAddress();
        obj.yySettingsemail.sendKeys(Email);
        obj.yysave.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.yyseettingsSaved.isDisplayed());
    }
    @And("sayfayi kapatirr US04")
    public void sayfayikapatirrUS04() {
        Driver.quitDriver();

    }

}
