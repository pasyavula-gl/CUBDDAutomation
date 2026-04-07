package cu.com.pages;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the Contoso University home page",
                Open.browserOn().the(CuHomePage.class));
    }
}
