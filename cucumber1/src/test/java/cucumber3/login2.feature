

Feature: User Login
  Scenario Outline: Multiple User Login
    Given I enter "<username>"
    When I enters "<password>"
    Then the page is Displayed

    Examples: 
      |username  | password|   
      | sam      | 5abc    | 
      | ram      | 123abc  | 
