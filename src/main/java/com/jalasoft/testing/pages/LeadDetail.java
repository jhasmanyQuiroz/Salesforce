package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadDetail extends AbstractBasePage{
    @FindBy(id = "lea2_ileinner")
    private WebElement leadNameText;

    public String getLeadNameText() {
        wait.until(ExpectedConditions.visibilityOf(leadNameText));
        return leadNameText.getText();
    }
}
