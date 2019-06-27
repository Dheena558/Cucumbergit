package cucumber2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("userenters {string}")
	public void userenters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

	@And("enters{string}")
	public void enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

	@When("user clickslogin button")
	public void user_clickslogin_button() {
	
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
	    
	}


}
