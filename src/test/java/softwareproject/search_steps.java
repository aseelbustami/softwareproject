package softwareproject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	boolean flag1=false;boolean flag2=false;boolean flag3=false;boolean flag4=false;
	boolean result=false;
	String SSSS;
	ArrayList  <book>  oi;
	
	
	@Given("the user choose the book to be searched by title")
	public void the_user_choose_the_book_to_be_searched_by_title() {
	  this.flag1 =true;
	}
	@Given("the user choose the book to be searched by ISBN")
	public void the_user_choose_the_book_to_be_searched_by_ISBN() {
	  this.flag2 =true;
	}
	@Given("the user choose the book to be searched by author")
	public void the_user_choose_the_book_to_be_searched_by_author() {
	  this.flag3 =true;
	}
	@Given("the user choose the book to be searched by signature")
	public void the_user_choose_the_book_to_be_searched_by_signature() {
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
		   
	   
		  oi= add_book.search_by_titel(SSSS) ;
		   if(oi.size()>0)
				  result=true;
	   }
	   if(flag3) {
		 
		  oi= add_book.search_by_auther(SSSS) ;
		   if(oi.size()>0)
				  result=true;
	   }
	   if(flag2) {
		   
		 
		  oi= add_book.search_by_ISBN(SSSS) ;
		  if(oi.size()>0)
			  result=true;   
	   }
	   if(flag4) {
		   
		  
		  oi= add_book.search_by_signature(SSSS) ;
		  if(oi.size()>0)
			  result=true;
		   
	   }
	   
	
			   
	   
	}
	
@Then("all the information about this book will appear directly on the screen")
	public void all_the_information_about_this_book_will_appear_directly_on_the_screen() {
	   assertTrue(result==true);
	
	   
	}

	
	
}
