@register
Feature: dsAlgo:003 Register page feature and functionality test

  Background: User launch the dsAlgo application
    Given open the browser maximize and set the timeouts
    And load the url
    When user click the "Get Started" button
    Then user clicks on register link

  Scenario: User enters only username and click register button
    Given user redirected to regiter page
    When user enters only "username" and clicks on register button
      | username          |
      | sdetustestingteam |
    And the user gets the warning message alert "Please fill out this field." below password textbox

  Scenario: User enters only username and password and click register button
    Given user redirected to regiter page
    When user enters only "username" and "password" and clicks on register button
      | username          | password     |
      | sdetustestingteam | Selenium@123 |
    And the user gets the warning message alert "Please fill out this field." below confirm password textbox

  Scenario: User enters all details blank and click register button
    Given user redirected to regiter page
    When user kept "username" and "password" and "confirm password" all fields blank and clicks on register button
    And the user gets the warning message alert "Please fill out this field." below username textbox

  Scenario: User enters invalid details and click register button
    Given user redirected to regiter page
    When user enters valid "username" but incorrect "password" and "confirm password"  and clicks on register button
      | username          | password     | confirm password |
      | sdetustestingteam | Selenium@123 | Selenium@1234    |
    And the user gets the error message as "password_mismatch:The two password fields didn’t match."

  Scenario: User redirects to login page
    Given user redirected to regiter page
    When user clicks login link
    Then the user redirects to login page

  Scenario: User enters the valid details and click register button
    Given user redirected to regiter page
    When the user enters the valid "username" and "password" and "confirm password"
    Then the user clicks the register button
    And the user is redirected to homepage with the message "New Account Created. You are logged in as <username>"
    And user clicks signout button
