package softwareproject;

import static org.junit.Assert.assertEquals;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	private boolean flag1=false;
	private boolean flag2=false;
	private boolean flag3=false;
	private boolean flag4=false;
private LoginCode h=new LoginCode();
	private boolean result=false;
	private AddBook j=new AddBook();
	private String SSSS;
	private  List  <TheBook>  oii;
	@Given("user  chooses the book to be searched by title")
	public void user_chooses_the_book_to_be_searched_by_title() {
	   this.flag1=true;
	}

	@Given("user  chooses the book to be searched by ISBN")
	public void user_chooses_the_book_to_be_searched_by_isbn() {
	   this.flag2=true;
	}

	@Given("user  chooses the book to be searched by author")
	public void user_chooses_the_book_to_be_searched_by_author() {
		this.flag3=true;
	}

	@Given("user  chooses the book to be searched by signature")
	public void user_chooses_the_book_to_be_searched_by_signature() {
		this.flag4=true;
	}

	
	
	@Given("he wrote the substring  {string}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(String substring) {
		this.SSSS=substring;
	}
	
	@When("he calls the search function")
	public void he_calls_the_search_function() {
	   if(flag1) {
		   
	   
		  oii=j.searchTitle(SSSS) ;
		
	   }
	   if(flag3) {
		 
		  oii= j.searchAuthor(SSSS) ;
		 
	   }
	   if(flag2) {
		   
		 
		  oii= j.searchIsbn(SSSS) ;
		 
	   }
	   if(flag4) {
		   
		  
		  oii= j.searchSignature(SSSS) ;
		  
		   
	   }
	   if(oii.size()>0)result=true;
	
			   
	   
	}
	

	
	
	
	
	
	
	@Then("all the information related to the entered string will be shown on the screen")
	public void all_the_information_related_to_the_entered_string_will_be_shown_on_the_screen() {
		 assertEquals(true,result);
		
		
		 for(int i=0;i<oii.size();i++) {
			 
			 System.out.printf  ("title:");
		 System.out.print( oii.get(i).getTitle()+"\n");
		 System.out.print  ("ISBN:");
		 System.out.print(oii.get(i).getIsbn()+"\n");
		 System.out.print  ("author:");
		 System.out.print(oii.get(i).getAuthor()+"\n");
		 System.out.print  ("signature:");

		 System.out.print(oii.get(i).getSignature()+"\n");
		 System.out.printf  ("*************************************************\n");
		 }


	 
	 
	
	}
	
	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by title")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_title(String username, String password) {
	    this.flag1=true;
	    h.checkvalidAdmin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by ISBN")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_isbn(String username, String password) {
		   this.flag2=true;
		    h.checkvalidAdmin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by author")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_author(String username, String password) {
		   this.flag3=true;
		    h.checkvalidAdmin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by signature")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_signature(String username, String password) {
		   this.flag4=true;
		    h.checkvalidAdmin(username, password);
	}


@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by title")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_title(String username, String password) {
   this.flag1=true;
   h.checkvalidUser(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by ISBN")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_isbn(String username, String password) {
	 this.flag2=true;
	   h.checkvalidUser(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by author")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_author(String username, String password) {
	 this.flag3=true;
	   h.checkvalidUser(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by signature")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_signature(String username, String password) {
	 this.flag4=true;
	   h.checkvalidUser(username, password);
}
	
	

	

	

	@Then("no book has this criteria")
	public void no_book_has_this_criteria() {
	assertEquals(false,result);
	 System.out.println("no book found has this criteria");
	}



	
}
