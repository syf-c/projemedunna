package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Us28StepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    static String createdCountryId; // Olusturulan ulke ID'lerini gecici olarak saklamak icin container
    static String ulkeAdi;
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    @Then("Kullanici Country linkine tiklar US28")
    public void kullaniciCountryLinkineTiklar() {
        ReusableMethods.jsclick(medunnaPage.countryLink);
    }

    @Then("Kullanici Create a new Country butonuna tiklar US28")
    public void kullaniciCreateANewCountryButonunaTiklar() {
        ReusableMethods.waitForVisibility(medunnaPage.createANewCountry,10);
        medunnaPage.createANewCountry.click();
    }

    @Then("Kullanici Name kismina yeni ulke ismi olarak {string} girer US28")
    public void kullaniciNameKisminaYeniUlkeIsmiOlarakGirer(String countryName) {
        medunnaPage.nameTextBoxCreateOrEditANewCountry.sendKeys(countryName);
        ulkeAdi=countryName;
    }

    @Then("Kullanici Save butonuna tiklar US28")
    public void kullaniciSaveButonunaTiklar() {
        medunnaPage.saveButon.click();
    }

    @Then("Kullanici ekranda {string} mesajini gorur ve olusturulan yeni ulkenin id numarasini not eder US28")
    public void kullaniciEkrandaMesajiniGorurVeOlusturulanYeniUlkeninIdNumarasiniNotEder(String expectedMessage) {
        String actualMessage = medunnaPage.toastifyCountryMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
        List<String> textWordList = List.of(actualMessage.split(" "));
        createdCountryId = textWordList.get(7);
        System.out.println("createdCountryId = " + createdCountryId);

    }

    @Then("Kullanici kaydedilen id'li ulkenin oldugu sirdaki delete butonuna tiklar US28")
    public void kullaniciKaydedilenIdLiUlkeninOlduguSirdakiDeleteButonunaTiklar() {
        WebElement specialCountryIdDeleteButon = Driver.getDriver().findElement(By.xpath("//a[@href='/country/"+createdCountryId+"/delete']"));

        ReusableMethods.waitForClickablility(specialCountryIdDeleteButon,5);
        ReusableMethods.jsScrollClick(specialCountryIdDeleteButon);

    }


    @Then("Kullanici ekranda cikan {string} mesajini gorur US28")
    public void kullaniciEkrandaCikanMesajiniGorur(String expectedMessage) {
        assertTrue(medunnaPage.countriesDeleteButonConfirmMessage.getText().contains(expectedMessage));
    }

    @Then("Kullanici delete butonuna tiklar US28")
    public void kullaniciDeleteButonunaTiklar() {
        ReusableMethods.waitForClickablility(medunnaPage.countriesDeleteConfirmButon,10); // delete onay butonu cikana kadar bekliyor
        medunnaPage.countriesDeleteConfirmButon.click(); // delete onay butonuna tikliyor
    }

    @Then("Kullanici delete butonuna tiklar ve cikan uyarida {string} mesajini gorur US28")
    public void kullaniciDeleteButonunaTiklarVeCikanUyaridaMesajiniGorur(String expectecMessage) {
        ReusableMethods.jsScrollClick(medunnaPage.countriesDeleteConfirmButon);
        ReusableMethods.waitForVisibility(medunnaPage.toastifyCountryMessage,5);
        assertTrue(medunnaPage.toastifyCountryMessage.getText().contains(expectecMessage));



    }

    @Then("Kullanici acilan sayfada silinen ulke id'sinin olmadigini dogrular US28")
    public void kullaniciAcilanSayfadaSilinenUlkeIdSininOlmadiginiDogrularUS28() {
        ReusableMethods.waitForPageToLoad(10);
        List<String> currentIdList = new ArrayList<>(); // tüm id'ler için List oluşturuyoruz
        for (WebElement w:medunnaPage.countriesIdList) { // id'leri liste atıyoruz
            currentIdList.add(w.getText());
        }
        assertFalse(currentIdList.contains(createdCountryId)); // list, ilk basta olusturulan Country'i iceriyor mu diye kontrol edriyoruz
    }

    @Then("Kullanici StateCity linkine tiklar US28")
    public void kullaniciStateCityLinkineTiklar() {
        ReusableMethods.jsScrollClick(medunnaPage.stateCityLink);
    }

    @Then("Kullanici Create a new StateCity butonuna tiklar US28")
    public void kullaniciCreateANewStateCityButonunaTiklar() {
        ReusableMethods.jsScrollClick(medunnaPage.createANewStateCity);
    }

    @Then("Kullanici Name kismina Eyalet&Sehir {string} ismi girer US28")
    public void kullaniciNameKisminaEyaletSehirIsmiGirer(String eyaletIsmi) {
        medunnaPage.createOrEditStateCityNameTextBox.sendKeys(eyaletIsmi);
    }

    @Then("Kullanici StateCity kismini {string} olarak secer US28")
    public void kullaniciStateCityKisminiTurkiyemOlarakSecer(String ulke) {
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.TAB).perform();
        }
           actions.sendKeys(ulke).perform();

    }

    @Then("Kullanici cikan uyari mesajinda {string} metnini gormemelidir US28")
    public void kullaniciCikanUyariMesajindaMetniniGormemelidirUS28(String toastifyMessage) {
        ReusableMethods.waitForVisibility(medunnaPage.toastifyCountryMessage,10);
        System.out.println("medunnaPage.toastifyCountryMessage.getText() = " + medunnaPage.toastifyCountryMessage.getText());
        assertFalse(medunnaPage.toastifyCountryMessage.getText().contains(toastifyMessage)); // Burada BUG var
    }

}
