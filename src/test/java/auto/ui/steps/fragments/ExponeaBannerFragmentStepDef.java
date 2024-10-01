package auto.ui.steps.fragments;

import com.google.inject.Inject;

import fragments.ExponeaBannerFragment;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.And;

@ScenarioScoped
public class ExponeaBannerFragmentStepDef {
    @Inject
    protected ExponeaBannerFragment exponeaBannerFragment;

    @And("^Click on close button in expo area banner$")
    public void clickOnCloseButtonInExpoAreaBanner() {
        exponeaBannerFragment.clickExponeaBannerCloseButton();
    }
}