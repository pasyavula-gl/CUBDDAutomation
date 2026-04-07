@Reg
Feature: Contoso University Students page
  As a user
  I validate the content of Contoso University Students page


  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University Students page
    When I click on "Students" menu option
    Then I validate contoso university "Students" page
