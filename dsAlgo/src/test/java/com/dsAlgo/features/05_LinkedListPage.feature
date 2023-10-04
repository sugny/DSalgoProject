@linkedlist
Feature: dsAlgo:005 Linked List feature and functionality test
  
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

  Scenario: User click get started on linked list page
    Given user is on linked list page
    And user check all the required links available for linked list page
    Then user clicks on each link
    And user validates the link navigation

  Scenario: User validates Introduction link page
    Given user is on Introduction Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates creating linked list link page
    Given user is on creating linked list Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates types of linked list link page
    Given user is on types of linked list link Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates implement linked list link in python page
    Given user is on implement linked list link Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates traversal link page
    Given user is on traversal link Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates insertion link page
    Given user is on insertion link Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates deletion link page
    Given user is on deletion link Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Practice Questions page
    Given user is on practice questions Page
    And user validate the title

  Scenario Outline: User validates error message for Introduction in try editor page for invalid code
    Given user is traversing to Introduction Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Creating Linked Lists in try editor page for invalid code
    Given user is traversing to creating linked list Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for types of linked list link in try editor page for invalid code
    Given user is traversing to types of linked list link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for implement linked list link in try editor page for invalid code
    Given user is traversing to implement linked list link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for traversal link page in try editor page for invalid code
    Given user is traversing to traversal link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for insertion link in try editor page for invalid code
    Given user is traversing to insertion link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for deletion link  in try editor page for invalid code
    Given user is traversing to deletion link Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
