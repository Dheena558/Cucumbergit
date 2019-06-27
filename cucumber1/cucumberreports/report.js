$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber1/login.feature");
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
  "name": "user enters the username",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginstep.user_enters_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the password",
  "keyword": "And "
});
formatter.match({
  "location": "Loginstep.user_enters_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Loginstep.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.homepage_displayed()"
});
formatter.result({
  "status": "passed"
});
});