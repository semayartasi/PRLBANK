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

<<<<<<< HEAD
    @FindBy(xpath = "//*[contains(text(),'Registration saved!')]")
    public WebElement approvalAlert;
=======
   @FindBy (xpath = "(//div[@class=‘invalid-feedback’])[2]")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath= "//*[@id='strengthBar']/li[1][@style='background-color: rgb(255, 0, 0);']")
    public WebElement first_strengthBar;

    @FindBy(xpath= "//*[@id='strengthBar']/li[2][@style='background-color: rgb(221, 221, 221);']")
    public WebElement second_strengthBar;

    @FindBy(xpath= "[@id='strengthBar']/li[3][@style='background-color: rgb(221, 221, 221);']")
    public WebElement third_strengthBar;

    @FindBy(xpath= "[@id='strengthBar']/li[4][@style='background-color: rgb(221, 221, 221);']")
    public WebElement fourth_strengthBar;

    @FindBy(xpath= "[@id='strengthBar']/li[5][@style='background-color: rgb(221, 221, 221);']")
    public WebElement fifth_strengthBar;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement alert;
>>>>>>> master

    @FindBy(xpath="//div[text()='This field is invalid']")
    public WebElement emailIsNotValidMessage;

    @FindBy(xpath="//div[text()='Your SSN is invalid']")
    public WebElement SSNIsNotValidMessage;

    @FindBy(xpath="//div[text()='Your mobile phone number is invalid']")
    public WebElement MobilePhoneIsNotValidMessage;







}
