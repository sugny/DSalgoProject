@array
Feature: dsAlgo:011 Array feature and functionality test
  
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
    Given user is on array page
    And user check all the required links available for array page
    Then user clicks on each link
    And user validates the link navigation for array page

  Scenario: User validates Arrays In Python page
    Given user is on Arrays In Python Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Arrays using list page
    Given user is on Arrays using list Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Basic operations in Lists page
    Given user is on Basic operations in Lists Page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario: User validates Applications of array page
    Given user is on Applications of array page
    And user clicks the Try here button
    Then user enters the code to check the output
    And user validates the output

  Scenario Outline: User validates error message for Arrays In Python in try editor page for invalid code
    Given user is traversing to Arrays In Python Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Arrays Using List in try editor page for invalid code
    Given user is traversing to Arrays Using List Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Basic Operations in List in try editor page for invalid code
    Given user is traversing to Basic Operations in List Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message for Applications of array in try editor page for invalid code
    Given user is traversing to Applications of array Page
    But user enter invalid code in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    Then The user should get the error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates Practice Questions 1 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on first practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the run button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  Scenario Outline: User validates Practice Questions 2 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on second practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the run button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         4 |

  Scenario Outline: User validates Practice Questions 3 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on third practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the run button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         6 |

  Scenario Outline: User validates Practice Questions 4 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on fourth practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the run button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         8 |

  Scenario Outline: User validates error message in Practice Questions 1 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on first practice question
    But user enter invalid code syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    When click the run button
    Then The user should be presented with error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message in Practice Questions 2 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on second practice question
    But user enter invalid code syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    When click the run button
    Then The user should be presented with error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message in Practice Questions 3 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on third practice question
    But user enter invalid code syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    When click the run button
    Then The user should be presented with error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates error message in Practice Questions 4 page
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on fourth practice question
    But user enter invalid code syntax in tryEditor from sheet "<Sheetname>" and <RowNumber> clicking on Run button
    When click the run button
    Then The user should be presented with error message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: User validates Practice Questions 1 page using submit
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on first practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the submit button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  Scenario Outline: User validates Practice Questions 2 page using submit
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on second practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the submit button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         5 |

  Scenario Outline: User validates Practice Questions 3 page using submit
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on third practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the submit button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         7 |

  Scenario Outline: User validates Practice Questions 4 page using submit
    Given user is on practice questions Page
    And user validate the title
    Then user clicks on fourth practice question
    And user enters the code for practice question in tryEditor from sheet "<Sheetname>" and <RowNumber>
    When click the submit button
    Then user validates the output for the practice question
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         9 |

  Scenario: User on login page and trying to sign out
    And The user navigates back
    And user clicks signout button
