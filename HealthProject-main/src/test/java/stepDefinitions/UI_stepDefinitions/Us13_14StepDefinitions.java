package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Us13_14StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    static String notedIdNumber;

    @Then("Kullanici gecerli username {string} girer US13-14")
    public void kullaniciGecerliUsernameGirerUS(String username) {
        medunnaPage.yyusurname.sendKeys(username);
    }

    @Then("Kullanici gecerli password {string} girer US13-14")
    public void kullaniciGecerliPasswordGirerUS(String password) {
        medunnaPage.yypassword.sendKeys(password);
    }

    @Then("Kullanici My Appointments linkine tiklar US13-14")
    public void kullaniciMyAppointmentsLinkineTiklarUS() {
        ReusableMethods.jsclick(medunnaPage.myAppointments);
    }

    @Then("Kullanici tarih araligini secer US13-14")
    public void kullaniciTarihAraliginiSecerUS() {
        medunnaPage.dateSelectFrom.sendKeys("16.11.2022");
        medunnaPage.dateSelectTo.sendKeys("30.11.2022");
    }

    @Then("Kullanici Edit butonuna tiklar US13-14")
    public void kullaniciEditButonunaTiklarUS() {
        ReusableMethods.waitFor(5);
        medunnaPage.appointmentsFirstEdit.click();
    }

    @Then("Kullanici Show Test Results butonuna tiklar US13-14")
    public void kullaniciShowTestResultsButonunaTiklarUS() {
        ReusableMethods.waitForVisibility(medunnaPage.showTestResults, 10);
        medunnaPage.showTestResults.click();
    }

    @Then("Kullanici ilgili satirdaki View Resaults butonuna tiklar US13-14")
    public void kullaniciIlgiliSatirdakiViewResaultsButonunaTiklarUS() {
        medunnaPage.testsViewResults4.click();
    }

    @Then("Kullanici acilan sayfada ilgili degerlerinin gorunurlugunu her bir test icin dogrular US13-14")
    public void kullaniciAcilanSayfadaIlgiliDegerlerininGorunurlugunuHerBirTestIcinDogrularUS() {

        List<WebElement> testResultsColumn1List = medunnaPage.testResultsColumn1List;
        for (WebElement w:testResultsColumn1List) {
            assertFalse(w.toString().isEmpty());
        }

        List<WebElement> testResultsColumn2List = medunnaPage.testResultsColumn2List;
        for (WebElement w:testResultsColumn2List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn3List = medunnaPage.testResultsColumn3List;
        for (WebElement w:testResultsColumn3List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn4List = medunnaPage.testResultsColumn4List;
        for (WebElement w:testResultsColumn4List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn5List = medunnaPage.testResultsColumn5List;
        for (WebElement w:testResultsColumn5List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn6List = medunnaPage.testResultsColumn6List;
        for (WebElement w:testResultsColumn6List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn7List = medunnaPage.testResultsColumn7List;
        for (WebElement w:testResultsColumn7List) {
            assertFalse(w.toString().isEmpty());
        }
        List<WebElement> testResultsColumn8List = medunnaPage.testResultsColumn8List;
        for (WebElement w:testResultsColumn8List) {
            assertFalse(w.toString().isEmpty());
        }

    }

    @And("Kullanici sayfayi kapatir US13-14")
    public void kullaniciSayfayiKapatirUS() {
        Driver.closeDriver();
    }

    @Then("kullanici signinnn butonuna tiklar US13-14")
    public void kullaniciSigninnnButonunaTiklarUS() {
        medunnaPage.yysign2.click();
    }

    @Then("Kullanici ilgili satirdaki Edit butonuna tiklar US13-14")
    public void kullaniciIlgiliSatirdakiEditButonunaTiklarUS() {
        ReusableMethods.waitFor(5);
        medunnaPage.appointmentsFirstEdit.click();

    }
    @Then("Kullanici ID numarasini not eder US13-14")
    public void kullaniciIDNumarasiniNotEderUS() {
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.F5);
        notedIdNumber = medunnaPage.EditAnAppointmentIdTextBox.getText();
    }

    @Then("Kullanici Request Inpatient butonuna tiklar US13-14")
    public void kullaniciRequestInpatientButonunaTiklarUS() {
        medunnaPage.EditAnAppointmentRequestInpatientButton.click();
    }

    @Then("Kullanici MyInPatients linkine tiklar US13-14")
    public void kullaniciMyInPatientsLinkineTiklarUS() {
        ReusableMethods.jsclick(medunnaPage.myInPatients);
    }

    @Then("Kullanici acilan sayfada Appointment altinda not ettigi ID'nin gorunurlugunu dogrular US13-14")
    public void kullaniciAcilanSayfadaAppointmentAltindaNotEttigiIDNinGorunurlugunuDogrularUS() {
        List<WebElement> inPatientAppointmentList = medunnaPage.inPatientsAppointmentList;
        assertTrue(inPatientAppointmentList.toString().contains(notedIdNumber));
    }

    @Then("Kullanici acilan sayfada ilgili basliklarin gorunurlugunu dogrular")
    public void kullaniciAcilanSayfadaIlgiliBasliklarinGorunurlugunuDogrular() {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("ID");expectedResult.add("Start Date"); expectedResult.add("End Date"); expectedResult.add("Status"); expectedResult.add("Description");
        expectedResult.add("Created Date"); expectedResult.add("Room"); expectedResult.add("Appointment"); expectedResult.add("Patient");
        System.out.println("expectedResult = " + expectedResult);
        List<WebElement> actualResult = medunnaPage.inPatientsThead;
        ReusableMethods.waitFor(3);
        for (int i = 0; i < 9; i++) {
            assertEquals(expectedResult.get(i),actualResult.get(i).getText());
        }

    }
}
