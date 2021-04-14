package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PageInitializer;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US015_ManageAccount extends PageInitializer {

    @Given("User goes to login page and sings in")
    public void userGoesToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("prlbank_url"));
        Driver.waitAndClick(prlHomePage.icon,3);
        prlHomePage.signInButton.click();
        Driver.wait(5);
    }

    @When("user clicks on My Operations then user clicks on Manage Accounts")
    public void userClicksOnMyOperationnThenUserClicksOnManageAccounts() {

    }

    @Then("user clicks on a desired account id")
    public void userClicksOnADesiredAccountId() {
    }

    @And("user clicks View button")
    public void userClicksViewButton() {
    }

    @And("user can click Edit button")
    public void userCanClickEditButton() {
    }

    @Then("user can update Account Type")
    public void userCanUpdateAccountType() {
    }
}
