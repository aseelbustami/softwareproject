

Feature: Search book
  

  Scenario Outline: Searching for books by providing a substringbof either title, author , signature, or ISBN.

    Given the user-admin is <login> logged in  choose the book to be searched by <value>
    And he wrote the substring  <S>  in the search engine
    
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen 
    
   Examples:
   |value|login |S            |
   |title|not    |"     the choice       "|
   |ISBN|not     |1524763160|
   |author|not     |"        Barack          "| 
   |signature|not   |"Obama2020 " |
   |title|  |"     the choice       "|
   |ISBN|   |1524763160|
   |author|     |"        Barack          "| 
   |signature|  |"Obama2020 " | 
    

   Scenario Outline:  No books match the criteria

    Given the user choose the book to be searched by <s>
    And he wrote the  <value> to be searched about in the search engine
    
    When he calls the search function
    Then the website will write a message that this book is not available  
    Examples:
   |s|value           |
   |title|"    hhhhh       "|
   |ISBN|1524733330|
   |author|"       yyyy          "| 
   |signature|"Ouuuuu " |
  
     Scenario Outline:  Find more than one book

    Given the user choose the book to be searched by <s>
    And he wrote the  <value> to be searched about in the search engine
    
    When he calls the search function
    Then the website will write a message that this information for more than one book is not available 
    
   Examples:
   |s|value           |
   |title|"    choice       "|
   
    
    
    
  