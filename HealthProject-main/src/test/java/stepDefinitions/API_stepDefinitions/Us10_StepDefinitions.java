package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointments;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class Us10_StepDefinitions {
    /**
     {
     "createdBy": "esra-hasta",
     "createdDate": "2022-11-17T12:50:28.042533Z",
     "id": 306280,
     "startDate": "2022-11-19T00:00:00Z",
     "endDate": "2022-11-19T01:00:00Z",
     "status": "UNAPPROVED",
     "anamnesis": "        Headache",
     "treatment": "Aspirin",
     "diagnosis": "        Headache\n",
     "prescription": "Aspirin",
     "description": null,
     "physician": {
     "createdBy": "batch81",
     "createdDate": "2022-11-17T16:45:48.543917Z",
     "id": 306322,
     "firstName": "Sifa",
     "lastName": "Acil",
     "birthDate": "1993-11-16T22:00:00Z",
     "phone": "775-610-3854",
     "gender": "MALE",
     "bloodGroup": "Apositive",
     "adress": "",
     "description": "",
     "user": {
     "createdBy": "anonymousUser",
     "createdDate": "2022-11-17T16:26:36.107545Z",
     "id": 307514,
     "login": "acilsifa",
     "firstName": "Sifa",
     "lastName": "Acil",
     "email": "acil@gmail.com",
     "activated": true,
     "langKey": "en",
     "imageUrl": null,
     "resetDate": null,
     "ssn": "123-54-5875"
     },
     "speciality": "DERMATOLOGY",
     "country": {
     "id": 43960,
     "name": "Turkeyy"
     },
     "cstate": null,
     "examFee": 250.00,
     "image": "",
     "imageContentType": null
     },
     "patient": {
     "createdBy": "esra-hasta",
     "createdDate": "2022-11-16T21:08:46.828224Z",
     "id": 304194,
     "firstName": "esra-hasta",
     "lastName": "Deniz",
     "birthDate": null,
     "phone": "456-888-8880",
     "gender": "MALE",
     "bloodGroup": "Apositive",
     "adress": null,
     "email": "ehasta@gmail.com",
     "description": null,
     "user": {
     "createdBy": "anonymousUser",
     "createdDate": "2022-11-16T21:06:27.957545Z",
     "id": 304863,
     "login": "esra-hasta",
     "firstName": "esra-hasta",
     "lastName": "Deniz",
     "email": "ehasta@gmail.com",
     "activated": true,
     "langKey": "en",
     "imageUrl": null,
     "resetDate": null,
     "ssn": "567-09-6754"
     },
     "inPatients": null,
     "country": null,
     "cstate": null
     },
     "ctests": null
     }

     */

    String url;
    Response response;

    @Given("US10 Doctor set the medunna base url")
    public void doctorSetTheMedunnaBaseUrl() {
         url="https://medunna.com/api/appointments/306280";
    }

    @When("US10 Doctor send the request and get the response")
    public void doctorSendTheRequestAndGetTheResponse() {
        response=given().headers("Authorization", "Bearer " + generateToken()).when().get(url);
        response.prettyPrint();
    }

    @Then("US10 Doctor status code should be 200")
    public void doctorStatusCodeShouldBe() {
        response.then().statusCode(200);
    }

    @Then("US10 Doctor verify expected data with Api")
    public void doctorVerifyExpectedDataWithApi() {
        Appointments actualData=response.as(Appointments.class);
        Assert.assertEquals("UNAPPROVED",actualData.getStatus());
        Assert.assertEquals("Sifa",actualData.getPhysician().getUser().getFirstName());
        Assert.assertEquals("acil@gmail.com",actualData.getPhysician().getUser().getEmail());
        Assert.assertEquals("2022-11-19T00:00:00Z",actualData.getStartDate().toString());
        Assert.assertEquals("2022-11-19T01:00:00Z",actualData.getEndDate().toString());


    }


}
