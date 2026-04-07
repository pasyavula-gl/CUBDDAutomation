@Reg
Feature: Contoso University Contact page
  As a user
  I validate the content of Contoso University Contact page

  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University Contact page
    When I click on "Contact" menu option
    Then I validate contoso university "Contact" page