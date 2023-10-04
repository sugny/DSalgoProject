@login
Feature: dsAlgo:004 Login page feature and functionality test

  Background: User launch the dsAlgo application
    Given open the browser maximize and set the timeouts
    And load the url
    When user click the "Get Started" button
    Then user redirects to the home page and verify the page title

  Scenario: User enter with valid credentials
    Given user click on the sign in link
    Given enter the username
      | username        |
      | SeleniumTesting |
    Then enter the password
      | password     |
      | Selenium@123 |
    And click the login button
    Then user navigated to the home page and verify the title
    And user clicks signout button
    And user validates successful logout

  Scenario: User redirects to register page
    Given user click on the sign in link
    Given The user is on signin page
    When user clicks register link
    Then the user redirects to register page

  Scenario: User on login page and login with invalid inputs "username" and "password"
    Given user click on the sign in link
    Given The user is on signin page
    When The user enter invalid "username" and "password"
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |
    And click the login button

  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    Given user click on the sign in link
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    And click the login button

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  Scenario: User on login page and trying to sign out
    Given The user is on signin page
    And user clicks signout button
