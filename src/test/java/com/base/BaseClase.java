package com.base;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LoginPage;
import com.automation.Hooks;
import org.openqa.selenium.WebDriver;

/**
 * Created by Abdul on 24/03/2017.
 */
public class BaseClase {


    protected WebDriver driver;
    public LoginPage loginPage;
    public LandingPage landingPage;

    public HomePage homePage;


    public BaseClase(){
        this.driver = Hooks.driver;
        loginPage = new LoginPage(driver);
        landingPage = new LandingPage(driver);
        homePage = new HomePage(driver);

    }



}
