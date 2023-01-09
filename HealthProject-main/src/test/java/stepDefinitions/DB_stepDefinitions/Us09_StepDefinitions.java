package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.*;

public class Us09_StepDefinitions {

    Map<String,Object> actualData;

    @Given("us09Connect to database")
    public void us09connectToDatabase() {
        createConnection();
    }

    @And("us09According to the SSN value in the table, the user receives all information")
    public void us09accordingToTheSSNValueInTheTableTheUserReceivesAllInformation() {
        String query="Select * from jhi_user where ssn='879-54-6215'";
        System.out.println(getRowMap(query));
        actualData=getRowMap(query);
    }

    @Then("us09Verify  query result")
    public void us09verifyQueryResult() {
        assertEquals("did not match","fatma",actualData.get("first_name"));
        assertEquals("did not match","cimen",actualData.get("last_name"));
        assertEquals("did not match","f@mn.com",actualData.get("email"));
        assertEquals("did not match","fatmacimen",actualData.get("login"));
    }
}
