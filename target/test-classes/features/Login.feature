#Login
#Only authorized users should be able to login to the application. When user logsin with valid credentials,
#Account summary page should be displayed. Users with wrong username or wrong password should not be able to login.
#Users with blank username or password should also not be able to login.
#When user tries to login with invalid information, error message Login and/or password are wrong.should be displayed.




Feature: Users should be able to login
  Scenario: Login as a user
    Given the user is on the login page
    When user logs in using "username" and "password"
    Then the user should be able to login
    And the title should contains "Zero - Account Summary"

  Scenario: Login as a unauthorized user
    Given the user is on the login page
    When user logs in using "user" and "password"
    Then the unauthorized user should not be able to login
    And the message should contains "Login and/or password are wrong."

  Scenario: Login as a unauthorized user
    Given the user is on the login page
    When user logs in using "username" and "pass"
    Then the unauthorized user should not be able to login
    And the message should contains "Login and/or password are wrong."

  Scenario: Login as a unauthorized user
    Given the user is on the login page
    When user logs in using "" and ""
    Then the unauthorized user should not be able to login
    And the message should contains "Login and/or password are wrong."

