package Test_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourcess/loginfeature"},
plugin = {"json:target/cucumber.json"},
glue = "StepDeffination", tags = {"@Ripon"})

// Tag is for Run specific or group test case
//AbstractTestNGCucumberTests  

public class PlanTestRunner extends AbstractTestNGCucumberTests{

}
//We had old version of testNG and Selenium- need updated that
//in build library TestNG was missing. we Massed Library.