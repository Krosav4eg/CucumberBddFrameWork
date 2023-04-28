package fragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selectors.byCssSelector;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static core.helpers.ActionHelper.*;

public class MainCategoriesOnTheMainCatalogFragment {

    SelenideElement mainCategoriesMenuWrapper = $(byCssSelector(".menu-wrapper.menu-wrapper_state_static"));
    ElementsCollection mainCategoriesList = $$(byCssSelector(".menu-wrapper.menu-wrapper_state_static>ul>li"));
    String partnerItems = "//h3[contains(text(),'%s')]/parent::div/following-sibling::ul/li/a";


    public List<String> getMainCategoriesList() {
        isElementDisplayed(mainCategoriesMenuWrapper);
        return mainCategoriesList.stream().map(WebElement::getText).limit(10).collect(Collectors.toList());
    }

    public List<String> getPartnersSectionList(String text) {
        isElementDisplayed(setRequiredTextIntoXpath(partnerItems, text));
        return $$(byXpath(String.format(partnerItems, text))).stream().map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void scrollToThePartnerElement(String text) {
        isElementDisplayed(setRequiredTextIntoXpath(partnerItems, text));
        scrollIntoElement(setRequiredTextIntoXpath(partnerItems, text));
    }
}