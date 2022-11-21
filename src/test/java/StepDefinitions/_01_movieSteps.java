package StepDefinitions;


import Pages.DialogContent;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class _01_movieSteps {

    WebDriver driver;
    DialogContent dialogContent=new DialogContent();

    @Given("Navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        //driver = Driver.getDriver(Browsers.firefox);
        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String Url = driver.getCurrentUrl();
        Assert.assertEquals(Url, "https://www.imdb.com/");

    }
    @Given("Click the Menu button")
    public void click_the_menu_button() {
        dialogContent.findElementAndClickFunction("menuButton");
    }

    @When("Click the Oscars button under the Award & Events\"heading.")
    public void click_the_oscars_button_under_the_award_events_heading() {
        dialogContent.findElementAndClickFunction("oscarsButton");
    }

    @Then("Under the Event History heading, the value 1929 is selected.")
    public void under_the_event_history_heading_the_value_is_selected() {
        dialogContent.findElementAndClickFunction("yearButton");
    }

    @Then("The Circus \\(Charles Chaplin) is selected under the Honorary Award")
    public void the_circus_charles_chaplin_is_selected_under_the_honorary_award() {
        dialogContent.findElementAndClickFunction("theCircusMovie");
    }

    @Then("Save the Director Writer and Stars")
    public void save_the_director_writer_and_stars() {
        String directorName = dialogContent.firstMovieDirector.getText();
        String writerName = dialogContent.firstMovieWriter.getText();
        String starName = dialogContent.firstMovieStars.getText();
    }

    @Then("Click on the imdb button at the top left of the screen")
    public void click_on_the_imdb_button_at_the_top_left_of_the_screen() {
        dialogContent.findElementAndClickFunction("imdbLogo");
    }

    @Then("Type The Circus in the search bar.")
    public void type_the_circus_in_the_search_bar() {
        dialogContent.findElementAndSendKeysFunction("txtBox", "The Circus");
    }

    @Then("Click the result")
    public void click_the_result() throws InterruptedException {
        Thread.sleep(1000);
        dialogContent.findElementAndClickFunction("firstMovieResult");
    }


    @Then("Compares Director Writer and Stars values")
    public void compares_director_writer_and_stars_values() {
        String directorName = dialogContent.firstMovieDirector.getText();
        String writerName = dialogContent.firstMovieWriter.getText();
        String starName = dialogContent.firstMovieStars.getText();

        String directorName2 = dialogContent.firstMovieNewDirector.getText();
        String writerName2 = dialogContent.firstMovieNewWriter.getText();
        String starNameName2 = dialogContent.firstMovieNewStars.getText();

        Assert.assertEquals(directorName,directorName2);
        Assert.assertEquals(writerName,writerName2);
        Assert.assertEquals(starName,starNameName2);
    }

    @When("Click on See all photos link")
    public void click_on_see_all_photos_link() throws InterruptedException {
        Thread.sleep(2000);
        dialogContent.findElementAndClickFunction("seeTheGallery");
    }

    @Then("Validate the visibility of all photos")
    public _01_movieSteps validate_the_visibility_of_all_photos() throws IOException {

        List<WebElement> images = dialogContent.imageFrame.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());

        for(int i=0; i<images.size(); i++) {
            WebElement element = images.get(i);
            String url = element.getAttribute("src");
            URL link = new URL(url);
            HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
            httpCon.connect();

            int rescode = httpCon.getResponseCode();
            if(rescode >= 400) {
                System.out.println(url + "-" + "is broken link");
            }
            else {
                System.out.println(url + "-" + "is valid link");
            }
        }
        return this;

    }
}

