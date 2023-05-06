package auto.ui.steps.pages;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.When;
import pages.NoteBooksPage;

@ScenarioScoped
@SuppressWarnings({"checkstyle:VisibilityModifier","checkstyle:DesignForExtension","checkstyle:MagicNumber"})
public class NoteBooksPageStepDef{

    @Inject
    protected NoteBooksPage noteBooksPage;

    @When("^check that all goods items have size$")
    public void checkThatAllGoodsItemsHaveSize() {
        int expectedSize = 60;
        noteBooksPage.checkThatGoodsItemsHaveSize(expectedSize);
    }

    @When("^goods tiles contains search word (.+)$")
    public void goodsTilesContainsSearchWordSearchWord(String word) {
        noteBooksPage.checkThatGoodsTileContainsSearchWord(word);
    }
}