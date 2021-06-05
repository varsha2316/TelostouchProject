$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test2.feature");
formatter.feature({
  "line": 2,
  "name": "Performance Test",
  "description": "",
  "id": "performance-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Performance"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Endurance Test",
  "description": "",
  "id": "performance-test;endurance-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@stress"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I run the app for 30 mins",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I close the app",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.i_open_the_app()"
});
formatter.result({
  "duration": 238986715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 18
    }
  ],
  "location": "StepDef.i_run_the_app_for_mins(int)"
});
formatter.result({
  "duration": 2922592,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_close_the_app()"
});
formatter.result({
  "duration": 60940,
  "status": "passed"
});
});