package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", 
                 glue = {"steps","hooks"}, 
                 monochrome=true,
                 dryRun=false,
                 plugin = { "pretty",
                		 	"html:target/cucumber-reports.html", 
                		 	"json:target/cucumber.json", // For CI/CD tools like Jenkins
                		 	"junit:target/cucumber-results.xml", // JUnit style reports
                		 	"rerun:target/failed_scenarios.txt" // Creates list of failed scenarios
})

/*public class RunCucumber extends AbstractTestNGCucumberTests {

}*/

public class RunCucumber {
	
}
