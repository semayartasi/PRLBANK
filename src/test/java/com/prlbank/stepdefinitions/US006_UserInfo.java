package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLSignInPage;
import com.prlbank.pages.PRLUserSettingsPage;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US006_UserInfo {
    PRLHomePage homePage = new PRLHomePage();
    PRLSignInPage signInPage = new PRLSignInPage();
    PRLUserSettingsPage userSettingsPage = new PRLUserSettingsPage();

    @Given("user is on main page")
    public void userIsOnMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("prlbank_url"));
        Driver.wait(2);
    }

    @When("user clicks to icon menu")
    public void userClicksToIconMenu() {
        Driver.waitAndClick(homePage.iconMenu, 5);
    }

    @Then("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        Driver.waitAndClick(homePage.signInButton,5);
    }

    @Then("user provides an username with valid cred")
    public void userProvidesAnUsernameWithValidCred() {
        Driver.waitAndSendText(signInPage.usernameTextBox, ConfigurationReader.getProperty("admin_username"), 5);
    }

    @Then("user provides a password with valid cred")
    public void userProvidesAPasswordWithValidCred() {
        Driver.waitAndSendText(signInPage.passwordTextBox, ConfigurationReader.getProperty("admin_password"),5);
    }

    @Then("user clicks on the sign in button")
    public void userClicksOnTheSignInButton() {
        Driver.waitAndClick(signInPage.signInButton, 3);
    }

    @Then("user clicks on employee icon")
    public void userClicksOnEmployeeIcon() {
        Driver.waitAndClick(signInPage.employeeDD,3);
    }

    @Then("user clicks user info")
    public void userClicksUserInfo() {
        Driver.waitAndClick(signInPage.UserInfo,3);
    }

    @Given("user clicks on first name textbox")
    public void userClicksOnFirstNameTextbox() {
        Driver.waitAndClick(userSettingsPage.FirstNameTextBox,2);
    }

    @When("user updates {string}")
    public void userUpdates(String fname) {
        Driver.waitAndSendText(userSettingsPage.FirstNameTextBox, "T43Refia",3);
    }

    @Then("user clicks save button")
    public void userClicksSaveButton() {
        Driver.waitAndClick(userSettingsPage.SaveButton,2);
    }

    @Then("user can see the aprroved message")
    public void userCanSeeTheAprrovedMessage() {
        Driver.wait(1);
    }

    @Given("user clicks on last name textbox")
    public void userClicksOnLastNameTextbox() {
        Driver.waitAndSendText(userSettingsPage.LastNameTextBox,"Sen",2);
    }

    @Given("user clicks on email textbox")
    public void userClicksOnEmailTextbox() {
        Driver.waitAndClick(userSettingsPage.EmailTextBox,2);
//        Driver.waitAndSendText(userSettingsPage.EmailTextBox,"ref@gmail.com",2);
//        Driver.waitAndClick(userSettingsPage.SaveButton);
    }

    @Given("user clicks on language textbox")
    public void userClicksOnLanguageTextbox() {
        Driver.waitAndClick(userSettingsPage.LanguageTextBox,2);
    }

    @When("user clicks Turkce")
    public void userClicksTurkce() {
        Driver.selectAnItemFromDropdown(userSettingsPage.LanguageTextBox,"Türkçe");
    }
}
