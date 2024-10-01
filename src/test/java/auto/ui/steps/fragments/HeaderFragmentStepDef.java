package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.HeaderFragment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class HeaderFragmentStepDef {
    @Inject
    HeaderFragment headerFragment;

    @And("User clicks on Rozetka icon in header menu")
    public void userClicksOnRozetkaIconInHeaderMenu() {
        headerFragment.clickOnTheMainLogo();
    }


    @When("User clicks on {string} in header menu")
    public void userClicksOnInHeaderMenu(String menuName) {
        headerFragment.clickOnCatalogMenuButton(menuName);
    }
}