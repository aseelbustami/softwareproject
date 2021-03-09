

Feature: Admin login
  
  Scenario: adminstrator has the wrong password
    Given the adminstrator opened the login page
   
    When he enters correct username "A" and  wrong password "B" 
  
  
    Then he can not log in  to the website



   Scenario: adminstrator can log in with valid credentials
    Given the adminstrator opened the login page
   
    When he enters username "A" and  password "A" correctly
  
    Then he logs in successfully to the website
    
  