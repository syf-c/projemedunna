package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.MessagePojo;
import pojos.MessagePostPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US027_StepDefinitions {
    String url;
    String url2;
    MessagePostPojo expectedData;
    MessagePojo expextedData2;
    Response response;
    Response response2;

    @Given("Kullanici post islemi icin endpoint olusturur US27")
    public void kullanici_post_islemi_icin_endpoint_olusturur() {

        url = "https://medunna.com/api/c-messages";

    }

    @When("Kullanici post islemi icin expectedData olusturur US27")
    public void kullanici_post_islemi_icin_expected_data_olusturur() {

        expectedData = new MessagePostPojo("abc@123com", "havalar yagmurlu", "XC90", "Cucumber");
        System.out.println("expectedData = " + expectedData);

    }

    @When("Kullanici token alip POST REQUEST yapar ve response alir US27")
    public void kullanici_token_alip_post_request_yapar_ve_response_alir() {

        response = given().headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().post(url);

        response.prettyPrint();

    }

    @Then("Kullanici post islemi icin dogrulamalari yapar US27")
    public void kullanici_post_islemi_icin_dogrulamalari_yapar() {

        MessagePostPojo actualData = response.as(MessagePostPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(201, response.getStatusCode());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getSubject(), actualData.getSubject());

    }

    @Given("Kullanici get islemi icin endpoint olusturur US27")
    public void kullanici_get_islemi_icin_endpoint_olusturur() {

        url2 = "https://medunna.com/api/c-messages/376535";

    }

    @When("Kullanici get islemi icin expectedData olusturur US27")
    public void kullanici_get_islemi_icin_expected_data_olusturur() {

        expextedData2 = new MessagePojo("deneme@deneme.com", 376535, "TestNG daha stabil calisiyor", "TestNG", "Framework");
        System.out.println("expextedData2 = " + expextedData2);

    }
    /*
{
    "id": 376535,
    "name": "TestNG",
    "email": "deneme@deneme.com",
    "subject": "Framework",
    "message": "TestNG daha stabil calisiyor"
}
     */

    @When("Kullanici token alip GET REQUEST yapar ve response alir US27")
    public void kullanici_token_alip_get_request_yapar_ve_response_alir() {
        response2 = given().headers("Authorization", "Bearer " + generateToken()).when().get(url2);
        response2.prettyPrint();

    }

    @Then("Kullanici get islemi icin dogrulamalari yapar US27")
    public void kullanici_get_islemi_icin_dogrulamalari_yapar() {
        MessagePojo actualData2 = response2.as(MessagePojo.class);
        System.out.println("actualData2 = " + actualData2);

           assertEquals(200, response2.getStatusCode());
           assertEquals(expextedData2.getMessage(),actualData2.getMessage());
           assertEquals(expextedData2.getId(), actualData2.getId());
           assertEquals(expextedData2.getName(), actualData2.getName());
           assertEquals(expextedData2.getEmail(), actualData2.getEmail());
           assertEquals(expextedData2.getSubject(), actualData2.getSubject());
           assertEquals(expextedData2.getMessage(), actualData2.getMessage());

    }

}
