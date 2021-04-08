package com.prlbank.stepdefinitions;

import com.prlbank.pages.HomePage;
import com.prlbank.pages.SignInPage;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;

import io.cucumber.java.en.*;
import org.junit.Assert;


public class US004StepDefinitions {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @And("User navigates to Sign In Page")
    public void userNavigatesToSignInPage() {
        Driver.wait(1);
        homePage.icon.click();
        Driver.wait(1);
        homePage.signInButton.click();
    }

    @And("User click on sign in button")
    public void userClickOnSignInButton() {
        signInPage.signInButton.click();
    }

    @Then("User verifies that user logined successfully")
    public void userVerifiesThatUserLoginedSuccessfully() {
        //SoftAssert softAssert = new SoftAssert();
        //Not: SoftAssert kullanirsaniz en alta softAssert(obje isminden).assertAll() methodunu koymaniz gerekir.
        Assert.assertTrue("Kullanici girisi basarili degildir", signInPage.loginConfirm.isDisplayed());

    }

    @Then("User provides a valid {string} username")
    public void userProvidesAValidUsername(String usernames) {
        signInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(usernames));
    }

    @And("User provides a valid {string} password")
    public void userProvidesAValidPassword(String passwords) {
        signInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(passwords));
    }
}
