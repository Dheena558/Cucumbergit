package cucumber1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep {
	@Given("user enters the username")
	public void user_enters_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user entered the username");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entered password");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("clicked");
	}

	@Then("homepage displayed")
	public void homepage_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("displayed");
	}

}
