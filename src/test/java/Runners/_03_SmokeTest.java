package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },

        features = {"src/test/java/FeatureFiles"},

        glue = {"StepDefinitions"},
        dryRun = false,
        tags = "@SmokeTest"

)


public class _03_SmokeTest extends AbstractTestNGCucumberTests {
}
// tagi smoketest olanları test et

