$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account summery behavior",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Credit Accounts",
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
  "name": "the user should see the following credit account columns",
  "rows": [
    {
      "cells": [
        "Account"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Balance"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummeryStepDef.the_user_should_see_the_following_credit_account_columns(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});