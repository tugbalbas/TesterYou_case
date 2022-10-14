package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static ThreadLocal<WebDriver> drivers=new ThreadLocal<>();


    public static WebDriver getDriver(){
        return getDriver(Browsers.chrome);
    }


    public static WebDriver getDriver(Browsers browser){
        if (drivers.get() == null){

            switch (browser){
                case edge:
                    WebDriverManager.edgedriver().setup();
                    drivers.set(new EdgeDriver());
                    break;

                case firefox:
                    WebDriverManager.firefoxdriver().setup();
                    drivers.set(new FirefoxDriver());
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    drivers.set(new ChromeDriver());
                    break;

            }

        }
        return drivers.get();
    }

    public static void quitDriver(){
        if (drivers.get() != null){
            drivers.get().quit();
            drivers.set(null);
        }
    }

}
