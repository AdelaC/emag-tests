package com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@DefaultUrl("https://www.emag.ro/search/samsung%20s7")
public class SearchResultsPage extends PageObject {


    @FindBy(css = ".visual-filter-item:nth-child(1)")
    private WebElementFacade mobilePhones;


    @FindBy(css = ".card-item.js-product-data") //CSS-UL CARE IMI RETURNEAZA 29 DE SAMSUNGURI
    public List<WebElementFacade> listOfSumsungS7;
    public String getListOfSumsungS7;


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

    public void loopsMethod() {
//alegi random un samsung din lista de 29.
        int randomNumber = ThreadLocalRandom.current().nextInt(0, listOfSumsungS7.size() - 1);
        listOfSumsungS7.get(randomNumber).click();


//        WebElement element = listOfSumsung.get(randomNumber).findElement(By.cssSelector(".card-footer.hidden-xs"));
//       element.click();


    }

    }