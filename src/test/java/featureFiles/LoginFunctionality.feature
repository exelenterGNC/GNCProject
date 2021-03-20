Feature: Login Functionality
  Scenario: As a user, I should be able to change my password

    And User waits for "1" seconds
    Given Hover over in "MainPage"
      | AccountButton |
    And User clicks in "LoginPage"
        |LoginSignUpButton|

    And User handles the alert for "15" seconds
    And User sends text in "LoginPage"
      | EmailAddressInput | test1dev1@yopmail.com |
      | PasswordInput     | Test1234!             |
    And User clicks in "LoginPage"
      |LoginButton|