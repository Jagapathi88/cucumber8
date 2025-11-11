@busBooking
Feature: Book bus tickects.

  Scenario: Book bus ticket for given details.
    Given User is in Abhi bus homepage
    Then User clicks on Buses option
    And enter leaving from and going to details
    Then select departure date
    And Click on search button.
    When user is in bus search page
    Then click on bus type filters
    And click on departure time type filter
