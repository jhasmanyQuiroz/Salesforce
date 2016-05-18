package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends AbstractBasePage {

    public static final String URL_SALESFORCE = "https://login.salesforce.com/";

    @FindBy(id = "username")
    private WebElement userNameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public Login() {
        driver.get(URL_SALESFORCE);
    }

    public void setUserNameTextField(String username) {
        wait.until(ExpectedConditions.visibilityOf(userNameTextField));
        userNameTextField.clear();
        userNameTextField.sendKeys(username);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public MainContainer clickLoginButtonToMainContainer() {
        clickLoginButton();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setUserNameTextField(userName);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }

}
