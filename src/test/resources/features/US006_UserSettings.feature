@US006
Feature: User info segment (User Settings) should be editable on Homepage
#"prlbank_url"
  Background: User can sign in and navigate to their info
    Given user is on main page
    When user clicks to icon menu
    Then user clicks on sign in button
    Then user provides an username with valid cred
    Then user provides a password with valid cred
    Then user clicks on the sign in button
    Then user clicks on employee icon
    Then user clicks user info

#  Scenario: User is able to see their info
#    Then user can populate firstname, lastname, email, and language
#    Then user is able to click language DD

    Scenario: User can update their first name
      Given user clicks on first name textbox
      When user updates "firstname"
      Given user clicks on last name textbox
      When user updates "lastname"
      Given user clicks on email textbox
      When user updates "email"
      Given user clicks on language textbox
      When user clicks Turkce
      Then user clicks save button
      Then user can see the aprroved message

#    Scenario: User can update their last name
#
#      Then user clicks save button
#      Then user can see the aprroved message
#
#    Scenario: User can update their email address
#
#      Then user clicks save button
#      Then user can see the aprroved message
#
#    Scenario: User can update their first name
#      Given user clicks on language textbox
#      When user clicks Turkce
#      Then user clicks save button
#      Then user can see the aprroved message
