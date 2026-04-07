package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class CuStudentsPage extends PageObject {

    private static final String CU_STUDENTS_HEADER = "Students";

    // Student Page Locators
    @FindBy(tagName = "h2")
    WebElement headerText;

    @FindBy(xpath = ".//*[@href = '/Student/Create']")
    WebElement createNew;

    @FindBy(xpath = ".//*[@action = '/Student']")
    WebElement studentDetailsSearch;

    @FindBy(xpath = ".//*[@name= 'SearchString']")
    WebElement searchTextBox;

    @FindBy(xpath = ".//table/tbody")
    WebElement studentsTable;

    @FindBy(xpath = ".//a[@href='/Student/Edit/1']")
    WebElement editButton;

    @FindBy(xpath = ".//a[@href='/Student/Details/1']")
    WebElement detailsButton;

    @FindBy(xpath = ".//a[@href='/Student/Delete/1']")
    WebElement deleteButton;

    @FindBy(xpath = ".//main/div[2]/div")
    WebElement paginationText;


    public void validateCUStudentsPageContent() {
       waitFor(5);
        assert headerText.getText().trim().equals(CU_STUDENTS_HEADER);
        assert createNew.getText().trim().equals("Create New");
        assert  searchTextBox.isDisplayed();
        assert studentDetailsSearch.isDisplayed();

        System.out.println(createNew.getText().trim());
        System.out.println(studentDetailsSearch.getText().trim());
        System.out.println(studentsTable.getText().trim());
        System.out.println(editButton.getText().trim());
        System.out.println(detailsButton.getText().trim());
        System.out.println(deleteButton.getText().trim());
        System.out.println(paginationText.getText().trim());
        assert paginationText.getText().trim().equals("Page 1 of 3");
    }

}
