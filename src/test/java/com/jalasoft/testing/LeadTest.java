package com.jalasoft.testing;

import com.jalasoft.testing.pages.*;
import org.testng.Assert;
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

        String expectedLeadName = "Mr. User01 Test";

        TabBar tabBar = mainContainer.goToTabBar();
        LeadHome leadHome = tabBar.clickLeadsTab();
        NewLeadForm newLeadForm = (NewLeadForm) leadHome.clickNewButton();
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

        newLeadForm.setStreetTextArea("Avenue Root #777");
        newLeadForm.setCityTextField("Cercado");
        newLeadForm.setProvinceTextField("Cochabamba");
        newLeadForm.setPostalCodeTextField("591");
        newLeadForm.setCountryTextField("Bolivia");

        newLeadForm.setProductInterestSelect("GC3000 series");
        newLeadForm.setSicCodeTextField("147");
        newLeadForm.setNumberOfLocationTextField("7");
        newLeadForm.setCurrentGeneratorTextField("1");
        newLeadForm.setPrimarySelect("No");

        newLeadForm.setDescriptionTextArea("This is a little a description about of the lead created");

        //newLeadForm.setAssignmentRuleCheckBox();

        LeadDetail leadDetail = newLeadForm.clickSaveButton();
        Assert.assertEquals(leadDetail.getLeadNameText(), expectedLeadName,
                "There was a problem with the lead name, it isn't the same");
    }
}
