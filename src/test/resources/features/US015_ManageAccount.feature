@US015
Feature: System should allow user to manage their account
  Background: User will sign in
    Given User goes to login page
    When user enters a valid username and password
    Then User logs in

  Scenario:User should see all account types and balance populated
    When user clicks on My Operations
    Then user clicks on Manage Accounts
    Then user clicks on a desired account id
    And user clicks View button
    And user can click Edit button
    Then user can update Account Type

  Scenario: User can view transaction


# OR  this way
#  Background: User will sign in
#    Given user clicks to icon menu
#    Then user clicks on sign in button
#    Then user provides a "username" and "password"
#    Then user clicks on the sign in button