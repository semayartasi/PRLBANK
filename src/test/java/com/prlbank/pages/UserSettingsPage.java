package com.prlbank.pages;

import com.prlbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSettingsPage {

    public UserSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement FirstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement LastNameTextBox;

    @FindBy(id = "email")
    public WebElement EmailTextBox;

    @FindBy(id = "langKey")
    public WebElement LanguageTextBox;

//    @FindBy(xpath = "(//select[@id])//option[@value='tr']")
//    public WebElement turkishLang;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveButton;
}

