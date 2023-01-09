package stepDefinitions.API_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Patient09;
import pojos.RoomFtm;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;

public class Us15_16StepDefinitions {

    RequestSpecification spec;
    Response response;

    @Given("US15 GET request gonderir.")
    public void usGETRequestGonderir() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "patients", "second", "402002");
    }

    @And("US15 status kodunun 200 oldugu gorulur.")
    public void usStatusKodununOlduguGorulur() {
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).get("{first}/{second}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @And("US15 tum hasta bilgilerini API response ile alir.")
    public void usTumHastaBilgileriniAPIResponseIleAlir() {
        Patient09 actualData = response.as(Patient09.class);
        System.out.println(actualData);

        Assert.assertEquals("team12", actualData.getCreatedBy());
        Assert.assertEquals(402002, actualData.getId());
        Assert.assertEquals("fatma", actualData.getFirstName());
        Assert.assertEquals("zeynep", actualData.getLastName());
        Assert.assertEquals("2022-12-11T21:00:00Z", actualData.getBirthDate());
        Assert.assertEquals("5528552514", actualData.getPhone());
        Assert.assertEquals("fatma@zyp.com", actualData.getEmail());
        Assert.assertEquals("team88_12admin", actualData.getUser().getCreatedBy());
        Assert.assertEquals("2022-07-15T19:38:40.886671Z", actualData.getUser().getCreatedDate());
        Assert.assertEquals("enrico.fermi", actualData.getUser().getLogin());
        Assert.assertEquals(null, actualData.getAppointments());
    }

    @Given("US16TC13 GET request gonderir.")
    public void usTCGETRequestGonderir() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "rooms", "second", "372491");
    }

    @Then("US16TC13 status kodunun 200 oldugu gorulur.")
    public void usTCStatusKodununOlduguGorulur() {
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).get("{first}/{second}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Then("US16TC13 tum oda bilgilerini API response ile alir.")
    public void usTCTumOdaBilgileriniAPIResponseIleAlir() {
        RoomFtm expectedData = new RoomFtm("team20", "2022-12-05T15:55:39.102687Z", "orman manzarali", 9000.00, 3185, "TWIN", false, 372491);

        RoomFtm actualData = response.as(RoomFtm.class);

        assertEquals(expectedData.getCreatedBy(), actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(), actualData.getCreatedDate());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.getRoomNumber(), actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(), actualData.getRoomType());
        assertEquals(expectedData.isStatus(), actualData.isStatus());
        assertEquals(expectedData.getId(), actualData.getId());
    }

    RoomFtm delete;
    RoomFtm expectedData;
    int id;


    @Given("US16TC15 POST request gonderiir.")
    public void usTCGETRequestGonderiir() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParam("first", "rooms");
        expectedData = new RoomFtm();
        expectedData.setRoomNumber((Integer.parseInt(Faker.instance().number().digits(5))));
        expectedData.setDescription("gol manzara");
        expectedData.setPrice(850);
        expectedData.setStatus(true);
        expectedData.setRoomType("DELUXE");
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().post("/{first}");


    }

    @Then("US16TC15 status kodunun 201 oldugu goruluur.")
    public void usTCStatusKodununOlduguGoruluur() {

        response.then().statusCode(201);
    }

    @Then("US16TC15 tum oda bilgilerini API ile olusturulur.")
    public void usTCTumOdaBilgileriniAPIIleOlusturulur() {

        RoomFtm actualData = response.as(RoomFtm.class);
        assertEquals(expectedData.getRoomNumber(), actualData.getRoomNumber());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getRoomType(), actualData.getRoomType());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.isStatus(), actualData.isStatus());


    }

    @Given("US16TC14 DELETE request gonderirr.")
    public void usTCGETRequestGonderirr() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "rooms", "second", 406932);
        delete=new RoomFtm();
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).
                delete("{first}/{second}");
    }

    @Then("US16TC14 status kodunun 204 oldugu gorulurr.")
    public void usTCStatusKodununOlduguGorulurr() {
        response.then().statusCode(204);
    }

    @Then("US16TC14 tum oda bilgilerini API ile silinir.")
    public void usTCTumOdaBilgileriniAPIIleSilinir() {
        RoomFtm actualData = new RoomFtm();
        assertEquals(delete.toString(),actualData.toString());


    }



    RoomFtm expectedDataa;

    @Given("US16TC16 PUT request goonderir.")
    public void usTCGETRequestGoonderir() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "rooms");
        expectedDataa = new RoomFtm();
        expectedDataa.setCreatedBy("team12");
        expectedDataa.setCreatedDate("2022-12-13T12:21:18.725101Z");
        expectedDataa.setId(406003);
        expectedDataa.setRoomNumber(69855159);
        expectedDataa.setDescription("gol manzarali");
        expectedDataa.setPrice(8075);
        expectedDataa.setStatus(true);
        expectedDataa.setRoomType("DELUXE");
        System.out.println("expectedData = " + expectedDataa);
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).
                contentType(ContentType.JSON).body(expectedDataa).when().put("/{first}");

    }

    @Then("US16TC16 status kodunun 200 oldugu goorulur.")
    public void usTCStatusKodununOlduguGoorulur() {
        response.then().statusCode(200);
    }

    @Then("US16TC16 tum oda bilgilerini API ile guncellenir.")
    public void usTCTumOdaBilgileriniAPIIleGuncellenir() {

        RoomFtm actualData = response.as(RoomFtm.class);
        assertEquals(expectedDataa.getRoomNumber(), actualData.getRoomNumber());
        assertEquals(expectedDataa.getDescription(), actualData.getDescription());
        assertEquals(expectedDataa.getRoomType(), actualData.getRoomType());
        assertEquals(expectedDataa.getPrice(), actualData.getPrice());
        assertEquals(expectedDataa.isStatus(), actualData.isStatus());
        System.out.println("actualData = " + actualData);


    }


}
