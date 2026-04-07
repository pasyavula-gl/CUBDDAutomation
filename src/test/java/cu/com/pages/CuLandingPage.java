package cu.com.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class CuLandingPage extends PageObject {


    private static final String CU_HOME_HEADER = "Contoso University";
    private static final String CU_HOME_WELCOME = "Welcome to Contoso University";
    private static final String CU_HOME_WELCOME_DETAILS = "Contoso University is a sample application that demonstrates how to use Entity Framework 6 in an ASP.NET MVC 5 web application.";
    private static final String CU_HOME_BUILD = "Build it from scratch";
    private static final String CU_HOME_BUILD_DETAILS = "You can build the application by following the steps in the tutorial series on the ASP.NET site.";
    private static final String CU_HOME_DOWNLOAD = "Download it";
    private static final String CU_HOME_DOWNLOAD_DETAILS = "You can download the completed project from the Microsoft Code Gallery.";

    // Home Page Locators
    @FindBy(css = "main[role='main']>div:nth-of-type(1)>h1")
//    @FindBy(tagName = "h1")
    WebElement headerText;

    @FindBy(css = "main[role='main']>div:nth-of-type(2)>div:nth-of-type(1)>h2")
    WebElement welcomeCUText;

    @FindBy(xpath = ".//*[@class = 'row']/div[1]/p")
    WebElement welcomeCUDetails;

    @FindBy(xpath = ".//*[@class = 'row']/div[2]/h2")
    WebElement buildText;

    @FindBy(xpath = ".//*[@class = 'row']/div[2]/p[1]")
    WebElement buildDetails;

    @FindBy(xpath = ".//*[@class = 'row']/div[2]/p[2]")
    WebElement seeTutorialButton;

    @FindBy(xpath = ".//*[@class = 'row']/div[3]/h2")
    WebElement downloadText;

    @FindBy(xpath = ".//*[@class = 'row']/div[3]/p[1]")
    WebElement downloadDetails;

    @FindBy(xpath = ".//*[@class = 'row']/div[3]/p[2]")
    WebElement downloadButton;

//    @Steps
    CommonPage commonPage;

    @Step
    public void validateCUHomePageContent() {
        commonPage.waitForPageLoad();
        System.out.println("------------------------------------------------------------------------------------------------");
        commonPage.assertClaimantUploadFilePageTitle("Home Page - Contoso University");
        assert commonPage.getH1Heading().getText().equals(CU_HOME_HEADER);
//        System.out.println(welcomeCUText.getText());
//        assert welcomeCUText.getText().equals(CU_HOME_WELCOME);
//        validateText("Validate welcome Text", CU_HOME_WELCOME, welcomeCUText.getText().trim());
//        validateText("Validate welcome details Text", CU_HOME_WELCOME_DETAILS, welcomeCUDetails.getText().trim());
//        validateText("Validate build Text", CU_HOME_BUILD, buildText.getText().trim());
//        validateText("Validate build details Text", CU_HOME_BUILD_DETAILS, buildDetails.getText().trim());
//        validateText("Validate download Text", CU_HOME_DOWNLOAD, downloadText.getText().trim());
//        validateText("Validate download details Text", CU_HOME_DOWNLOAD_DETAILS, downloadDetails.getText().trim());
        System.out.println("------------------------------------------------------------------------------------------------");
    }

    @Step
    public void validateCUHomePageButtons() {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Contoso University Home page validations: ");
//        commonPage.getWebElementPresent(seeTutorialButton);
//        assert seeTutorialButton.isDisplayed();
//        assert downloadButton.isDisplayed();
//        validateButtonsExistence("See tutorial button status", seeTutorialButton);
//        validateButtonsExistence("Download button status", downloadButton);
        System.out.println("------------------------------------------------------------------------------------------------");
    }

}
