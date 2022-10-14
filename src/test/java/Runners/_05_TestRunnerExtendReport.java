package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        tags = "@login",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"
                // oluşturalacak raporun yeri ve adı veriliyor.
        }
)

public class _05_TestRunnerExtendReport extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass()
    {

    }

    @AfterClass
    public static void afterClass()
    {
        // ayarlar alındı, cucumber extend reporttan haberi oldu
        /*
        Reporter.loadXMLConfig("src/test/resources/extendReportSet.xml");
        Reporter.setSystemInfo("Username", "Tugba Albas");
        Reporter.setSystemInfo("Application Name", "Keytorc");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setSystemInfo("Ek satır Adı", "Satır açıklaması");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
         */
    }
}
