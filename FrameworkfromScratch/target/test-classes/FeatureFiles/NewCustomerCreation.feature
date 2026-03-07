@regression
Feature: Creation of new Customer

  Background: 
    Given user open the browser URL
    And user enter the username "mngr654865"
    And user enter the password "yjugara"
    When user click on login button
    Then validate that user navigate to homepage of the application

  Scenario Outline: Create new customer with all details
    Given user is on the homepage of the application
    And user click on New Customer link
    And user enters the customer name as "<cust_name>"
    And user selects gender
    And user enters dat of birth as "<dob>"
    And user enters address as "<address>"
    And user enters city as "<city>"
    And user enters state as "<state>"
    And user enters pin as "<pin>"
    And user enters mobile as "<mobile>"
    And user enters email as emailAddress
    And user enters password as "<password>"
    When user click on submit button
    Then a new customer will be created
    And user captures the customer id
    And user closes the browser

    Examples: 
      | cust_name | dob        | address | city   | state       | pin    | mobile     | password    |
      | Prakash   | 24-04-1999 | Deghat  | Almora | Uttarakhand | 123456 | 9898987667 | Test@123456 |
#And enter below details
#|cust_name|dob|address|city|state|mobile|email|password|||
