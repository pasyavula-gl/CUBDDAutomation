package cu.com.steps;

import cu.com.pages.CUCommons;
import cu.com.pages.CuLandingPage;
import cu.com.pages.CuMenus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class CommonStepDefs {
    @Steps
    CuMenus cuMenus;

    @Steps
    CUCommons cuCommons;

    @Steps
    CuLandingPage cuLandingPage;

    @When("I click on {string} menu option")
    public void iClickOnMenuOption(String option) {
        cuMenus.clickMenu(option);
    }

   @Then("I should see the {string} page title")
    public void iShouldSeeThePageTitle(String page) {
        cuMenus.validateTitles(page);
    }

    @When("I validate contoso university {string} page")
    public void iValidateContosoUniversityPage(String page) {
        cuCommons.validatePageContent(page);
    }

    @When("I validate contoso university home page")
    public void iValidateContosoUniversityHomePage() {
//        cuLandingPage.validateCUHomePageContent();
    }

    @Then("I am also validate contoso university home page buttons")
    public void iAmAlsoValidateContosoUniversityHomePageButtons() {
//        cuLandingPage.validateCUHomePageButtons();
    }

    @Then("I should be on contoso university home page")
    public void iShouldBeOnContosoUniversityHomePage() {
        cuLandingPage.validateCUHomePageContent();
    }
}
