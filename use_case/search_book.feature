

Feature: Search book
  

 
  Scenario Outline: Searching for books by providing a substringbof either title, author , signature, or ISBN.

    Given the user choose the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen 
   Examples:
   |value|S|
   |title|"the choice"|
   |ISBN|1524763160|
   |author|" Barack Obama  "| 
   |signature|"Obama2020 " |
    
    

    
    
   
    
    
    
    
  