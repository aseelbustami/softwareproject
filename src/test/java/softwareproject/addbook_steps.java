package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addbook_steps {
	private boolean flag2=false;
	private boolean flag_login=false;login_code h=new login_code();
	add_book ff=new add_book();
	@Given("adminstrator is logged in  and entered  username {string} and password {string}")
	public void adminstrator_is_logged_in_and_entered_username_and_password(String string, String string2) {
	  flag_login= h.checkvalid(string, string2);
	}
	

	@When("he calls add book function")
	public void he_calls_add_book_function() {
	    System.out.println("add book button is pressed");
	}
	
	

	
	

	
	
	
	@When("he entered the required information about the book {string},{int}, {string},{string} and presses submit button")
	public void he_entered_the_required_information_about_the_book(String title, Integer isbn, String author, String signature) {
		if(flag_login==true) {
			 flag2= ff.add(title,isbn,author,signature);
		   }
	}

	@Then("the book will be added")
	public void the_book_will_be_added() {
	    assertTrue(flag2==true);
	    System.out.println("the book is added successfully!!");
	}
	@Given("adminstrator is  not logged in")
	public void adminstrator_is_not_logged_in() {
	{flag_login=false;}
	}
	
	
	
	
	@Then("the website will show message that books are added by adminstrator only")
	public void the_website_will_show_message_that_books_are_added_by_adminstrator_only() {
	   if(flag_login==false)System.out.println("books are added by adminstrator only");
	}

	
	@Then("the book will not  be added")
	public void the_book_will_not_be_added() {
		assertTrue(flag_login==false);
		System.out.println("can not add the book");
	}

}
