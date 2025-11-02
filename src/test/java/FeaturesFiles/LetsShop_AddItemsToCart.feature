@LetsShop
Feature: Add items to Cart

  Scenario: Login into Lets shop website and add items to cart
    Given User is in Login Page of lets shop website
    Then user enters Username and password
    And Clicks on signin button
    When user is on home page for Lets shop
    Then user clicks on add to cart button for all the required items
    And User clicks on cart button to navigate to Cart page
