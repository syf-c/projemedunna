package stepDefinitions.API_stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Country;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class Us28StepDefinitions { //TODO

    static RequestSpecification spec;
    static Response response;
    static Country expectedData;
    static String countryId;
    static String countryName;


    @Given("Admin set the url for post request US28")
    public void adminSetTheUrlForPostRequestUS28() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api","second",   "countries");
    }

    @When("Admin enter the expected datas for post request US28")
    public void adminEnterTheExpectedDatasForPostRequestUS28() {

        expectedData = new Country(null,"AhmetPostUlke01");
    }

    @When("Admin send the post request and get the response US28")
    public void adminSendThePostRequestAndGetTheResponseUS28() {
        response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).
                headers("Authorization", "Bearer " + generateToken()).
                when().post("/{first}/{second}");
        response.prettyPrint();

    }


    @Then("Admin checked status code should be {int} US28")
    public void adminCheckedStatusCodeShouldBeUS28(int statusCode) {
        assertEquals(statusCode,response.getStatusCode());
    }

    @Then("Admin verify the post request expected data with Api US28")
    public void adminVerifyThePostRequestExpectedDataWithApiUS28() {
        Country actualData = response.as(Country.class);
        assertEquals(expectedData.getName(),actualData.getName());
        countryId = actualData.getId().toString();
        countryName = actualData.getName().toString();
    }

    @Given("Admin set the url for delete request US28")
    public void adminSetTheUrlForDeleteRequestUS28() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api","second",   "countries","third",countryId);
    }

    @When("Admin send the delete request and get the response US28")
    public void adminSendTheDeleteRequestAndGetTheResponseUS28() {
        response = given().spec(spec).contentType(ContentType.JSON).body(""). // body bos gonderilmezse hata veriyor !!!
                headers("Authorization", "Bearer " + generateToken()).
                delete("/{first}/{second}/{third}");

                String message = countryId+" id numarali" + " " +countryName +" ulkesinin silindigi dogrulanmistir.";
        if(response.prettyPrint().isEmpty()){
            System.out.println(message);
        }
    }

    @Given("Admin set the url for put request US28")
    public void adminSetTheUrlForPutRequestUS28() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api","second",   "countries");
    }

    @When("Admin enter the expected datas for put request US28")
    public void adminEnterTheExpectedDatasForPutRequestUS28() {
        System.out.println("countryId = " + countryId);
        expectedData = new Country(countryId,"AhmetPutUlke"); // countryId  US28_TC07 scenario'sunda oluşturulan ulkenin id'si
    }
    @When("Admin send the put request and get the response US28")
    public void adminSendThePutRequestAndGetTheResponseUS28() {
        response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).
                headers("Authorization", "Bearer " + generateToken()).
                when().put("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("Admin verify the put request expected data with Api US28")
    public void adminVerifyThePutRequestExpectedDataWithApiUS28() {
        Country actualData = response.as(Country.class);
       assertEquals(expectedData.getName(), actualData.getName());
       assertEquals(expectedData.getId(), actualData.getId().toString()); // expectedData.getId() bize String, actualData.getId() ise int bir deger dondurdugu icin toString() kullandık

        String message = countryId + " id numarali " + countryName + " ulke isminin " + actualData.getName() + " olarak guncellendigi dogrulanmistir.";
        if (expectedData.getName().equals(actualData.getName())) {
            System.out.println(message);
        }
    }
}
