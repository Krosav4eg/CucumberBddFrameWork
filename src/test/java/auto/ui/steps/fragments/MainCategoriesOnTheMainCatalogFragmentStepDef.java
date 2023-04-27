package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.MainCategoriesOnTheMainCatalogFragment;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MainCategoriesOnTheMainCatalogFragmentStepDef {

    @Inject
    MainCategoriesOnTheMainCatalogFragment mainCategoriesOnTheMainCatalogFragment;

    @Then("user check main categories menu list:")
    public void userCheckMainCategoriesMenuList(DataTable dataTable) {
        List<String> expectedMainCategoriesList = dataTable.asList();
        List<String> actualMainCategoriesList = mainCategoriesOnTheMainCatalogFragment.getMainCategoriesList();
        Assert.assertEquals("Actual and Expected categories lists don't match", expectedMainCategoriesList,
                actualMainCategoriesList);

    }
}