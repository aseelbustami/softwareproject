

Feature: Admin login


 
  Scenario: adminstrator can log in with valid credentials
    Given adminstrator has account already
   
    When he enters "A" and "A" correctly
  
    Then he logs in successfully
    
    
  Scenario: adminstrator has the wrong password
    Given adminstrator has account already
   
    When he enters "A" and "B" wrong password
  
    Then he can not log in  

