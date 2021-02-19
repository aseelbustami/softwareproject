package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addbook_steps {
	public boolean flag=false;public boolean flag2=false;public boolean flag3=false;
	public boolean flag4=false;
	login_code gg;add_book ff;
	public addbook_steps(login_code gg,add_book ff) {
		this.gg=gg;
		this.ff=ff;
	}
	@Given("the website has add_book functionality visible")
	public void the_website_has_add_book_functionality_visible() {
	   this.flag=true;
	}

	@When("he enters his username {string} and  password {string} as adminstrator")
	public void he_enters_his_username_and_password_as_adminstrator(String string, String string2) {
	  flag=gg.checkvalid(string, string2);
	}

	@When("he calls add_book function")
	public void he_calls_add_book_function() {
	   if(flag) {
		 flag2= ff.add();
	   }
	   if(flag3) {
			 flag4= ff.add();
		   }
	  
	  
	}

	@Then("the book will be added")
	public void the_book_will_be_added() {
	    assertTrue(flag2==true);
	}
	@When("he enters his username {string} and  password {string} not adminstrator")
	public void he_enters_his_username_and_password_not_adminstrator(String string, String string2) {
		flag3=gg.checkvalid(string, string2);
	}
	@Then("the website will show message that books are added by adminstrator only")
	public void the_website_will_show_message_that_books_are_added_by_adminstrator_only() {
	   System.out.println("error");
	}

	@Then("the book will not  be added")
	public void the_book_will_not_be_added() {
		assertTrue(flag4==false);
	}

}
