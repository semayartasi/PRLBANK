@wip
  #Feature:'imiz US'mizin id'si ve Aciklamasi
Feature: US004 Login page should accessible with valid credentials
  #Scenario:'muz TC id'miz ve Acceptance Criteria'miz
  Scenario Outline: TC001 There should be a valid username and password validating the success message to login
    And User navigates to Sign In Page
    Then User provides a valid "<username>" username
    And User provides a valid "<password>" password
    And User click on sign in button
    Then User verifies that user logined successfully
    #Examples:'a examples'a koydugumuz datalarin aciklamasini yaziyoruz
    Examples: Valid usernames and passwords
      | username         | password         |
      | admin_username   | admin_password   |
      | manager_username | manager_password |