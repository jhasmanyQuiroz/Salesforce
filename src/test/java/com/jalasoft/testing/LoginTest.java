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
public class LoginTest {

    @Test
    public void testLogin() {
        String expectedCampaignName = "New Campaign 00001";

        Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("carledriss@freeorg02.com", "P@ssw0rd");

        TabBar tabBar = mainContainer.goToTabBar();
        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName() + " [View Hierarchy]",
                expectedCampaignName);
    }
}
