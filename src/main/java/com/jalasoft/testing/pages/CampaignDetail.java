package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignDetail extends AbstractBasePage{

    @FindBy(id = "cpn1_ileinner")
    private WebElement campaignText;

    public String getCampaignName() {
        return campaignText.getText();
    }
}
