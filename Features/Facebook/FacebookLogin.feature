@login @regression
Feature: Login

  //Background:
    // Given I launch facebook website

  @invalidLogin  @sanity
  Scenario: Verify user gets error for invalid credential1
    When I enter '%^&&*()' as login email
    When I enter 'abcd@1234' as login password
    When I click on login button
    Then I verify login error is displayed
  @invalidLogin   @sanity
  Scenario: Verify user can login with valid credential
    When I enter 'cc28@tmail.com' as login email
    When I enter 'gongzuo202@' as login password
    When I click on login button
    Then I verify user lands on home page

  @validLogin
  Scenario: Verify user can login with valid credential2
    When I enter 'corectEmail2@gmail.com' as login email
    When I enter 'correctPassword' as login password
    When I click on login button
    Then I verify user lands on home page

  Scenario OUtline: Verify user gets error for invalid credential2
    When I enter '<invalidEmail>' as login email
    When I enter '<invalidPassword>' as login password
    When I click on login button
    Then I verify login error is displayed

  Examples:
    | invalidEmail  | invalidPassword |
    | BN.com        | abcd@1234       |
    | %^&&*()       | abcd@1234       |
  # How to we perform Data Driven Testing (DDT) in Cucumber
  # ---> using Scenario Outline and Examples

    # Background
    # Scenario-1
    # Background
    # Scenario-2
    # Background
    # Scenario-3