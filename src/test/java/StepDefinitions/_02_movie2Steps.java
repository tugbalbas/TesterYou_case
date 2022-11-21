package StepDefinitions;

import Pages.DialogContent;
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

public class _02_movie2Steps {

    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Then("The Jazz Singer is selected under the Honorary Award")
    public void the_jazz_singer_is_selected_under_the_honorary_award() {
        dialogContent.findElementAndClickFunction("theJazzSingerMovie");
    }

    @Then("Save the The Jazz Singer movie's Director Writer and Stars")
    public void save_the_the_jazz_singer_movie_s_director_writer_and_stars() {
        String secondDirectorName = dialogContent.secondMovieDirector.getText();
        String secondWriterName = dialogContent.secondMovieWriter.getText();
        String secondStarName = dialogContent.secondMovieStar.getText();
    }

    @Then("Type The Jazz Singer in the search bar")
    public void type_the_jazz_singer_in_the_search_bar() {
        dialogContent.findElementAndSendKeysFunction("txtBox", "The Jazz Singer");
    }

    @Then("Click the first result")
    public void click_the_first_result() throws InterruptedException {
        Thread.sleep(1000);
        dialogContent.findElementAndClickFunction("resultJazzSinger");    }


    @Then("Compares The Jazz Singer movie's Director Writer and Stars values")
    public void compares_the_jazz_singer_movie_s_director_writer_and_stars_values() {
        String secondDirectorName = dialogContent.secondMovieDirector.getText();
        String secondWriterName = dialogContent.secondMovieWriter.getText();
        String secondStarName = dialogContent.secondMovieStar.getText();

        String secondDirectorName2 = dialogContent.secondNewMovieDirector.getText();
        String secondWriterName2 = dialogContent.secondNewMovieWriter.getText();
        String secondStarName2 = dialogContent.secondNewMovieStar.getText();

        Assert.assertEquals(secondDirectorName, secondDirectorName2);
        Assert.assertEquals(secondWriterName, secondWriterName2);
        Assert.assertEquals(secondStarName, secondStarName2);
    }

    @When("Click on The Jazz Singer movie's See all photos link")
    public void click_on_the_jazz_singer_movie_s_see_all_photos_link() throws InterruptedException {
        Thread.sleep(2000);
        dialogContent.findElementAndClickFunction("photosButton");
    }

    @Then("Verify the visibility of all photos")
    public _02_movie2Steps verify_the_visibility_of_all_photos() throws IOException {

        List<WebElement> images = dialogContent.imageFrame.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String url = element.getAttribute("src");
            URL link = new URL(url);
            HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
            httpCon.connect();

            int responseCode = httpCon.getResponseCode();
            if (responseCode >= 400) {
                System.out.println(url + "is broken link");
            } else {
                System.out.println(url + "is valid link");
            }
        }
        return this;

    }

}


