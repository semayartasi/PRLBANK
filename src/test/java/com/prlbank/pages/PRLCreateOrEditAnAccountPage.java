package com.prlbank.pages;

import com.prlbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRLCreateOrEditAnAccountPage {

    public PRLCreateOrEditAnAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id=\"tp-account-description\"]")
    public WebElement descriptionTextBox;

    @FindBy(xpath="//*[@id=\"tp-account-balance\"]")
    public WebElement balanceTextBox;

    @FindBy (id="tp-account-accountType")
    public WebElement multiSelectDDAccountType;

    @FindBy (id="tp-account-accountStatusType")
    public WebElement multiSelectDDAccountStatusType;

    @FindBy(id="tp-account-createDate")
    public WebElement createDateSelect;

    @FindBy(id="tp-account-closedDate")
    public WebElement closedDateSelect;

    @FindBy (id="tp-account-employee")
    public WebElement multiSelectDDEmployee;

    @FindBy (id="save-entity")
    public WebElement saveButton;

    @FindBy (id="cancel-save")
    public WebElement backArrowButton;











}
