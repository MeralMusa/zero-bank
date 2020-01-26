

Feature: Account activity behavior

  Scenario: Navigate to account activity
    Given the user is on the login page
    When user logs in using "username" and "password"
    And the user navigates to Account Activity
    Then the title should contains "Zero - Account Activity"


  Scenario: The Account drop down default option should be Savings
    Given the user is on the login page
    When user logs in using "username" and "password"
    And the user navigates to Account Activity
    And the user navigates to Account drop down
    Then the default option should be "Savings"


  Scenario: drop down options behavior
    Given the user is on the login page
    When user logs in using "username" and "password"
    And the user navigates to Account Activity
    When the user navigates to Account drop down

    Then the user should see dropdown options
      |Savings|
      |Checking|
      |Savings|
      |Loan|
      |Credit Card|
      |Brokerage|
  @wip

  Scenario: Transactions table behavior
    Given the user is on the login page
    When user logs in using "username" and "password"
    And the user navigates to Account Activity
    Then the user should see tabelerow
      |Date|
      |Description|
      |Deposit|
      |Withdrawal|


