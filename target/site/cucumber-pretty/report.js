$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Administrator/Desktop/slideteam.com.test/src/test/resources/login.feature");
formatter.feature({
  "line": 1,
  "name": "Slidetech login",
  "description": "",
  "id": "slidetech-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Slidetech login functionality",
  "description": "",
  "id": "slidetech-login;slidetech-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is already on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user in on pricing page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepPage.user_is_already_on_Sign_in_page()"
});
formatter.result({
  "duration": 3781795400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepPage.user_enter_username()"
});
formatter.result({
  "duration": 2131731800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepPage.user_enter_password()"
});
formatter.result({
  "duration": 2061661300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepPage.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 8831897400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepPage.user_in_on_pricing_page()"
});
formatter.result({
  "duration": 2264350600,
  "status": "passed"
});
});