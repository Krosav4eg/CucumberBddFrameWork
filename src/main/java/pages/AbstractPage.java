package pages;

import fragments.GoodItemFragment;
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

    public void openBaseUrl() {
        openUrl();
    }
}