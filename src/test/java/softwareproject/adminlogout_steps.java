package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminlogout_steps {
boolean flag=false;

	@Given("the adminstrator is already logged in")
	public void the_adminstrator_is_already_logged_in() {
	  if(login_code.flag4)flag=true;
	}

	@When("the adminstrator calls the logout function")
	public void the_adminstrator_calls_the_logout_function() {
		if(flag)
	login_code.flag4=false;
	}

	@Then("the adminstrator logs out")
	public void the_adminstrator_logs_out() {
	   assertTrue(flag==true);
	   System.out.println("logged out done");
	}
}
