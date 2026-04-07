@Reg
Feature: Contoso University Instructors page
  As a user
  I validate the content of Contoso University Instructors page


  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University Instructors page
    When I click on "Instructors" menu option
    Then I validate contoso university "Instructors" page