package com.steps.serenity;

import com.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.util.List;

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

    @Step
    public void checkListOfResultsNotEmpty() {
        List<String> listOfResults = searchResultsPage.getListOfResults();
        boolean isEmpty = listOfResults.isEmpty();
        Assert.assertFalse(isEmpty);
    }
}

