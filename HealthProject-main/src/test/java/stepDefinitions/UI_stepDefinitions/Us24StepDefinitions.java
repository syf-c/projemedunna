package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us24StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    @And("Kullanici MYPAGES \\(PATIENT) butonunu tiklar MCK")
    public void kullaniciMYPAGESPATIENTButonunuTiklarMCK() {
        medunnaPage.myPagesButtonMck.click();

    }

    @And("Kullanici MY APPOINTMENTS butonunu tiklar MCK")
    public void kullaniciMYAPPOINTMENTSButonunuTiklarMCK() {
        medunnaPage.myAppointmentsButtonMck.click();
    }

    @And("Kullanici baslangic tarihi girer \\(from) MCK")
    public void kullaniciBaslangicTarihiGirerFromMCK() {
        // medunnaPage.fromDateMck.sendKeys("05.12.2022");

    }

    @And("Kullanici bitis tarihi girer \\(to)")
    public void kullaniciBitisTarihiGirerTo() {
        // medunnaPage.toDateMck.sendKeys("15.12.2022");

    }

    @And("Kullanici sayfadaki ShowTests butonuna tiklar MCK")
    public void kullaniciSayfadakiShowTestsButonunaTiklarMCK() {
        medunnaPage.showTestsButtonMck.click();

    }

    @And("Kullanici test sonuclarinin goruntulendigini dogrular MCK")
    public void kullaniciTestSonuclarininGoruntulendiginiDogrularMCK() {
        Assert.assertTrue(medunnaPage.viewResultButtonMck.isDisplayed());
    }

    @And("Kullanici id, name ,default max ve min value, test date and description bolumleri goruntuler MCK")
    public void kullaniciIdNameDefaultMaxVeMinValueTestDateAndDescriptionBolumleriGoruntulerMCK() {
        medunnaPage.viewResultButtonMck.click();
        Assert.assertTrue(medunnaPage.testIdMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testNameMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testResultMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testDefaultMaxValueMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testDefaultMinValueMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testTestMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testDescriptionMck.isDisplayed());
        Assert.assertTrue(medunnaPage.testDateMck.isDisplayed());

    }

    @And("Kullanici sayfadaki ShowInvoice kismina tiklar MCK")
    public void kullaniciSayfadakiShowInvoiceKisminaTiklarMCK() {
        medunnaPage.showInvoiceButtonMck.click();

    }

    @And("Kullanici faturanin goruntulendigini dogrular MCK")
    public void kullaniciFaturaninGoruntulendiginiDogrularMCK() {
        Assert.assertTrue(medunnaPage.cashInvoiceMck.isDisplayed());

    }

    @And("Kullanici hasta gecerli bir kullanici adi ve sifresi girer ve sign in butonunu tiklar MCK")
    public void kullaniciHastaGecerliBirKullaniciAdiVeSifresiGirerVeSignInButonunuTiklarMCK() {

        medunnaPage.userNameTwoMck.click();
        actions
                .sendKeys("abcPatient")
                .sendKeys(Keys.TAB)
                .sendKeys("abcd")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //medunnaPage.userNameTwoMck.sendKeys("abcPatient");
        //medunnaPage.passwordMck.sendKeys("abcd");
        //medunnaPage.signInButtonMck.click();

    }
}
