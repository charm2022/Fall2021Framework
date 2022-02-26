Feature: Login to Facebook

  Scenario: Verify user gets error for invalid credential
    Given I launch facebook website
    When I enter '%^&&*()' as login email
    When I enter 'abcd@1234' as login password
    When I click on login button
    Then I verify login error is displayed

  Scenario: Find User account when attempt to login without credentials
    Given I launch facebook website
    Then I click on login button
    And i verify find your account link
    And i click on the find your account link
    Then i find my account and login
    And Verify the cancel button is displayed and enabled