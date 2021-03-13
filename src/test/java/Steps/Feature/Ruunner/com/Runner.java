package Steps.Feature.Ruunner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				"//BasicTestNG/src/test/java/Steps/Feature/Ruunner/com/Feature.featuree"
		},
		glue= {
				"stepDefinitions"
		},
		plugin= {
				"pretty","html:target/cucumber"
		}
		)


public class Runner {
	

}
