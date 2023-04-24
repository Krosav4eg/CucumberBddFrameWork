package auto.ui.steps.pages;


import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import pages.AbstractPage;


@ScenarioScoped
public class BaseStepDef {

    @Inject
    protected AbstractPage abstractPage;

    @Given("I navigate to home page")
    public void iNavigateToHomePage() {
        abstractPage.openBaseUrl();
    }
}