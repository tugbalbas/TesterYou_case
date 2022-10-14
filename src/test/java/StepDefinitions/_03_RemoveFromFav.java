package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;

public class _03_RemoveFromFav {

    DialogContent dialogContent=new DialogContent();
    WebDriver driver;


    @Given("^Click on my favorites link$")
    public void click_on_my_favorites_link(){
        dialogContent.findElementAndClickFunction("closeFancybox");
        dialogContent.findElementAndClickFunction("loginButton");
        dialogContent.findElementAndClickFunction("myFavList");
    }

    @Given("^Verify the same product exists$")
    public void verify_the_same_product_exists(){
        Assert.assertTrue(dialogContent.productInFav.isDisplayed());
    }

    @When("^Remove product from favorites$")
    public void remove_product_from_favorites(){
        dialogContent.findElementAndClickFunction("remove");
    }

    @Then("^Confirm product not found in favorites$")
    public void confirm_product_not_found_in_favorites(){
        WebElement message = dialogContent.situation;
        Assert.assertTrue(message.getText().contains("Favori ürünlerinizi takip edebilirsiniz."));

    }

}
