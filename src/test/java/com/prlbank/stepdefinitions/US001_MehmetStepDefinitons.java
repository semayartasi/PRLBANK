package com.prlbank.stepdefinitions;

import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLRegistrationPage;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US001_MehmetStepDefinitons {
        PRLHomePage prlHomePage= new PRLHomePage();
        PRLRegistrationPage prlRegistrationPage= new PRLRegistrationPage();


        @Given("user on the {string}")
        public void userOnThe(String url) {//url olarak desgistirdim arg0=url
            Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
        }

        @And("User navigates to registration page")
        public void userNavigatesToRegistrationPage() {
           prlHomePage.icon.click();
           prlRegistrationPage.registerButton.click();


        }

        @Then("User provides a valid ssn")
        public void userProvidesAValidSsn() {
           prlRegistrationPage.SSNTextBox.sendKeys(ConfigurationReader.getProperty("ssn"));
        }

        @And("User provides a valid firstname")
        public void userProvidesAValidFirstname() {
           prlRegistrationPage.firstNameTextBox.sendKeys("Karen");
        }

        @And("User provides a valid lastname")
        public void userProvidesAValidLastname() {
            prlRegistrationPage.lastNameTextBox.sendKeys("last_name");

        }

        @And("User provides a valid address")
        public void userProvidesAValidAddress() {
        }

        @And("User provides a valid phonenumber")
        public void userProvidesAValidPhonenumber() {
        }

        @And("User provides a valid username")
        public void userProvidesAValidUsername() {
        }

        @And("User provides a valid email")
        public void userProvidesAValidEmail() {
        }

        @And("User provides password")
        public void userProvidesPassword() {
        }

        @And("User provides a valid password confirmation")
        public void userProvidesAValidPasswordConfirmation() {
        }

        @And("User clicks Register button")
        public void userClicksRegisterButton() {
        }

        @And("User asserts thst he could register successfully")
        public void userAssertsThstHeCouldRegisterSuccessfully() {
        }
    }

