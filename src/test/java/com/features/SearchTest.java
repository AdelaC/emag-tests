package com.features;

import com.steps.serenity.HomeSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.SearchResultsSteps;
import com.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    HomeSteps homeSteps;

    @Steps
    SearchResultsSteps searchResultsSteps;

    @Test
    public void searchTest() {
        loginSteps.navigateToLogin();
        loginSteps.setUserName(Constants.USER_EMAIL);
        loginSteps.clickOnContinue();
        loginSteps.setUserPass(Constants.USER_PASS);
        loginSteps.clickOnContinue();
        homeSteps.setSearchField(Constants.TEXT_SEARCH_FIELD);
        searchResultsSteps.selectMobilePhones();
        searchResultsSteps.checkListOfResultsNotEmpty();
    }


    @Test
    public void checkSamsungListIsNotEmpty(){
        loginSteps.navigateToLogin();
        loginSteps.setUserName(Constants.USER_EMAIL);
        loginSteps.clickOnContinue();
        loginSteps.setUserPass(Constants.USER_PASS);
        loginSteps.clickOnContinue();
        homeSteps.setSearchField(Constants.TEXT_SEARCH_FIELD);
        searchResultsSteps.selectMobilePhones();
        searchResultsSteps.selectS7Black32GB();


    }

}
