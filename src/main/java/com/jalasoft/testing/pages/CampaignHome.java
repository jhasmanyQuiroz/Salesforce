package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Carlos Gonzales on 5/16/2016.
 */
public class CampaignHome extends AbstractBasePage {

    @FindBy(name = "new")
    private WebElement newButton;

    public NewCampaignForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewCampaignForm();
    }

}
