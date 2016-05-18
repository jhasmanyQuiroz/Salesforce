package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Jhasmany Quiroz on 5/18/2016.
 */
public class RelatedList extends AbstractBasePage {

    @FindBy(name = "new")
    private WebElement newButton;

    public NewCampaignForm clickNewCampaignButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewCampaignForm();
    }

    public NewLeadForm clickNewLeadButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewLeadForm();
    }
}