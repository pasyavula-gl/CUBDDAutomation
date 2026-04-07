package cu.com.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonPage extends PageObject {

    @FindBy(xpath = "//label[contains(.,'Yes')]")
    WebElement yesButton;

    @FindBy(xpath = "//label[contains(.,'No')]")
    WebElement noButton;

    @FindBy(xpath = "//*/h1")
    WebElement h1Heading;

    @FindBy(xpath = "//*/h2")
    WebElement h2Heading;

    @FindBy(css = "button#submit")
    WebElement signInButton;


    public WebElement getH1Heading() {
        return waitFor(h1Heading);
    }

    public String getH1HeadingText() {
        return getH1Heading().getText();
    }

    public String getH2HeadingText() {
        return h2Heading.getText();
    }

    public WebElement getYesButton() {
        return waitFor(yesButton);
    }

    public WebElement getNoButton() {
        return waitFor(noButton);
    }

    public WebElement getRadioOrCheckBox(String label) {
        String xpath = String.format("//label[contains(., '%s')]", label);
        return find(By.xpath(xpath));
    }

    public WebElement getLink(String linkText) {
        return find(By.linkText(linkText));
    }

    public WebElement getInputBox(String label) {
        String xpath = String.format("//label[contains(.,\"%s\")]/following::text()[1]/following::input", label);
        return find(By.xpath(xpath));
    }

    public WebElement getTextArea(String label) {
        String xpath = String.format("//label[contains(.,'%s')]/following::text()[1]/following::textarea", label);
        return find(By.xpath(xpath));
    }

    public WebElement getButton(String label) {
        String xpath = String.format("//button[contains(.,'%s')]", label);
        return find(By.xpath(xpath));
    }

    public void openPage(String url) {
        openUrl(url);
        maximiseWindowSize();
    }

    public void maximiseWindowSize() {
        getDriver().manage().window().maximize();
    }

    public void waitElementToBeClickable(WebElement element) {
        waitForPageLoad();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
//        ThreadUtil.sleep(500);
        waitFor(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForPageLoad() {
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        new FluentWait<>(getDriver()).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForElementAndClick(WebElement webElement) {
        waitFor(webElement);
        webElement.click();
    }

    @Step
    public void assertPageHeading(String heading) {
        waitForTextToAppear(heading);
        assertEquals(heading, getH1HeadingText());
    }

    @Step
    public void assertH2Heading(String heading) {
        waitForTextToAppear(heading);
        assertEquals(heading, getH2HeadingText());
    }

//    @Step
//    public void assertPageContent(List<PageElement> contents) {
//        AutoCloseableSoftAssertions softly = new AutoCloseableSoftAssertions();
//        for (PageElement element : contents) {
//            try {
//                String actualText = element.getWebElement().getText();
//                softly.assertThat(actualText).as("Mismatch").isEqualTo(element.getExpectedText());
//            } catch (NoSuchElementException e) {
//                softly.fail("\n[Element not found]\n" +
//                        "expected: " + element.getExpectedText());
//            }
//        }
//        softly.assertAll();
//    }

    public String getVisibleText(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return ((String) js.executeScript(
                "return Array.from(arguments[0].childNodes)"
                        + ".filter(node => node.nodeType === Node.TEXT_NODE || "
                        + "(node.nodeType === Node.ELEMENT_NODE && !node.classList.contains('govuk-visually-hidden')))"
                        + ".map(node => node.textContent.trim()).join(' ');",
                element
        )).trim();
    }

    @Step
    public WebElement getSignInButton() {
        waitFor(signInButton);
        return signInButton;
    }

    @Step
    public void enterText(WebElement element, String text) {
        waitForPageLoad();
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void assertClaimantUploadFilePageTitle(String title) {
        waitFor(5);
        System.out.println(getDriver().getTitle());
        assert getDriver().getTitle().equals(title);
    }

    public void cuPageRefresh()
    {
        waitForPageLoad();
        getDriver().navigate().refresh();
        waitForPageLoad();
    }

    public void getWebElementPresent (WebElement element) {
        waitForPageLoad();
//        System.out.println(element.isDisplayed());
        element.isDisplayed();
    }

}
