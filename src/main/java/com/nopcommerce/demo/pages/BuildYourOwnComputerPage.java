package com.nopcommerce.demo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nopcommerce.demo.utility.Utility;


public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement buildYourOwnComputerText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddRadios;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadio;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareCheckBoxes;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedToCartMessage;


    public void verifyBuildYourOwnComputerText(){
        String actualText = productAddedToCartMessage.getText();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(actualText, expectedText, "The product is not added to the cart");
    }


    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void chooseHDD() {
        clickOnElement(hddRadios);
    }

    public void chooseOS() {
        clickOnElement(osRadio);
    }

    public void chooseSoftware() {
        clickOnElement(softwareCheckBoxes);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getProductAddedToCartMessage() {
        return getTextFromElement(productAddedToCartMessage);
    }


}
