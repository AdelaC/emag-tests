package com.steps.serenity;

import com.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

/**
 * Created by Calin on 9/6/2017.
 */
public class HomeSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void checkLoggedIn(String userName) {
        String userDetails = homePage.getUserDetails();
        boolean result = userDetails.contains(userName);
        Assert.assertTrue(result);
    }

    @Step
    public void setSearchField(String wordToSearch){
        homePage.setSearchFieldAndEnter(wordToSearch);
    }
}
