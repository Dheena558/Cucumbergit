package cucumber3;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Account {
	@Given("enter credientals")
	public void enter_credientals() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter credientals")
	public void i_enter_credientals(io.cucumber.datatable.DataTable dataTable) {
	    
	     List<Map<String,String>> list =dataTable.asMaps(String.class,String.class);
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  for(int i=0;i<list.size();i++)
	  {
		  System.out.println(list.get(i).get("name"));
		  System.out.println(list.get(i).get("password"));
	  }
	}

	@Then("i verify Account")
	public void i_verify_Account() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
