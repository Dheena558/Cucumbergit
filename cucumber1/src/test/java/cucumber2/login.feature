
Feature: Login
 

   @smoke @uat
  Scenario: login
    Given user enters "sam1"
    And Enters"dheen1"
    When user clicks the login button
    Then Homepage is displayed
  @uat
  Scenario: home
   Given displays the page
   And clicks the category
   When user click the product
   Then it displays product
    
   
  @uat 
  Scenario: demo
  Given :fgef
  And :dsada
  When :vcs
  Then :fdg