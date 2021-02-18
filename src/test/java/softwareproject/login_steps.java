package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	boolean flag=false;boolean flag2=false;
	login_code f;
	public login_steps(login_code f) {
		this.f=f;
	}
	@Given("the adminstrator opened the login page")
	public void the_adminstrator_opened_the_login_page() {
		 this.flag=true;
	}
	@When("he enters username {string} and  password {string} correctly")
	public void he_enters_and(String username, String password) {
		flag2=  f.checkvalid(username,password);
	    
	}
	

	

	@Then("he logs in successfully to the website")
	public void he_logs_in_successfully_to_the_website() {
		 assertTrue(flag==true);
	}
	

	
	@When("he enters correct username {string} and  wrong password {string}")
	public void he_enters_correct_username_and_wrong_password(String string, String string2) {
		flag=  f.checkvalid(string,string2);
	}

	
	@Then("he can not log in  to the website")
	public void he_can_not_log_in_to_the_website() {
		assertTrue(flag2==false);
	}

}
