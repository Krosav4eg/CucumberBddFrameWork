package fragments;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static core.helpers.ActionHelper.*;

public class HeaderFragment {
    SelenideElement mainLogo = $(byCssSelector("img[alt='Rozetka Logo']"));
    String catalogMenuButton = "//button[@aria-label='%s']";
    String productCategories = "//li/a[contains(text(),'%s')]/following-sibling::ul/li/a";

    public void clickOnTheMainLogo() {
        isElementDisplayed(mainLogo);
        clickOnButton(mainLogo);
    }

    public void clickOnCatalogMenuButton(String menuText) {
        isElementDisplayed(setRequiredTextIntoXpath(catalogMenuButton, menuText).shouldBe(enabled));
        clickOnButton(setRequiredTextIntoXpath(catalogMenuButton, menuText));
    }

    public List<String> getProductCategoriesList(String goodTitle) {
        checkThatAllElementsAreVisible($$(byXpath(String.format(productCategories, goodTitle))));
        return $$(byXpath(String.format(productCategories, goodTitle))).stream().map(WebElement::getText)
                .map(String::trim).collect(Collectors.toList());
    }
}