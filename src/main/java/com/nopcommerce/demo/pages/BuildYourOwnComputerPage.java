package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import utility.Utility;

import java.util.Collections;


public class BuildYourOwnComputerPage extends Utility {

    By buildYourOwnComputerText = By.xpath("//div[@class='page-title']/h1");
    By processorDropDown = By.xpath("//select[@id='product_attribute_1']]");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By hddRadios = By.xpath("//ul[@data-attr='3']");
    By osRadio = By.xpath("//ul[@data-attr='4']");
    By softwareCheckBoxes = By.xpath("//ul[@data-attr='5']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedToCartMessage = By.xpath("//div[@class='bar-notification success']");

    public void verifyBuildYourOwnComputerText(){
        Reporter.log("Build your own computer text displayed: " + this.buildYourOwnComputerText.toString());
    }

    public void selectProcessor(){
        Reporter.log("Selecting Processor: " + processorDropDown.toString());
        selectByIndexFromDropDown(By.xpath("//select[@id='product_attribute_1']"),1);
    }

    public void selectRam(){
        Reporter.log("Selecting RAM: " + ramDropDown.toString());
        selectByIndexFromDropDown(By.xpath("//select[@id='product_attribute_2']"), 2);

    }

    public void selectHDD(){
        Reporter.log("Selecting HDD: " + hddRadios.toString());
        clickOnElement(By.xpath("//li[@data-attr-value='7']"));
    }


    public void selectOS(){
        Reporter.log("Selecting OS: " + osRadio.toString());
        clickOnElement(By.xpath("//li[@data-attr-value='8']"));
    }

    public void selectSoftware(){
        Reporter.log("Selecting software: " + softwareCheckBoxes.toString());
        clickOnElement(By.xpath("//li[@data-attr-value='12']"));
    }

    public void clickOnAddToCartButton(){
        Reporter.log("Clicking on Add To Cart button: " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void verifyProductAddedToCartMessage(){
        Reporter.log("Product added to cart message displayed: " + productAddedToCartMessage.toString());

    }

}
