package testrun_package;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/feature-folder/cartlink.feature"},
plugin = {"json:target/cucumber.json"},
glue = "step_package",tags = {"@Reel"})


public class testrun_class extends AbstractTestNGCucumberTests{

}
