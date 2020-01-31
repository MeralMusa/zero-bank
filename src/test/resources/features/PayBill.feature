#Pay Bills
#Account Activity page should have the title Zero –Pay Bills.
#When user completes a successful Pay operation, The payment was successfully submitted. should be displayed.
# When user tries to make a payment without entering the amount or date, Please fill out this field message!should be displayed.
#Amount field should not accept alphabetical or special characters. Date field should not accept alphabetical characters.
#NOTE: . For the date input field you can just use sendKeys. No need to click on the date navigator.
  Feature: Pay Bills page behavior

    Scenario: Pay Bills page should have the title Zero –Pay Bills
      Given the user is on the login page
      When user logs in using "username" and "password"
      And the user navigates to Pay Bills page
      Then the title should contains "Zero - Pay Bills"

    Scenario: When user completes a successful Pay operation, The payment was successfully submitted. should be displayed.
      Given the user is on the login page
      When user logs in using "username" and "password"
      And the user navigates to Pay Bills page
      And the user enter amount "100" and description "2020-01-10" and the other options
      Then "The payment was successfully submitted." should be displayed.




    @wip

    Scenario: Payment without entering amount

        Given the user is on the login page
        When user logs in using "username" and "password"
        When the user navigates to Pay Bills page
        When user entering all options without amount
      Then message should displayed "Füllen Sie dieses Feld aus."


    Scenario: Payment without entering date
      Given the user is on the login page
      When user logs in using "username" and "password"
      When the user navigates to Pay Bills page
      When user entering all options without date
      Then message should displayed "Füllen Sie dieses Feld aus."


