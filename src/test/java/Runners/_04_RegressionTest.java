package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Aşağıdaki seçenekte tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
 * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
 * olanlar çalışacak
 *
 * plugin kısmı ise basit rapor oluşturan kısım
 * "html:target/cucumber-report" : target klasörünün altında cucumber-report un
 * altında basit bir rapor oluşturacak.
 *
 * "json:target/cucumber.json" : aynı raporu JSON formatında oluşturacak.
 */

@CucumberOptions(

        tags = "@RegressionTest", // tag imizi alıp Features ların basina ekliyoruz yalnızca
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = { //basit rapor oluşturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        dryRun = false

)


public class _04_RegressionTest extends AbstractTestNGCucumberTests {
}

/*
Regression Testte Application/Test/Websitesine yeni özellikler ekliyoruz
ya da daha önceki hataları düzelttik direkt REGRESSION TEST ile düzeltiyoruz.
düzelttik tekrar bu testi yapmamız gerekiyor
her yenilikten, her hatadan sonra yapılan test(çok sık yapılır)
SmokeTestin yazılışından hiç bir farkı yok.
 */
