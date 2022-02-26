Feature:Sprint planning 1


  Scenario: Verify past dates of current month is disabled

    Given I launch Hotel launchpage
    Given User verifies current date
    And Users Verify past dates are disabled

  @test2
  Scenario: Verify error message displayed for invalid data in signup form
    Given I launch Hotel launchpage
    And i click on Sign in
    When I click on Sign up
    And I enter my wrong email
    And I verify error message is displayed
    Then I enter my password with 4 letters
    And I verify error message is displayed
    When I enter my invalid first name
    And I enter my invalid last name
    And I verify error message is displayed after clicking sign up with invalid credentials

  @test3
  Scenario: Verify error message for invalid sign in credentials
    Given I launch Hotel launchpage
    Given I click on Sign in link
    Then I enter invalid email address
    Then I enter invalid password
    And I click on sign in button
    And I verify error msg is displayed

  @test4
  Scenario: Verify terms && conditions are displayed
    Given I launch Hotel launchpage
    When I click on Sign in link
    And I click on Sign up
    Then I click on Terms and condition link
    And I verify Terms and condition link opens on a new tab
    Then I click on Privacy Statement link
    Then I verify Privacy Statement link opens on a new tab


  @test5
  Scenario: Verify user can update number of guests on Homepage
    Given I launch Hotel launchpage
    And I click on travelers
    When I select adults as four
    When I select children as two
    And first child as four
    And second child as one
    And I verify rooms pop up number of adults and children as selected on step three and four
    And I click apply
    And I verify total number of adults and children as same as selected on step three and four

  @test6
  Scenario: Verify Change dates button is displayed at the end of search results
    Given I launch Hotel launchpage
    When I Enter Bora Bora in destination
    Then Select check in dates
    And select check out date
    Then I click on the search button
    Then I Verify Change dates button is displayed at the end of search results
