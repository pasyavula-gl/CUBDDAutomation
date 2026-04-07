@Reg
Feature: Contoso University Departments page
  As a user
  I validate the content of Contoso University Departments page


  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University Departments page
    When I click on "Departments" menu option
    Then I validate contoso university "Departments" page
