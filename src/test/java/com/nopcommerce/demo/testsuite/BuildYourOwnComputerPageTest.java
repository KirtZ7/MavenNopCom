package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuildYourOwnComputerPageTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    DesktopsPage desktopsPage = new DesktopsPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully() {
        homePage.clickOnComputersMenu();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("2 GB");
        buildYourOwnComputerPage.chooseHDD();
        buildYourOwnComputerPage.chooseOS();
        buildYourOwnComputerPage.chooseSoftware();
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyBuildYourOwnComputerText();
    }

}