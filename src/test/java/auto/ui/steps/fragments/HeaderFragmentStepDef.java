package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.HeaderFragment;
import io.cucumber.java.en.When;


public class HeaderFragmentStepDef {
    @Inject
    HeaderFragment headerFragment;

    @When("User clicks on Rozetka icon in header menu")
    public void userClicksOnRozetkaIconInHeaderMenu() {
        headerFragment.clickOnTheMainLogo();
    }


    @When("User clicks on {string} in header menu")
    public void userClicksOnInHeaderMenu(String menuName) {
        headerFragment.clickOnCatalogMenuButton(menuName);
    }
}