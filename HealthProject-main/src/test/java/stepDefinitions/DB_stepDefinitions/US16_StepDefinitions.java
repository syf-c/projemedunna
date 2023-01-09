package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static utilities.DatabaseUtility.getRowMap;

public class US16_StepDefinitions {

    Map<String,Object> actualMap;

    @Given("US16TC17 Kullanici connection kurar.")
    public void usTCKullaniciConnectionKurar() {

        DatabaseUtility.createConnection();
    }

    @And("US16TC17 Kullanici query olusturur.")
    public void usTCKullaniciQueryOlusturur() {

        String query="select * from room where id=372491";
        actualMap=getRowMap(query);
        System.out.println(actualMap);
    }

    @Then("US16TC17 Kullanici oda bilgilerini dogrular.")
    public void usTCKullaniciOdaBilgileriniDogrular() {

        assertEquals("372491",actualMap.get("id").toString());
        assertEquals("orman manzarali",actualMap.get("description"));
        assertEquals("3185",actualMap.get("room_number").toString());
        assertEquals("9000.00",actualMap.get("price").toString());
        assertEquals("TWIN",actualMap.get("room_type"));
        assertEquals("2022-12-05 15:55:39.102687",actualMap.get("created_date").toString());
    }
}
