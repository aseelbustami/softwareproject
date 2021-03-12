

Feature: Search book

   Scenario Outline: Searching for books by title, author , signature, or ISBN by user 

    Given  user  chooses the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information related to the entered string will be shown on the screen  
    
   Examples:
   |value          |S              |
   |title          |"promised "    | 
   |ISBN           |"1524763160 "    |
   |author         |" bama "       | 
   |signature      |"20"        |
   
   

   Scenario Outline: Searching for books by title, author , signature, or ISBN when admin logged in

    Given the admin is  logged in and he entered username "A" and password "A" and chooses the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information related to the entered string will be shown on the screen  
    
   Examples:
   |value          |S                  |
   |title          |"educated "        | 
   |ISBN           |"0241334144 "        |
   |author         |" Tara "           | 
   |signature      |"Obama"        |
   
   Scenario Outline: Searching for books by title, author , signature, or ISBN when user logged in

    Given the user  is  logged in and he entered username "s" and password "s" and chooses the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information related to the entered string will be shown on the screen  
    
   Examples:
   |value          |S                  |
   |title          |" land"    | 
   |ISBN           |"0099511 "        |
   |author         |" ta "           | 
   |signature      |"20"        |
   
   
     Scenario Outline: no book was found 

    Given  user  chooses the book to be searched by <value>
    And  he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then no book has this criteria 
    
   Examples: 
   |value    |S          |
   |title          |" uuuu"    |
   |ISBN     |"1524733330" |
   |author   |"   yyyy"  | 
   |signature|"Ouuuuu "  |
   
   
   
  
  
  