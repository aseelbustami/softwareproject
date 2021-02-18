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
	@Given("adminstrator has account already")
	public void adminstrator_has_account_already() {
	    this.flag=true;
	}
	@When("he enters {string} and {string} correctly")
	public void he_enters_and(String username, String password) {
		flag2=  f.checkvalid(username,password);
	}

	


	@Then("he logs in successfully")
	public void he_logs_in_successfully() {
	   assertTrue(flag==true);
	}

	@When("he enters {string} and {string} wrong password")
	public void he_enters_and_wrong_password(String string, String string2) {
		
			flag=  f.checkvalid(string,string2);
		}
	

	@Then("he can not log in")
	public void he_can_not_log_in() {
		 assertTrue(flag2==false);
	}
}
