package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildYourOwnComputerPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    DesktopsPage desktopsPage = new DesktopsPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully() {
        homePage.clickOnComputersMenu();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectProcessor("");
        buildYourOwnComputerPage.selectRam("2 GB");
        buildYourOwnComputerPage.selectHDD("320 GB");
        buildYourOwnComputerPage.selectOS("Vista Premium [+$60.00]");
        buildYourOwnComputerPage.selectSoftware("Acrobat Reader [+$10.00]");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        String actualText = buildYourOwnComputerPage.verifyBuildYourOwnComputerText();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(actualText, expectedText, "The product is not added to the cart");
    }

}