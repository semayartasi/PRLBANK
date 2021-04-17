@US015
Feature: System should allow user to manage their account
  Background: User will sign in
    Given User goes to login page and sings in

  Scenario:User should see all account types and balance populated
    When user clicks on My Operations then Manage Accounts
    Then user clicks on a desired account id
    And user clicks View button
    And user can click Edit button
    Then user can update Account Type

  Scenario: User can view transaction
    Given user n
#  transaction varmi yok mu buton varsa trasncation olmus demek yoksa yoktur
#    asagda islemler cikiyormu vallidation yapablrsin ne kadar amount transfer
#    olmus bunu getext yap assertion