package fragments;

import com.codeborne.selenide.SelenideElement;



import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static core.helpers.ActionHelper.clickOnButton;
import static core.helpers.ActionHelper.isElementDisplayed;

public class HeaderFragment {
    SelenideElement mainLogo = $(byCssSelector("img[alt='Rozetka Logo']"));

    public void clickOnTheMainLogo() {
        isElementDisplayed(mainLogo);
        clickOnButton(mainLogo);
    }
}