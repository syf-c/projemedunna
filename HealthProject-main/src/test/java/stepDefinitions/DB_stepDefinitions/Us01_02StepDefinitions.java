package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Us01_02StepDefinitions {
    List<Object> actualData;
    @Given("Kullanici database ile connection kurar")
    public void kullaniciDatabaseIleConnectionKurar() {
        DatabaseUtility.createConnection();
    }

    @Then("Kullanıcı kayitli kisileri {string} ve {string} komutlariyla getirir")
    public void kullanıcıKayitliKisileriKomutlariylaGetirir(String query, String columnname) {
        actualData=DatabaseUtility.getColumnData(query, columnname);
    }

    @And("kullanıcı bilgilerini dogrular")
    public void kullanıcıBilgileriniDogrular() {
        assertTrue(actualData.contains("100-10-1010"));
        System.out.println(actualData);
        System.out.println("Aranan SSN tabloda bulunmaktadir");

    }

    @And("kullanıcı mert bilgilerini dogrular")
    public void kullanıcıMertBilgileriniDogrular() {
        assertTrue(actualData.contains("ismailmertdemirci@gmail.com"));
        System.out.println(actualData);
    }
}
