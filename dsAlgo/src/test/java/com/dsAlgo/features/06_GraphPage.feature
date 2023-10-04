@graph
Feature: dsAlgo:006 Graph feature and functionality test
  
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

  Scenario: User click get started on Graph page
    Given user is on Graph page
    And user check all the required links available for Graph page
    Then user clicks on each link
    And user validates the link navigation for graph page

  Scenario: User validates Graph link page
    Given user is on Graph link page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Graph Representations link page
    Given user is on Graph Representations link
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario Outline: User validates error message for Graph link page in try editor page for invalid code
    Given user is traversing to Graph link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Graph Represenation link page in try editor page for invalid code
    Given user is traversing to Graph Representation link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
