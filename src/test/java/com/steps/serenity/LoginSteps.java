package com.steps.serenity;


import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void navigateToLogin() {
        loginPage.open();
    }

    @Step
    public void setUserName(String userName) {
        loginPage.setEmailField(userName);
    }

    @Step
    public void clickOnContinue() {
        loginPage.clickContinueButton();
    }

    @Step
    public void setUserPass(String userPass) {
        loginPage.setPasswordField(userPass);
    }

    @Step
    public void checkErrorMailMessage(String errorMessageExpected) {
        String errorMessageDisplayed = loginPage.getErrorMailMessage();
        boolean result = errorMessageExpected.equals(errorMessageDisplayed);
        Assert.assertTrue(result);
    }

    @Step
    public void checkErrorPasswordMessage(String errorPasswordMessageExpected) {
        String errorMessagePasswordDisplayed = loginPage.getErrorPasswordMessage();
        boolean result = errorPasswordMessageExpected.equals(errorMessagePasswordDisplayed);
        Assert.assertTrue(result);
    }
}
