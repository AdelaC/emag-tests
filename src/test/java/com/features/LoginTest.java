package com.features;

import com.steps.serenity.HomeSteps;
import com.steps.serenity.LoginSteps;
import com.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    HomeSteps homeSteps;

    @Test
    public void logInTest(){
        loginSteps.navigateToLogin();
        loginSteps.setUserName(Constants.USER_EMAIL);
        loginSteps.clickOnContinue();
        loginSteps.setUserPass(Constants.USER_PASS);
        loginSteps.clickOnContinue();
        homeSteps.checkLoggedIn(Constants.USER_NAME);
    }

    @Test
    public void loginWithInvalidEmail(){
        loginSteps.navigateToLogin();
        loginSteps.setUserName(Constants.INVALID_EMAIL);
        loginSteps.clickOnContinue();
        loginSteps.checkErrorMailMessage(Constants.MESSAGE_INVALID_EMAIL);
    }

    @Test
    public void logInWithInvalidPassword(){
        loginSteps.navigateToLogin();
        loginSteps.setUserName(Constants.USER_EMAIL);
        loginSteps.clickOnContinue();
        loginSteps.setUserPass(Constants.INVALID_USER_PASS);
        loginSteps.clickOnContinue();
        loginSteps.checkErrorPasswordMessage(Constants.MESSAGE_INVALID_PASS);

    }

}


