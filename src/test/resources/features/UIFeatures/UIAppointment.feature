Feature: appointments test




  @Appointment
  Scenario Outline: test appointments
    Given user clicks on make an appointment
    And user provides the appoinment name "<firstname>"
    And user provides the appointment lastname "<lastname>"
    And user provides ssn and email "<SSN>" and "<email>"
    When user provides the phone number "<phoneNumber>"
    And user provides the date "<date>"
    Then user requests appointment and verifies the success message

    Examples: test data

    |firstname|lastname|SSN|email|phoneNumber|date|
    |Cetin    |Isilak  |203-38-2837|cetin@gmail.com|253-283-2837|06-07-2022|




  @AppointmentNegative
  Scenario Outline: test appointments
    Given user clicks on make an appointment
    And   user provides blank the appointment info "<firstname>", "<lastname>","<SSN>","<email>","<phoneNumber>" and "<date>"
    Then  user requests appointment and verifies the required message

    Examples: test data

      |firstname|lastname|SSN        |email             |phoneNumber |date|
      |         |bulut   |203-38-6667|bulut@gmail.com   |253-283-2837|06-07-2022|
      |demet    |        |203-38-8888|demet@gmail.com   |253-283-2837|06-07-2022|
      |karanfil |deniz   |           |karanfil@gmail.com|253-283-2837|06-07-2022|
      |gul      |gunes   |203-38-2837|                  |253-283-2837|06-07-2022|
      |beyaz    |siyah   |203-38-2837|beyaz@gmail.com   |            |06-07-2022|
      |gul      |diken   |203-38-2837|gul@gmail.com     |253-283-2837|          |


