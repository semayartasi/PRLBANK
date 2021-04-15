package com.prlbank.pages;

import com.prlbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRLAdminHomePage {
    public PRLAdminHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "admin-menu")
    public WebElement administrationDD;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagementLink;

    @FindBy(xpath = "//*[text()='team43 Checking Account']")
    public WebElement checkingAccountName;

    @FindBy(xpath = "//*[text()='team43 Saving Account']")
    public WebElement savingAccountName;

//    @FindBy(xpath = "//*[@id="demo43username1"]/td[4]/button")
    public WebElement deactivateButtonforUser;

    @FindBy(id = "account-menu")
    public WebElement iconButton;

    @FindBy(partialLinkText = "logout") //href = logout
    public WebElement signOutLink;





}
