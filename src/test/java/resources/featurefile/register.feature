@regression
Feature: Register Test
  As user I want to register on the nopcommerce website

  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | Kirtan  | Jagdish    | K.jagdish@gmail.com  | test123456 | test123456 |
      | jagdish | kirtan | kjkjkj@gmail.com | tesasdt123456 | tesasdt123456 |
      | Kirtz  | jagdish    | 3d3d3@gmail.com  | 123456 | 123456 |
