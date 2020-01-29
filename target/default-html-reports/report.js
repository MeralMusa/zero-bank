$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBill.feature");
formatter.feature({
  "name": "Pay Bills page behavior",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "When user completes a successful Pay operation, The payment was successfully submitted. should be displayed.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to Pay Bills page",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillStepDef.the_user_navigates_to_Pay_Bills_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter amount \"100\" and description \"2020-01-10\" and the other options",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillStepDef.the_user_enter_amount_and_description_and_the_other_options(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillStepDef.should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});