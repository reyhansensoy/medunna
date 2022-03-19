package pojos;

public class Appointment {


    private String appoSpeciality;
    private String birthDate;
    private String email;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String ssn;
    private String startDate;

    /*
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

    //variables, constructors, getters and setters, toString


    public Appointment() {
    }

    public Appointment(String firstname, String lastname, String ssn, String email, String phoneNumber, String date) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.ssn = ssn;
        this.email = email;
        this.phone = phoneNumber;
        this.startDate = date;
    }

    public String getAppoSpeciality() {
        return appoSpeciality;
    }

    public void setAppoSpeciality(String appoSpeciality) {
        this.appoSpeciality = appoSpeciality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appoSpeciality='" + appoSpeciality + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
