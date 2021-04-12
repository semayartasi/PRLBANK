Feature:Login page should not be accessible with invalid credentials

  Background:
    Given User navigates to login page

  @invalidusername
  Scenario: User cannot login with invalid username validating the error message

    And User provides an invalid username "invalid_username"
    And User provides a valid password "customer_password"
    Then User clicks on Signin button
    Then There should be the error message

  @invalidpassword
  Scenario: User cannot login with invalid password validating the error message

    And User provides a valid username "customer_username"
    And User provides an invalid password "invalid_password"
    Then User clicks on Signin button
    Then There should be the error message

  @invalidusername&password
  Scenario: User cannot login with invalid username and password validating the error message

    And User provides an invalid username "invalid_username"
    And User provides an invalid password "invalid_password"
    Then User clicks on Signin button
    Then There should be the error message

  @resetbutton
  Scenario: User with invalid credentials should be given an option to reset their password
    Then There should be a password reset button that navigates to reset page
