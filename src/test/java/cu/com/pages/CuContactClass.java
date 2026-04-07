package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class CuContactClass extends CommonPage {

    private static final String CU_ABOUT_HEADER = "Student Body Statistics";
    private static final String CU_TABLE_HEADER = "Head Office";

    // About Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(css = "main>p")
    WebElement yourContactText;

    @FindBy(tagName = "h4")
    WebElement tableHeaderSummary;

    @FindBy(xpath = ".//table/tbody")
    WebElement statsTable;

    public void validateCuContactPageContent() {
        waitFor(5);
        assert headerText.getText().trim().equals(CU_ABOUT_HEADER);
        assert yourContactText.getText().trim().equals("Your contact page.");
        assert tableHeaderSummary.getText().trim().equals(CU_TABLE_HEADER);
        System.out.println("\n" + statsTable.getText().trim());
    }

}
