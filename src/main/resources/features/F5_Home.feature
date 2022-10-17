Feature: user should be able to access home system features

  @search
  Scenario: logged User could search for any product
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can fill search data and click search

  @currency
  Scenario: logged User could switch between currencies US-Euro
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can can change currency to US-Euro