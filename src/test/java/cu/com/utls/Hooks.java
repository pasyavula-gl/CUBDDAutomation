package cu.com.utls;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.pages.PageObject;

public class Hooks extends PageObject
{

    @Before(order = 1)
    public void before(Scenario scenario)
    {
        System.out.println("Starting - " + scenario.getName());
//        if (properties == null)
//        {
//            setupTestContext();
//        }
    }

    @After
    public void after(Scenario scenario) {
        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
        getDriver().manage().deleteAllCookies();
    }

}
