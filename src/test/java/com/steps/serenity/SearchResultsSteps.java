package com.steps.serenity;

import com.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchResultsSteps extends ScenarioSteps {

    SearchResultsPage searchResultsPage;

    @Step
    public void selectMobilePhones(){
        searchResultsPage.selectMobilePhones();
    }

    @Step
    public void selectS7Black32GB(){
        searchResultsPage.selectS7Black32GB();
    }


}

