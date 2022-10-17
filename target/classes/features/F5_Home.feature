@integration
Feature: user should be able to access home system features

  Scenario: logged User could search for any product
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can fill search data and click search

  Scenario: logged User could switch between currencies US-Euro
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can can change currency to US-Euro

  Scenario: logged user could select different Categories
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can hover on main category and select sub category

  Scenario: logged user could filter with color
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can hover on main category and select sub category
    And user can select color to filter products

  Scenario: logged user could select different tags
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can hover on main category and select sub category
    And user can select digital tag

  Scenario: logged user could select different tags
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can open product and add it to cart

  Scenario: logged user could add different products to Wishlist
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can open product and add it to wishList


  Scenario: logged user could add different products to compare list
    Given user open browser
    And user navigate to login page
    When user fill login data
    And click on login button
    Then home page is opened
    And user can open product and add it to compareList