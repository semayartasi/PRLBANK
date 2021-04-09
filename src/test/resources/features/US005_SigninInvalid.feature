Feature:Login page should not be accessible with invalid credentials
  Scenario: User cannot login with invalid username validating the error message
    Given Go to https://gmibank-qa-environment.com/
    When Navigate to login page



