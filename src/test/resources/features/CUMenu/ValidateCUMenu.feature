@Reg
Feature: Contoso University application Manus
  As a user
  I want to check all the page titles on Contoso University applications


  Background:
    Given the user is on contoso university home page

  Scenario:1 - Validate Contoso University Menu links
    When I click on "Home" menu option
    Then I should see the "Home" page title

    When I click on "About" menu option
    Then I should see the "About" page title

    When I click on "Students" menu option
    Then I should see the "Students" page title

    When I click on "Courses" menu option
    Then I should see the "Courses" page title

    When I click on "Instructors" menu option
    Then I should see the "Instructors" page title

    When I click on "Departments" menu option
    Then I should see the "Departments" page title


