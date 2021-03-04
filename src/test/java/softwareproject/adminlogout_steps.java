package softwareproject;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminlogout_steps {
boolean flag=false;login_code f;
public adminlogout_steps(login_code f) {
	this.f=f;
}
@Given("the adminstrator opens the login page")
public void the_adminstrator_opens_the_login_page() {
    System.out.println("welcomw to the website library");
}

@When("he entered username {string} and  password {string} correctly")
public void he_entered_username_and_password_correctly(String string, String string2) {
flag= f.checkvalid(string, string2);
}

@Then("he logsin successfully to the website")
public void he_logsin_successfully_to_the_website() {
   assertTrue(flag==true);
}


@When("the adminstrator calls the logout function")
public void the_adminstrator_calls_the_logout_function() {
 if(flag)flag=false;
}

@Then("the adminstrator logs out")
public void the_adminstrator_logs_out() {
    assertTrue(flag==false);
    System.out.println("adminstrator logged out successfully!!");
}
}
