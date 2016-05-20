package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractHome extends AbstractBasePage{

    @FindBy(name = "new")
    protected WebElement newButton;

    abstract public AbstractBasePage clickNewButton();
}
