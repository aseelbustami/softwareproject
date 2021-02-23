

Feature: Search book
  

 
  Scenario: Searching for a substring of the title

    Given the user choose the book to be searched by the title
    And he wrote the substring of the title in the search engine
    
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen 
    
    
    
 Scenario: Searching for a substring of the author

    Given the user choose the book to be searched by the author
    And he wrote the substring of the author in the search engine
    
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen 
    
    
    
    
     Scenario: Searching for a substring of the ISBN

    Given the user choose the book to be searched by the ISBN
    And he wrote the substring of the ISBN in the search engine
    
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen 
    
    
     Scenario: Searching for a substring of the signature

    Given the user choose the book to be searched by the signature
    And he wrote the substring of the signature in the search engine
    
    When he calls the search function
    Then all the information about this book will appear directly on the screen 
    
    
    
    Scenario: Searching also works when the user/administrator is logged in

    Given user/administrator is logged in
    And he chooses the book to be searched by one of the choices available on the screen
     And he wrote the  wanted information to be searched about in the search engine
    When he calls the search function
 
    
    Then all the information about this book will appear directly on the screen
    And a list of recommended books to him based on his history in the website 
    And a list  of the most searched books in the website 
    
       Scenario:  No books match the criteria

    Given the user choose the book to be searched by one of the choices available on the screen
    And he wrote the  wanted information to be searched about in the search engine
    
    When he calls the search function
    Then the website will write a message that this book is not available 
    
  
     Scenario:  Find more than one book

    Given the user choose the book to be searched by one of the choices available on the screen
    And he wrote the  wanted information to be searched about in the search engine
    
    When he calls the search function
    Then the website will show a table that has all the books available that has the same criteria 
    
  
    
    
    
    
    
    
    
  