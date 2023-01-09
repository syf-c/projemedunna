package stepDefinitions.API_stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Physician;
import pojos.User;
import utilities.ConfigReader;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class Us18_StepDefinitions {
    Response response;
    static Physician expectedPojo;
    static  User dataPojo;

    @Given("Kullanici idsi {int} Physician  icin get request yapar")
    public void kullaniciIdsiPhysicianIcinGetRequestYapar(int id) {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("US018_Physician_get_request"));

        response.prettyPrint();

    }

    @Then("Kullanici get request yapilan Physician icin bilgilerini dogrular")
    public void kullaniciGetRequestYapilanPhysicianIcinBilgileriniDogrular() {


        dataPojo = new User(221729, "team52doktor", "123-31-6446", "team52doktor",
                "team52doktor", "abdurrahman.kurin@gmail.com", null, true, "en", "anonymousUser",
                "2022-08-23T17:20:58.102852Z", null);

        expectedPojo = new Physician("team52", "2022-08-23T17:35:32.635587Z", 219366,
                "abdurrahman", "abdurrahman", "2000-08-22T21:00:00Z", "5444187654", "MALE",
                "Apositive", "1 Bear Pl Unit 97045", "",dataPojo,
                "ALLERGY_IMMUNOLOGY", null, null,350.00, "", null);



        Physician actualPojo = response.as(Physician.class);


        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedPojo.getCreatedBy(), actualPojo.getCreatedBy());
        Assert.assertEquals(expectedPojo.getCreatedDate(), actualPojo.getCreatedDate());
        Assert.assertEquals(expectedPojo.getId(), actualPojo.getId());
        Assert.assertEquals(expectedPojo.getFirstName(), actualPojo.getFirstName());
        Assert.assertEquals(expectedPojo.getFirstName(), actualPojo.getLastName());
        Assert.assertEquals(expectedPojo.getBirthDate(), actualPojo.getBirthDate());
        Assert.assertEquals(expectedPojo.getPhone(), actualPojo.getPhone());
        Assert.assertEquals(expectedPojo.getGender(), actualPojo.getGender());
        Assert.assertEquals(expectedPojo.getBloodGroup(), actualPojo.getBloodGroup());
        Assert.assertEquals(expectedPojo.getAdress(), actualPojo.getAdress());
        Assert.assertEquals(expectedPojo.getDescription(), actualPojo.getDescription());
        Assert.assertEquals(dataPojo.getCreatedBy(), actualPojo.getUser().getCreatedBy());
        Assert.assertEquals(dataPojo.getCreatedDate(), actualPojo.getUser().getCreatedDate());
        Assert.assertEquals(dataPojo.getId(), actualPojo.getUser().getId());
        Assert.assertEquals(dataPojo.getLogin(), actualPojo.getUser().getLogin());
        Assert.assertEquals(dataPojo.getFirstName(), actualPojo.getUser().getFirstName());
        Assert.assertEquals(dataPojo.getLastName(), actualPojo.getUser().getLastName());
        Assert.assertEquals(dataPojo.getEmail(), actualPojo.getUser().getEmail());
        Assert.assertEquals(dataPojo.isActivated(), actualPojo.getUser().isActivated());
        Assert.assertEquals(dataPojo.getLangKey(), actualPojo.getUser().getLangKey());
        Assert.assertEquals(dataPojo.getImageUrl(), actualPojo.getUser().getImageUrl());
        Assert.assertEquals(dataPojo.getResetDate(), actualPojo.getUser().getResetDate());
        Assert.assertEquals(dataPojo.getSsn(), actualPojo.getUser().getSsn());
        Assert.assertEquals(expectedPojo.getSpeciality(), actualPojo.getSpeciality());

        Assert.assertEquals(expectedPojo.getCountry(), actualPojo.getCountry());
        Assert.assertEquals(expectedPojo.getCstate(), actualPojo.getCstate());
        Assert.assertEquals(expectedPojo.getImage(), actualPojo.getImage());
        Assert.assertEquals(expectedPojo.getImageContentType(), actualPojo.getImageContentType());
    }
}
