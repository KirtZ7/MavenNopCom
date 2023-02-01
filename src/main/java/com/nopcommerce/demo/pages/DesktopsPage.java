package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class DesktopsPage  extends Utility {

    By desktopsText = By.xpath("//a[contains(text(),\"Desktops\")]");
    By sortBy = By.xpath("//select[@id=\"products-orderby\"]");
    By display = By.xpath("//select[@id=\"products-pagesize\"]");

    By selectProductList = By.xpath("//a[@class=\"viewmode-icon list\"]");

    By buildYourOwnComputerButton = By.xpath("//h2[@class='product-title']/a[text()='Build your own computer']");

    public void clickOnBuildYourOwnComputer(){
        Reporter.log("Clicking on Build your own computer: " + buildYourOwnComputerButton.toString());
        clickOnElement(buildYourOwnComputerButton);
    }


    public String getDesktopsText() {
        Reporter.log("Desktops link was pressed " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }


    public void getSortBy(){
        Reporter.log("Sort by text " + sortBy.toString());
        selectByIndexFromDropDown(sortBy, 2);
    }

    public void getDisplay(){
        Reporter.log("Display by text " + sortBy.toString());
        selectByValueFromDropDown(display,"3");
    }

    public void getSelectProductList(){
        Reporter.log("Product list icons " + selectProductList.toString());
        clickOnElement(selectProductList);
    }

}
