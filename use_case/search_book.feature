

Feature: Search book
  

  Scenario Outline: Searching for books by providing a substring of either title, author , signature, or ISBN.

    Given the user  is <login> logged in  and chooses the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information related to the entered string will be shown on the screen  
    
   Examples:
   |value       |login  |S                  |
   |title       |not    |"promised land"    | 
   |ISBN        |not    |1524763160         |
   |author      |not    |" bama "           | 
   |signature   |not    |"Obama2020"        |
   |title       |       |"promised land "   |
   |ISBN        |       |1524763160         |
   |author      |       |"Barack"           | 
   |signature   |       |"Obama2018"        | 
    
    Scenario Outline: Searching for books by title, author , signature, or ISBN 

    Given the admin is <login> logged in  and chooses the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information related to the entered string will be shown on the screen  
    
   Examples:
   |value       |login  |S                  |
   |title       |not    |"promised "    | 
   |ISBN        |not    |1524763160         |
   |author      |not    |" bama "         | 
   |signature   |not    |"Obama2020"        |
   |title       |       |"promised land "      |
   |ISBN        |       |1524763160         |
   |author      |       |"Barack"           | 
   |signature   |       |"Obama2018"         | 
   
    Scenario Outline: no book was found 

    Given  a regular user chooses  the book to be searched by <value>
    And  he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then no book has this criteria 
    
       Examples:
   |value|S           |
   |title|"    hhhhh       "|
   |ISBN|1524733330|
   |author|"       yyyy          "| 
   |signature|"Ouuuuu " |
   
   
   
   
   