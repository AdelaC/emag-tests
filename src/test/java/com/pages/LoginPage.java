package com.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.emag.ro/user/login")
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(css = ".gui-btn.auth-btn-primary.auth-submit")
    private WebElementFacade continueButton;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".gui-input-explain.-is-error")
    private WebElementFacade errorEmailField;

    @FindBy(css = ".step2 .gui-input-explain.-is-error")
    private WebElementFacade errorPasswordField;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void clickContinueButton() {
        clickOn(continueButton);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public String getErrorMailMessage() {
        return errorEmailField.getTextValue();
    }

    public String getErrorPasswordMessage() {
        return errorPasswordField.getTextValue();
    }

}




