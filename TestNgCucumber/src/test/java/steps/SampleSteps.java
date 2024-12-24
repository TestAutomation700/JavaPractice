package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {
	
	@Given("I added testng cucumber dependency")
	public void i_added_testng_cucumber_dependency() {
      System.out.println("checking testng cucumber integration");
	}

	@When("I run the test from CMD")
	public void i_run_the_test_from_cmd() {
	   System.out.println("Running from CMD");
	    
	}

	@Then("The build should be successful")
	public void the_build_should_be_successful() {
     System.out.println("Build should be successful");
	}

}
