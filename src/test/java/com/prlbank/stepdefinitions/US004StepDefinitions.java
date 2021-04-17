package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLManagerHomePage;
import com.prlbank.pages.PRLSignInPage;
import com.prlbank.pages.PageInitializer;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US004StepDefinitions extends PageInitializer {

    @And("User navigates to Sign In Page")
    public void userNavigatesToSignInPage() {
        Driver.wait(1);
        prlHomePage.icon.click();
        Driver.wait(1);
        prlHomePage.signInButton.click();
    }

    @And("User click on sign in button")
    public void userClickOnSignInButton() {
        Driver.wait(1);
        prlHomePage.signInButton.click();
    }

    @Then("User verifies that user logined successfully")
    public void userVerifiesThatUserLoginedSuccessfully() {
        //SoftAssert softAssert = new SoftAssert();
        //Not: SoftAssert kullanirsaniz en alta softAssert(obje isminden).assertAll() methodunu koymaniz gerekir.
        Driver.wait(2);
        Assert.assertEquals("My Operations", prlManagerHomePage.myOperationsDropdown.getText());
    }

    @Then("User provides a valid username{string}")
    public void userProvidesAValidUsername(String arg0) {
        prlSignInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }

    @And("User provides a valid  password {string}")
    public void userProvidesAValidPassword(String arg0) {
        prlSignInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }

    @When("User provides valid username {string} and password {string}")
    public void userProvidesValidUsernameAndPassword(String arg0, String arg1) {
        prlSignInPage.usernameTextBox.sendKeys("admin");
        prlSignInPage.passwordTextBox.sendKeys("admin");
    }

    @And("User clicks on cancel button")
    public void userClicksOnCancelButton() {
        Driver.wait(1);
        prlSignInPage.cancelButton.click();
    }

    @Then("User can cancel to sign in")
    public void userCanCancelToSignIn() {
        Driver.wait(2);
        prlHomePage.icon.click();
        Assert.assertTrue(prlHomePage.signInButton.isDisplayed());
    }
}
