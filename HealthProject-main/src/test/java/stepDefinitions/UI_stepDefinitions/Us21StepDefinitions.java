package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class Us21StepDefinitions {
    MedunnaPage staffPage = new MedunnaPage();

    @Given("Personel url gider")
    public void personelUrlGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("US21 Personel Kisi ikonuna  tiklar")
    public void usPersonelKisiIkonunaTiklar() {

        staffPage.PhysiciankisiIconu.click();
    }

    @And("US21 Personel sigin buttonuna tiklar")
    public void usPersonelSiginButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.PhysiciansignIn,5);
        staffPage.PhysiciansignIn.click();
    }

    @When("US21 Personel rolu ile gecerli username {string} girer")
    public void usPersonelRoluIleGecerliUsernameGirer(String username) {
        ReusableMethods.waitForVisibility(staffPage.PhysicianuserName,5);
        staffPage.PhysicianuserName.sendKeys(username);
    }

    @And("US21 Personel rolu ile gecerli password {string} girer")
    public void usPersonelRoluIleGecerliPasswordGirer(String password) {
        ReusableMethods.waitForVisibility(staffPage.Physicianpassword,5);
        staffPage.Physicianpassword.sendKeys(password);
    }

    @And("US21 Personel Signi tiklar")
    public void usPersonelSigniTiklar() {
        ReusableMethods.waitForVisibility(staffPage.PhysiciansignInButton,5);
        staffPage.PhysiciansignInButton.click();
    }

    @And("US21 Personel My Pages buttonuna tiklar")
    public void usPersonelMyPagesButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.PhysicianMyPages,5);
        staffPage.PhysicianMyPages.click();
    }

    @And("US21 Personel Search Patient buttonuna tiklar")
    public void usPersonelSearchPatientButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.StaffSearchPatient,5);
        staffPage.StaffSearchPatient.click();
    }


    @Then("US21 Show Appointments buttonuna tiklar")
    public void usShowAppointmentsButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.StaffShowAppointments,5);
        staffPage.StaffShowAppointments.click();
    }

    @Then("US21 Edit buttonuna tiklar")
    public void usEditButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.StaffEdit,5);
        staffPage.StaffEdit.click();
    }

    @Then("US21 {string} yazisini gorur")
    public void usYazisiniGorur(String arg1) {

        assertTrue(staffPage.StaffUpdate.isDisplayed());
    }


    @Given("US21 Patient ssn bolumune gecerli ssn numarasini girer")
    public void usPatientSsnBolumuneGecerliSsnNumarasiniGirer() {
        ReusableMethods.waitForVisibility(staffPage.StaffPatientSSN,5);
        staffPage.StaffPatientSSN.sendKeys("567-09-6754");
    }

    @And("US21 UNAPPROVED, PENDING veya CANCELLED seceneklerini secer")
    public void usUNAPPROVEDPENDINGVeyaCANCELLEDSeceneklerininSecer() {
        ReusableMethods.waitForVisibility(staffPage.StaffDropDown,5);

    //List<String> expexted=new ArrayList<>(Arrays.asList("UNAPPROVED","PENDING","CANCELLED"));

    //  for (int i = 1; i < 5; i++) {
    //      for (int j = 0; j <3 ; j++) {
    //          if (i != 3) {
    //              staffPage.StaffStatus.get(i).click();
    //              Assert.assertEquals(expexted.get(j),staffPage.StaffStatus.get(i).getAttribute("value"));
    //          }
    //      }

    //  }

        Select select = new Select(staffPage.appointmentstatus);
        select.selectByValue("UNAPPROVED");
        assertTrue(staffPage.appointmentstatus.getAttribute("value").contains("UNAPPROVED"));
        select.selectByValue("PENDING");
        assertTrue(staffPage.appointmentstatus.getAttribute("value").contains("PENDING"));
        select.selectByValue("CANCELLED");
        assertTrue(staffPage.appointmentstatus.getAttribute("value").contains("CANCELLED"));
        ReusableMethods.waitFor(3);

    }
    @Then("US21 {string} seceneginin secilemedigini gorur")
    public void usSecenegininSecilemediginiGorur(String status) {
        ReusableMethods.waitForVisibility(staffPage.StaffDropDown,5);
        staffPage.StaffStatus.get(3).click();
        String completed = staffPage.StaffDropDown.getAttribute("value");
        Assert.assertNotEquals(status, completed);
    }


    @Then("US21 Physician bolumunden doktoru secer")
    public void usPhysicianBolumundenDoktoruSecer() {
        ReusableMethods.waitForVisibility(staffPage.StaffPhysician,5);
        ReusableMethods.jsScrollClick(staffPage.StaffPhysician);
        Select select = new Select(staffPage.StaffPhysician);
        select.selectByVisibleText("306322:Sifa Acil:DERMATOLOGY");

    }

    @And("US21 Save buttonuna basar kayit yapilabildigini gorur")
    public void usSaveButtonunaBasarKayitYapilabildiginiGorur() {
        ReusableMethods.waitForVisibility(staffPage.StaffSave,5);
        ReusableMethods.jsScrollClick(staffPage.StaffSave);
        ReusableMethods.waitForVisibility(staffPage.appointmentUpdatedMesaj,5);
        assertTrue(staffPage.appointmentUpdatedMesaj.isDisplayed());
    }

    @Then("US21 Show Tests buttonuna tiklar")
    public void usShowTestsButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.StaffShowTests,5);
        staffPage.StaffShowTests.click();
    }

    @And("US21 View resault buttonuna tiklar")
    public void usViewResaultButtonunaTiklar() {
        ReusableMethods.waitForVisibility(staffPage.StaffTestResult,5);
        staffPage.StaffTestResult.click();
    }

    @And("US21 Hastanin test sonuclarini gorur")
    public void usHastaninTestSonuclariniGorur() {
        ReusableMethods.waitForVisibility(staffPage.StaffPotassium,5);
        assertTrue(staffPage.StaffPotassium.isDisplayed());
    }


    @Then("US21 Personel sayfayi kapatir")
    public void usPersonelSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("US21 {string} bolumlerine data girilemedigini gorur")
    public void usBolumlerineDataGirilemediginiGorur(String arg1) {
        staffPage.StaffTreatment.sendKeys("abcy");
        staffPage.StaffAnamnesis.sendKeys("defx");
        staffPage.StaffDiagnosis.sendKeys("xyza");
        String anamnesis = staffPage.StaffAnamnesis.getAttribute("value");
        String treatment = staffPage.StaffTreatment.getAttribute("value");
        String diagnosis = staffPage.StaffDiagnosis.getAttribute("value");
        Assert.assertNotEquals("Anamnesise deger girilebiliyor", "abcy", anamnesis);
        Assert.assertNotEquals("Anamnesise deger girilebiliyor", "defx", treatment);
        Assert.assertNotEquals("Anamnesise deger girilebiliyor", "xyza", diagnosis);
    }

    @Then("US21 Edit buttonuna tiklarr")
    public void usEditButtonunaTiklarr() {
        ReusableMethods.waitFor(3);

        staffPage.appointmentsEditButton.click();
    }
}

