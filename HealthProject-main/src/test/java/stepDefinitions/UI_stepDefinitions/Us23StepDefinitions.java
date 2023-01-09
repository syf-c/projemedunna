package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class Us23StepDefinitions {
    MedunnaPage page = new MedunnaPage();

    @Given("Kullanici url'e gider")
    public void kullaniciUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici user icon simgesine tiklar us{int}")
    public void kullaniciUserIconSimgesineTiklarUs(int arg0) {
        page.userIcon.click();
    }

    @Then("Kullanici acilan menude Sign in sekmesine tiklar")
    public void kullaniciAcilanMenudeSignInSekmesineTiklar() {
        page.mainPageSignIn.click();
    }

    @And("Kullanici acilan sayfada Staff icin gecerli olan username ve password girip sign in butonuna tiklar")
    public void kullaniciAcilanSayfadaStaffIcinGecerliOlanUsernameVePasswordGiripSignInButonunaTiklar() {
        page.loginUsername.sendKeys("abcStaff");
        page.loginPassword.sendKeys("abcd");
        page.loginSignIn.click();
    }

    @And("Kullanici sayfanin acildigini dogrular")
    public void kullaniciSayfaninAcildiginiDogrular() {
        assert page.welcomePage.isDisplayed();
    }

    @And("Kullanici acilan sayfada My Pages sekmesine tiklar")
    public void kullaniciAcilanSayfadaMyPagesSekmesineTiklar() {
        page.myPages.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici Search Patient'e tiklar")
    public void kullaniciSearchPatientETiklar() {
        page.searchPatient.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici arama kutusuna hastanin SSN numarasini girer")
    public void kullaniciAramaKutusunaHastaninSSNNumarasiniGirer() {
        page.ssnBox.sendKeys("122-56-9045");
        ReusableMethods.waitFor(1);

    }

    @And("Kullanici acilan sayfada Show Appointments butonuna tiklar")
    public void kullaniciAcilanSayfadaShowAppointmentsButonunaTiklar() {
        ReusableMethods.jsScrollClick(page.showAppointments);
    }

    @Given("Kullanici PaymentInvoice Process butonuna tiklar")
    public void kullaniciPaymentInvoiceProcessButonunaTiklar() {
        ReusableMethods.waitForVisibility(page.paymentInvoiceButton, 10).click();
    }


    @When("Kullanici Create invoice butonuna tiklar")
    public void kullaniciCreateInvoiceButonunaTiklar() {
        page.createInvoice.click();
    }

    @Then("Kullanici fatura olustugunu dogrular")
    public void kullaniciFaturaOlustugunuDogrular() {
        assert page.invoicePage.isDisplayed();
    }

    @And("Kullanici sayfayi kapatir us{int}")
    public void kullaniciSayfayiKapatirUs(int arg0) {
        Driver.closeDriver();
    }

    @And("Kullanici muayene ve test ucretlerini goruntuleyebildigini dogrular")
    public void kullaniciMuayeneVeTestUcretleriniGoruntuleyebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        assert page.examPrice.isDisplayed();
        for (int i = 0; i < page.testPrices.size() - 1; i++) {
            assertTrue(page.testPrices.get(i).isDisplayed());
            ReusableMethods.waitFor(1);
        }
    }

    @Given("Kullanici arama kutusuna hastanin SSN numarasini girer{int}")
    public void kullaniciAramaKutusunaHastaninSSNNumarasiniGirer(int arg0) {
        page.ssnBox.sendKeys("872-85-6951");
        ReusableMethods.waitFor(1);
        page.page2.click();
        ReusableMethods.waitFor(1);
        
    }

    @When("Kullanici acilan sayfada Show Appointments butonuna tiklar{int}")
    public void kullaniciAcilanSayfadaShowAppointmentsButonunaTiklar(int arg0) {
        page.showAppointments2.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici Show invoice butonuna tiklar")
    public void kullaniciShowInvoiceButonunaTiklar() {
        ReusableMethods.waitFor(1);
        page.showInvoice.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici Invoice sayfasinin acildigini dogrular")
    public void kullaniciInvoiceSayfasininAcildiginiDogrular() {
        assert page.invoicePage.isDisplayed();
        ReusableMethods.waitFor(1);
    }
}
