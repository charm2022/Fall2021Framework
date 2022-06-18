$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Facebook/FacebookLogin.feature");
formatter.feature({
  "name": "Login",
  "description": "  //Background:\n    // Given I launch facebook website",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Verify user gets error for invalid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@invalidLogin"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \u0027%^\u0026\u0026*()\u0027 as login email",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.enterLoginData(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \u0027abcd@1234\u0027 as login password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.enterLoginData(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify login error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginSD.verifyInvalidLoginError()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify user can login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@invalidLogin"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \u0027cc28@tmail.com\u0027 as login email",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.enterLoginData(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \u0027gongzuo202@\u0027 as login password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.enterLoginData(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginSD.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify user lands on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginSD.verifyUserLoggedIn()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:Features/Facebook/FacebookPay.feature");
formatter.feature({
  "name": "Facebook Pay",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fbPay"
    }
  ]
});
formatter.scenario({
  "name": "Verify user can make a payment using Facebook Pay",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fbPay"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@makePayment"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I launch facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.FacebookPaySD.launchFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Facebook Pay",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.FacebookPaySD.clickFbPay()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I make payment using Facebook Pay",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I verify Payment successful message is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});