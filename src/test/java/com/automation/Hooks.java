package com.automation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Abdul on 24/03/2017.
 */
public class Hooks {

    public static WebDriver driver;

    @Before
    public WebDriver setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\Documents\\Selenium_jar\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}
