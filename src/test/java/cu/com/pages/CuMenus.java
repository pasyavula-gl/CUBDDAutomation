package cu.com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static cu.com.utls.UIUtils.clickButton;


public class CuMenus extends PageObject {

    CUCommons cuCommons;

    private static final String CU_HOME_TITLE = "Home Page - Contoso University";
    private static final String CU_ABOUT_TITLE = "Student Body Statistics - Contoso University";
    private static final String CU_CONTACT_TITLE = "Contact - Contoso University";
    private static final String CU_STUDENTS_TITLE = "Students - Contoso University";
    private static final String CU_COURSES_TITLE = "Courses - Contoso University";
    private static final String CU_INSTRUCTORS_TITLE = "Instructors - Contoso University";
    private static final String CU_DEPARTMENTS_TITLE = "Departments - Contoso University";


    // Home Page Locators
    @FindBy(xpath = ".//a[@href='/' and @class = 'navbar-brand']")
    WebElement cuHomeMenu;
    @FindBy(xpath = ".//a[@href='/Home/About']")
    WebElement cuAboutMenu;

    @FindBy(xpath = ".//a[@href='/Home/Contact']")
    WebElement cuContactMenu;

    @FindBy(xpath = ".//*[@href='/Home/About']")
    WebElement aboutMnu;

    @FindBy(xpath = ".//*[@href='/Student']")
    WebElement cuStudentsMenu;

    @FindBy(xpath = ".//*[@href='/Course']")
    WebElement cuCoursesMenu;

    @FindBy(xpath = ".//*[@href='/Instructor']")
    WebElement cuInstructorsMnu;

    @FindBy(xpath = ".//*[@href='/Department']")
    WebElement cuDepartmentsMnu;

    public void clickMenu(String option) {
        switch (option) {
            case "Home":
                clickButton(cuHomeMenu);
                break;
            case "About":
                clickButton(cuAboutMenu);
                break;
            case "Contact":
                clickButton(cuContactMenu);
                break;
            case "Students":
                clickButton(cuStudentsMenu);
                break;
            case "Courses":
                clickButton(cuCoursesMenu);
                break;
            case "Instructors":
                clickButton(cuInstructorsMnu);
                break;
            case "Departments":
                clickButton(cuDepartmentsMnu);
                break;
            default:
                System.out.println("There is no such menu '" + option + "' exists!");
        }
        System.out.println(option + " menu option is clicked");
    }

    public void validateTitles(String title) {
        waitFor(5);
        switch (title) {
            case "Home":
                cuCommons.validatePageTitle(CU_HOME_TITLE);
                break;
            case "About":
                cuCommons.validatePageTitle(CU_ABOUT_TITLE);
                break;
            case "Contact":
                cuCommons.validatePageTitle(CU_CONTACT_TITLE);
                break;
            case "Students":
                cuCommons.validatePageTitle(CU_STUDENTS_TITLE);
                break;
            case "Courses":
                cuCommons.validatePageTitle(CU_COURSES_TITLE);
                break;
            case "Instructors":
                cuCommons.validatePageTitle(CU_INSTRUCTORS_TITLE);
                break;
            case "Departments":
                cuCommons.validatePageTitle(CU_DEPARTMENTS_TITLE);
                break;
            default:
                System.out.println("There is no such menu '" + title + "' exists!");
        }
    }


}
