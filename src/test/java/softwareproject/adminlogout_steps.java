package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminlogout_steps {
boolean flag=false;
production_code d;
public adminlogout_steps (production_code d) {
	this.d=d;
}
	@Given("the adminstrator is already logged in")
	public void the_adminstrator_is_already_logged_in() {
	  this. flag=true;
	}

	@When("the adminstrator calls the logout function")
	public void the_adminstrator_calls_the_logout_function() {
	 flag=   d.logout_function(flag);
	}

	@Then("the adminstrator logs out")
	public void the_adminstrator_logs_out() {
	   assertTrue(flag==false);
	}
}
