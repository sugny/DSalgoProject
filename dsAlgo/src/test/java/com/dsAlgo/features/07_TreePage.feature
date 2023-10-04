@tree
Feature: dsAlgo:007 Tree feature and functionality test
  
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
    And user clicks get started link of tree page

  Scenario Outline: user is on tree page and navigate to overview of trees and enter valid inputs on try editor page
    Given user click overview of trees link and navigated to overview of trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: user is on tree page and navigate to overview of trees and enter invalid inputs on try editor page
    Given user click overview of trees link and navigated to overview of trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Terminologies and enter valid inputs on try editor page

    Given user click Terminologies link and navigated to Terminologies page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Terminologies and enter invalid inputs on try editor page

    Given user click Terminologies link and navigated to Terminologies page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Types of Trees and enter valid inputs on try editor page

    Given user click Types of Trees link and navigated to Types of Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Types of Trees and enter invalid inputs on try editor page

    Given user click Types of Trees link and navigated to Types of Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Tree Traversals and enter valid inputs on try editor page

    Given user click Tree Traversals link and navigated to Tree Traversals page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Tree Traversals and enter invalid inputs on try editor page

    Given user click Tree Traversals link and navigated to Tree Traversals page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Traversals-Illustration and enter valid inputs on try editor page

    Given user click Traversals-Illustration and navigated to Traversals-Illustration page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Traversals-Illustration and enter invalid inputs on try editor page

    Given user click Traversals-Illustration and navigated to Traversals-Illustration page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Trees and enter valid inputs on try editor page

    Given user click Binary Trees and navigated to Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Trees and enter invalid inputs on try editor page

    Given user click Binary Trees and navigated to Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Types of Binary Trees and enter valid inputs on try editor page

    Given user click Types of Binary Trees and navigated to Types of Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Types of Binary Trees and enter invalid inputs on try editor page

    Given user click Types of Binary Trees and navigated to Types of Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Implementation in Python and enter valid inputs on try editor page

    Given user click Implementation in Python and navigated to Implementation in Python page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Implementation in Python and enter invalid inputs on try editor page

    Given user click Implementation in Python and navigated to Implementation in Python page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Tree Traversals and enter valid inputs on try editor page

    Given user click Binary Tree Traversals and navigated to Binary Tree Traversals page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Tree Traversals and enter invalid inputs on try editor page

    Given user click Binary Tree Traversals and navigated to Binary Tree Traversals page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Implementation of Binary Trees  and enter valid inputs on try editor page

    Given user click Implementation of Binary Trees and navigated to Implementation of Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Implementation of Binary Trees  and enter invalid inputs on try editor page

    Given user click Implementation of Binary Trees and navigated to Implementation of Binary Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Applications of Binary trees and enter valid inputs on try editor page

    Given user click Applications of Binary trees and navigated to Applications of Binary trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Applications of Binary trees and enter invalid inputs on try editor page

    Given user click Applications of Binary trees and navigated to Applications of Binary trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Search Trees and enter valid inputs on try editor page

    Given user click Binary Search Trees and navigated to Binary Search Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: 
    user is on tree page and navigate to Binary Search Trees and enter invalid inputs on try editor page

    Given user click Binary Search Trees and navigated to Binary Search Trees page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario Outline: user is on tree page and navigate to Implementation Of BST and enter valid inputs on try editor page
    Given user click Implementation Of BST and navigated to Implementation Of BST page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    Then capture and verify the result
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: user is on tree page and navigate to Implementation Of BST and enter invalid inputs on try editor page
    Given user click Implementation Of BST and navigated to Implementation Of BST page
    When user click on tryhere and navigated to try editor page
    And user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    When click the run button
    But capture and verify the alert message
    And The user navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: user is on tree page and navigate Practice Questions page
    Given user click overview of trees link and navigated to overview of trees page
    When user click Practice Questions and navigated to Practice Questions page
    And The user navigates back
    And user clicks signout button
