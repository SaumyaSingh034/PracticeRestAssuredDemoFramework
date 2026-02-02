Feature: GS Application Login

  Scenario: Validate login functionality
    Given user is on the login page
    Then user validated username and password field
    And validates login button is displayed
    When user enters valid credentials and login
    Then user should be logged in successfully
    And verify the test "Hello Moto"'