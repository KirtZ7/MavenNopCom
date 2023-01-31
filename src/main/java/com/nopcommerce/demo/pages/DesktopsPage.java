package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class DesktopsPage  extends Utility {

    By desktopsText = By.xpath("//a[contains(text(),\"Desktops\")]");
    By sortBy = By.xpath("//select[@id=\"products-orderby\"]");
    By display = By.xpath("//select[@id=\"products-pagesize\"]");

    By selectProductList = By.xpath("//a[@class=\"viewmode-icon list\"]");

    public void getDesktopsText() {
        Reporter.log("Desktops link was pressed " + desktopsText.toString());
        getTextFromElement(desktopsText);
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
        Reporter.log("Product list icons ");
        clickOnElement(selectProductList);
    }

}
