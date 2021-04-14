package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLRegistrationPage;
import com.prlbank.pages.PRLSignInPage;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DEMO {
    PRLRegistrationPage prlRegistrationPage  = new PRLRegistrationPage();
    PRLHomePage prlHomePage = new PRLHomePage();
    PRLSignInPage prlSignInPage = new PRLSignInPage();

    @And("user provides information for registration")
    public void userProvidesInformationForRegistration() {
        prlRegistrationPage.SSNTextBox.sendKeys(ConfigurationReader.getProperty("demossn"));
        prlRegistrationPage.firstNameTextBox.sendKeys(ConfigurationReader.getProperty("demofname"));
        prlRegistrationPage.lastNameTextBox.sendKeys(ConfigurationReader.getProperty("demolname"));
        prlRegistrationPage.addressTextBox.sendKeys(ConfigurationReader.getProperty("demoaddress"));
        prlRegistrationPage.mobilePhoneNumberTextBox.sendKeys(ConfigurationReader.getProperty("demomobile"));
        prlRegistrationPage.userNameTextBox.sendKeys(ConfigurationReader.getProperty("demousername"));
        prlRegistrationPage.emailTextBox.sendKeys(ConfigurationReader.getProperty("demoemail"));
        prlRegistrationPage.newPasswordTextBox.sendKeys(ConfigurationReader.getProperty("demopswd"));
        prlRegistrationPage.passwordConfirmationTextBox.sendKeys(ConfigurationReader.getProperty("demopswd"));
        Driver.wait(3);
        prlRegistrationPage.registerButton.click();
        Driver.wait(3);
    }

    @Then("admin user clicks sign in button")
    public void userClicksSignInButton() {
        prlHomePage.icon.click();
        prlHomePage.signInButton.click();
    }

    @And("login to admin account {string} and {string}")
    public void loginToAdminAccountAnd(String adminusername, String adminpaswd) {
        prlSignInPage.usernameTextBox.clear();
        prlSignInPage.usernameTextBox.sendKeys(adminusername);
        prlSignInPage.passwordTextBox.clear();
        prlSignInPage.passwordTextBox.sendKeys(adminpaswd);
        prlSignInPage.signInButton.click();
    }

    @Then("admin activates the account of the user")
    public void adminActivatesTheAccountOfTheUser() {

    }

    @And("login out from admin account")
    public void loginOutFromAdminAccount() {

    }

    @Then("login to employee account {string} and {string}")
    public void loginToEmployeeAccountAnd(String arg0, String arg1) {
    }

    @And("employee integrates accounts for the user")
    public void employeeIntegratesAccountsForTheUser() {
    }

    @Then("login out from employee account")
    public void loginOutFromEmployeeAccount() {
    }

    @Then("user logs into their own account")
    public void userLogsIntoTheirOwnAccount() {
    }

    @And("user navigates to My Accounts")
    public void userNavigatesToMyAccounts() {
    }

    @Then("user makes money transfer")
    public void userMakesMoneyTransfer() {
    }

    @And("user verifies their money transfer")
    public void userVerifiesTheirMoneyTransfer() {
    }
}
