package pages;

import fragments.FilterSideFragment;
import fragments.GoodItemFragment;
import fragments.HeaderFragment;
import fragments.MainCategoriesOnTheMainCatalogFragment;
import lombok.Getter;

import static core.helpers.ActionHelper.*;


/**
 * AbstractPage class contains all common fragments in application
 * and general methods related to navigation and checking page condition.
 * This fragments can be using for interaction in different classes.
 */
@Getter
public class AbstractPage {
    protected GoodItemFragment goodItemFragment = new GoodItemFragment();
    protected FilterSideFragment filterSideFragment = new FilterSideFragment();
    protected HeaderFragment headerFragment = new HeaderFragment();
    protected MainCategoriesOnTheMainCatalogFragment mainCategoriesOnTheMainCatalogFragment = new
            MainCategoriesOnTheMainCatalogFragment();

    public void openBaseUrl() {
        openUrl();
    }
}