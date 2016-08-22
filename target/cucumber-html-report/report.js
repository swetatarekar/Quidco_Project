$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/quidco/project/shoop/login/shoopLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Going to Shoop Extension",
  "description": "\r\nIn order to do some good shopping\r\nAs a shopaholic\r\nI want to login to Shoop",
  "id": "going-to-shoop-extension",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login to Shoop Extension on Chrome",
  "description": "",
  "id": "going-to-shoop-extension;login-to-shoop-extension-on-chrome",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I go to chrome with shoop extension",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the Shoop Extension",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input my \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Sign Out button appears Sign In is confirmed",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "going-to-shoop-extension;login-to-shoop-extension-on-chrome;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "going-to-shoop-extension;login-to-shoop-extension-on-chrome;;1"
    },
    {
      "cells": [
        "sweta.tarekar0506@gmail.com",
        "Sweta12"
      ],
      "line": 17,
      "id": "going-to-shoop-extension;login-to-shoop-extension-on-chrome;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Login to Shoop Extension on Chrome",
  "description": "",
  "id": "going-to-shoop-extension;login-to-shoop-extension-on-chrome;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I go to chrome with shoop extension",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the Shoop Extension",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I input my sweta.tarekar0506@gmail.com and Sweta12",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on the SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Sign Out button appears Sign In is confirmed",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoopLoginTest.i_go_to_chrome_with_shoop_extension()"
});
formatter.result({
  "duration": 3369388769,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginTest.i_click_on_the_Shoop_Extension()"
});
formatter.result({
  "duration": 4059351390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sweta.tarekar0506@gmail.com",
      "offset": 11
    },
    {
      "val": "Sweta12",
      "offset": 43
    }
  ],
  "location": "ShoopLoginTest.i_input(String,String)"
});
formatter.result({
  "duration": 820045863,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginTest.i_click_on_the_SignIn_button()"
});
formatter.result({
  "duration": 329706170,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginTest.sign_Out_button_appears_Sign_In_is_confirmed()"
});
formatter.result({
  "duration": 5640858739,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginTest.quit_the_browser()"
});
formatter.result({
  "duration": 1614225638,
  "status": "passed"
});
});