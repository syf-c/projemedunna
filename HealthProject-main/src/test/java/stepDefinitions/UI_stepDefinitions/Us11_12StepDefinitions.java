package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Us11_12StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Then("Kullanici gecerli username {string} girer. US11")
    public void kullaniciGecerliUsernameGirer(String username) {
        medunnaPage.yyusurname.sendKeys(username);
    }

    @Then("Kullanici gecerli password {string} girer. US11")
    public void kullaniciGecerliPasswordGirer(String password) {
        medunnaPage.yypassword.sendKeys(password);
    }

    @Then("Sign in butonuna tiklar. US11")
    public void signInButonunaTiklar() {
        medunnaPage.yysign2.click();
    }

    @Then("My Appointments butonuna tiklar. US11")
    public void myAppointmentsButonunaTiklar() {
        ReusableMethods.jsclick(medunnaPage.myAppointments);
    }

    @Then("Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11")
    public void appointmentsListesindekiIlkSiradakiHastaninEditButonunaTiklar() throws InterruptedException {
        medunnaPage.appointmentsFirstEdit.click();
    }

    @Then("Save butonuna tiklar. US11")
    public void saveButonunaTiklar() {
        ReusableMethods.jsScrollClick(medunnaPage.createOrEditAppointmentsSave);
    }

    @Then("Appointments sayfasindaki id bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiIdBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.idAppointments.isDisplayed());
    }

    @Then("Appointments sayfasindaki Start Date Time bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiStartDateTimeBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.startDateTimeAppointments.isDisplayed());
    }

    @Then("Appointments sayfasindaki End Date Time bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiEndDateTimeBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.endDataTimeAppointments.isDisplayed());
    }

    @Then("Appointments sayfasindaki Status bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiStatusBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.statusAppointments.isDisplayed());
    }

    @Then("Appointments sayfasindaki Physician bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiPhysicianBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.physicianAppointments.isDisplayed());
    }

    @Then("Appointments sayfasindaki Patient bilgisini gorebilmeli.")
    public void appointmentsSayfasindakiPatientBilgisiniGorebilmeli() {
        Assert.assertTrue(medunnaPage.patientAppointments.isDisplayed());
    }


    @Then("Doktor Anamnesis alanina {string} girer.")
    public void doktorAnamnesisAlaninaGirer(String Anamnesis) {
        actions.click(medunnaPage.anamnesisBoxZSG).sendKeys(Keys.HOME).perform();
        for (int i = 0; i < 80; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        medunnaPage.anamnesisBoxZSG.sendKeys(Anamnesis);
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Doktor Treatment alanina {string} girer.")
    public void doktorTreatmentAlaninaGirer(String Treatment) {
        for (int i = 0; i < 80; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        medunnaPage.treatmentBoxZSG.sendKeys(Treatment);
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Doktor Diagnosis alanina {string} girer.")
    public void doktorDiagnosisAlaninaGirer(String Diagnosis) {
        for (int i = 0; i < 80; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        medunnaPage.diagnosisBoxZSG.sendKeys(Diagnosis);
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Doktor Prescription alanina {string} girer.")
    public void doktorPrescriptionAlaninaGirer(String Prescription) {
        for (int i = 0; i < 80; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        medunnaPage.prescriptionBoxZSG.sendKeys(Prescription);
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Doktor Description alanina {string} direr.")
    public void doktorDescriptionAlaninaDirer(String Description) {
        for (int i = 0; i < 80; i++) {
            actions.sendKeys(Keys.DELETE).perform();
        }
        medunnaPage.descriptionBoxZSG.sendKeys(Description);
    }

    @Then("Doktor Prescription alanini bos birakir.")
    public void doktorPrescriptionAlaniniBosBirakir() {
        ReusableMethods.jsScrollClick(medunnaPage.prescriptionBoxZSG);


        if (!medunnaPage.prescriptionBoxZSG.getText().isEmpty())
            ReusableMethods.waitFor(1);
        actions.doubleClick(medunnaPage.prescriptionBoxZSG).perform();
        ReusableMethods.waitFor(1);
        medunnaPage.prescriptionBoxZSG.clear();
        if (!medunnaPage.prescriptionBoxZSG.getText().isEmpty())
            actions.doubleClick(medunnaPage.prescriptionBoxZSG).perform();
        Assert.assertTrue(medunnaPage.prescriptionBoxZSG.getText().isEmpty());
        Assert.assertTrue(medunnaPage.prescriptionBoxZSG.getText().isEmpty());


    }

    @Then("Doktor Description alanini bos birakir.")
    public void doktorDescriptionAlaniniBosBirakir() {
        ReusableMethods.jsclick(medunnaPage.descriptionBoxZSG);
        if (!medunnaPage.descriptionBoxZSG.getText().isEmpty())
            ReusableMethods.waitFor(1);
        actions.doubleClick(medunnaPage.descriptionBoxZSG).perform();
        ReusableMethods.waitFor(1);
        medunnaPage.descriptionBoxZSG.clear();
        if (!medunnaPage.descriptionBoxZSG.getText().isEmpty())
            actions.doubleClick(medunnaPage.descriptionBoxZSG).perform();
        Assert.assertTrue(medunnaPage.descriptionBoxZSG.getText().isEmpty());
        Assert.assertTrue(medunnaPage.descriptionBoxZSG.getText().isEmpty());

    }
    @Then("Status ,COMPLETED olarak secilebilmeli.")
    public void statusCOMPLETEDOlarakSecilebilmeli() {
        Select select = new Select(medunnaPage.completedBoxZSG);
        select.selectByVisibleText("COMPLETED");
    }
    @Then("Request A Test butonuna tiklar.")
    public void requestATestButonunaTiklar() throws AWTException {
        ReusableMethods.waitFor(3);
        // ReusableMethods.jsclick(medunnaPage.requestATestZSG);
        js.executeScript("arguments[0].click();", medunnaPage.requestATestZSG);
        ReusableMethods.waitFor(3);
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT); // %20 Kucultme
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // %20 Kucultme
            robot.keyRelease(KeyEvent.VK_CONTROL);
            //  Driver.getDriver().navigate().refresh();
        }

    }
    @Then("Sayfa acilinca birazz bekler.")
    public void sayfaAcilincaBirazzBekler() {
        //ReusableMethods.waitForVisibility(medunnaPage.idBoxZSG,10);
        ReusableMethods.waitFor(10);
    }

    @Then("Test items listesinden Glucose secmelidir.")
    public void testItemsListesindenGlucoseSecmelidir() {
        //medunnaPage.glucoseTestClick.click();
        js.executeScript("arguments[0].click();", medunnaPage.glucoseTestClick);
    }

    @Then("Test items listesinden Urea secmelidir.")
    public void testItemsListesindenUreaSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.ureaTestClick);
    }

    @Then("Test items listesinden Creatinine secmelidir.")
    public void testItemsListesindenCreatinineSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.creatinineTestClick);
    }

    @Then("Test items listesinden Sodium secmelidir.")
    public void testItemsListesindenSodiumSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.sodiumTestClick);
    }

    @Then("Test items listesinden Potassium secmelidir.")
    public void testItemsListesindenPotassiumSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.potassiumTestClick);
    }

    @Then("Test items listesinden Total protein secmelidir.")
    public void testItemsListesindenTotalProteinSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.totalProteinTestClick);
    }

    @Then("Test items listesinden Albumin secmelidir.")
    public void testItemsListesindenAlbuminSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.albuminTestClick);
    }

    @Then("Test items listesinden Hemoglobin secmelidir.")
    public void testItemsListesindenHemoglobinSecmelidir() {
        js.executeScript("arguments[0].click();", medunnaPage.hemoglobinTestClick);

    }
    @Then("Show Test Results butonuna tiklar.")
    public void showTestResultsButonunaTiklar() {
        ReusableMethods.waitFor(3);
        medunnaPage.showResultTestZSG.click();
    }
    @Then("Sectigi testlere bakmaya gider.")
    public void sectigiTestlereBakmayaGider() {
        ReusableMethods.waitFor(3);
        medunnaPage.viewResultBoxListZSG.get(medunnaPage.viewResultBoxListZSG.size()+1);

    }


}