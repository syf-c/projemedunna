package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Us18StepDefinitions {
    MedunnaPage loginPage = new MedunnaPage();
    Select selectGender;
    Select selectSpeciality;
    Select selectBlood;
    Select selectUser;
    Select selectCountry;
    Select selectCity;
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    static String seciliUzmanlikAlani;
    static String ilkMuayeneUcreti;
    static int sayac;
    @And("Kullanici physician sekmesine basar")
    public void kullaniciPhysicianSekmesineBasar() {

        ReusableMethods.waitFor(2);
        ReusableMethods.jsclick(loginPage.physician);
    }

    @Then("Kullanici butun doktorların bilgilerinin goruldugunu test eder")
    public void kullaniciButunDoktorlarınBilgilerininGoruldugunuTestEder() {
        List<Object> expectedDataList = new ArrayList<>();
        expectedDataList.add(2051);
        expectedDataList.add("147-78-7879");
        expectedDataList.add("Steven");
        expectedDataList.add("Stronge");
        expectedDataList.add("10/12/80 00:00");
        expectedDataList.add("0123456789");
        expectedDataList.add("MALE");
        expectedDataList.add("A+");
        expectedDataList.add("Lake Shanelle");
        expectedDataList.add("MEDICAL GENETICS");
        expectedDataList.add(123456789);
        expectedDataList.add("uzman");
        expectedDataList.add("14/12/21 13:40");
        expectedDataList.add(" image/png, 77 723 bytes");
        expectedDataList.add("doktorekrem");
        expectedDataList.add("USA");
        expectedDataList.add("California");
        expectedDataList.add("View");
        expectedDataList.add("Edit");
        expectedDataList.add("Delete");


        List<WebElement> actualDataList =loginPage.firstTable;




        System.out.println("Expected size " + expectedDataList.size());
        System.out.println("Actual size " + actualDataList.size());
        System.out.println("expectedDataList = " + expectedDataList);
       System.out.println("actualDataList = " + actualDataList.get(0).getText());


        for (int i = 0; i < expectedDataList.size(); i++) {
            for (int j = 0; j < actualDataList.size(); j++) {


                if (expectedDataList.get(i).equals(actualDataList.get(j).getText())) {

                    Assert.assertEquals(expectedDataList.get(i), actualDataList.get(j).getText());

                }
            }
        }

    }

    @And("Kullanici administration sekmesine basar")
    public void kullaniciAdministrationSekmesineBasar() {
        ReusableMethods.waitFor(2);
        loginPage.administration.click();
    }

    @And("Kullanici user management sekmesine basar")
    public void kullaniciUserManagementSekmesineBasar() {
        ReusableMethods.waitFor(2);
        loginPage.userManagement.click();
    }

    @And("Kullanici create a new user sekmesine basar")
    public void kullaniciCreateANewUserSekmesineBasar() {
        ReusableMethods.waitFor(2);
        loginPage.createANewUser.click();
    }


    @And("Kullanici login {string} firstname {string} lastname {string} mail {string} SSN {string} rol olarak doktor girer")
    public void kullaniciLoginFirstnameLastnameMailSSNRolOlarakDoktorGirer(String login, String firstname, String lastname, String mail, String ssn) {
        ReusableMethods.waitFor(2);
        loginPage.loginTextBox.sendKeys(login);
        ReusableMethods.waitFor(1);
        loginPage.firstNameTextBox.sendKeys(firstname);
        ReusableMethods.waitFor(1);
        loginPage.lastNameTextBox.sendKeys(lastname);
        ReusableMethods.waitFor(1);
        loginPage.emailTextBox.sendKeys(mail);
        ReusableMethods.waitFor(1);
        loginPage.ssnTextBox.sendKeys(ssn);
        ReusableMethods.waitFor(1);
        Select select = new Select(loginPage.roleDdm);
        select.selectByVisibleText("ROLE_PHYSICIAN");
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici save butonuna basar")
    public void kullaniciSaveButonunaBasar() {
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();", loginPage.saveButton);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici kayitli SSN {string} girer ve dogrulama mesajinin geldigini test eder")
    public void kullaniciKayitliSSNGirerVeDogrulamaMesajininGeldiginiTestEder(String ssn) {
        ReusableMethods.waitFor(2);
        loginPage.userSearch.click();
        loginPage.searchSSN.sendKeys(ssn);
        loginPage.searchUser.click();
        ReusableMethods.waitFor(2);
        //loginPage.dogrulamaMesaji.click();

        Assert.assertTrue(loginPage.userFoundWithSearchSSN.isDisplayed());

    }
    @And("Kullanici kayitli olan doktorun edit butonun tiklar")
    public void kullaniciIdOlanDoktorunEditButonunTiklar() {

        loginPage.firstDoctorfirstEdit.click();
    }


    @And("Kullanici doktora ait yeni bilgileri girer")
    public void kullaniciDoktoraAitYeniBilgileriGirer() {
        ReusableMethods.waitFor(2);
        actions.moveToElement(loginPage.editFirstName).click().perform();
        loginPage.editFirstName.sendKeys(Keys.CONTROL, "a");
        loginPage.editFirstName.sendKeys(Keys.DELETE);

        loginPage.editFirstName.sendKeys("Dr. Steven");
        ReusableMethods.waitFor(2);


        loginPage.editLastName.clear();
        loginPage.editLastName.sendKeys("Stone");
        ReusableMethods.waitFor(2);
        loginPage.editBirthDate.clear();
        loginPage.editBirthDate.sendKeys("03.12.2000 14:12");
        ReusableMethods.waitFor(2);

        loginPage.editPhone.clear();
        loginPage.editPhone.sendKeys("9876543210");
        ReusableMethods.waitFor(2);
        loginPage.editAdress.clear();
        loginPage.editAdress.sendKeys("New York");

        ReusableMethods.waitFor(2);
        selectGender = new Select(loginPage.editGenderDdm);
        selectGender.selectByIndex(2);
        ReusableMethods.waitFor(1);
        selectSpeciality = new Select(loginPage.editSpecialityDdm);
        selectSpeciality.selectByIndex(16);
        ReusableMethods.waitFor(1);
        selectBlood = new Select(loginPage.editBloodGroupDdm);
        selectBlood.selectByIndex(2);
        ReusableMethods.waitFor(1);
        loginPage.editDescriptions.clear();
        loginPage.editDescriptions.sendKeys("UZMAN");
        ReusableMethods.waitFor(1);

        String path = "C:\\Users\\Yaman\\YandexDisk\\Ekran görüntüleri\\2022-12-05_10-22-55.png";
        loginPage.editDosyaSecButton.sendKeys(path);
        ReusableMethods.waitFor(1);
        loginPage.editExamFee.clear();
        loginPage.editExamFee.sendKeys("15000");
        ReusableMethods.waitFor(2);

        selectUser = new Select((WebElement) loginPage.editUserDdm);
        selectUser.selectByIndex(15);
        ReusableMethods.waitFor(1);
        selectCountry = new Select((WebElement) loginPage.editCountryDdm);
        selectCountry.selectByIndex(82);
        ReusableMethods.waitFor(1);
        selectCity = new Select(loginPage.editCityDdm);
        selectCity.selectByIndex(1);
        ReusableMethods.waitFor(1);


    }

    @And("Kullanici save tusuna basar")
    public void kullaniciSaveTusunaBasar() {
        loginPage.editSave.click();
    }

    @Then("Kullanici edit icin dogrulama mesajinin gorundugunu test eder")
    public void kullaniciEditIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertTrue(loginPage.editDoctorUpdated.isDisplayed());

    }


    @And("Kullanici acilan sayfada Create a new Physician butonuna tiklar")
    public void kullaniciAcilanSayfadaCreateANewPhysicianButonunaTiklar() {
        loginPage.createANewPhysician.click();
    }

    @And("Kullanici kayitli SSN {string} girer ve aratir")
    public void kullaniciKayitliSSNGirerVeAratir(String ssn) {
        ReusableMethods.waitFor(2);
        loginPage.userSearch.click();
        loginPage.searchSSN.sendKeys(ssn);
        loginPage.searchUser.click();
        seciliUzmanlikAlani=loginPage.editSpecialityDdm.getAttribute("value");
        System.out.println("seciliUzmanlikAlani = " + seciliUzmanlikAlani);

    }
    @And("Kullanici doktor için gerekli bilgileri girer ve save butonuna basar")
    public void kullaniciDoktorIçinGerekliBilgileriGirerVeSaveButonunaBasar() {
        actions.moveToElement(loginPage.editFirstName).click().perform();
        loginPage.editFirstName.sendKeys(Keys.CONTROL, "a");
        loginPage.editFirstName.sendKeys(Keys.DELETE);
        loginPage.editFirstName.sendKeys("Dr.Uzman");
        ReusableMethods.waitFor(2);
        loginPage.editLastName.clear();
        loginPage.editLastName.sendKeys("Kariyer");
        ReusableMethods.waitFor(2);
        loginPage.editBirthDate.clear();
        loginPage.editBirthDate.sendKeys("05.12.2001 14:12");
        ReusableMethods.waitFor(2);

        loginPage.editPhone.clear();
        loginPage.editPhone.sendKeys("9876543210");
        ReusableMethods.waitFor(2);
        loginPage.editAdress.clear();
        loginPage.editAdress.sendKeys("Ankara");

        ReusableMethods.waitFor(2);
        selectGender = new Select(loginPage.editGenderDdm);
        selectGender.selectByIndex(2);
        ReusableMethods.waitFor(1);
        selectSpeciality = new Select(loginPage.editSpecialityDdm);
        selectSpeciality.selectByIndex(14);
        ReusableMethods.waitFor(1);
        selectBlood = new Select(loginPage.editBloodGroupDdm);
        selectBlood.selectByIndex(2);
        ReusableMethods.waitFor(1);
        loginPage.editDescriptions.clear();
        loginPage.editDescriptions.sendKeys("prof");
        ReusableMethods.waitFor(1);

        String path = "C:\\Users\\Yaman\\YandexDisk\\Ekran görüntüleri\\2022-12-05_10-22-55.png";
        loginPage.editDosyaSecButton.sendKeys(path);
        ReusableMethods.waitFor(1);
        loginPage.editExamFee.clear();
        loginPage.editExamFee.sendKeys("10000");
        actions.sendKeys(Keys.DOWN).perform();
        ReusableMethods.waitFor(2);

        selectUser = new Select((WebElement) loginPage.doctorUserDdm1);
        selectUser.selectByIndex(12);
        ReusableMethods.waitFor(1);
        selectCountry = new Select((WebElement) loginPage.editCountryDdm);
        selectCountry.selectByIndex(82);
        ReusableMethods.waitFor(1);
        selectCity = new Select(loginPage.editCityDdm);
        selectCity.selectByIndex(1);
        ReusableMethods.waitFor(1);
        loginPage.editSave.click();
    }

    @And("Kullanici doktor icin girilen bilgilerin kaydededildigini gorunurlugunu test eder")
    public void kullaniciDoktorIcinGirilenBilgilerinKaydededildiginiGorunurlugunuTestEder() {

        ReusableMethods.waitFor(2);
        actions.moveToElement(loginPage.physicianCreated).perform();
        Assert.assertTrue(loginPage.physicianCreated.isDisplayed());
    }


    @And("Kullanici create a new physician sekmesine basar")
    public void kullaniciCreateANewPhysicianSekmesineBasar() {
        loginPage.createANewPhysician.click();
    }


    @And("Kullanici doktor icin bir uzmanlik alanini secer")
    public void kullaniciDoktorIcinBirUzmanlikAlaniniSecer() {
        actions.sendKeys(Keys.DOWN).perform();
        ReusableMethods.waitFor(1);
        selectSpeciality = new Select(loginPage.editSpecialityDdm);
        selectSpeciality.selectByIndex(3);
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici doktor icin uzmanlik alaninin secildigini test eder")
    public void kullaniciDoktorIcinUzmanlikAlanininSecildiginiTestEder() {
        String secilenUzmanlikAlani=loginPage.editSpecialityDdm.getAttribute("value");
        System.out.println("secilenUzmanlikAlani = " + secilenUzmanlikAlani);
        Assert.assertNotEquals(seciliUzmanlikAlani,secilenUzmanlikAlani);
    }

    @And("Kullanici doktor icin bir profil resmi secer")
    public void kullaniciDoktorIcinBirProfilResmiSecer() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        String path = "C:\\Users\\Yaman\\YandexDisk\\Ekran görüntüleri\\2022-12-08_12-56-59.png";
        loginPage.editDosyaSecButton.sendKeys(path);
        ReusableMethods.waitFor(3);




    }

    @And("Kullanici doktor icin profil resminin secildigini test eder")
    public void kullaniciDoktorIcinProfilResmininSecildiginiTestEder() {
        String exectedImageBoyutu="38 631 bytes";
        String actualImageBoyutu=loginPage.doktorImage.getText();
        System.out.println("exectedImageBoyutu = " + exectedImageBoyutu);
        System.out.println("actualImageBoyutu = " + actualImageBoyutu);
        Assert.assertTrue(actualImageBoyutu.contains(exectedImageBoyutu));
    }

    @And("Kullanici doktorun muayene ucretini girer")
    public void kullaniciDoktorunMuayeneUcretiniGirer() {
        ilkMuayeneUcreti=loginPage.editExamFee.getAttribute("value");
        System.out.println("ilkMuayeneUcreti = " + ilkMuayeneUcreti);
        ReusableMethods.jsScrollClick(loginPage.editExamFee);
        loginPage.editExamFee.sendKeys("2500");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici muayene ucretinin girilebildini test eder")
    public void kullaniciMuayeneUcretininGirilebildiniTestEder() {
        String girilenMuayeneUcreti=loginPage.editExamFee.getAttribute("value");
        System.out.println("girilenMuayeneUcreti = " + girilenMuayeneUcreti);
        Assert.assertNotEquals(ilkMuayeneUcreti,girilenMuayeneUcreti);
    }

    @And("Kullanici son sayfaya gecer")
    public void kullaniciSonSayfayaGecer() {
        ReusableMethods.jsScrollClick(loginPage.doktorSonSayfa);
    }

    @And("Kullanici son sayfadaki SSN {string} olan doktorun delete butona tiklar")
    public void kullaniciSonSayfadakiSSNOlanDoktorunDeleteButonaTiklar(String ssn) {
        sayac = 1;
        List<WebElement> ssnList = loginPage.doktorSonSayfaSSNList;
        System.out.println(ssnList.size());


        for (WebElement i : ssnList) {
            if (i.getText().equals(ssn)) break;
            sayac++;
        }

        WebElement silinecekDoktor = Driver.getDriver().findElement(By.xpath("//tr[" + sayac + "]/td[11]/div/a[3]"));

        js.executeScript("arguments[0].click();", silinecekDoktor);


    }

    @And("Kullanici cikan uyari mesajinda delete butonuna basar")
    public void kullaniciCikanUyariMesajindaDeleteButonunaBasar() {
        ReusableMethods.waitFor(1);
sayac=+1;
        WebElement deleteButton=Driver.getDriver().findElement(By.xpath("(//*[text()='Delete'])["+ sayac + "]"));
        ReusableMethods.jsclick(deleteButton);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici delete icin dogrulama mesajinin gorundugunu test eder")
    public void kullaniciDeleteIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertTrue(loginPage.deleteDogrulamaMesaji1.isDisplayed());
    }


    @Given("Kullanici doktoru secebilir")
    public void kullaniciDoktoruSecebilir() throws IOException {
        ReusableMethods.waitFor(3);
        loginPage.secilenDoktor.click();
        ReusableMethods.waitFor(4);
    }

    @Then("Kullanici physician secilebilir oldugunu dogrular")
    public void kullaniciPhysicianSecilebilirOldugunuDogrular() {
        Assert.assertTrue(loginPage.secilenDoktorHataMesaji.isDisplayed());
    }
}
