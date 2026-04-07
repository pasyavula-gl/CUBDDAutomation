package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class CuAboutPage extends PageObject {

    private static final String CU_ABOUT_HEADER = "Student Body Statistics";
    private static final String CU_TABLE_HEADER = "Enrollment Summary";

    // About Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(tagName = "h4")
    WebElement tableHeaderSummary;

    @FindBy(xpath = ".//table/tbody")
    WebElement statsTable;

    public void validateCUAboutPageContent() {
        waitFor(5);
        assert headerText.getText().trim().equals(CU_ABOUT_HEADER);
        assert tableHeaderSummary.getText().trim().equals(CU_TABLE_HEADER);
        System.out.println("\n"+statsTable.getText().trim());
    }

}
