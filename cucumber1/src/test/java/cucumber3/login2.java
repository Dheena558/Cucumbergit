package cucumber3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login2 {
	@Given("I enter {string}")
	public void i_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

	@When("I enters {string}")
	public void i_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	@Then("the page is Displayed")
	public void the_page_is_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
