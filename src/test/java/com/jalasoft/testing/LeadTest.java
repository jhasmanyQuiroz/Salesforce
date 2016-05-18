package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.annotations.Test;

/**
 * Created by Jhasmany Quiroz on 5/18/2016.
 */
public class LeadTest {

    @Test
    public void createLead() {
        Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("userTest01@test.com", "userTest_01");

        String expectedLeadName = "Mrs. User01";

        TabBar tabBar = mainContainer.goToTabBar();
        LeadHome leadHome = tabBar.clickLeadsTab();
        RelatedList relatedList =  leadHome.goToRelatedList();
        NewLeadForm newLeadForm = relatedList.clickNewLeadButton();
        newLeadForm.setFirstNameSelect("Mr.");
        newLeadForm.setFirstNameTextField("User01");
        newLeadForm.setLastNameTextField("Test");
        newLeadForm.setCompanyTextField("Threat");
        newLeadForm.setTitleTextField("Title");
        newLeadForm.setLeadSourceSelect("Web");
        newLeadForm.setIndustrySelect("Engineering");
        newLeadForm.setAnnualRevenueTextField("123");
        newLeadForm.setPhoneTextField("44455566");
        newLeadForm.setMobileTextField("76455444");
        newLeadForm.setFaxTextField("44455566");
        newLeadForm.setEmailTextField("test@test.com");
        newLeadForm.setWebsiteTextField("www.test.com");
        newLeadForm.setLeadStatusSelect("Working - Contacted");
        newLeadForm.setRatingSelect("Cold");
        newLeadForm.setNumberOfEmployeesTextField("07");
        LeadDetail leadDetail = newLeadForm.clickSaveButton();
    }
}
