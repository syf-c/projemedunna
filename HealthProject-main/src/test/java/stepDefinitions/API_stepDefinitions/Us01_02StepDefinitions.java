package stepDefinitions.API_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Us01ApiRegisterPojo;
import pojos.Us02ApiUserPojo;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;


public class Us01_02StepDefinitions {
    static RequestSpecification spec;
    static Response response;
    static Us01ApiRegisterPojo expectedData;
    static Us02ApiUserPojo expectedData2;



    @Given("Kullanici  bilgileri dogrularr")
    public void kullanici_bilgileri_dogrularr() throws IOException {
        Us01ApiRegisterPojo actualData=response.as(Us01ApiRegisterPojo.class);

        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getSsn(),actualData.getSsn());
        assertEquals(expectedData.getLogin(),actualData.getLogin());



    }

    @Then("Kullanici expected datalari girerr")
    public void kullanici_expected_datalari_girerr() {
        Faker faker=new Faker();
        expectedData=new Us01ApiRegisterPojo(faker.name().username(), faker.name().firstName(),
                faker.name().lastName(), faker.idNumber().ssnValid(), faker.internet().emailAddress(),
                faker.internet().password());

    }


    @When("Kullanici request gonderir ve response alirr")
    public void kullanici_request_gonderir_ve_response_alirr() {
        response=given().spec(spec).contentType(ContentType.JSON).body(expectedData).when()
                .post("/{first}");
        response.prettyPrint();
    }
    @Then("Kullanici API icin Url set ederr")
    public void kullanici_apı_icin_url_set_ederr() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParam("first", "register");
    }


    @Given("Kullanici tum kayit bilgilerini Get request ile getirebilmelidir")
    public void kullaniciTumKayitBilgileriniGetRequestIleGetirebilmelidir() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/user");
        response.prettyPrint();
    }


    @Given("Kullanici adi ve email dogrulamak icin gerekli requesti yollar")
    public void kullaniciAdiVeEmailDogrulamakIcinGerekliRequestiYollar() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/users");
        response.prettyPrint();
    }

    @When("Status code {int} olmalidir")
    public void statusCodeOlmalidir(int arg0) {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Then("Kullanici sonucu dogrular")
    public void kullaniciSonucuDogrular() {
        assertTrue(response.asString().contains("antonia.hagenes@hotmail.com"));
        assertTrue(response.asString().contains("iona.stamm"));
    }
}