package Runners;

import Utilities.Browsers;
import Utilities.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},

        glue = {"StepDefinitions"},

        tags = "@login", // login taglerini çalıştırıcak

        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" }, // rapor için pluginleri netten kopyala-yapıştır yapıyoruz

        dryRun = false

)

public class _02_RunnerBelirliTestler extends AbstractTestNGCucumberTests {

    @BeforeTest
    @Parameters("browser")
    public void beforeTest(@Optional("chrome") String browser){
        Driver.getDriver(Browsers.valueOf(browser));
    }
}
