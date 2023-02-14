package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Bhavesh
 * recreated by Kirtan
 */

//setting up all the paths and methods
public class HomePage extends Utility {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    // all menu buttons

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computersMenu;
    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsMenu;
    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelMenu;
    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsMenu;

    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement books;

    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewelryMenu;

    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement giftCardsMenu;


    @FindBy (xpath = "//a[@class=\"ico-account\"]")
            WebElement myAccountLink;

    @FindBy(xpath = "//a[@class=\\\"ico-logout\\\"]")
    WebElement logOut;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    public void clickOnComputersMenu() {
        clickOnElement(computersMenu);
    }

    public void clickOnElectronicsMenu() {
        clickOnElement(electronicsMenu);
    }

    public void clickOnApparelMenu() {
        clickOnElement(apparelMenu);
    }

    public void clickOnDigitalDownloadsMenu() {
        clickOnElement(digitalDownloadsMenu);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }

    public void clickOnJewelryMenu() {
        clickOnElement(jewelryMenu);
    }

    public void clickOnGiftCardsMenu() {
        clickOnElement(giftCardsMenu);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        clickOnElement(logOut);
    }


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}
