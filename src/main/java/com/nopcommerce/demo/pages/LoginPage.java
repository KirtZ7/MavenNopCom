package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//a[@class=\"ico-logout\"]")
    WebElement logOutButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMag;

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }

    public String getErrorMessage(){

        return getTextFromElement(errorMag);
    }


}
