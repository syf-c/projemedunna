package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getRowMap;

public class Us27_StepDefinions {
    Map<String,Object> actualData;
    @Given("Database'e baglan US27")
    public void databaseEBaglanUS() {
        createConnection();
    }

    @When("Tablodan ileti bilgilerini getir US27")
    public void tablodanIletiBilgileriniGetirUS() {
        actualData = getRowMap("select * from cmessage where id=364775");
        System.out.println("actualData = " + actualData);
    }

    @Then("Sorgu Query sonuclarini dogrula US27")
    public void sorguQuerySonuclariniDogrulaUS() {
         /*
        "id: 364775,
        name: testNG22,
        email: deneme2@deneme.com,
        subject: Hangi framework222,
        message: TestNG daha stabil calisiyor222"
         */

        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("id",(long)364775);
        expectedData.put("name","testNG22");
        expectedData.put("email","deneme2@deneme.com");
        expectedData.put("subject","Hangi framework222");
        expectedData.put("message","TestNG daha stabil calisiyor222");

        System.out.println("expectedData = " + expectedData);


        assertEquals(expectedData.get("id"),actualData.get("id"));
        assertEquals(expectedData.get("name"),actualData.get("name"));
        assertEquals(expectedData.get("email"),actualData.get("email"));
        assertEquals(expectedData.get("subject"),actualData.get("subject"));
        assertEquals(expectedData.get("message"),actualData.get("message"));
    }
}
