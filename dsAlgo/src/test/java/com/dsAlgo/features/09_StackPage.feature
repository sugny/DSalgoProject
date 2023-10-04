@stack
Feature: dsAlgo:009 Stack page feature and functionality test
  
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

  Scenario: user is navigated to stack page
    Given user should click the get started button
    And user should select the operatins in stack option
    Then The user should navigate to select try here option and click on it
    And user is navigated to a page having an tryEditor with a Run button to test
    And The user clicks on Run button after Entering valid python code in stack tryEditor

  Scenario: user should navigate back to the stack page
    Given The user should navigate to the implimantaion option in stack page
    And user should click on try here button
    Then the user should enter data to perform
    And the user should run the code for output

  Scenario: user should navigate to the application option in the stack page
    Given The user should select the application option and click on it
    And user should click on try here option
    Then the user should enter code to perform
    And the user should run the data for output

  Scenario: user should navigate to the practice question page
    Given The user is now in practice question page
    And The user navigates back

  Scenario Outline: User validates error message for Operations in stack in try editor page for invalid code
    Given user is traversing to  Operations in stack Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Implementation page in try editor page for invalid code
    Given user is traversing to Implementation page in stack Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Applications page in try editor page for invalid code
    Given user is traversing to Applications page in stack Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
