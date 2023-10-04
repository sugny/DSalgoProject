@data_structure
Feature: dsAlgo:008 Data Structures feature and functionality test
  Before: User launch the dsAlgo application
    Given open the browser maximize and set the timeouts
    And load the url
    When user click the "Get Started" button
    Then user redirects to the home page and verify the page title

  Scenario: 
    Given user click on the sign in link
    Given enter the username
      | username        |
      | SeleniumTesting |
    Then enter the password
      | password     |
      | Selenium@123 |
    And click the login button

  Scenario: The user is able to navigate to Data Structure page
    Given The user is on the home page
    When The user clicks the Getting Started button in Data Structure Page introduction Panel
    And user check all the required links available for data structures page
    And user clicks and validates the ds link navigation

  Scenario: User validates Time Complexity link page
    Given user is on Time Complexity Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Practice Questions page
    Given user is on practice questions Page
    And user validate the title

  Scenario Outline: User validates error message for Time Complexity in try editor page for invalid code
    Given user is traversing to Time Complexity Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
