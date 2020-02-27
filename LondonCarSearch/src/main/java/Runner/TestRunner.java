package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/papa/Documents/Development/Workspace/LondonCarSearch/src/main/java/Feature",
		glue= {"stepDefinition"},
		format= {"pretty","html:test-output"}
		)

public class TestRunner {
	
}
