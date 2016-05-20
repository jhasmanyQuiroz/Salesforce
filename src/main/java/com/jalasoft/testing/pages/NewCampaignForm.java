package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.WEmbeddedFrame;

public class NewCampaignForm extends AbstractBasePage {

    /*
    Campaign Information
     */
    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(id = "cpn16")
    private WebElement activeCheckBox;

    @FindBy(id = "cpn2")
    private WebElement campaignTypeSelect;

    @FindBy(id = "cpn4")
    private WebElement descriptionTextArea;

    @FindBy(id = "cpn3")
    private WebElement statusSelect;

    @FindBy(id = "cpn5")
    private WebElement startDateTextField;

    @FindBy(id = "cpn6")
    private WebElement endDateTextField;

    /*
    Planning
     */

    @FindBy(id = "cpn13")
    private WebElement numSentTextField;

    @FindBy(id = "cpn11")
    private WebElement expectedResponseTextField;

    @FindBy(id = "cpn9")
    private WebElement budgetedPostTextField;

    @FindBy(id = "cpn10")
    private WebElement actualCostTextField;

    @FindBy(id = "cpn10")
    private WebElement expectedRevenueTextField;

    @FindBy(name = "save")
    private WebElement saveButton;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        setTextField(campaignNameTextField, campaignName);
    }

    public void setActiveCheckBox() {
        if (!activeCheckBox.isSelected()) {
            activeCheckBox.click();
        }
    }

    public void setCampaignTypeSelect(String campaign) {
        setSelect(campaignTypeSelect, campaign);
    }

    public void setDescriptionTextArea(String description) {
        setTextField(descriptionTextArea, description);
    }

    public void setStatusSelect(String status) {
        setSelect(statusSelect, status);
    }

    public void setStartDateTextField(String startDate) {
        setTextField(startDateTextField, startDate);
    }

    public void setEndDateTextField(String endDate) {
        setTextField(endDateTextField, endDate);
    }

    public void setNumSentTextField(String numSent) {
        setTextField(numSentTextField, numSent);
    }

    public void setExpectedResponseTextField(String expectedResponse) {
        setTextField(expectedResponseTextField, expectedResponse);
    }

    public void setBudgetedPostTextField(String budgetedPost) {
        setTextField(budgetedPostTextField, budgetedPost);
    }

    public void setActualCostTextField(String actualCost) {
        setTextField(actualCostTextField, actualCost);
    }

    public void setExpectedRevenueTextField(String expectedRevenue) {
        setTextField(expectedRevenueTextField, expectedRevenue);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
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
