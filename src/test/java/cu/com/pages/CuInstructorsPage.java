package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import static cu.com.utls.UIUtils.isElementExists;


public class CuInstructorsPage extends CuContactClass {


    private static final String CU_INSTRUCTORS_HEADER = "Instructors";


    // Instructors Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(xpath = ".//*[@href = '/Instructor/Create']")
    WebElement createNew;

    @FindBy(xpath = ".//table/tbody")
    WebElement instructorTable;

    @FindBy(xpath = ".//a[@href='/Instructor/Index/0']")
    WebElement selectButton;

    @FindBy(xpath = ".//a[@href='/Instructor/Edit/0']")
    WebElement editButton;

    @FindBy(xpath = ".//a[@href='/Instructor/Details/0']")
    WebElement detailsButton;

    @FindBy(xpath = ".//a[@href='/Instructor/Delete/0']")
    WebElement deleteButton;


    public void validateCUInstructorsPageContent() {
        waitFor(5);
        assert headerText.getText().trim().equals(CU_INSTRUCTORS_HEADER);
        assert createNew.isDisplayed();
        isElementExists("See Create new link ", createNew);
        System.out.println(instructorTable.getText().trim());
        System.out.println(selectButton.getText().trim());
        System.out.println(editButton.getText().trim());
        System.out.println(detailsButton.getText().trim());
        System.out.println(deleteButton.getText().trim());
    }

}
