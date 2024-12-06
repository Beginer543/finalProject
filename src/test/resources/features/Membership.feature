Feature: Search Employees

  Background:
    When user enters admin username and admin password
    And user clicks on login button
    Then user is navigated to dashbaord page
    When user clicks on PIM option
    And user clicks on employee list option

  @membership  @regression
  Scenario: Search employee and add membership details
    And user enters employee ID
    When user clicks on search button
    Then user is able to see searched employee on screen
    When user click on id number employee open personal details
    Then user click on membership and navigate Assigned Memberships
    And user click on add button
    Then user select membership
    Then user select Membership Subscription paid by
    And user enter Subscription Amount
    Then user select Currency
    Then user enters Subscription Commence and Renewal Dates
    And user clicks on Save button
