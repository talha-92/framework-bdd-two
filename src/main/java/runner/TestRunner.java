package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},
        features ={"src/test/resources/features"},
        glue = {"stepdefs"},
        //  tags = "@addtocart",
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
