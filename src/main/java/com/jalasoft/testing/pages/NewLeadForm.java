package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NewLeadForm extends AbstractBasePage {

    /*
    Lead Information
     */
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

    /*
    Address Information
    */
    @FindBy(id = "lea16street")
    private WebElement streetTextArea;

    @FindBy(id = "lea16city")
    private WebElement cityTextField;

    @FindBy(id = "lea16state")
    private WebElement provinceTextField;

    @FindBy(id = "lea16zip")
    private WebElement postalCodeTextField;

    @FindBy(id = "lea16country")
    private WebElement countryTextField;

    /*
    Additional Information
     */
    @FindBy(id = "00N3600000GaKef")
    private WebElement productInterestSelect;

    @FindBy(id = "00N3600000GaKeg")
    private WebElement sicCodeTextField;

    @FindBy(id = "00N3600000GaKed")
    private WebElement numberOfLocationTextField;

    @FindBy(id = "00N3600000GaKec")
    private WebElement currentGeneratorTextField;

    @FindBy(id = "00N3600000GaKee")
    private WebElement primarySelect;

    /*
    Description Information
     */

    @FindBy(id = "lea17")
    private WebElement descriptionTextArea;

    /*
    Optional
     */

    @FindBy(id = "lea21")
    private WebElement assigmentRuleCheckBox;

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

    public void setStreetTextArea(String street) {
        setTextField(streetTextArea, street);
    }

    public void setCityTextField(String city) {
        setTextField(cityTextField, city);
    }

    public void setProvinceTextField(String province) {
        setTextField(provinceTextField, province);
    }

    public void setPostalCodeTextField(String postalCode) {
        setTextField(postalCodeTextField, postalCode);
    }

    public void setCountryTextField(String country) {
        setTextField(countryTextField, country);
    }

    public void setProductInterestSelect(String productInterest) {
        setSelect(productInterestSelect, productInterest);
    }

    public void setSicCodeTextField(String sicCode) {
        setTextField(sicCodeTextField, sicCode);
    }

    public void setNumberOfLocationTextField(String numberOfLocation) {
        setTextField(numberOfLocationTextField, numberOfLocation);
    }

    public void setCurrentGeneratorTextField(String currenGenerator) {
        setTextField(currentGeneratorTextField, currenGenerator);
    }

    public void setPrimarySelect(String primary) {
        setSelect(primarySelect, primary);
    }

    public void setDescriptionTextArea(String description) {
        setTextField(descriptionTextArea, description);
    }

    public void setAssignmentRuleCheckBox() {
        if (!assigmentRuleCheckBox.isSelected()) {
            assigmentRuleCheckBox.click();
        }
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
