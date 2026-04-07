package cu.com.steps;

import cu.com.pages.CuHomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class CuHomeActions extends UIInteractionSteps {

    CuHomePage cuHomePage;

    @Step("the user is on contoso university home page")
    public void theUserIsOnContosoUniversityHomePage() {
        cuHomePage.openCuHomePage();
    }


//    @Step("Login as {0}")
//    public void login_as(String username, String password) {
//        cuHomePage.loginAs(username, password);
//    }
}

