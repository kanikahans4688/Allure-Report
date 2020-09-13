$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Google.feature");
formatter.feature({
  "line": 1,
  "name": "WordPress Login",
  "description": "",
  "id": "wordpress-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify Login",
  "description": "",
  "id": "wordpress-login;verify-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I want to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "I click on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I verify title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I close the title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.i_want_to_launch_the_browser()"
});
