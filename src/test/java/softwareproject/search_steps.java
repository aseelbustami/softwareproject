package softwareproject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	boolean flag1=false;boolean flag2=false;boolean flag3=false;boolean flag4=false;
	boolean result=false;add_book j=new add_book();boolean result2=false;
	String SSSS;
	ArrayList  <book>  oi;
	@Given("the user-admin is not logged in  choose the book to be searched by title")
	public void the_user_admin_is_not_logged_in_choose_the_book_to_be_searched_by_title() {
		 this.flag1 =true;
	}

	@Given("the user-admin is not logged in  choose the book to be searched by ISBN")
	public void the_user_admin_is_not_logged_in_choose_the_book_to_be_searched_by_isbn() {
		 this.flag2 =true;
	}

	@Given("the user-admin is not logged in  choose the book to be searched by author")
	public void the_user_admin_is_not_logged_in_choose_the_book_to_be_searched_by_author() {
		 this.flag3 =true;
	}

	@Given("the user-admin is not logged in  choose the book to be searched by signature")
	public void the_user_admin_is_not_logged_in_choose_the_book_to_be_searched_by_signature() {
		 this.flag4 =true;
	}

	@Given("the user-admin is  logged in  choose the book to be searched by title")
	public void the_user_admin_is_logged_in_choose_the_book_to_be_searched_by_title() {
		 this.flag1 =true;
	}

	@Given("the user-admin is  logged in  choose the book to be searched by ISBN")
	public void the_user_admin_is_logged_in_choose_the_book_to_be_searched_by_isbn() {
		 this.flag2 =true;
	}

	@Given("the user-admin is  logged in  choose the book to be searched by author")
	public void the_user_admin_is_logged_in_choose_the_book_to_be_searched_by_author() {
		 this.flag3 =true;
	}

	@Given("the user-admin is  logged in  choose the book to be searched by signature")
	public void the_user_admin_is_logged_in_choose_the_book_to_be_searched_by_signature() {
		 this.flag4 =true;
	}

	
	
	
	
	
	@Given("he wrote the substring  {string}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(String string) {
	   SSSS=string;
	}
	@Given("he wrote the substring  {int}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(Integer int1) {
		SSSS=int1.toString();
	}
	
	@When("he calls the search function")
	public void he_calls_the_search_function() {
	   if(flag1) {
		   
	   
		  oi=j.search_by_titel(SSSS) ;
		  if(oi.size()>0)
			  result=true;
		   if(oi.size()>1)
				  result2=true;
		   
	   }
	   if(flag3) {
		 
		  oi= j.search_by_auther(SSSS) ;
		   if(oi.size()>0)
				  result=true;
		   if(oi.size()>1)
				  result2=true;
	   }
	   if(flag2) {
		   
		 
		  oi= j.search_by_ISBN(SSSS) ;
		  if(oi.size()>0)
			  result=true;
		  if(oi.size()>1)
			  result2=true;
	   }
	   if(flag4) {
		   
		  
		  oi= j.search_by_signature(SSSS) ;
		  if(oi.size()>0)
			  result=true;
		  if(oi.size()>1)
			  result2=true;
		   
	   }
	   
	
			   
	   
	}
	
@Then("all the information about this book will appear directly on the screen")
	public void all_the_information_about_this_book_will_appear_directly_on_the_screen() {
	   assertTrue(result==true);
	
	   
	}
@Given("the user choose the book to be searched by title")
public void the_user_choose_the_book_to_be_searched_by_title() {
    this.flag1=true;
}

@Given("he wrote the  {string} to be searched about in the search engine")
public void he_wrote_the_to_be_searched_about_in_the_search_engine(String string) {
   SSSS=string;
}

@Then("the website will write a message that this book is not available")
public void the_website_will_write_a_message_that_this_book_is_not_available() {
	   assertTrue(result==false);
	   System.out.println("no books has this kind of criteria");
}

@Given("the user choose the book to be searched by ISBN")
public void the_user_choose_the_book_to_be_searched_by_isbn() {
   this.flag2=true;
}

@Given("he wrote the  {int} to be searched about in the search engine")
public void he_wrote_the_to_be_searched_about_in_the_search_engine(Integer int1) {
	SSSS=int1.toString();
}

@Given("the user choose the book to be searched by author")
public void the_user_choose_the_book_to_be_searched_by_author() {
   this.flag3=true;
}

@Given("the user choose the book to be searched by signature")
public void the_user_choose_the_book_to_be_searched_by_signature() {
    this.flag4=true;
}

@Then("the website will write a message that this information for more than one book is not available")
public void the_website_will_write_a_message_that_this_information_for_more_than_one_book_is_not_available() {
   assertTrue(result2==true);
   System.out.println("more than one book");
}

	
}
