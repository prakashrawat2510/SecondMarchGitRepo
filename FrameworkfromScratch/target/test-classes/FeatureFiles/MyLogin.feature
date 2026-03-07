@regression1
Feature: Login funcationality for demo guru99

  Scenario Outline: Validate Login Funcationality
    Given user open the browser URL
    And user enter the username "<uname>"
    And user enter the password "<password>"
    When user click on login button
    Then validate that user navigate to homepage of the application
    And user closes the browser

    Examples: 
      | uname      | password |
      | mngr654865 | yjugara  |
