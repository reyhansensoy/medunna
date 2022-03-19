package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;
import pojos.Registrant;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static Hooks.Hooks.spec;
import static junit.framework.Assert.assertNotSame;
import static utilities.WriteToTxt.saveRegistrantData;
import static junit.framework.TestCase.assertEquals;


public class MakeAppointmentApiSteps {

    Registrant registrant = new Registrant();
    Appointment appointment = new Appointment();
    Response response;
    Faker faker = new Faker();

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
//
//        firstname=faker.name().firstName();
//        lastname=faker.name().lastName();
//        ssn=faker.idNumber().ssnValid();
//        email=faker.internet().emailAddress();
//        phonenumber=faker.phoneNumber().phoneNumber();
          //date=faker.date().future();

        appointment.setFirstName(firstname);
        appointment.setLastName(lastname);
        appointment.setSsn(ssn);
        appointment.setEmail(email);
        appointment.setPhone(phonenumber);
        appointment.setStartDate(date);

    }

    @Then("user sends the post request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        response = given().spec(spec).contentType(ContentType.JSON).body(appointment).when().post("/{first}/{second}/{third}");

    }

    @Then("user saves the api records to txt file")
    public void user_saves_the_api_records_to_txt_file() {

        saveRegistrantData(appointment);

    }

    @Then("user validates Api records")
    public void user_validates_api_records() throws IOException {
        //response.then().statusCode(201);
        response.prettyPrint();

        //ObjectMapper obj = new ObjectMapper();
        //Appointment actualAppointment = obj.readValue(response.asString(),Appointment.class);
       // System.out.println(actualAppointment);

//    assertEquals(appointment.getFirstName(), actualAppointment.getFirstName());
//    assertEquals(appointment.getLastName(), actualAppointment.getLastName());
//    assertEquals(appointment.getSsn(), actualAppointment.getSsn());
//    assertEquals(appointment.getEmail(), actualAppointment.getEmail());
//    assertEquals(appointment.getPhone(), actualAppointment.getPhone());
//    assertEquals(appointment.getStartDate(), actualAppointment.getStartDate());

    }

    }



