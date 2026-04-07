@Reg
Feature: Contoso University Courses page
  As a user
  I validate the content of Contoso University Courses page

Background:
  Given the user is on contoso university home page


  Scenario:1 - Validate Contoso University Courses page
    When I click on "Courses" menu option
    Then I validate contoso university "Courses" page

