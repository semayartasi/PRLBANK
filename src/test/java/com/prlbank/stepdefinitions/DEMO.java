package com.prlbank.stepdefinitions;

import com.prlbank.pages.*;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DEMO extends PageInitializer {

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
        prlAdminHomePage.administrationDD.click();
        prlAdminHomePage.userManagementLink.click();
        prlAdminHomePage.deactivateButtonforUser.click();
    }

    @And("login out from admin account")
    public void loginOutFromAdminAccount() {
        prlAdminHomePage.signOutLink.click();
    }

    @Then("login to employee account {string} and {string}")
    public void loginToEmployeeAccountAnd(String arg0, String arg1) {
        prlHomePage.icon.click();
        prlHomePage.signInButton.click();
        prlSignInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty("emplUsername"));
        prlSignInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty("emplPaswd"));
        prlSignInPage.signInButton.click();
    }

    @And("employee integrates accounts for the user")
    public void employeeIntegratesAccountsForTheUser() {
        prlEmployeePage.MyOperations.click();
        prlEmployeePage.ManageAccounts.click();
        prlCustomersPage.createANewCustomerButton.click();
        prlAccountsPage.createANewAccountButton.click();
        prlCreateOrEditAnAccountPage.descriptionTextBox.sendKeys("TEAM43 CHECKING");
        prlCreateOrEditAnAccountPage.balanceTextBox.sendKeys("90000000000");
        Driver.wait(2);
        prlCreateOrEditAnAccountPage.saveButton.click();
        Driver.wait(2);
        prlEmployeePage.MyOperations.click();
        prlEmployeePage.ManageAccounts.click();
        prlCustomersPage.createANewCustomerButton.click();
        prlCreateOrEditAnAccountPage.descriptionTextBox.sendKeys("TEAM43 SAVING");
        prlCreateOrEditAnAccountPage.balanceTextBox.sendKeys("1000000");
        Driver.wait(2);
        prlCreateOrEditAnAccountPage.saveButton.click();
    }

    @Then("login out from employee account")
    public void loginOutFromEmployeeAccount() {
        prlAccountsPage.iconMenu.click();
        prlAccountsPage.signOutButton.click();
    }

    @Then("user logs into their own account")
    public void userLogsIntoTheirOwnAccount() {
        prlHomePage.icon.click();
        prlHomePage.signInButton.click();
        prlSignInPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(""));
        prlSignInPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(""));
        prlSignInPage.signInButton.click();
    }

    @And("user navigates to My Operations")
    public void userNavigatesToMyOperations() {
        prlUserPage.MyOperations.click();
    }

    @Then("user makes money transfer")
    public void userMakesMoneyTransfer() {
        prlUserPage.TransferMoney.click();
        prlUserPage.fromAccount.sendKeys(ConfigurationReader.getProperty("fromTextbox"));
        prlUserPage.toAccount.sendKeys(ConfigurationReader.getProperty("toTextbox"));
        prlUserPage.balanceTextBox.sendKeys(ConfigurationReader.getProperty("balanceTextBox"));
        prlUserPage.descriptionTextBox.sendKeys(ConfigurationReader.getProperty("descriptionTextBox"));
        prlUserPage.MakeTransferButton.click();
    }

    @And("user verifies their money transfer")
    public void userVerifiesTheirMoneyTransfer() {

    }

}
