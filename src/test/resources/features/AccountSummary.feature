#Account summary
#Account summary page should have the title Zero –Account summary.
#Account summary page should have to following account types:
#Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts. Credit Accountstable must have columnsAccount, Credit Cardand Balance.
  Feature: Account summery behavior

  Scenario: Navigate to account summery
    Given the user is on the login page
    When user logs in using "username" and "password"
    Then the title should contains "Zero - Account Summary"


  Scenario: The Account summery account types
    Given the user is on the login page
    When user logs in using "username" and "password"
    Then the user should see the following account table types
      |Cash Accounts|
      |Investment Accounts|
      |Credit Accounts|
      |Loan Accounts|

    @wip

  Scenario: Credit Accounts
    Given the user is on the login page
    When user logs in using "username" and "password"
    Then the user should see the following credit account columns
      |Account|
      |Credit Card|
      |Balance|


