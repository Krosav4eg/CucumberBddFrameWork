package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.HeaderFragment;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class HeaderFragmentStepDef {
    @Inject
    HeaderFragment headerFragment;

    @When("User clicks on Rozetka icon in header menu")
    public void userClicksOnRozetkaIconInHeaderMenu() {
        headerFragment.clickOnTheMainLogo();
    }


    @When("User clicks on {string} in header menu")
    public void userClicksOnКаталогInHeaderMenu(String menuName) {
        headerFragment.clickOnCatalogMenuButton(menuName);
    }

    @Then("User sees following sub categories in section {string}:")
    public void userSeesFollowingSubCategoriesInSectionНоутбуки(String productCategoryTitle, DataTable dataTable) {
        List<List<String>> lists = dataTable.rows(0).transpose().asLists();
        List<String> expectedSubcategories = lists.get(0);
        List<String> actualSubcategories = headerFragment.getProductCategoriesList(productCategoryTitle);
        Assert.assertEquals("Actual and Expected sub categories don't match: ", expectedSubcategories,
                actualSubcategories);
    }

    @When("User clicks on (.+) menu in header menu")
    public void userClicksOnMenuInHeaderMenu(String menuName) {
        headerFragment.clickOnCatalogMenuButton(menuName);
    }
}