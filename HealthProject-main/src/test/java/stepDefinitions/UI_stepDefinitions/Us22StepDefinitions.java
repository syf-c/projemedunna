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

public class Us22StepDefinitions {
    MedunnaPage staffPage=new MedunnaPage();
    @Given("US22 Personel url gider")
    public void usPersonelUrlGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("US22 Personel Kisi ikonuna  tiklar")
    public void usPersonelKisiIkonunaTiklar() {
        staffPage.PhysiciankisiIconu.click();
    }

    @And("US22 Personel sigin buttonuna tiklar")
    public void usPersonelSiginButtonunaTiklar() {
        staffPage.PhysiciansignIn.click();
    }

    @When("US22 Personel rolu ile gecerli username {string} girer")
    public void usPersonelRoluIleGecerliUsernameGirer(String username ) {
        staffPage.PhysicianuserName.sendKeys(username);
    }

    @And("US22 Personel rolu ile gecerli password {string} girer")
    public void usPersonelRoluIleGecerliPasswordGirer(String password) {
        staffPage.Physicianpassword.sendKeys(password);
    }

    @And("US22 Personel Signi tiklar")
    public void usPersonelSigniTiklar() {
        staffPage.PhysiciansignInButton.click();
    }

    @And("US22 Personel My Pages buttonuna tiklar")
    public void usPersonelMyPagesButtonunaTiklar() {
        staffPage.PhysicianMyPages.click();
    }

    @And("US22 Personel Search Patient buttonuna tiklar")
    public void usPersonelSearchPatientButtonunaTiklar() {
        staffPage.StaffSearchPatient.click();
    }

    @Then("US22 Hasta bilgilerinin geldigini gorur")
    public void usHastaBilgilerininGeldiginiGorur() {

        for (int i = 0; i <staffPage.hastayaAitBilgiler.size() ; i++) {

            assertTrue(staffPage.hastayaAitBilgiler.get(i).isDisplayed());
        }

    }

    @Then("US22 Show Appointments buttonuna tiklar")
    public void usShowAppointmentsButtonunaTiklar() {
        staffPage.StaffShowAppointments.click();
    }

    @And("US22 Show Tests buttonuna tiklar")
    public void usShowTestsButtonunaTiklar() {
        staffPage.StaffShowTests.click();
    }

    @And("US22 View Results buttonuna tiklar")
    public void usViewResultsButtonunaTiklar() {
        staffPage.StaffTestResult.click();
    }

    @Given("US22 Patient ssn bolumune gecerli ssn numarasini girer")
    public void usPatientSsnBolumuneGecerliSsnNumarasiniGirer() {
        staffPage.StaffPatientSSN.sendKeys("567-09-6754");
    }


    @Then("US22 Personel sayfayi kapatir")
    public void usPersonelSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("US22 Test sonuclarini gorur")
    public void usTestSonuclariniGorur() {
        staffPage.StaffTestEdit.click();
        assertTrue(staffPage.resultTest.isDisplayed());
    }


    @Then("US22 Testin edit buttonuna tiklar  ID, Date, Result, description, Created date bolumlerini gorur ve  gunceller.")
    public void usTestinEditButtonunaTiklarIDDateResultDescriptionCreatedDateBolumleriniGorurVeGunceller() {
        ReusableMethods.waitForVisibility(staffPage.potasyumTestEdit,5);
        ReusableMethods.jsScrollClick(staffPage.potasyumTestEdit);

        staffPage.resultTest.clear();
        ReusableMethods.waitForVisibility(staffPage.resultTest,5);
        staffPage.resultTest.sendKeys("pozitif");
        staffPage.descriptionTest.clear();
        ReusableMethods.waitForVisibility(staffPage.descriptionTest,5);
        staffPage.descriptionTest.sendKeys("kan değerleri düşük");
        assertTrue(staffPage.resultTest.getAttribute("value").contains("pozitif"));
        assertTrue(staffPage.descriptionTest.getAttribute("value").contains("kan değerleri düşük"));
    }
}
