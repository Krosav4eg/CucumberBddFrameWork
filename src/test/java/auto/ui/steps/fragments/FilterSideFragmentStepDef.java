package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.FilterSideFragment;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class FilterSideFragmentStepDef {
    @Inject
    protected FilterSideFragment filterSideFragment;

//    @When("^select name of selected product (.+) form filter bar$")
//    public void selectNameOfSelectedProductFormFilterBar(String productTitle) {
//        filterSideFragment.selectBrandFromSideBar(productTitle);
//    }
}