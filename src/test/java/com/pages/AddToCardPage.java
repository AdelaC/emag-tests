package com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.emag.ro/search/telefoane-mobile/samung+s7/c")
public class AddToCardPage extends PageObject {


    @FindBy(css = "#card_grid > div:nth-child(1) .card-section-btm")
    private WebElementFacade addToCardSamsun1Of29;




    public void clickAddToCard() {
        clickOn(addToCardSamsun1Of29);
    }



}
