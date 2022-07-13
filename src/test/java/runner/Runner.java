package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = "src/test/java/features",
	glue = ("sgluecode"),	
	snippets = SnippetType.CAMELCASE,
	plugin = {"json:target/cucumber.json"}
)

public class Runner {

}
