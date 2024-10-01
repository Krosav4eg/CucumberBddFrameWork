package fragments;

import com.codeborne.selenide.SelenideElement;
import core.helpers.ActionHelper;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;


public class ExponeaBannerFragment {

    SelenideElement exponeaBannerCloseButton = $(byCssSelector("span.exponea-close-cross"));

      public ExponeaBannerFragment clickExponeaBannerCloseButton() {
        ActionHelper.clickOnButton(exponeaBannerCloseButton);
        return new ExponeaBannerFragment();
    }
}