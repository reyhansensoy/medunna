
Feature: Make appointment api test

  @MakeAppointment
  Scenario Outline: appointment test

    Given user create endpoint
    And   user sets the expected data "<firstname>", "<lastname>", "<SSN>", "<email>", "<phonenumber>" and "<date>"
    Then  user sends the post request and gets the response
    And   user saves the api records to txt file
    Then  user validates Api records

    Examples: api test data

      |firstname|lastname|SSN        |email           |phonenumber |date|
      |gunes    | bulut  |333-21-4445|gunes@gmail.com |333-456-7890|2022-03-24|
      |yagmur   | bulut  |333-23-4445|yagmur@gmail.com|123-456-7890|2022-03-25|







