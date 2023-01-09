package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Us03StepDefinitions {

    MedunnaPage loginPage = new MedunnaPage();

    Actions actions = new Actions(Driver.getDriver());


    @And("Kullanici New password kısmına {string} girer")
    public void kullaniciNewPasswordKısmınaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(loginPage.registrationFirstPassword).click();
        ReusableMethods.waitFor(2);
        actions.sendKeys("12345A+").perform();
    }


    @And("Kullanici New password kısmını temizler ve buraya {string} girer")
    public void kullaniciNewPasswordKısmınıTemizlerVeBurayaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(1);
        actions.sendKeys("1234A+a").perform();
    }






    @And("Kullanıci New password kısmına {string} girer.")
    public void kullanıciNewPasswordKısmınaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(loginPage.registrationFirstPassword).click();
        ReusableMethods.waitFor(2);
        actions.sendKeys("12345a+").perform();
    }

    @And("Kullanıci New password kısmını temizler ve buraya {string} girer.")
    public void kullanıciNewPasswordKısmınıTemizlerVeBurayaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(1);
        actions.sendKeys("1234a+A").perform();
    }

    @And("Kullanıci New password kismına {string} girer.")
    public void kullanıciNewPasswordKismınaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(loginPage.registrationFirstPassword).click();
        ReusableMethods.waitFor(2);
        actions.sendKeys("abcABC+").perform();
    }

    @And("Kullanıci New password kismını temizler ve buraya {string} girer.")
    public void kullanıciNewPasswordKismınıTemizlerVeBurayaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(1);
        actions.sendKeys("abcAB+1").perform();
    }

    @And("Kullanıci New password kismina {string} girer.")
    public void kullanıciNewPasswordKisminaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(loginPage.registrationFirstPassword).click();
        ReusableMethods.waitFor(2);
        actions.sendKeys("123abAB").perform();
    }

    @And("Kullanıci New password kisminı temizler ve buraya {string} girer.")
    public void kullanıciNewPasswordKisminıTemizlerVeBurayaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(1);
        actions.sendKeys("123abA+").perform();
    }





    @And("Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder")
    public void kullaniciPasswordStrengthDeBesinciSeviyedekiRenginYesilOldugunuTestEder() {
        ReusableMethods.waitFor(3);

        Assert.assertTrue(loginPage.passwordStrength5Green.isDisplayed());
    }

    @And("Kullanıci New password kisminaa {string} girer.")
    public void kullanıciNewPasswordKisminaaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(loginPage.registrationFirstPassword).click();
        ReusableMethods.waitFor(2);
        actions.sendKeys("12abA*").perform();
    }

    @And("Kullanıci New password kismini temizler ve buraya {string} girer.")
    public void kullanıciNewPasswordKisminiTemizlerVeBurayaGirer(String arg0) {
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.waitFor(1);
        loginPage.registrationFirstPassword.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(1);
        actions.sendKeys("12abA+*").perform();

    }


    @And("Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder")
    public void kullaniciPasswordStrengthDeBesinciSeviyedekiRenginYesilOlmadigininGorunebilirliginiTestEder() {
        ReusableMethods.waitFor(3);
        String actualStyleColor=loginPage.passwordStrength5Gri1.getAttribute("style");
        String expectedStyleColor="background-color: rgb(0, 255, 0);";
        Assert.assertNotEquals(expectedStyleColor,actualStyleColor);



    }

    @And("Kullanici Password strength de besinci seviyedeki rengin yesil olmadigini test eder")
    public void kullaniciPasswordStrengthDeBesinciSeviyedekiRenginYesilOlmadiginiTestEder() {
        ReusableMethods.waitFor(2);
        String actualStyleColor=loginPage.passwordStrength5Gri.getAttribute("style");
        String expectedStyleColor="background-color: rgb(0, 255, 0);";
        Assert.assertNotEquals(expectedStyleColor,actualStyleColor);

    }

    @And("Kullanici Password strength de besincii seviyedeki rengin yesil olmadigini test eder")
    public void kullaniciPasswordStrengthDeBesinciiSeviyedekiRenginYesilOlmadiginiTestEder() {
        ReusableMethods.waitFor(2);
        String actualStyleColor=loginPage.passwordStrength5Gri1.getAttribute("style");
        String expectedStyleColor="background-color: rgb(0, 255, 0);";
        Assert.assertNotEquals(expectedStyleColor,actualStyleColor);
    }
}