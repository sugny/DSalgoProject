@home
Feature: dsAlgo:002 Home page feature and functionality test

  Background: User launch the dsAlgo application
    Given open the browser maximize and set the timeouts
    And load the url
    When user click the "Get Started" button
    Then user redirects to the home page and verify the page title

  Scenario: User is on the Home page and click sign in
    Given user click on the sign in link
    Then user redirected to login page

  Scenario: User is on Home page and click getstarted link without sign in
    Given user clicks on Get Started link without login
    But user get alert message "You are not logged in"

  Scenario Outline: 
    User is on Home page and click on dropdown menu without sign in

    Given user clicks on dropdown <menu>
    But user get alert message "You are not logged in"

    Examples: 
      | menu         |
      | 'Arrays'     |
      | 'Linkedlist' |
      | 'Stack'      |
      | 'Queue'      |
      | 'Tree'       |
      | 'Graph'      |

  Scenario: User is on Home page and click on register
    Given user clicks on register link
    Then user redirected to register page
