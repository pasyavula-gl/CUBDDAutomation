@Reg
Feature: Contoso University About page
  As a user
  I validate the content of Contoso University About page

  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University About page
    When I click on "About" menu option
    Then I validate contoso university "About" page