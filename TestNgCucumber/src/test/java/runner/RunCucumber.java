package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", 
                 glue = "steps", 
                 plugin = { "pretty",
                		 	"html:target/cucumber-reports.html", 
                		 	"json:target/cucumber.json", // For CI/CD tools like Jenkins
                		 	"junit:target/cucumber-results.xml", // JUnit style reports
                		 	"rerun:target/failed_scenarios.txt" // Creates list of failed scenarios
})

public class RunCucumber extends AbstractTestNGCucumberTests {

}
