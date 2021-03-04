

Feature: add book
  

  
  Scenario Outline:  Add a book when the administrator is logged in
    Given  adminstrator is logged in  and entered  username "A" and password "A"
    When  he calls add book function
     
    And   he entered the required information about the book <title>,<ISBN>, <author>,<signature> and presses submit button 
    
    Then the book will be added 
    
    Examples:
 |  title           | ISBN       | author            | signature       |
 | "promised land"  | 1524763160 |" Barack Obama  "  | "Obama2020 "    |
 | "Becoming "      | 0241334144 |" Michelle Obama " | "Obama2018 "    |
 |" the choice "    | 1846045126 |" Edith Eger  "    |" Eger2019   "   | 
 


Scenario: Add a book when the administrator is not logged in
    Given   adminstrator is  not logged in 
 
    When  he calls add book function
  
   
    Then the website will show message that books are added by adminstrator only  
    And  the book will not  be added 
   
 