Feature: Sign up for Facebook
  Scenario:  Validate dates on sign up form
    Given i navigate to facebook homepage
    When i click on create account
    Then i validate the current month
    Then i validate the current day
    Then i validate the current year