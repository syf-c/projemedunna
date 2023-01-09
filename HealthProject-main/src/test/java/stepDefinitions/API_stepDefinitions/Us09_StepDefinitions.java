package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import pojos.Patient09;
import utilities.Authentication;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Us09_StepDefinitions extends Authentication {


    Response response;
    @Then("US9 GET request gonderir")
    public void usGETRequestGonderir() {

        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/patients/341219");
        //response.prettyPrint();
    }

    @And("US9 status kodunun 200 oldugu gorulur")
    public void usStatusKodununOlduguGorulur() {
        response.then().statusCode(200);
    }

    @And("US9 tum hasta bilgilerini API response ile alir")
    public void usTumHastaBilgileriniAPIResponseIleAlir() {

        Patient09 actualData = response.as(Patient09.class);
        System.out.println(actualData);

        assertEquals("fatmacimen", actualData.getCreatedBy());
        assertEquals(341219, actualData.getId());
        assertEquals("fatma", actualData.getFirstName());
        assertEquals("cimen", actualData.getLastName());
        assertEquals(null, actualData.getBirthDate());
        assertEquals("5528552514", actualData.getPhone());
        assertEquals("f@mn.com", actualData.getEmail());
        assertEquals("fatmacimen", actualData.getUser().getCreatedBy());
        assertEquals("2022-11-26T13:43:16.863782Z", actualData.getUser().getCreatedDate());
        assertEquals("2022-11-26T13:43:16.863782Z", actualData.getUser().getCreatedDate());
        assertEquals("user_112233445_56677889991669470196761", actualData.getUser().getLogin());
        assertEquals("user_112233445_56677889991669470196761", actualData.getUser().getLogin());
        assertEquals(null, actualData.getAppointments());

    }


}
