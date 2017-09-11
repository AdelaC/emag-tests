package com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@DefaultUrl("https://www.emag.ro/search/samsung%20s7")
public class SearchResultsPage extends PageObject {


    @FindBy(css = ".visual-filter-item:nth-child(1)")
    private WebElementFacade mobilePhones;

    @FindBy(css = ".card-item.js-product-data")
    public List<WebElementFacade> listOfSumsungS7;

    public void selectMobilePhones() {
        clickOn(mobilePhones);
    }

    public void selectS7Black32GB() {
        for (WebElementFacade elementFacade : listOfSumsungS7) {
            String dataName = elementFacade.getAttribute("data-name");
            if (dataName.contains("Telefon mobil Samsung Galaxy S7, 32GB, 4G, Black"))
                elementFacade.click();
            break;
        }
    }

    public List<String> getListOfResults() {
        List<String> listOfResultsAsString = new ArrayList<>();
        for (WebElementFacade elementFacade : listOfSumsungS7) {
            listOfResultsAsString.add(elementFacade.getAttribute("data-name"));
        }
        return listOfResultsAsString;
    }
}