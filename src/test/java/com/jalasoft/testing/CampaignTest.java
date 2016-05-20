package com.jalasoft.testing;

import com.jalasoft.testing.pages.CampaignDetail;
import com.jalasoft.testing.pages.CampaignHome;
import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.MainContainer;
import com.jalasoft.testing.pages.NewCampaignForm;
import com.jalasoft.testing.pages.TabBar;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Carlos Gonzales on 5/13/2016.
 */
public class CampaignTest {

    @Test
    public void createCampaign() {
        String expectedCampaignName = "New Campaign";

        Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("userTest01@test.com", "userTest_01");

        TabBar tabBar = mainContainer.goToTabBar();
        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.setActiveCheckBox();
        newCampaignForm.setCampaignTypeSelect("Webinar");
        newCampaignForm.setDescriptionTextArea("This is a little a description about of the campaign created");
        newCampaignForm.setStatusSelect("In Progress");
        newCampaignForm.setStartDateTextField("5/20/2016");
        newCampaignForm.setEndDateTextField("5/21/2016");
        newCampaignForm.setNumSentTextField("7");
        newCampaignForm.setExpectedResponseTextField("50");
        newCampaignForm.setBudgetedPostTextField("777");
        newCampaignForm.setActualCostTextField("1000");
        newCampaignForm.setExpectedRevenueTextField("444");

        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName + " [View Hierarchy]");
    }
}
