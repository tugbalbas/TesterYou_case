package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver1 {

    private static WebDriver driver;


    public static WebDriver getDriver(){
        return getDriver(Browsers.chrome);
    }


    public static WebDriver getDriver(Browsers browser){
        if (driver == null){

            switch (browser){
                case edge:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case firefox:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

            }

        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }

}
