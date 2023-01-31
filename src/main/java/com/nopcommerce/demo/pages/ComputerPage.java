package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class ComputerPage extends Utility  {

    By computerText = By.xpath("//h1[contains(text(),\"Computers\")]");

    By desktopLink = By.xpath("//a[contains(text(),\" Desktops \")]") ;

    By noteBookLink = By.xpath("//a[contains(text(),\" Notebooks \")]");

    By softwareLink = By.xpath("//a[contains(text(),\" Software \")]");

    //click on the buttons
    public void clickOnComputerText(){
        Reporter.log("computer text " +computerText.toString());
        clickOnElement(computerText);
    }

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }

    public void clickOnNoteBookText(){
        clickOnElement(noteBookLink);
    }

    public void clickOnSoftwareText(){
        clickOnElement(softwareLink);
    }

}
