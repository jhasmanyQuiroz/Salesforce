package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewCampaignForm extends AbstractBasePage {

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(name = "save")
    private WebElement saveButton;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        campaignNameTextField.clear();
        campaignNameTextField.sendKeys(campaignName);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }
}
