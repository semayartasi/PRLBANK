@US015
Feature: System should allow user to manage their account

  Background: User will sign in
    Given user is on main page
    When user clicks to icon menu
    Then user clicks on sign in button
    Then user provides an username with valid cred
    Then user provides a password with valid cred
    Then user clicks on the sign in button

  Scenario:User should see all account types and balance populated
    When user clicks on My Operations
    Then user clicks on Manage Accounts
    Then user clicks on a desired account id
    And user clicks View button
    And user can click Edit button
    Then user can update Account Type



  Scenario: User can view transaction