package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ComputerPageTest extends TestBase {

    HomePage homepage = new HomePage();
    ComputerPage computerPage= new ComputerPage();

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        // click on Computer tab
        computerPage.clickOnComputerText();
        // verify "Computer" text
        String expectedText = "Computers";
        String actualText = computerPage.getComputerText();
        Assert.assertEquals(actualText, expectedText, "Error: User not navigated to Computer page");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // click on Computer tab
        computerPage.clickOnComputerText();
        // click on Desktops link
        computerPage.getComputerText();
        // verify "Desktops" text
        String expectedText = "Desktops";
        String actualText = computerPage.getDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Error: User not navigated to Desktops page");
    }


}
