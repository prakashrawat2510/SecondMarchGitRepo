@regression
Feature: Logout functionality

  Scenario: Successful logout
    Given user open the browser URL
    And user enter the username "mngr654865"
    And user enter the password "yjugara"
    When user click on login button
    Then validate that user navigate to homepage of the application
    When user clicks on logout link
    Then user should be redirected to login page
    And user closes the browser
