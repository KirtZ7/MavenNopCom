package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homepage = new HomePage();
    RegisterPage registerPage= new RegisterPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        Reporter.log("User is on Register Page, Verified 'Register' Text");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.clickOnRegisterButtonFinish();
        String actualFirstNameError = registerPage.getFirstNameErrorMessage();
        String expectedFirstNameError = "First name is required.";
        Assert.assertEquals(actualFirstNameError, expectedFirstNameError);
        Reporter.log("Verified the error message 'First name is required.' ");

        String actualLastNameError = registerPage.getLastNameErrorMessage();
        String expectedLastNameError = "Last name is required.";
        Assert.assertEquals(actualLastNameError, expectedLastNameError);
        Reporter.log("Verified the error message 'Last name is required.' ");

        String actualEmailError = registerPage.getEmailErrorMessage();
        String expectedEmailError = "Email is required.";
        Assert.assertEquals(actualEmailError, expectedEmailError);
        Reporter.log("Verified the error message 'Email is required.' ");

        String actualPasswordError = registerPage.getPasswordErrorMessage();
        String expectedPasswordError = "Password is required.";
        Assert.assertEquals(actualPasswordError, expectedPasswordError);
        Reporter.log("Verified the error message 'Password is required.' ");
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnMaleRadioButton();
        registerPage.enterFirstName("Kirtan");
        registerPage.enterLastName("Jagdish");
        registerPage.selectDayDOB();
        registerPage.selectMonthDOB();
        registerPage.selectYearDOB();
        registerPage.enterEmail("Kirtz_77@hotmail.co.uk");
        registerPage.enterPassword("123456Test");
        registerPage.enterConfirmPassword("123456Test");
        registerPage.clickOnRegisterButtonFinish();
        String actualRegistrationSuccessMessage = registerPage.getRegistrationSuccessMessage();
        String expectedRegistrationSuccessMessage = "Your registration completed";
        Assert.assertEquals(actualRegistrationSuccessMessage, expectedRegistrationSuccessMessage);
        Reporter.log("Verified message 'Your registration completed' ");
    }

}

