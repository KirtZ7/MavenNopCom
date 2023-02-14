package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.nopcommerce.demo.utility.Utility;

public class DesktopsPage  extends Utility {
    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),\"Desktops\")]")
    WebElement desktopsText;

    @FindBy(xpath = "//select[@id=\"products-orderby\"]")
    WebElement sortBy;

    @FindBy(xpath = "//select[@id=\"products-pagesize\"]")
    WebElement display;

    @FindBy(xpath = "//a[@class=\"viewmode-icon list\"]")
    WebElement selectProductList;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerButton;


    public void clickOnBuildYourOwnComputer(){
        clickOnElement((WebElement) buildYourOwnComputerButton);
    }


    public String getDesktopsText() {
        return getTextFromElement(desktopsText);
    }


    public void getSortBy(){
        selectByIndexFromDropDown(sortBy, 2);
    }

    public void getDisplay(){
        selectByValueFromDropDown(display,"3");
    }

    public void getSelectProductList(){
        clickOnElement((WebElement) selectProductList);
    }

}
