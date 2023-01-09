package stepDefinitions.UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Methodlar.*;

public class Us20StepDefinitions {

   MedunnaPage obj2=new MedunnaPage();
    @Given("Admin20 {string} adresine gider")
    public void adminAdresineGider( String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
    }

    @Then("Admin20 Giris simgesine tiklar")
    public void adminGirisSimgesineTiklar() {

        obj2.userIcon.click();
    }

    @Then("Admin20 Sign in simgesine tiklar")
    public void adminSignInSimgesineTiklar() {
        obj2.yysign.click();

    }

    @Then("Admin20 Username alanina gecerli bir username {string} girer")
    public void adminUsernameAlaninaGecerliBirUsernameGirer( String usurname) {
        obj2.yyusurname.sendKeys(usurname);
    }

    @Then("Admin20 Password alanina gecerli bir password {string} girer")
    public void adminPasswordAlaninaGecerliBirPasswordGirer( String password) {
        obj2.yypassword.sendKeys(password);
    }

    @Then("Admin20 Sign in butonuna tiklar")
    public void adminSignInButonunaTiklar() {
        obj2.yysign2.click();
    }

    @Then("Admin20 Administratiton sekmesine tiklar")
    public void adminAdministratitonSekmesineTiklar() {
        obj2.administrationYY.click();
    }

    @And("Admin20  User management sekmesine tiklar")
    public void adminUserManagementSekmesineTiklar() {
        obj2.userManagementYY.click();
    }

    @Then("Admin20 sececegi kullanicinin  View butonuna tiklar")
    public void adminSececegiKullanicininViewButonunaTiklar() {
        ReusableMethods.waitFor(2);
        obj2.editYY.click();
    }

    @Then("Admin20 sectigi kullanicinin bilgilerini yazdirir")
    public void adminsectigikullanicininbilgileriniyazdirir() {
        ReusableMethods.waitFor(3);
        String valueFirstName=obj2.value1YY.getAttribute("value");
        System.out.println("valueFirstName = " + valueFirstName);
        String valueLastName=obj2.value2YY.getAttribute("value");
        System.out.println("valueLastName = " + valueLastName);
        String valueEmail=obj2.value3YY.getAttribute("value");
        System.out.println("valueEmail = " + valueEmail);

    }


    @Then("Admin20 yeni bir kullanici olusturur")
    public void adminYeniBirKullaniciOlusturur() {
        butunrolleriOlusturma();

    }

    @Then("Admin20 personeli silebilmelidir")
    public void Admin20personelisilebilmelidir() {
        usersilme();
    }

    @And("Admin20 sayfayi kapatir")
    public void adminSayfayiKapatir() {

        Driver.quitDriver();
    }

}
