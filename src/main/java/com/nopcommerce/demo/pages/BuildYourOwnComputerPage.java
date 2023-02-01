package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;


public class BuildYourOwnComputerPage extends Utility {

    By buildYourOwnComputerText = By.xpath("//div[@class='page-title']/h1");
    By processorDropDown = By.xpath("//select[@id='product_attribute_1']]");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By hddRadios = By.xpath("//ul[@data-attr='3']");
    By osRadio = By.xpath("//ul[@data-attr='4']");
    By softwareCheckBoxes = By.xpath("//ul[@data-attr='5']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedToCartMessage = By.xpath("//div[@class='bar-notification success']");

    public String verifyBuildYourOwnComputerText(){
        Reporter.log("Build your own computer text displayed: " + this.buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }


    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void selectHDD(String hdd) {
        selectRadioButton(hddRadios, hdd);
    }

    public void selectOS(String os) {
        selectRadioButton(osRadio, os);
    }

    public void selectSoftware(String software) {
        selectCheckBox(softwareCheckBoxes, software);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getProductAddedToCartMessage() {
        return getTextFromElement(productAddedToCartMessage);
    }


}
