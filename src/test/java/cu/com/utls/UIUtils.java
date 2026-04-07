package cu.com.utls;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UIUtils extends PageObject {


    public String getPageTitle() {
        return getDriver().getTitle();
    }

//
//    @Step
//    public static void validateTitle(String desc, String title) {
//        System.out.println("---------------------------------------------------------------------");
//        System.out.printf("%s : %s%n", desc, title);
//        System.out.printf("%s : %s%n", desc, driver.getTitle());
////        assertEquals(desc, title, driver.getTitle());
//        System.out.println("---------------------------------------------------------------------");
//    }

    @Step
    public static void validateTitle(String actualTitle, String expectedTitle) {
        System.out.printf("%s : %s%n", actualTitle, expectedTitle);
        assertEquals(actualTitle, expectedTitle);

    }

    @Step
    public static void validateText(String desc, String str, String string) {
        System.out.println(desc + " : " + string);
        assertEquals(desc, str, string);
    }

    @Step
    public static void validateButtonsExistence(String desc, WebElement ele) {
        if (ele.isDisplayed()) {
            System.out.println("'" + desc + "' : " + ele.isDisplayed());
//            System.out.println("'" + desc + "' : " + ele.isDisplayed());
        }
        assertTrue(ele.isDisplayed());
    }

    @Step
    public static void clickButton(WebElement ele) {
        ele.click();
    }

    @Step
    public static boolean isElementExists(String desc, WebElement ele) {
        // Set a small element timeout because it is a try catch.
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        boolean status;
        try {
            if (ele.isDisplayed()) {
                System.out.printf("%s existing status is : %s%n", desc, ele.isDisplayed());
                assertTrue(ele.isDisplayed());
                status = true;
            } else {
                System.out.println(desc + " existing status is : " + ele.isDisplayed());
                status = false;
            }
        } catch (NoSuchElementException e) {
            status = false;
        }
        return status;
    }

}
