$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber/features/myFirstFeature.feature");
formatter.feature({
  "name": "Feature Name",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Test API",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@testthis"
    }
  ]
});
formatter.step({
  "name": "I have API",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs2.kt:16"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Hit API with user id as 1",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs2.kt:20"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code comes as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs2.kt:27"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "json body contain name as \"Leanne Graham\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs2.kt:35"
});
formatter.result({
  "status": "passed"
});
});