@queue
Feature: dsAlgo:010 Queue page feature and functionality test
  
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

  Scenario: user is navigated to queue page from home page
    Given user should click on get started
    Then user should select queue element
    And user should select the implementation option
    Then user should click on tryhere button
    And user should enter text
    Then user should run the code given

  Scenario: user is navigated to queue page
    Given user should select on imlementation of collection option
    Then user should click on tryhere button
    And user should enter text
    Then user should run the code given

  Scenario: user is navigated to queue page
    Given user should select on imlementation of array option
    Then user should click on tryhere button
    And user should enter text
    Then user should run the code given

  Scenario: user is navigated to queue page
    Given user should select on queue operation option
    Then user should click on tryhere button
    And user should enter text
    Then user should run the code given

  Scenario: user is navigated to queue page
    Given user should select the practice question option
    Then user should click on it
    And The user navigates back

  Scenario Outline: User validates error message for Implementation of queue in try editor page for invalid code
    Given user is traversing to Implementation of queue Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Implementation using collection deque in try editor page for invalid code
    Given user is traversing to Implementation using collection deque Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Implementation using array in try editor page for invalid code
    Given user is traversing to Implementation using array of queue Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for queue operations in try editor page for invalid code
    Given user is traversing to queue operations Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
