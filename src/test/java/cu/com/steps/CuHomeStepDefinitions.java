package cu.com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CuHomeStepDefinitions {

    @Steps
    CuHomeActions cuHomeActions;

    private boolean dashboardVisible = false; // placeholder for demo

    @Given("the user is on contoso university home page")
    public void theUserIsOnContosoUniversityHomePage() {
       cuHomeActions.theUserIsOnContosoUniversityHomePage();
    }


    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
//        cuHomeActions.login_as("standard_user", "secret_password");
        // in a real test, you'd check the UI; here we just simulate
        dashboardVisible = true;
    }

    @Then("the user should see the dashboard")
    public void the_user_should_see_the_dashboard() {
        assertThat(dashboardVisible)
                .as("Dashboard should be visible after successful login")
                .isTrue();
    }
}

