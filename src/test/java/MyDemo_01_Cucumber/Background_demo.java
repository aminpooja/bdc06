package MyDemo_01_Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Background_demo {
	@Given("click on shortcut")
	public void click_on_shortcut() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("click shortcut");
	}

	@Then("clear the cash")
	public void clear_the_cash() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clear cash");
		
	}

	@Given("enter the credentials")
	public void enter_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("enter the credentials");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("login");
	}

	@Given("enter the logout button")
	public void enter_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("logout");
	}

}
