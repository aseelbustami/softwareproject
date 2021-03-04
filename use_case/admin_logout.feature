Feature: Admin log out
 

  Background:  the adminstrator is already logged in  
    Given the adminstrator opens the login page
   
    When he entered username "A" and  password "A" correctly
  
    Then he logsin successfully to the website
  
  Scenario: adminstrator logs out
    
  
    When the adminstrator calls the logout function
  
    Then the adminstrator logs out
 

 