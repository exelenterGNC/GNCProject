Feature: Login Functionality

Background:
  When User waits for "1" seconds
  Given Hover over in "MainPage"
    | AccountButton |
  And User clicks in "LoginPage"
    |LoginSignUpButton|
  And User sends text in "LoginPage"
    | EmailAddressInput | furkathikmatzod@mail.ru |
    | PasswordInput     | NewJersey2024|
  And User clicks in "LoginPage"
    |LoginButton|


Scenario Outline: As a user, I should not be able to change my password

  When Hover over in "MainPage"
  | AccountUserButton |
  And User clicks in "LoginPage"
  |AccountButton|
  |ChangePasswordButton|
  And User sends text in "LoginPage"
  | NewPasswordInput        | <New Password>        |
  | ConfirmNewPasswordInput | <Repeat New Password> |
  And User clicks in "LoginPage"
  | CreatePasswordButton |
  Examples:
  | New Password  | Repeat New Password |
#  | Manual1       | Manual1             |
#  | TEST11111     | TEST11111           |
#  | test22222     | test22222           |
#  | Nonumbershere | Nonumbershere       |
#  | lowercase     | lowercase           |
#  | UPPERCASE     | UPPERCASE           |
#  | 987654321     | 987654321           |
  | TEST11111     | TEST11111           |
  | NewJersey2024 | NewJersey2024       |
  | NewJersey2021 | NewJersey2020       |