package StepDefinitions;

import Pages.DialogContent;
import Utilities.Browsers;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    WebDriver driver;
    DialogContent dialogContent=new DialogContent();


    @Given("^Navigate to web site and verify$")
    public void navigate_to_web_site_and_verify(){
        driver = Driver.getDriver();
        //driver = Driver.getDriver(Browsers.firefox);
        driver.get("https://www.vatanbilgisayar.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, "https://www.vatanbilgisayar.com/");
    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button(){

        DialogContent dialogContent = new DialogContent();

        dialogContent.findElementAndClickFunction("acceptCookies");
        dialogContent.findElementAndClickFunction("loginButton");
        dialogContent.findElementAndClickFunction("loginButton2");

        dialogContent.findElementAndSendKeysFunction("emailInput","keytorc.test1@gmail.com");
        dialogContent.findElementAndSendKeysFunction("passwordInput","123456");

        dialogContent.findElementAndClickFunction("loginButton3");

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully(){
        Assert.assertTrue(dialogContent.loginSuccess.isDisplayed());
    }
}

