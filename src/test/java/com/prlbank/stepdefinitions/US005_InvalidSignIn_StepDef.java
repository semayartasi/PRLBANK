package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLResetPasswordPage;
import com.prlbank.pages.PRLSignInPage;
import com.prlbank.pages.PageInitializer;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US005_InvalidSignIn_StepDef extends PageInitializer {

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        Driver.wait(1);
        prlHomePage.icon.click();
        Driver.wait(1);
        prlHomePage.signInButton.click();
    }

    @When("User provides an invalid username {string}")
    public void user_provides_an_invalid_username(String string) {
        prlSignInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("invalid_username"));
    }

    @Then("User provides a valid password {string}")
    public void user_provides_valid_password(String string) {
        prlSignInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("customer_password"));
    }

    @Then("User clicks on Signin button")
    public void user_clicks_on_signin_button() {
        prlSignInPage.signInButton.click();
    }

    @Then("There should be the error message")
    public void there_should_be_the_error_message() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Failed to sign in! Please check your credentials and try again.", prlSignInPage.signInFail.getText());
    }

    @And("User provides a valid username {string}")
    public void userProvidesAValidUsername(String arg0) {
        prlSignInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("customer_username"));
    }

    @And("User provides an invalid password {string}")
    public void userProvidesAnInvalidPassword(String arg0) {
        prlSignInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("invalid_password"));
    }

    @Then("There should be a password reset button that navigates to reset page")
    public void thereShouldBeAPasswordResetButtonThatNavigatesToResetPage() {
        Driver.wait(1);
        Assert.assertEquals("Did you forget your password?", prlSignInPage.forgetPassword.getText());
        Driver.wait(2);
        prlSignInPage.forgetPassword.click();
        Driver.wait(2);
    }

}
