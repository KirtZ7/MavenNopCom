package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import utility.Utility;

import java.util.NoSuchElementException;

/**
 * Created by Bhavesh
 * Recreated by Kirtan
 */
public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField=By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    By logOutButton = By.xpath("//a[@class=\"ico-logout\"]");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");

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
