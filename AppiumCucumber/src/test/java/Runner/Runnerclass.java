package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features ={"src//test//java//FeatureFiles"},
        glue = {"Base","Pageobjects","StepDefinitions"},
        plugin = {"html:target/Reports","json:target/Reports/cucumber.json",
                "pretty:target/Reports/cucumber-pretty.txt"}
             )

@Test
public class Runnerclass extends AbstractTestNGCucumberTests {

}
