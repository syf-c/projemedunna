package stepDefinitions.DB_stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.getRowMap;

public class Us19_StepDefinitions {


   Map<String,Object> actualMap;
    @Given("Kullanici connection kurarYY")
    public void kullaniciConnectionKurarYY() {
        DatabaseUtility.createConnection();
    }

    @Then("Kullanici query olustururYY")
    public void kullaniciQueryOlustururYY() {
        String query="select * from  staff where id=367707";
        actualMap=getRowMap(query);
    }

    @Then("Kullanici staff bilgilerini dogrularYY")
    public void kullaniciStaffBilgileriniDogrularYY() {

        String expectedUSer="367707";
        String expectedfirs="tayfun";
        String expectedlast="sönmez";


        assertEquals(expectedUSer,actualMap.get("id").toString());
        assertEquals(expectedfirs,actualMap.get("first_name"));
        assertEquals(expectedlast,actualMap.get("last_name"));



    }



}
