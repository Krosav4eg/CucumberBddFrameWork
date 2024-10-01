package fragments;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;
import static core.helpers.ActionHelper.*;


@Getter
public class GoodItemFragment {
    ElementsCollection goodsBodyItem = $$(byCssSelector("div.goods-tile__content"));
    ElementsCollection goodsTitle = $$(byCssSelector("span.goods-tile__title"));
    ElementsCollection goodsPriceList = $$(byCssSelector("p.ng-star-inserted>span.goods-tile__price-value"));

    public void witForAllGoodsBodyItemsArePresent() {
        checkThatAllElementsAreVisible(goodsBodyItem);
    }

    public void checkSizeAllGoodsBodyItems(int elementsSize) {
        checkThatElementCollectionsHasSize(goodsBodyItem, elementsSize);
    }
}