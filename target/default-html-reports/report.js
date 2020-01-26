$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account activity behavior",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Transactions table behavior",
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
  "name": "the user navigates to Account Activity",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivityStepDef.the_user_navigates_to_Account_Activity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see tabelerow",
  "rows": [
    {
      "cells": [
        "Date"
      ]
    },
    {
      "cells": [
        "Description"
      ]
    },
    {
      "cells": [
        "Deposit"
      ]
    },
    {
      "cells": [
        "Withdrawal"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityStepDef.the_user_should_see_tabelerow(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});