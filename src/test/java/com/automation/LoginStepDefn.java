package com.automation;


import Pages.LandingPage;
import Pages.LoginPage;
import com.base.BaseClase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Pages.HomePage.login;
import static Pages.LoginPage.loginbtn;


/**
 * Created by Abdul on 24/03/2017.
 */
public class LoginStepDefn extends BaseClase{

    WebDriver driver;


    public LoginStepDefn() {
        this.driver = Hooks.driver;
    }


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

        driver.get("https://heroku.com");
         login.click();
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String password) throws Throwable {

        loginPage.loginToWebSite(username, password);
    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        loginbtn.click();
    }

    @Then("^I ses valid or invalid login message$")
    public void i_ses_valid_or_invalid_login_message() throws Throwable {

        landingPage.checkMasg();

    }


}
