package stepDefinitions.API_stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Test;
import pojos.Us17ApiTestItemPojo;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class Us17_StepDefinitions {
    Response response;
    Response response1;

   static RequestSpecification spec;
static Us17ApiTestItemPojo expectedData;
static Us17ApiTestItemPojo expectedData1;
    static Us17ApiTestItemPojo actualData;

    static Us17ApiTestItemPojo actualData1;

    @Given("kullanici test item bilgileri icin get request yapar")
    public void kullaniciTestItemBilgileriIcinGetRequestYapar() {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("testItem_getEndpoint"));

        response.prettyPrint();
    }
    @And("Kulanici Get request icin status kodu {int} oldugunu test eder")
    public void kulaniciGetRequestIcinStatusKoduOldugunuTestEder(int kod) {
        response.then().assertThat().statusCode(kod);
    }





    @Given("Kullanici idsi {int} olan test-items icin expected datalari girer")
    public void kullaniciIdsiOlanTestItemsIcinExpectedDatalariGirer(int arg0) {
    //  expectedData = new Us17ApiTestItemPojo("maryhannah", "2022-03-19T07:31:17.476885Z","120", "50", "mg/dL", 33020, "Cruz test", 130.00);


       System.out.println("expectedData = " + expectedData);

    }
    @And("Kullanici idsi {int} test-items icin get request yapar")
    public void kullaniciIdsiTestItemsIcinGetRequestYapar(int arg0) {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("testItem_getEndpoint_33020"));
        response.then().assertThat().statusCode(200);
        actualData=response.as(Us17ApiTestItemPojo.class);
        System.out.println("actualData = " + actualData);

    }

    @Then("Kullanici get request yapilan test-items icin bilgileri dogrular")
    public void kullaniciGetRequestYapilanTestItemsIcinBilgileriDogrular() {
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getDefaultValMin(),actualData.getDefaultValMin());
        assertEquals(expectedData.getDefaultValMax(),actualData.getDefaultValMax());
    }


    @Given("Kullanici expected datalari girer")
    public void kullaniciExpectedDatalariGirer() {

        expectedData1=new Us17ApiTestItemPojo("batch81","2022-12-12T17:21:13.204Z","210","80","konya42",null,"hasan4m5man",252.00);


    }

    @And("Kullanici request gonderir ve response alir")
    public void kullaniciRequestGonderirVeResponseAlir() {
        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
        spec.pathParams("first","api","second","c-test-items");
        response=given().spec(spec).headers("Authorization","Bearer " + generateToken()).body(expectedData1).when().post("/{first}/{second}");



    actualData1= ObjectMapperUtils.convertJsonToJava(response.asString(),Us17ApiTestItemPojo.class);


    }

    @And("Kullanici  status kodu {int} oldugunu dogrular")
    public void kullaniciStatusKoduOldugunuDogrular(int statusKode) {
        //assertEquals(statusKode,response.getStatusCode());
    }
}
