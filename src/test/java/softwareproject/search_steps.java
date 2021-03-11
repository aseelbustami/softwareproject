package softwareproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	private boolean flag1=false;
	private boolean flag2=false;
	private boolean flag3=false;
	private boolean flag4=false;
private login_code h=new login_code();
	private boolean result=false;
	private add_book j=new add_book();
	private String SSSS;
	private ArrayList  <book>  oi;
	
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

	@Given("he wrote the substring  {int}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(Integer isbn) {
		this.SSSS=isbn.toString();
	};
	
	@Given("he wrote the substring  {string}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(String substring) {
		this.SSSS=substring;
	}
	
	@When("he calls the search function")
	public void he_calls_the_search_function() {
	   if(flag1) {
		   
	   
		  oi=j.search_by_titel(SSSS) ;
		
	   }
	   if(flag3) {
		 
		  oi= j.search_by_auther(SSSS) ;
		 
	   }
	   if(flag2) {
		   
		 
		  oi= j.search_by_ISBN(SSSS) ;
		 
	   }
	   if(flag4) {
		   
		  
		  oi= j.search_by_signature(SSSS) ;
		  
		   
	   }
	   if(oi.size()>0)result=true;
	
			   
	   
	}
	

	
	
	
	
	
	
	@Then("all the information related to the entered string will be shown on the screen")
	public void all_the_information_related_to_the_entered_string_will_be_shown_on_the_screen() {
		assertTrue(result==true);
		 
		
		
		 for(int i=0;i<oi.size();i++) {
			 System.out.printf  ("title:");
		 System.out.print( oi.get(i).get_title()+"\n");
		 System.out.print  ("ISBN:");
		 System.out.print(oi.get(i).get_isbn()+"\n");
		 System.out.print  ("author:");
		 System.out.print(oi.get(i).get_author()+"\n");
		 System.out.print  ("signature:");

		 System.out.print(oi.get(i).get_signature()+"\n");
		 
		 }


	 
	 
	
	}
	
	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by title")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_title(String username, String password) {
	    this.flag1=true;
	    h.checkvalid_admin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by ISBN")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_isbn(String username, String password) {
		   this.flag2=true;
		    h.checkvalid_admin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by author")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_author(String username, String password) {
		   this.flag3=true;
		    h.checkvalid_admin(username, password);
	}

	@Given("the admin is  logged in and he entered username {string} and password {string} and chooses the book to be searched by signature")
	public void the_admin_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_signature(String username, String password) {
		   this.flag4=true;
		    h.checkvalid_admin(username, password);
	}


@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by title")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_title(String username, String password) {
   this.flag1=true;
   h.checkvalid_user(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by ISBN")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_isbn(String username, String password) {
	 this.flag2=true;
	   h.checkvalid_user(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by author")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_author(String username, String password) {
	 this.flag3=true;
	   h.checkvalid_user(username, password);
}

@Given("the user  is  logged in and he entered username {string} and password {string} and chooses the book to be searched by signature")
public void the_user_is_logged_in_and_he_entered_username_and_password_and_chooses_the_book_to_be_searched_by_signature(String username, String password) {
	 this.flag4=true;
	   h.checkvalid_user(username, password);
}
	
	

	

	

	@Then("no book has this criteria")
	public void no_book_has_this_criteria() {
	 assertTrue(result==false);
	 System.out.println("no book found has this criteria");
	}



	
}
