Feature: Darksky Homepage Test

  @sanity
  Scenario: Feels like Temp is between High and low
    Given User navigate to Darksky homepage
    And User Collects the High Temp
    And User Collects the Low temp
    And User Collects the feels like Temp
    Then User verifies feels like temp is between high and low temp


  Scenario: Verify all blog postdates
    Given User navigates to Darksky Blog
    Then Verify all the post dates are present