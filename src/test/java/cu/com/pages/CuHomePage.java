package cu.com.pages;

import net.serenitybdd.core.pages.PageObject;

public class CuHomePage extends PageObject {

    CUCommons cuCommons;

    public void openCuHomePage() {
        waitFor(5);
        openUrl("http://cuwebapp.local:5050");
        getDriver().manage().window().maximize();
    }

    public void validateCuHomePageTitle() {
        cuCommons.validatePageTitle("Home Page - Contoso University");
    }

}

