@regression
Feature: Creation of new Account


  Background: 
    Given user open the browser URL
    And user enter the username "mngr654865"
    And user enter the password "yjugara"
    When user click on login button
    Then validate that user navigate to homepage of the application
    And user click on New Customer link
    And user enters the customer name as "Prakash"
    And user selects gender
    And user enters dat of birth as "24-04-1999"
    And user enters address as "Deghat"
    And user enters city as "Almora"
    And user enters state as "Uttarakhand"
    And user enters pin as "123456"
    And user enters mobile as "9898987667"
    And user enters email as emailAddress
    And user enters password as "Test@123456"
    When user click on submit button
    Then a new customer will be created
    And user captures the customer id

  Scenario: Create Customer New account
    Given user is on the homepage of the application
    And user click on New Account link
    And user enter Customer id
    And user enter Initial deposit as "50000"
    When user click on Account submit button
    Then a new Account will be created
    And user captures the Account id
    And user closes the browser

    
    