package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),\"Register\")]");

    By maleFemaleRadio = By.xpath("//input[@type='radio']");

    By firstName = By.xpath("//input[@id='FirstName']");

    By lastName = By.xpath("//input[@id='LastName']");

    By dayDOB = By.xpath("//select[@name='DateOfBirthDay']");

    By monthDOB = By.xpath("//select[@name='DateOfBirthMonth']");

    By yearDOB = By.xpath("//select[@name='DateOfBirthYear']");

    By eMailField = By.xpath("//input[@id='Email']");

    By passwordField = By.xpath("//input[@id='Password']");

    By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");

    By registerButton = By.xpath("//a[@class='ico-register']");

    By registerButtonFinish = By.xpath("//button[@id='register-button']");

    By firstNameMsg = By.xpath("//span[@id='FirstName-error']");

    By lastNameMsg = By.xpath("//span[@id='LastName-error']");

    By eMailMsg = By.xpath("//span[@id='Email-error']");

    By passwordMsg = By.xpath("//span[@id='Password-error']");

    By registrationMsg = By.xpath("//div[@class='result']");

    By continueButton = By.xpath("//a[@class='button-1 register-continue-button']");


    public void checkOnRegisterPage(){
        waitUntilVisibilityOfElementLocated(registerText,5);
        Reporter.log("On the register page " + registerButton.toString());
    }

    public void clickOnMaleRadioButton() {
        clickOnElement(maleFemaleRadio);
    }

    public void enterFirstName(String Kirtan) {
        sendTextToElement(firstName,Kirtan);
    }

    public void enterLastName(String Jagdish) {
        sendTextToElement(lastName,Jagdish);
    }


    public void selectDayDOB() {
        Reporter.log("Choose Day " + dayDOB.toString());
        selectByContainsTextFromDropDown(dayDOB,"20");
    }

    public void selectMonthDOB() {
        Reporter.log("Choose Day " + monthDOB.toString());
        selectByContainsTextFromDropDown(monthDOB,"April");
    }

    public void selectYearDOB() {
        Reporter.log("Choose Day " + yearDOB.toString());
        selectByContainsTextFromDropDown(yearDOB,"2000");
    }

    public void enterEmail(String email) {
        sendTextToElement(eMailField,email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField,password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(confirmPasswordField,password);
    }

    public void clickOnRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public String getFirstNameErrorMessage() {
        return getTextFromElement(firstNameMsg);
    }

    public String getLastNameErrorMessage() {
        return getTextFromElement(lastNameMsg);
    }

    public String getEmailErrorMessage() {
        return getTextFromElement(eMailMsg);
    }

    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordMsg);
    }

    public String getRegistrationSuccessMessage() {
        Reporter.log("Click on continue button " + registrationMsg.toString());
        return getTextFromElement(registrationMsg);
    }

    public void clickOnContinueButton(){
        Reporter.log("Click on continue button " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnRegisterButtonFinish(){
        Reporter.log("Clicked on REGISTER button on page " + registerButtonFinish.toString());
        clickOnElement(registerButtonFinish);
    }

}
