@regression
Feature: Login Test
  As user I want to navigate to the computers page

  @computer
  Scenario: User should navigate to computer page successfully
    Given I click on the computer link text
    Then I should be navigated successfully to the computers page

  @computer
  Scenario: User should navigate to the desktop page successfully
    Given I click on the computer link text
    When I should be navigated successfully to the computers page
    Then I should be navigated to the desktops page