package com.prlbank.pages;


import com.prlbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRLSignInPage {

    public PRLSignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(css = "button[type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement loginConfirm;
}
