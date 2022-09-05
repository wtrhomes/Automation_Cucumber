$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BackgroundColors.feature");
formatter.feature({
  "line": 2,
  "name": "Validate background colors",
  "description": "",
  "id": "validate-background-colors",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BackgroundFeature"
    }
  ]
});
formatter.before({
  "duration": 2941555300,
  "status": "passed"
});
formatter.before({
  "duration": 2787914800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "2",
  "description": "1 User should be able to click on white background button and the background color will change to white",
  "id": "validate-background-colors;2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on the \"https://techfios.com/test/101/\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user clicks white background button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the background should turn white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://techfios.com/test/101/",
      "offset": 16
    }
  ],
  "location": "SkyblueSteps.user_is_on_the_page(String)"
});
formatter.result({
  "duration": 55946400,
  "status": "passed"
});
formatter.match({
  "location": "WhiteSteps.user_clicks_white_background_button()"
});
formatter.result({
  "duration": 44972800,
  "status": "passed"
});
formatter.match({
  "location": "WhiteSteps.the_background_should_turn_white()"
});
formatter.result({
  "duration": 29951200,
  "status": "passed"
});
formatter.after({
  "duration": 780744200,
  "status": "passed"
});
formatter.after({
  "duration": 591917200,
  "status": "passed"
});
});