package com.prlbank.stepdefinitions;

import com.github.javafaker.Faker;
import com.prlbank.pages.PRLHomePage;
import com.prlbank.pages.PRLRegistrationPage;
import com.prlbank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US003_PasswordSecureLevel {

    PRLHomePage homePage = new PRLHomePage();
    PRLHomePage registerBtn = new PRLHomePage();
    PRLRegistrationPage registrationPage = new PRLRegistrationPage();
    Faker faker = new Faker();

    @When("user clicks on icon menu")
    public void user_clicks_on_icon_menu() {
        Driver.wait(1);
        homePage.icon.click();
    }

   // @Then("user clicks on register button")
//    public void user_clicks_on_register_button() {
 //       Driver.wait(1);
   //     homePage.registerButton.click();


   // }

    @Then("user navigate on Register page")
    public void user_navigate_on_register_page() {
        Driver.waitForPageToLoad(5);

    }

    @Then("user navigate in the New Password box and provides a lowercase letter")
    public void user_navigate_in_the_new_password_box_and_provides_a_lowercase_letter() {
        //firstBar = registrationPage.first_strengthBar;
        registrationPage.newPasswordTextBox.sendKeys("a");

    }

    @Then("user should be see change on the Password strength first bar")
    public void user_should_be_see_change_on_the_password_strength_first_bar(WebElement firstBar) throws InterruptedException {
        firstBar = registrationPage.first_strengthBar;
        Assert.assertEquals(firstBar,registrationPage.first_strengthBar);
        Thread.sleep(2000);
    }


    @Then("user navigate in the New Password box and provides a uppercase letter")
    public void user_navigate_in_the_new_password_box_and_provides_a_uppercase_letter() {
        registrationPage.newPasswordTextBox.sendKeys("aA");
    }

    @Then("user should be see change on the Password strength second bar")
    public void user_should_be_see_change_on_the_password_strength_second_bar(WebElement secondBar) throws InterruptedException {
        secondBar = registrationPage.second_strengthBar;
        Assert.assertEquals(secondBar,registrationPage.second_strengthBar);
        Thread.sleep(2000);
    }

    @Then("user navigate in the New Password box and provides a digit")
    public void user_navigate_in_the_new_password_box_and_provides_a_digit() {
        registrationPage.newPasswordTextBox.sendKeys("aA1");
    }


    @Then("user should be see change on the Password strength third bar")
    public void user_should_be_see_change_on_the_password_strength_third_bar(WebElement thirdBar) throws InterruptedException {
        thirdBar = registrationPage.third_strengthBar;
        Assert.assertEquals(thirdBar, registrationPage.third_strengthBar);
        Thread.sleep(2000);
    }


    @Then("user navigate in the New Password box and provides a special char")
    public void user_navigate_in_the_new_password_box_and_provides_a_special_char() {
        registrationPage.newPasswordTextBox.sendKeys("aA1*");
    }


    @Then("user should be see change on the Password strength fourth bar")
    public void user_should_be_see_change_on_the_password_strength_fourth_bar(WebElement fourthBar) throws InterruptedException {
        fourthBar = registrationPage.third_strengthBar;
        Assert.assertEquals(fourthBar, registrationPage.third_strengthBar);
        Thread.sleep(2000);
    }

    @Then("user navigate in the New Password box and provides any three chars")
    public void user_navigate_in_the_new_password_box_and_provides_any_three_chars() {
        registrationPage.newPasswordTextBox.sendKeys("aA1*123");
    }


    @Then("user should be see change on the Password strength fifth bar")
    public void user_should_be_see_change_on_the_password_strength_fifth_bar(WebElement fifthBar) throws InterruptedException {
        fifthBar = registrationPage.third_strengthBar;
        Assert.assertEquals(fifthBar, registrationPage.third_strengthBar);
        Thread.sleep(2000);
    }
}

