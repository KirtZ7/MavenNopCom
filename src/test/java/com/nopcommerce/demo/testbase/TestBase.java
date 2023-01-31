package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Utility;

import java.util.NoSuchElementException;

/**
 * Created by Bhavesh
 * recreated by Kirtan
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    //to check for login tests
    public boolean isElementDisplayedlogOut(By logoutLink) {
        try {
            return driver.findElement(logoutLink).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    //to check for log out test
    public boolean isElementDisplayedLogIn(By logInLink) {
        try {
            return driver.findElement(logInLink).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

}
