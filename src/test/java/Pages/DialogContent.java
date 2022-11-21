package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "iconContext-menu")
    private WebElement menuButton;

    @FindBy(xpath = "//span[contains(text(),'Oscars')]")
    private WebElement oscarsButton;

    @FindBy(xpath = "//a[text()='1929']")
    private WebElement yearButton;

    @FindBy(xpath = "//a[contains(text(),'Şarlo Sirkte')]")
    private WebElement theCircusMovie;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement firstMovieDirector;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement firstMovieWriter;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement firstMovieStars;

    @FindBy(id = "home_img_holder")
    private WebElement imdbLogo;

    @FindBy(xpath="//input[@type='text']")
    public WebElement txtBox;

    @FindBy(xpath = "//div[contains(text(),'1928')]")
    private WebElement firstMovieResult;

    @FindBy(xpath = "//h3[text()='Photos']")
    public WebElement seeTheGallery;

    @FindBy(linkText = "Charles Chaplin")
    public WebElement firstMovieNewDirector;

    @FindBy(linkText = "Charles Chaplin")
    public WebElement firstMovieNewWriter;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement firstMovieNewStars;


    //second movie
    @FindBy(xpath = "(//*[text()='The Jazz Singer'])[2]")
    private WebElement theJazzSingerMovie;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[1]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondMovieDirector;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondMovieWriter;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondMovieStar;

    @FindBy(xpath = "//body/div[@id='__next']/nav[@id='imdbHeader']/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[2]/div[2]")
    public WebElement resultJazzSinger;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondNewMovieDirector;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondNewMovieWriter;

    @FindBy(xpath = "//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    public WebElement secondNewMovieStar;

    @FindBy(xpath="//div[@class='article']")
    public WebElement imageFrame;

    @FindBy(xpath="(//h3[@class='ipc-title__text'])[1]")
    public WebElement photosButton;



    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "menuButton":
                myElement = menuButton;
                break;

            case "oscarsButton":
                myElement = oscarsButton;
                break;

            case "yearButton":
                myElement = yearButton;
                break;

            case "theCircusMovie":
                myElement = theCircusMovie;
                break;

            case "imdbLogo":
                myElement = imdbLogo;
                break;

            case "firstMovieResult":
                myElement = firstMovieResult;
                break;

            case "seeTheGallery":
                myElement = seeTheGallery;
                break;

            case "theJazzSingerMovie":
                myElement = theJazzSingerMovie;
                break;

            case "resultJazzSinger":
                myElement = resultJazzSinger;
                break;

            case "photosButton":
                myElement = photosButton;
                break;

        }
        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "txtBox":
                myElement = txtBox;
                break;
        }

        sendKeysFunction(myElement, value);
    }

}
