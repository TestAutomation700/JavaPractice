package steps;

import io.cucumber.java.en.Given;

public class AppSteps {
	
	@Given("I am adding second feature")
	public void  I_am_adding_second_feature() {
	    System.out.println("Running Given for second time");
	   
	}

}
