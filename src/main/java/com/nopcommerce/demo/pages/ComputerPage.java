package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.nopcommerce.demo.utility.Utility;

public class ComputerPage extends Utility  {
    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),\"Computers\")]")
    WebElement computerText;

    @FindBy(xpath = "//a[contains(text(),\" Desktops \")]")
    WebElement desktopLink;

    @FindBy(xpath = "//a[contains(text(),\" Notebooks \")]")
    WebElement noteBookLink;

    @FindBy(xpath = "//a[contains(text(),\" Software \")]")
    WebElement softwareLink;


    //click on the buttons
    public void clickOnComputerText(){
        clickOnElement(computerText);
    }


    public String getComputerText() {
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }

    public String getDesktopsText() {
        return getTextFromElement(desktopLink);
    }

    public void clickOnNoteBookText(){
        clickOnElement(noteBookLink);
    }

    public String getNoteBookText() {
        return getTextFromElement(noteBookLink);
    }

    public void clickOnSoftwareText(){
        clickOnElement(softwareLink);
    }

    public String softwareText() {
        return getTextFromElement(softwareLink);
    }


}
