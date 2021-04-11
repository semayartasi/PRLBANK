package com.prlbank.pages;

import com.prlbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRLRegistrationPage {

    public PRLRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "ssn")
    public WebElement SSNTextBox;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement firstNameTextBox;

    @FindBy(xpath="//*[@id=\"lastname\"]")
    public WebElement lastNameTextBox;

    @FindBy(id= "address")
    public WebElement addressTextBox;

    @FindBy(id= "mobilephone")
    public WebElement mobilePhoneNumberTextBox;

    @FindBy(id= "username")
    public WebElement userNameTextBox;

    @FindBy(id= "email")
    public WebElement emailTextBox;

    @FindBy (xpath = "//*[text() ='This field is invalid']")
    public WebElement invalidEmailError;

    @FindBy(id= "firstPassword")
    public WebElement newPasswordTextBox;

    @FindBy(id= "secondPassword")
    public WebElement passwordConfirmationTextBox;

    @FindBy(id= "register-submit")
    public WebElement registerButton;

   @FindBy (xpath = "//*[text() ='Your First Name is required']")
    public WebElement firstNameErrorMessage;























}