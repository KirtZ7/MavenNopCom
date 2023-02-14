package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.nopcommerce.demo.utility.Utility;

public class RegisterPage extends Utility {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='radio']")
    WebElement maleFemaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDOB;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDOB;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDOB;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement eMailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerButton;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButtonFinish;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameMsg;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameMsg;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement eMailMsg;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordMsg;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMsg;

    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton;




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
        selectByContainsTextFromDropDown(monthDOB,"April");
    }

    public void selectYearDOB() {
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
        clickOnElement(registerButton);
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

    public void register(String fName, String lName, String email,String pass, String cpass) throws InterruptedException {
        sendTextToElement(firstName,fName);
        Thread.sleep(2000);
        sendTextToElement(lastName,lName);
        Thread.sleep(2000);
        sendTextToElement(eMailField,email);
        Thread.sleep(2000);
        sendTextToElement(passwordField,pass);
        Thread.sleep(2000);
        sendTextToElement(confirmPasswordField,cpass);
        Thread.sleep(2000);
        clickOnElement(registerButton);
    }

}
