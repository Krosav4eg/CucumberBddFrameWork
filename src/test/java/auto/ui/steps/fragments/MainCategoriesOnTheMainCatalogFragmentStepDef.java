package auto.ui.steps.fragments;

import com.google.inject.Inject;
import fragments.MainCategoriesOnTheMainCatalogFragment;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

@SuppressWarnings({"checkstyle:VisibilityModifier","checkstyle:DesignForExtension"})
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

    @And("User scrolls to the {string} section")
    public void userScrollsToTheSection(String sectionText) {
        mainCategoriesOnTheMainCatalogFragment.scrollToThePartnerElement(sectionText);
    }

    @Then("User sees following sub categories in section {string}:")
    public void userSeesFollowingSubCategoriesInSection(String categoryTitle, DataTable dataTable) {
        List<List<String>> lists = dataTable.rows(0).transpose().asLists();
        List<String> expectedSubcategories = lists.get(0);
        List<String> actualSubcategories = mainCategoriesOnTheMainCatalogFragment.getPartnersSectionList(categoryTitle);
        Assert.assertEquals("Actual and Expected sub categories don't match: ", expectedSubcategories,
                actualSubcategories);
    }
}