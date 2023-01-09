package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

public class Us10_StepDefinitions {

    String query;
    @Given("US10 Connect to database")
    public void connectToDatabase() {
        DatabaseUtility.createConnection();
    }

    @Then("US10 Get appointment information of all patients from the table")
    public void getAppointmentInformationOfAllPatientsFromTheTable() {
        query="select * from appointment where physician_id=(select id from physician where first_name='Sifa')";

        System.out.println("Randevu id :" + DatabaseUtility.getColumnData(query, "id"));
        System.out.println("Randevu Start_Date :" + DatabaseUtility.getColumnData(query, "start_date"));
        System.out.println("Randevu End_Date :" + DatabaseUtility.getColumnData(query, "end_date"));
        System.out.println("Randevu Status :" + DatabaseUtility.getColumnData(query, "status"));
    }

    @Then("US10 The verify query result")
    public void theVerifyQueryResult() {
        Assert.assertEquals((long)306280,DatabaseUtility.getColumnData(query, "id").get(0));
        Assert.assertEquals("2022-11-19 00:00:00.0",DatabaseUtility.getColumnData(query, "start_date").get(0).toString());
        Assert.assertEquals("2022-11-19 01:00:00.0",DatabaseUtility.getColumnData(query, "end_date").get(0).toString());
        Assert.assertEquals("UNAPPROVED",DatabaseUtility.getColumnData(query, "status").get(0));

    }
}
