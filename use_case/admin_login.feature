

Feature: Admin login
  
  Scenario Outline: adminstrator has the wrong password
    Given the adminstrator opened the login page
   
    When he enters correct username <u> and  wrong password <p> 
  
    Then he can not log in  to the website
Examples:
| u | p |
|"A"|"B"|


   Scenario Outline: adminstrator can log in with valid credentials
    Given the adminstrator opened the login page
   
    When he enters username <u> and  password <p> correctly
  
    Then he logs in successfully to the website
    
  Examples:
| u | p |
|"A"|"A"|