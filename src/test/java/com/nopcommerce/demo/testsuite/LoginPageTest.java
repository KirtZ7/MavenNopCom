package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Bhavesh
 * Recreated by Kirtan
 */
public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage= new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on login link
        // verify that "Welcome, Please Sign In!" message is displayed
        homepage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyTheErrorMessageWithInvalidCredentials() {
        // click on login link
        // enter email
        // enter password
        // click on login button
        // verify the error message
        homepage.clickOnLoginLink();
        String email = "invalid@test.com";
        String password = "invalid";
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        String expectedError = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualError = loginPage.getErrorMessage();
        Assert.assertEquals(actualError, expectedError);
    }

    @Test
    public void verifyThatUserShouldLoginSuccessfullyWithValidCredentials() {
        // click on login link
        // enter email
        // enter password
        // click on login button
        // verify that logout link is displayed
        homepage.clickOnLoginLink();
        String email = "kirtz_777@hotmail.co.uk";
        String password = "123456Test";
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        By logoutLink = By.xpath("//a[contains(text(),'Log out')]");
        Assert.assertTrue(isElementDisplayedlogOut(logoutLink));
    }



    @Test
    public void verifyThatUserShouldLogoutSuccessfully() {
        // click on login link
        // enter email
        // enter password
        // click on login button
        // click on logout link
        // verify that login link is displayed
        homepage.clickOnLoginLink();
        String email = "kirtz_777@hotmail.co.uk";
        String password = "123456test";
        loginPage.enterEmailId(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutButton();
        By logInLink = By.xpath("//a[contains(text(),'Log in')]");
        Assert.assertTrue(isElementDisplayedLogIn(logInLink));
    }

}
