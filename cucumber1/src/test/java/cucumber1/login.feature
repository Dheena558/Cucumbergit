
Feature: Login
 

  @tag1
  Scenario: Success
    Given user enters the username
    And user enters the password
    When user click on login button
    Then homepage displayed
  

  