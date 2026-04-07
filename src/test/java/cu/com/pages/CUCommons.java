package cu.com.pages;


import cu.com.utls.UIUtils;
import net.serenitybdd.core.pages.PageObject;

import java.io.IOException;


public class CUCommons extends PageObject {
    CuLandingPage cuLandingPage;

    UIUtils ui = new UIUtils();
    CuAboutPage cuAboutPage = new CuAboutPage();
    CuStudentsPage cuStudentsPage = new CuStudentsPage();
    CuCoursesPage cuCoursesPage = new CuCoursesPage();
    CuInstructorsPage cuInstructorsPage = new CuInstructorsPage();
    CuDepartmentsPage cuDepartmentsPage = new CuDepartmentsPage();

    public CUCommons() throws IOException {
    }

    public void validatePageContent(String page) {
        switch (page) {
            case "Home":
                cuLandingPage.validateCUHomePageContent();
                break;
            case "About":
                cuAboutPage.validateCUAboutPageContent();
                break;
            case "Students":
                cuStudentsPage.validateCUStudentsPageContent();
                break;
            case "Courses":
                cuCoursesPage.validateCUCoursesPageContent();
                break;
            case "Instructors":
                cuInstructorsPage.validateCUInstructorsPageContent();
                break;
            case "Departments":
                cuDepartmentsPage.validateCUDepartmentsPageContent();
                break;
            default:
                System.out.println("There is no such menu '" + page + "' exists!");
        }
    }

    public void validatePageTitle(String title) {
        waitForTitleToAppear(ui.getPageTitle());
        UIUtils.validateTitle(ui.getPageTitle(),title);
    }

}
