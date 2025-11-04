Feature: Book one way Flight Ticket

  Scenario: Book one way flight ticket
    Given user logins into QAClickJet webpage
    When user is on home page
    Then Enter Country name
    And Select one way
    Then Select Depature city
    And Select Arrival City
    Then Select Depature date
    Then click on Passengers tab
    And select Adults
    And select Childs and click on done
    Then Select Currency
    Then click on Search

  Scenario Outline: Book Round trip ticket
    Given user logins into QAClickJet webpage
    When user is on home page
    Then Enter "<Country>" name
    And Select round trip
    Then Select "<Depature>" city
    And Select "<Arrival>" City
    Then Select Depature date
    Then Select return date
    Then click on Passengers tab
    And select <Adults> adults
    And select <Childs> childs and click on done
    Then Select "<Currency>"
    Then click on Search

    Examples: 
      | Country | Depature | Arrival | Adults | Childs | Currency |
      | India   | MAA      | DEL     | 2      | 4      | AED      |
      | India   | BLR      | HYD     | 2      | 4      | USD      |
      | India   | DEL      | BLR     | 4      | 2      | INR      |
      
 
      
