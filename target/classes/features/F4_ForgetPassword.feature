@forget
Feature: user should be able to reset his forgotten password

  Scenario: User could reset his/her password successfully
    Given user open browser
    And user navigate to login page
    And user navigate to forget page
    When user fill forget data
    And click on recover button