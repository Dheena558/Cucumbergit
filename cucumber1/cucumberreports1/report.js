$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber2/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "userenters \"sam\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.userenters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters\"dheen\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clickslogin button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clickslogin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});