Feature: user enter the login page

  Scenario: launch the url
    Given launch the webdriver
    When User enter the valid username and password
    Then validate the login
