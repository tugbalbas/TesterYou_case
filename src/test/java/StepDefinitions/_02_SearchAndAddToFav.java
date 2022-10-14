package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _02_SearchAndAddToFav {

    WebDriver driver;
    DialogContent dialogContent=new DialogContent();

    @Given("^Search samsung and click the search button and verify$")
    public void search_samsung_and_click_the_search_button_and_verify(){

        dialogContent.findElementAndSendKeysFunction("searchInput", "samsung");
        dialogContent.findElementAndClickFunction("searchButton");
        Assert.assertTrue(dialogContent.samsungProduct.isDisplayed());


    }

    @When("^Click on the second page and verify$")
    public void click_on_the_second_page_and_verify(){
        dialogContent.findElementAndClickFunction("secondPage");
        Assert.assertTrue(dialogContent.secondPage2.getText().contains("2"));
    }

    @Then("^Add the third product to favorites$")
    public void add_the_third_product_to_favorites(){
        dialogContent.findElementAndClickFunction("thirdProduct");
        dialogContent.findElementAndClickFunction("addToFav");
    }

}

