$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Hotels/HotelsSP_1.feature");
formatter.feature({
  "name": "Sprint planning 1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Change dates button is displayed at the end of search results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test6"
    }
  ]
});
formatter.step({
  "name": "I launch Hotel launchpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.Hotels_Steps.i_launch_Hotel_launchpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Enter Bora Bora in destination",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Select check in dates",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select check out date",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on apply",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on the search button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I Verify Change dates button is displayed at the end of search results",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});