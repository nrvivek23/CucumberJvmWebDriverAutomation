$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("webconsumer.feature");
formatter.feature({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website",
  "description": "",
  "name": "As a Slyde Consumer, I should be able to manage my account through Slyde Website",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 3721644000,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website;tc01-login-with-valid-credentials",
  "description": "",
  "name": "TC01 Login with valid credentials",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Slyde Consumer Website",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I enter valid \"username\" and \"password\"",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "Greeted with welcome message",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "location": "WebConsumerStepDefs.i_am_on_Slyde_Consumer_Website()"
});
formatter.result({
  "duration": 138985000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "WebConsumerStepDefs.i_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 1599639000,
  "status": "passed"
});
formatter.match({
  "location": "WebConsumerStepDefs.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 558204000,
  "status": "passed"
});
formatter.match({
  "location": "WebConsumerStepDefs.greeted_with_welcome_message()"
});
formatter.result({
  "duration": 21833000,
  "status": "passed"
});
formatter.after({
  "duration": 3203543000,
  "status": "passed"
});
formatter.before({
  "duration": 3012655000,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website;tc02-check-forgot-password?-link",
  "description": "",
  "name": "TC02 Check Forgot password? link",
  "keyword": "Scenario",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Slyde Consumer Website",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "I should see \"Forgot password?\" link",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "location": "WebConsumerStepDefs.i_am_on_Slyde_Consumer_Website()"
});
formatter.result({
  "duration": 27556000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Forgot password?",
      "offset": 14
    }
  ],
  "location": "WebConsumerStepDefs.i_should_see_link(String)"
});
formatter.result({
  "duration": 46272000,
  "status": "passed"
});
formatter.after({
  "duration": 3068959000,
  "status": "passed"
});
formatter.before({
  "duration": 3943472000,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website;tc03-login-with-blank-username-\u0026-password",
  "description": "",
  "name": "TC03 Login with blank username \u0026 password",
  "keyword": "Scenario",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Slyde Consumer Website",
  "keyword": "Given ",
  "line": 15
});
formatter.step({
  "name": "I enter blank \"username\" and \"password\"",
  "keyword": "When ",
  "line": 16
});
formatter.step({
  "name": "I should be displayed with error message \"There was an error with your E-Mail/Password combination. Please try again.\"",
  "keyword": "Then ",
  "line": 17
});
formatter.match({
  "location": "WebConsumerStepDefs.i_am_on_Slyde_Consumer_Website()"
});
formatter.result({
  "duration": 22776000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "WebConsumerStepDefs.i_enter_blank_and(String,String)"
});
formatter.result({
  "duration": 251951000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There was an error with your E-Mail/Password combination. Please try again.",
      "offset": 42
    }
  ],
  "location": "WebConsumerStepDefs.i_should_be_displayed_with_error_message(String)"
});
formatter.result({
  "duration": 420326000,
  "status": "passed"
});
formatter.after({
  "duration": 2919649000,
  "status": "passed"
});
formatter.before({
  "duration": 3049944000,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website;tc12-verify-that-user-is-able-to-change-new-password",
  "description": "",
  "name": "TC12 Verify that user is able to change new password",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Slyde Consumer Website",
  "keyword": "Given ",
  "line": 20
});
formatter.step({
  "name": "I enter valid \"username\" and \"password\"",
  "keyword": "When ",
  "line": 21
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "I should be able to change my existing password to \"newpassword\"",
  "keyword": "And ",
  "line": 23
});
formatter.step({
  "name": "I should be displayed with password conformation message \"Successfully changed your password.\"",
  "keyword": "And ",
  "line": 24
});
formatter.match({
  "location": "WebConsumerStepDefs.i_am_on_Slyde_Consumer_Website()"
});
formatter.result({
  "duration": 18540000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "WebConsumerStepDefs.i_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 973132000,
  "status": "passed"
});
formatter.match({
  "location": "WebConsumerStepDefs.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 546718000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newpassword",
      "offset": 52
    }
  ],
  "location": "WebConsumerStepDefs.i_should_change_my_password(String)"
});
formatter.result({
  "duration": 1122707000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully changed your password.",
      "offset": 58
    }
  ],
  "location": "WebConsumerStepDefs.i_should_get_success_confirmation(String)"
});
formatter.result({
  "duration": 1226621000,
  "status": "passed"
});
formatter.after({
  "duration": 2903618000,
  "status": "passed"
});
formatter.before({
  "duration": 3148393000,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-slyde-consumer,-i-should-be-able-to-manage-my-account-through-slyde-website;tc13-verify-that-user-receives-an-error-when-inputting-incorrect-current-password-when-changing-password",
  "description": "",
  "name": "TC13 Verify that user receives an error when inputting incorrect current password when changing password",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Slyde Consumer Website",
  "keyword": "Given ",
  "line": 27
});
formatter.step({
  "name": "I enter valid \"username\" and \"password\"",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then ",
  "line": 29
});
formatter.step({
  "name": "I should get error message \"There was an error with your E-Mail/Password combination. Please try again.\" when provided with wrong current password",
  "keyword": "And ",
  "line": 30
});
formatter.match({
  "location": "WebConsumerStepDefs.i_am_on_Slyde_Consumer_Website()"
});
formatter.result({
  "duration": 26861000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 30
    }
  ],
  "location": "WebConsumerStepDefs.i_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 995110000,
  "status": "passed"
});
formatter.match({
  "location": "WebConsumerStepDefs.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 565623000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There was an error with your E-Mail/Password combination. Please try again.",
      "offset": 28
    }
  ],
  "location": "WebConsumerStepDefs.i_should_get_error_message(String)"
});
formatter.result({
  "duration": 30603553000,
  "status": "failed",
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(.,\u0027There was an error with your E-Mail/Password combination. Please try again.\u0027)]\"}\nCommand duration or timeout: 30.03 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.42.2\u0027, revision: \u00276a6995d31c7c56c340d6f45a76976d43506cd6cc\u0027, time: \u00272014-06-03 10:52:47\u0027\nSystem info: host: \u0027Srikanth-Vejendlas-MacBook-Pro.local\u0027, ip: \u0027192.168.31.99\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.9.2\u0027, java.version: \u00271.6.0_65\u0027\nSession ID: 64ac8fe5-9b27-924b-9b95-55974686c710\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dMAC, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, browserName\u003dfirefox, rotatable\u003dfalse, locationContextEnabled\u003dtrue, version\u003d31.0, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue}]\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:513)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat slyde.automation.utils.WebDriverHelper.isTextPresent(WebDriverHelper.java:45)\n\tat slyde.automation.cucumber.WebConsumerStepDefs.i_should_get_error_message(WebConsumerStepDefs.java:94)\n\tat ✽.And I should get error message \"There was an error with your E-Mail/Password combination. Please try again.\" when provided with wrong current password(webconsumer.feature:30)\nCaused by: org.openqa.selenium.remote.ErrorHandler$UnknownServerException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(.,\u0027There was an error with your E-Mail/Password combination. Please try again.\u0027)]\"}\nBuild info: version: \u00272.42.2\u0027, revision: \u00276a6995d31c7c56c340d6f45a76976d43506cd6cc\u0027, time: \u00272014-06-03 10:52:47\u0027\nSystem info: host: \u0027Srikanth-Vejendlas-MacBook-Pro.local\u0027, ip: \u0027192.168.31.99\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.9.2\u0027, java.version: \u00271.6.0_65\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/rb/z8c1404x10166_rb8kxvwq2c0000gp/T/anonymous4245876074876737610webdriver-profile/extensions/fxdriver@googlecode.com/components/driver_component.js:9470:133)\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///var/folders/rb/z8c1404x10166_rb8kxvwq2c0000gp/T/anonymous4245876074876737610webdriver-profile/extensions/fxdriver@googlecode.com/components/driver_component.js:407:5)\n"
});
formatter.after({
  "duration": 4061197000,
  "status": "passed"
});
});