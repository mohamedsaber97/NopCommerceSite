Feature: user should be able to sign up into system

  Scenario: user could register with valid data
    Given user open browser
    And user navigate to register page
    When user fill register data
    And click on register button
    Then success message is displayed
    And user log out from system
    And user navigate to login page