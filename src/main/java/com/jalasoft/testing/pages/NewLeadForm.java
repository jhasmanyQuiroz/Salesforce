package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jhasmany Quiroz on 5/18/2016.
 */
public class NewLeadForm extends AbstractBasePage {

    @FindBy(id = "name_salutationlea2")
    private WebElement firstNameSelect;

    @FindBy(id = "name_firstlea2")
    private WebElement firstNameTextField;

    @FindBy(id = "name_lastlea2")
    private WebElement lastNameTextField;

    @FindBy(id = "lea3")
    private WebElement companyTextField;

    @FindBy(id = "lea4")
    private WebElement titleTextField;

    @FindBy(id = "lea5")
    private WebElement leadSourceSelect;

    @FindBy(id = "lea6")
    private WebElement industrySelect;

    @FindBy(id = "lea7")
    private WebElement annualRevenueTextField;

    @FindBy(id = "lea8")
    private WebElement phoneTextField;

    @FindBy(id = "lea9")
    private WebElement mobileTextField;

    @FindBy(id = "lea10")
    private WebElement faxTextField;

    @FindBy(id = "lea11")
    private WebElement emailTextField;

    @FindBy(id = "lea12")
    private WebElement websiteTextField;

    @FindBy(id = "lea13")
    private WebElement leadStatusSelect;

    @FindBy(id = "lea14")
    private WebElement ratingSelect;

    @FindBy(id = "lea15")
    private WebElement numberOfEmployeesTextField;

    @FindBy(xpath = "//input[@tabindex='30']")
    private WebElement saveButton;

    public void setFirstNameSelect(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameSelect));
        Select select = new Select(firstNameSelect);
        select.selectByVisibleText(firstName);
    }

    public void setFirstNameTextField(String firstName) {
        setTextField(firstNameTextField, firstName);
    }

    public void setLastNameTextField(String lastName) {
        setTextField(lastNameTextField, lastName);
    }

    public void setCompanyTextField(String company) {
        setTextField(companyTextField, company);
    }

    public void setTitleTextField(String title) {
        setTextField(titleTextField, title);
    }

    public void setLeadSourceSelect(String leadSource) {
        setSelect(leadSourceSelect, leadSource);
    }

    public void setIndustrySelect(String industry) {
        setSelect(industrySelect, industry);
    }

    public void setAnnualRevenueTextField(String annualRevenue) {
        setTextField(annualRevenueTextField, annualRevenue);
    }

    public void setPhoneTextField(String phone) {
        setTextField(phoneTextField, phone);
    }

    public void setMobileTextField(String mobile) {
        setTextField(mobileTextField, mobile);
    }

    public void setFaxTextField(String fax) {
        setTextField(faxTextField, fax);
    }

    public void setEmailTextField(String email) {
        setTextField(emailTextField, email);
    }

    public void setWebsiteTextField(String website) {
        setTextField(websiteTextField, website);
    }

    public void setLeadStatusSelect(String status) {
        setSelect(leadStatusSelect, status);
    }

    public void setRatingSelect(String rating) {
        setSelect(ratingSelect, rating);
    }

    public void setNumberOfEmployeesTextField(String numberOfEmployees) {
        setTextField(numberOfEmployeesTextField, numberOfEmployees);
    }

    public LeadDetail clickSaveButton() {
        saveButton.click();
        return new LeadDetail();
    }

    private void setTextField(WebElement webElement, String value) {
        webElement.clear();
        webElement.sendKeys(value);
    }

    private void setSelect(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }
}
