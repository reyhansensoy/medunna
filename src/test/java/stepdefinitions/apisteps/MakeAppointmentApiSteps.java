package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment2;
import pojos.Registrant;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static Hooks.Hooks.spec;
import static utilities.WriteToTxt.saveRegistrantData;
import static junit.framework.TestCase.assertEquals;


public class MakeAppointmentApiSteps {

    Registrant registrant = new Registrant();
    Appointment2 appointment2 = new Appointment2();
    Response response;

    @Given ("user create endpoint")
    public void user_create_endpoint() {

        spec.pathParams("first","api","second","appointments","third","request");

    }
    @Given("user sets the expected data {string}, {string}, {string}, {string}, {string} and {string}")
    public void user_sets_the_expected_data_and(String firstname, String lastname, String ssn, String email, String phonenumber, String date) {

        /*
        {
  "appoSpeciality": "string",
  "birthDate": "2022-03-10T01:21:59.468Z",
  "email": "merhaba2@gmail.com",
  "firstName": "merhaba2",
  "gender": "male",
  "lastName": "hosgeldin2",
  "phone": "123-332-3827",

  "ssn": "873-38-3728",
  "startDate": "2022-03-10"
}
         */


        appointment2.setEmail(email);
        appointment2.setFirstName(firstname);

        appointment2.setLastName(lastname);
        appointment2.setPhone(phonenumber);
        appointment2.setSsn(ssn);
        appointment2.setStartDate(date);

    }

    @Then("user sends the post request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        response = given().spec(spec).contentType(ContentType.JSON).body(appointment2).when().post("/{first}/{second}/{third}");

    }

    @Then("user saves the api records to txt file")
    public void user_saves_the_api_records_to_txt_file() {

        saveRegistrantData(appointment2);

    }

    @Then("user validates Api records")
    public void user_validates_api_records() throws IOException {

     response.then().statusCode(201);
     response.prettyPrint();

     ObjectMapper  obj=new ObjectMapper();





//    assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
//    assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
//    assertEquals(registrant.getSsn(),actualRegistrant.getSsn());
//    assertEquals(registrant.getEmail(),actualRegistrant.getEmail());
//    assertEquals(registrant.getPhone(),actualRegistrant.getPhone());
//    assertEquals(registrant.getStartDate(),actualRegistrant.getStartDate());

    }

    }



