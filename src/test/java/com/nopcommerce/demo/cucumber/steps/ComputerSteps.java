package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @When("^I click on the computer link text$")
    public void iClickOnTheComputerLinkText() {
        new ComputerPage().clickOnComputerText();
    }

    @Then("^I should be navigated successfully to the computers page$")
    public void iShouldBeNavigatedSuccessfullyToTheComputersPage() {
        new ComputerPage().getComputerText();
    }

    @Then("^I should be navigated to the desktops page$")
    public void iShouldBeNavigatedToTheDesktopsPage() {
        new ComputerPage().clickOnDesktopLink();
    }
}
