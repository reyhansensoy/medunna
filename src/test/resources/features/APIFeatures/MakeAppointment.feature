
Feature: Make appointment api test

  @MakeAppointment
  Scenario Outline: appointment test

    Given user create endpoint
    And   user sets the expected data "<firstname>", "<lastname>", "<SSN>", "<email>", "<phonenumber>" and "<date>"
    Then  user sends the post request and gets the response
    And   user saves the api records to txt file
    Then  user validates Api records

    Examples: api test data

      |firstname |lastname   |SSN        |email                  |phonenumber |date      |
      |vera   |cicek22       |850-81-4460|gul222@gmail.com       |333-486-7890|2022-03-24|
      |vedat  |bulut23       |355-91-4490|karanfil233@gmail.com  |123-600-7890|2022-03-25|












