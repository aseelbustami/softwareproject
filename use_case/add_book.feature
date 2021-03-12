

Feature: add book
    Scenario Outline:  Add a book when the administrator is logged in
    Given  adminstrator is logged in  by  entering his  username "A" and password "A"
  
     
   When   he entered the required information about the book <title>,<ISBN>, <author>,<signature> and presses submit button 
    
    Then   the book will be added if the ISBN is valid and  unique and signature is unique
    
    
    
    
    
    Examples:   
 |  title                         | ISBN       | author         | signature       |
 | "this is going to hurt"        | "1509858636" |"  Adam Kay  "  | "Kay2018 "      |
 | "where the crawdads sing "     | "1472154665" |" Delia Owens " | "Owens2019 "    |
 |" the choice "                  | "1846045126" |" Edith Eger  " |" Eger2019   "   | 
  


Scenario Outline: Add a book when the administrator is not logged in
    Given   adminstrator is  not logged in 
 
   When   he entered the required information about the book <title>,<ISBN>, <author>,<signature> and presses submit button 
  
   
    Then  the book will not  be added and the website will show message that books are added by adminstrator only if he is logged in
     Examples:
 |  title           | ISBN       | author            | signature       |
|" the choice "     | "1846045126"   |" Edith Eger  "    |" Eger2019   "   | 
 