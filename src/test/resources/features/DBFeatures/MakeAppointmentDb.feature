Feature: DB Make appointment tests


  Background: db connection set up
    Given user creates a connection with DB using "jdbc:postgresql://medunna.com:5432/medunna_db" and "medunnadb_user" , "Medunnadb_@129"



     @DBTest
      Scenario Outline: make appointment db test

      Then  user sends the query "<query>" to DB
      And   user saves the DB records to correspondent files
      Then  user validates DB make appointment data

      Examples: test data

        |query|
        |select * from jhi_user where ssn=888-56-6789|








