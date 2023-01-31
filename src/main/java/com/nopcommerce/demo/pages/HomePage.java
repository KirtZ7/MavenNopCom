package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

/**
 * Created by Bhavesh
 * recreated by Kirtan
 */

//setting up all the paths and methods
public class HomePage extends Utility {

    // all menu buttons
    By computersMenu = By.linkText("Computers ") ;
    By electronicsMenu = By.linkText("Electronics ") ;
    By apparelMenu = By.linkText("Apparel ") ;
    By digitalDownloadsMenu = By.linkText("Digital downloads ") ;
    By books = By.linkText("Books ") ;
    By jewelryMenu = By.linkText("Jewelry ") ;
    By giftCardsMenu = By.linkText("Gift Cards ") ;

    By myAccountLink = By.xpath("//a[@class=\"ico-account\"]");

    By logOut = By.xpath("//a[@class=\"ico-logout\"]");

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnComputersMenu() {
        Reporter.log("Clicking on computers menu " + computersMenu.toString());
        clickOnElement(computersMenu);
    }

    public void clickOnElectronicsMenu() {
        Reporter.log("Clicking on electronics menu " + electronicsMenu.toString());
        clickOnElement(electronicsMenu);
    }

    public void clickOnApparelMenu() {
        Reporter.log("Clicking on apparel menu " + apparelMenu.toString());
        clickOnElement(apparelMenu);
    }

    public void clickOnDigitalDownloadsMenu() {
        Reporter.log("Clicking on digital downloads menu " + digitalDownloadsMenu.toString());
        clickOnElement(digitalDownloadsMenu);
    }

    public void clickOnBooks() {
        Reporter.log("Clicking on books " + books.toString());
        clickOnElement(books);
    }

    public void clickOnJewelryMenu() {
        Reporter.log("Clicking on jewelry menu " + jewelryMenu.toString());
        clickOnElement(jewelryMenu);
    }

    public void clickOnGiftCardsMenu() {
        Reporter.log("Clicking on gift cards menu " + giftCardsMenu.toString());
        clickOnElement(giftCardsMenu);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Clicking on my account link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        Reporter.log("Clicking on log out link " + logOut.toString());
        clickOnElement(logOut);
    }


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link "+ registerLink.toString());
        clickOnElement(registerLink);
    }

}
