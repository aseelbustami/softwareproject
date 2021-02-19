

Feature: add book
  

  
  Scenario: Add a book when the administrator is logged in
    Given  the website has add_book functionality visible
 
    When  he enters his username "A" and  password "A" as adminstrator
    And he calls add_book function 
   
    Then the book will be added 
   
Scenario: Add a book when the administrator is not logged in
    Given  the website has add_book functionality visible
 
    When  he enters his username "AA" and  password "AA" not adminstrator
    And he calls add_book function 
   
    Then the website will show message that books are added by adminstrator only  
    And  the book will not  be added 
   
 