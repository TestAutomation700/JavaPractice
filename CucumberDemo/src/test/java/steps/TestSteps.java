package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	@Given("I want to test Maven Cucumber Integration")
	public void i_want_to_test_maven_cucumber_integration() {
	    System.out.println("Running Given");
	   
	}

	@When("I run the test from CMD")
	public void i_run_the_test_from_cmd() {
		System.out.println("Running When");
	}

	@Then("The build should be successful")
	public void the_build_should_be_successful() {
		System.out.println("Running Then");

	}

}
