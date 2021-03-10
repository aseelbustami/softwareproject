package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addbook_steps {
	private boolean flag2=false;;
	private boolean flag_login=false;
	 private login_code h=new login_code();
	 private	add_book ff=new add_book();
	String username;
	String pasword;
	@Given("adminstrator is logged in  by  entering his  username {string} and password {string}")
	public void adminstrator_is_logged_in_and_entered_username_and_password(String username, String password) {
	  this.username=username;
	  this.pasword=password;
		flag_login= h.checkvalid_admin(username, password);
	}
	
	
	
	@When("he entered the required information about the book {string},{int}, {string},{string} and presses submit button")
	public void he_entered_the_required_information_about_the_book(String title, Integer isbn, String author, String signature) {
		if(flag_login) {
			 flag2= ff.add(title,isbn,author,signature);
		   }
		else
			flag2=false;
	}

	@Then("the book will be added if the ISBN is valid and  unique and signature is unique")
	public void the_book_will_be_added() {
	    assertTrue(flag2==true);
	    
	    System.out.println("the book is added successfully!!");
	    
	    
	}
	@Given("adminstrator is  not logged in")
	public void adminstrator_is_not_logged_in() {
		 h.logout(username, pasword);
		flag_login=false;
	}
	
	@Then("the book will not  be added and the website will show message that books are added by adminstrator only if he is logged in")
	public void the_book_will_not_be_added_and_the_website_will_show_message_that_books_are_added_by_adminstrator_only() {
		assertTrue(flag2==false);
		
		System.out.println("can not add the book...books are added by adminstrator only if he is logged in");
	}
	

}
