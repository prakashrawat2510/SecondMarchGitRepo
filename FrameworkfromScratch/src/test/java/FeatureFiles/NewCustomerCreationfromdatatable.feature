@regression
Feature: Creation of new Customer with DataTable

  Background: 
    Given user open the browser URL
    And user enter the username "mngr654865"
    And user enter the password "yjugara"
    When user click on login button
    Then validate that user navigate to homepage of the application

  Scenario: Create new customer with with data table
    Given user is on the homepage of the application
    And user click on New Customer link
    And enter the below mandatory fields
      | cust_name     | dob        | address | city   | state       | pin    | mobile     | email       | password    |
      | Prakash rawat | 24-04-1999 | Deghat  | Almora | Uttarakhand | 123456 | 9898987667 | randomEmail | Test@123456 |
    When user click on submit button
    Then a new customer will be created
    And user captures the customer id
    And user closes the browser
