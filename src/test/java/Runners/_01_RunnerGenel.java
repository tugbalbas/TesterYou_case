package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles"}, // test yapacağın FeatureFile'ın nerede stepler

        glue = {"StepDefinitions"}, // steplerin konumları nerde

        dryRun = false

)

public class _01_RunnerGenel extends AbstractTestNGCucumberTests {

}

/*
Cucumberda testlerimizi bunun üzerinde yapıyoruz -> (extends AbstractTestNGCucumberTests)
Artık .feature lardan değil bu testleri RUN yapıyoruz.
 */


