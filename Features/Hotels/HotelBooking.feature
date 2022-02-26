Feature: Book a Hotel


  Background:
    Given I launch Hotel launchpage
    And I enter my destination
    And I entered my check in date
    And I entered my check out date
    Then I click on search button


  @sanity
  Scenario: Check for lowest possible rates



    Then I sort search result from low to high
    And I verify the lowest price is less or equal to One hundred
    Then I Close the Browser

  @invalid
  Scenario: fitlers aren't selected
    And Verify all popular filters checkbox arent selected
    And Verify star rating buttons are in increasing order