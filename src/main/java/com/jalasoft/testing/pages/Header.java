package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id = "id=userNavButton")
    protected WebElement userMenu;

    @FindBy(xpath = "//a[@title='Logout']")
    private WebElement logoutMenu;

    public Header clickUserMenu() {
        userMenu.click();
        return this;
    }

    public AbstractBasePage clickLogoutMenu() {
        logoutMenu.click();
        return new LeadDetail();
    }
}