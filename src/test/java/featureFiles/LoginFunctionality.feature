Feature: Login Functionality

  Background:


  Scenario: As a user, I should be able to change my password
    And User waits for "1" seconds
    Given Hover over in "MainPage"
      | AccountButton |
    And User clicks in "LoginPage"
        |LoginSignUpButton|
#    And User handles the alert for "15" seconds
    And User sends text in "LoginPage"
      | EmailAddressInput | furkathikmatzod@mail.ru |
      | PasswordInput     | NewJersey2026|
    And User clicks in "LoginPage"
      |LoginButton|
    When Hover over in "MainPage"
      | AccountUserButton |
    And User clicks in "LoginPage"
      |AccountButton|
      |ChangePasswordButton|
    And User sends text in "LoginPage"
      | NewPasswordInput        | NewJersey2027 |
      | ConfirmNewPasswordInput | NewJersey2027 |
    And User clicks in "LoginPage"
      |CreatePasswordButton|
    And User waits for "3" seconds
    Then User verifies the URL is "https://development.gnc.com/"


