package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;

import java.time.LocalDate;

public class Us15_16StepDefinitions {

    MedunnaPage fatma2=new MedunnaPage();

    @And("Yonetici username girilir FC.")
    public void yoneticiUsernameGirilirFC() {
        fatma2.signinUsername9.sendKeys("team12");
    }

    @And("Yonetici password girilir FC.")
    public void yoneticiPasswordGirilirFC() {
        fatma2.signinPassword9.sendKeys("team12B81");
    }

    @And("Items&Titles'a tiklanir FC.")
    public void itemsTitlesATiklanirFC() {
        fatma2.itemTitles15.click();
    }

    @And("Patient'e tiklanir FC.")
    public void patientETiklanirFC() {
        fatma2.patient15.click();
    }

    @And("Create a new patient'e tiklanir FC.")
    public void createANewPatientETiklanirFC() {
        fatma2.createANewPatient15.click();
    }

    @Then("Create or edit a Patient yazisinin goruldugu test edilir FC.")
    public void createOrEditAPatientYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createOrEditText15.isDisplayed());
    }

    @Then("SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,Description, Created Date, User, Country and state City gibi hasta bilgilerinin goruldugu test edilir FC.")
    public void ssnFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityGibiHastaBilgilerininGorulduguTestEdilirFC() {
        for (WebElement w:fatma2.basliklar15
        ) {
            Assert.assertTrue(w.isDisplayed());

        }

    }

    @And("Istenen hasta bilgileri girilir FC.")
    public void istenenHastaBilgileriGirilirFC() throws InterruptedException {
        fatma2.createFirstname15.sendKeys(Faker.instance().name().firstName());
        fatma2.createLastname15.sendKeys(Faker.instance().name().lastName());
        fatma2.createBirthDate15.sendKeys("04.12.2000 20:00");
        fatma2.createEmail15.sendKeys(Faker.instance().internet().emailAddress());
        fatma2.createPhone15.sendKeys("5558964178");
        Select select=new Select(fatma2.createGender15);
        select.selectByValue("FEMALE");
        Thread.sleep(3000);
        Select select1=new Select(fatma2.createBloodGroup15);
        select1.selectByVisibleText("AB+");
        fatma2.createAdress15.sendKeys(Faker.instance().address().fullAddress());
        fatma2.createDescription15.sendKeys(Faker.instance().lorem().characters(20));
        Thread.sleep(3000);
        Select select2=new Select(fatma2.createCountry15);
        select2.selectByVisibleText("USA");
        Thread.sleep(3000);
        Select select3=new Select(fatma2.createState15);
        select3.selectByVisibleText("California");

    }

    @And("Save butonuna tıklanır FC.")
    public void saveButonunaTiklanirFC() throws InterruptedException {
        Thread.sleep(3000);
        fatma2.createSave15.click();
    }

    @Then("Hasta oluturuldu yazinin görundugu test edilir FC.")
    public void hastaOluturulduYazininGorunduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @And("Edit'e tiklanir FC.")
    public void editETiklanirFC() {
        //Driver.getDriver().get("https://medunna.com/staff/367707/edit");
        fatma2.edit15.click();
    }

    @And("Hasta bilgileri guncellenir FC.")
    public void hastaBilgileriGuncellenirFC() throws InterruptedException {
        Select select=new Select(fatma2.createCountry15);
        select.selectByVisibleText("USA");
        Select select1=new Select(fatma2.createState15);
        select1.selectByVisibleText("California");
        Thread.sleep(3000);

    }

    @And("Hastanin güncellendigi yazinin görundugu test edilir FC.")
    public void hastaninGuncellendigiYazininGorunduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @Then("Country ve Us state seceneklerinin oldugu test edilir FC.")
    public void countryVeUsStateSeceneklerininOlduguTestEdilirFC() {

        Assert.assertTrue(fatma2.createCountry15.isDisplayed());
        Assert.assertTrue(fatma2.createState15.isDisplayed());
    }

    @And("Delete'e tiklanir FC.")
    public void deleteETiklanirFC() throws InterruptedException {
        fatma2.delete15.click();
        Thread.sleep(3000);
        fatma2.deleteSure15.click();
    }

    @Then("Hasta silindi yazisinin goruldugu test edilir FC.")
    public void hastaSilindiYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @And("Room'e tiklanir FC.")
    public void roomETiklanirFC() {
        fatma2.room16.click();
    }

    @And("Create a new room'a tiklanir FC.")
    public void createANewRoomATiklanirFC() {
        fatma2.createANewRoom16.click();
    }

    String roomNumber;

    @And("Oda bilgileri doldurulur FC.")
    public void odaBilgileriDoldurulurFC() {

        roomNumber = Faker.instance().number().digits(5);
        fatma2.roomNumber16.sendKeys(roomNumber);
        Select select = new Select(fatma2.roomType16);
        select.selectByVisibleText("SUITE");
        fatma2.status16.click();
        fatma2.price16.sendKeys(Faker.instance().number().digits(4));
        fatma2.roomDescription16.sendKeys(Faker.instance().lorem().characters(20));

    }

    @And("SaveRoom butonuna tıklanır FC.")
    public void saveroomButonunaTiklanirFC() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma2.roomSave16);

    }

    @Then("Yeni oda olusturuldu yazisinin goruldugu test edilir FC.")
    public void yeniOdaOlusturulduYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());

    }

    @And("Room number bos birakilir FC.")
    public void roomNumberBosBirakilirFC() {
        fatma2.roomNumber16.click();
        fatma2.roomType16.click();
    }

    @Then("This field is required yazisinin goruldugu test edilir FC.")
    public void thisFieldIsRequiredYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.bosBirakilamaz16.isDisplayed());
    }

    @Then("Room type olarak TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE goruldugu test edilir FC.")
    public void roomTypeOlarakTWINDELUXEPREMIUM_DELUXESUITVeDAYCAREGorulduguTestEdilirFC() {
        Select select = new Select(fatma2.roomType16);
        for (WebElement w : select.getAllSelectedOptions()
        ) {

            Assert.assertTrue(w.isDisplayed());

        }

    }

    @Then("Status'un ayarlanabilir oldugu test edilir FC.")
    public void statusUnAyarlanabilirOlduguTestEdilirFC() {

        fatma2.status16.click();
        Assert.assertTrue(fatma2.status16.isSelected());

    }

    String price;

    @And("Price alani doldurulur FC.")
    public void priceAlaniDoldurulurFC() {

        price = Faker.instance().number().digits(5);
        fatma2.price16.sendKeys(price);
    }

    @Then("Price'ın eklendigi test edilir FC.")
    public void priceInEklendigiTestEdilirFC() {

        Assert.assertEquals(price, fatma2.price16.getAttribute("value"));

    }

    @And("Price alani boş birakilir FC.")
    public void priceAlaniBosBirakilirFC() {
        fatma2.price16.click();
        fatma2.roomDescription16.click();
    }

    @Then("Price'ın bos birakilmadıgı test edilir FC.")
    public void priceInBosBirakilmadigiTestEdilirFC() {
        Assert.assertTrue(fatma2.bosBirakilamaz16.isDisplayed());
    }

    @And("Description alaninin bos birakilir FC.")
    public void descriptionAlanininBosBirakilirFC() {
        fatma2.roomNumber16.sendKeys(Faker.instance().number().digits(7));
        fatma2.price16.sendKeys(Faker.instance().number().digits(4));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma2.roomSave16);

    }

    @Then("Description alaninin bos birakilabildigi test edilir FC.")
    public void descriptionAlanininBosBirakilabildigiTestEdilirFC() {

        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());

    }


    @Then("Tarihin gun ay yil seklinde oldugu test edilir FC.")
    public void tarihinGunAyYilSeklindeOlduguTestEdilirFC() {

        Assert.assertEquals(LocalDate.now().atTime(00, 00).toString(), fatma2.roomCreateDate16.getAttribute("value"));

    }

    @And("Room Type'a tiklanir FC.")
    public void roomTypeATiklanirFC() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma2.tabloRoomtype16);


    }

    @Then("Ayni tur odalarin gorulebildigi test edilir FC.")
    public void ayniTurOdalarinGorulebildigiTestEdilirFC() throws InterruptedException {

        Thread.sleep(3000);
        String roomType = fatma2.tabloRoomtypeIlk16.getText();

        for (int i = 0; i < fatma2.tabloRoomtypeAyniList16.size(); i++) {

            Assert.assertEquals(roomType, fatma2.tabloRoomtypeAyniList16.get(i).getText());

        }


    }

    @And("Room Edit'e tiklanir FC.")
    public void roomEditETiklanirFC() {

        fatma2.edit16.click();
    }

    @And("Odanin bilgileri düzenlenir FC.")
    public void odaninBilgileriDuzenlenirFC() {
        fatma2.price16.clear();
        fatma2.price16.sendKeys(Faker.instance().number().digits(4));
        fatma2.roomDescription16.clear();
        fatma2.roomDescription16.sendKeys(Faker.instance().lorem().characters(20));
    }

    @And("Save'e tiklanir FC.")
    public void saveETiklanirFC() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma2.roomSave16);
        //fatma3.roomSave16.click();
    }

    @Then("Secilen odanin guncellendigi test edilir FC.")
    public void secilenOdaninGuncellendigiTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @And("Secilen odanin delete butonuna tiklanir FC.")
    public void secilenOdaninDeleteButonunaTiklanirFC() throws InterruptedException {

        fatma2.delete16.click();
        Thread.sleep(3000);
        fatma2.deleteSure16.click();
    }

    @Then("Odanin silinebildigi test edilir FC.")
    public void odaninSilinebildigiTestEdilirFC() {

        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

}
