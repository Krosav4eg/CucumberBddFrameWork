package auto.ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


/***
 * Class required for running automation tests with special options.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber.json", "timeline:target/cucumber-html-reports/"},
		features = {"src/test/resources/features"},
		glue = {"auto/ui/steps"},
		tags = "@Filter",
		monochrome = true
)

public class TestRunner {

}