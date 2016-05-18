package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Carlos Gonzales on 5/16/2016.
 */
public class TabBar extends AbstractBasePage {

    @FindBy(css = "#Campaign_Tab > a")
    private WebElement campaignTab;

    //@FindBy(css = "")
    //a[@title='Leads Tab - Selected']")); driver.findElement(By.xpath("//a[@title='Leads Tab']"));
    @FindBy(xpath = "//a[@title='Leads Tab']")
    private WebElement leadTab;

    public CampaignHome clickCampaignsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(campaignTab));
        campaignTab.click();
        return new CampaignHome();
    }

    public LeadHome clickLeadsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(leadTab));
        leadTab.click();
        return new LeadHome();
    }
}
