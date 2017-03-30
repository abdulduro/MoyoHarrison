package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Abdul on 24/03/2017.
 */
public class LandingPage {

    protected WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "name")
    private WebElement personalApplMessage;


    public void checkMasg() {

        Assert.assertTrue(personalApplMessage.getText().equals("Personal apps"));

        // Assert.assertTrue(personalApplMessage.getText().equals(text));

       // personalApplMessage.isDisplayed()


//        if (driver.getPageSource().contains("Personal apps")) {
//
//            Assert.assertTrue(personalApplMessage.getText().equals("Personal apps"));
//        } else {
//
//            Assert.assertTrue(LoginPage.invalidLoginMessage.getText().equals("There was a problem with your login"));
//
//            // Assert.assertTrue(personalApplMessage.getText().equals("Personal apps"));
//
//            //Assert.assertTrue(LoginPage.invalidLoginMessage.getText().equals("There was a problem with your login"));
//        }

    }
}