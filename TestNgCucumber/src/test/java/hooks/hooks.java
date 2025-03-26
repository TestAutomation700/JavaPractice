package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println(scenario.getName()+" has started running");
	}	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println(scenario.getName()+" has run successfully");
		System.out.println(scenario.getStatus());
	}
	

}

