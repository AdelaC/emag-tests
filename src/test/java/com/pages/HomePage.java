package com.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.emag.ro/user/account")
public class HomePage extends PageObject{

    @FindBy(css = ".account_holder")
    private WebElementFacade detailsForm;

    @FindBy(id = "emg-input-autosuggest")
    private WebElementFacade searchField;

    public void setSearchFieldAndEnter(String searchText) {
        searchField.typeAndEnter(searchText);
    }

    public String getUserDetails(){
        return detailsForm.getTextValue();
    }
}


