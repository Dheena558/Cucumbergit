
Feature: create account
  
  Scenario: new account creation
    Given enter credientals
    When I enter credientals
    
      | name  | password    | status  |
      | name1 |     5qwer   | success |
      | name2 |     7sdfg   | Fail    |
     Then i verify Account