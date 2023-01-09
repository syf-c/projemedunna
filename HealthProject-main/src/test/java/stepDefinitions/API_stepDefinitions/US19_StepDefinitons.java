package stepDefinitions.API_stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Country;
import pojos.US19_GetPojo;
import pojos.User;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US19_StepDefinitons {

    User user=new User();

    RequestSpecification spec;
    Response response;
    @Then("GET request gonderirYY")
    public void getRequestGonderirYY() {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("api", "staff",  "second","367707");

    }

    @Then("status kodunun {int} oldugu dogrulanirYY")
    public void statusKodununOlduguDogrulanirYY(int statusCode) {
        response=given().spec(spec).headers("Authorization", "Bearer " + generateToken()).get("{api}/{second}");
        assertEquals(statusCode, response.getStatusCode());
        response.prettyPrint();

    }

    @And("gereken endpoint ayarlanirYY")
    public void gerekenEndpointAyarlanirYY() {
        User user=new User(367707,"altan","863-95-6872","tayfun","sönmez","teksimsahibi@gmail.com",null,true,"en","anonymousUser","2022-12-02T06:31:37.176555Z",null);

        Country country=new Country(80065,"USA");

        US19_GetPojo expectedData=new US19_GetPojo("tayfun","sönmez","0123456798","MALE","Bpositive","Apt. 155 350 Janee Camp, East Brandenland, MI 55662",user);

        US19_GetPojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),US19_GetPojo.class);

       assertEquals(expectedData.getFirstName(),actualData.getFirstName());
       assertEquals(expectedData.getLastName(),actualData.getLastName());
       assertEquals(expectedData.getPhone(),actualData.getPhone());
       assertEquals(expectedData.getGender(),actualData.getGender());
       assertEquals(expectedData.getAdress(),actualData.getAdress());









    }
}
