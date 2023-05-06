package fragments;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static core.helpers.ActionHelper.*;

@SuppressWarnings({"checkstyle:VisibilityModifier", "checkstyle:DesignForExtension"})
public class FilterSideFragment {
    SelenideElement sellerFilterBarBody = $(byCssSelector("div[data-filter-name='seller']"));
    String sidebarBrand = "//ul[@class='checkbox-filter']//a[contains(@data-id, '%s')]";

    public FilterSideFragment selectBrandFromSideBar(String brandName) {
        isElementDisplayed(sellerFilterBarBody);
        setRequiredTextIntoXpath(sidebarBrand, brandName).click();
        isElementSelected(setRequiredTextIntoXpath(sidebarBrand, brandName));
        return this;
    }
}