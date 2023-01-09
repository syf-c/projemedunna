package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Us28_StepDefinitions {
    @Given("Kullaninici Medunna Data Base'e baglanir US28")
    public void kullaniniciMedunnaDataBaseEBaglanirUS28() {
        DatabaseUtility.createConnection();
    }

    @Then("Kullanici {string} tablosundan {string} idli Ulkeyi sorgular ve olustugunu dogrular US28")
    public void kullaniciTablosundanIdliUlkeyiSorgularVeOlustugunuDogrularUS28(String tabloAdi, String countryId) {
        String countryQuery = "Select * from " + tabloAdi + " where id = " + countryId;
        System.out.println("countryQuery = " + countryQuery);
        DatabaseUtility.executeQuery(countryQuery);

        List<Object> actualData =DatabaseUtility.getRowList(countryQuery);

        List<Object> expectedData = new ArrayList<>();

        expectedData.add(0, "238498");
        expectedData.add(1, "Amerika");

        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);

        for (int i = 0; i < expectedData.size(); i++) {

            assertEquals("Beklenen eslesme bulunamadi" , expectedData.get(i),actualData.get(i).toString());
        }
    }

    @And("Kullanici {string} tablosundan {string} idli State Cityi sorgular ve olustugunu dogrular US28")
    public void kullaniciTablosundanIdliStateCityiSorgularVeOlustugunuDogrular(String tabloAdi, String countryId) {
        String c_stateQuery = "Select * from " + tabloAdi + " where id= " + countryId;
        System.out.println("c_stateQuery = " + c_stateQuery);
        DatabaseUtility.executeQuery(c_stateQuery);

        List<Object> actualData = DatabaseUtility.getRowList(c_stateQuery);

        List<Object> expectedData = new ArrayList<>();
        expectedData.add(0,"1315");
        expectedData.add(1,"Bolu");
        expectedData.add(2,"1202");

        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);


        for (int i = 0; i < expectedData.size(); i++) {
            assertEquals("Beklenen eslesme bulunamadi" ,expectedData.get(i), actualData.get(i).toString());
        }
    }
}
