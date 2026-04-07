package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static cu.com.utls.UIUtils.isElementExists;


public class CuDepartmentsPage extends PageObject {


    private static final String CU_DEPARTMENTS_HEADER = "Departments";

    // Departments Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(xpath = ".//*[@href = '/Department/Create']")
    WebElement createNew;

    @FindBy(xpath = ".//table/tbody")
    WebElement departmentTable;

    @FindBy(xpath = ".//*[@href='/Department/Edit/0']")
    WebElement editButton;

    @FindBy(xpath = ".//*[@href='/Department/Details/0']")
    WebElement detailsButton;

    @FindBy(xpath = ".//*[@href='/Department/Delete/0']")
    WebElement deleteButton;


    public void validateCUDepartmentsPageContent() {
       waitFor(5);
       assert headerText.getText().trim().equals(CU_DEPARTMENTS_HEADER);
       assert createNew.isDisplayed();
        isElementExists("See Create new link ", createNew);
        System.out.println(departmentTable.getText().trim());
        System.out.println(editButton.getText().trim());
        System.out.println(detailsButton.getText().trim());
        System.out.println(deleteButton.getText().trim());
    }

}
