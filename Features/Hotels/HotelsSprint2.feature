Feature: Sprint planning 2


  @test7
  Scenario: Verify tick mark when user enters corect data in sign up form
    Given I launch Hotel launchpage
    And i click on Sign in
    When I click on Sign up
    Then I enter my  email
    And I verify green tickmark is displayed
    Then I enter password
    And I verify green tickmark is displayed
    And I enter my first name
    Then I verify green tickmark is displayed
    And I enter my last name
    And I verify green tickmark is displayed




  @test8
  Scenario: Verify error is displayed when user submits the empty feedback form

    Given I launch Hotel launchpage
    Then I verify free cancellation is displayed
    And I verify Our price guarantee is displayed
    And I verify ten night stand is displayed
    Then I click on Website feedback
    Then I click on submit form
    And I verify please fill up the form message is displayed
    And I verify red dotted box is displayed









  @test10
  Scenario: Verify user can submit after completing the feedback form
    Given I launch Hotel launchpage
    And I click on Website feedback
    Then I select the star
    Then I leave a comment
    And I select a option from how likely to rate
    Then I clicked on the prior visit
    Then I click on submit button
    And I verify for your feedback Thank you message






  @test9
  Scenario: Verigy link/text why book with Hotels.com is displayed
    Given I launch Hotel launchpage
    Then I go to why book with hotels.com
    And I click on price price guarentee
    Then I verify on price guarentee heading is dispalyed
    And then i go back to hotels.com
    And then i click on ten nights you stay link
    Then I verify saving rewards is displayed