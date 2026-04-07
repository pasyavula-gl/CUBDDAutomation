package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class CuCoursesPage extends PageObject {

    private static final String CU_COURSES_HEADER = "Courses";

    // Course Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(css = "a[href='/Course/Create']")
    WebElement createNewCourseButton;

    @FindBy(xpath = ".//*[@href = '/Course/Create']")
    WebElement createNew;

    @FindBy(tagName = "h5")
    WebElement filterByDeptText;

    @FindBy(xpath = ".//*[@action = '/Course']")
    WebElement selectDetailsSearch;

    @FindBy(xpath = ".//table/tbody")
    WebElement coursesTable;

    @FindBy(xpath = ".//a[@href='/Course/Edit/1045']")
    WebElement editButton;

    @FindBy(xpath = ".//a[@href='/Course/Details/1045']")
    WebElement detailsButton;

    @FindBy(xpath = ".//a[@href='/Course/Delete/1045']")
    WebElement deleteButton;


    public void validateCUCoursesPageContent() {
        waitFor(5);
        assert headerText.getText().trim().equals(CU_COURSES_HEADER);
        assert createNewCourseButton.getText().trim().equals("Create New Course");
        assert filterByDeptText.getText().trim().equals("Filter by Department");

        System.out.println(createNew.getText().trim());
        System.out.println(selectDetailsSearch.getText().trim());
        System.out.println(coursesTable.getText().trim());
        System.out.println(editButton.getText().trim());
        System.out.println(detailsButton.getText().trim());
        System.out.println(deleteButton.getText().trim());
    }

}
