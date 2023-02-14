@regression
Feature: Build my own computer
  As user I want to Build my own computer and add it to card on nop commerce website

  @smoke
  Scenario: I am able to navigate to the build your own computer page
    Given I am on homepage
    When I click on the computer link text
    And I click on Desktops link
    And I click on Build your own computer link
    And I select my processor from the dropdown
    And I select my Ram from the dropdown
    And I click on my HDD space
    And I click on what OS i would like
    And I click on what software i would like to add on
    And I click on add to card button
    Then my computer build should be added to cart