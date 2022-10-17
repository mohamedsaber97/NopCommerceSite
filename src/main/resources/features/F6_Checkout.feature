@smoke
Feature: create successfully order

  Scenario: create successful Order
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can open product and add it to cart
    When user open cart
    And accept terms and click on checkout
    And fill billing address data and save it
    And confirm all order steps
    Then order is created and open order details