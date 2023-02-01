package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class ComputerPage extends Utility  {

    By computerText = By.xpath("//a[contains(text(),\"Computers\")]");

    By desktopLink = By.xpath("//a[contains(text(),\" Desktops \")]") ;

    By noteBookLink = By.xpath("//a[contains(text(),\" Notebooks \")]");

    By softwareLink = By.xpath("//a[contains(text(),\" Software \")]");

    //click on the buttons
    public void clickOnComputerText(){
        Reporter.log("computer text " + computerText.toString());
        clickOnElement(computerText);
    }


    public String getComputerText() {
        Reporter.log("Computer text shown " + computerText.toString());
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopLink(){
        Reporter.log("Desktop link is pressed " + desktopLink.toString());
        clickOnElement(desktopLink);
        getTextFromElement(desktopLink);
    }

    public String getDesktopsText() {
        return getTextFromElement(desktopLink);
    }

    public void clickOnNoteBookText(){
        Reporter.log("Notebook link ia pressed " +noteBookLink.toString());
        clickOnElement(noteBookLink);
        getTextFromElement(noteBookLink);
    }

    public String getNoteBookText() {
        return getTextFromElement(noteBookLink);
    }

    public void clickOnSoftwareText(){
        Reporter.log("Software button is clicked " + softwareLink.toString());
        clickOnElement(softwareLink);
        getTextFromElement(softwareLink);
    }

    public String softwareText() {
        return getTextFromElement(softwareLink);
    }


}
