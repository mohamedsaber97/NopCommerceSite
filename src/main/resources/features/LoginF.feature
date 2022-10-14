Feature: user should be able to login into system

  Scenario: User could log in with valid email and password
    Given user open browser
    And user navigate to register page
    When user fill login data
    And click on login button