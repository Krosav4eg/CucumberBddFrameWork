package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.*;
import static core.helpers.ActionHelper.*;

public class HeaderFragment {
    SelenideElement mainLogo = $(byCssSelector("img[alt='Rozetka Logo']"));
    String catalogMenuButton = "//button[@aria-label='%s']";

    public void clickOnTheMainLogo() {
        isElementDisplayed(mainLogo);
        clickOnButton(mainLogo);
    }

    public void clickOnCatalogMenuButton(String menuText) {
        isElementDisplayed(setRequiredTextIntoXpath(catalogMenuButton, menuText).shouldBe(enabled));
        clickOnButton(setRequiredTextIntoXpath(catalogMenuButton, menuText));
    }
}