Feature: Country Functionality
  As a user, I want to be able to create and update countries
  so that I can update the country list

  Scenario: Create a new country
    Given Navigate to Campus
    And Enter username and password
    And Click on login Button
    And Click on login Button
    And Verify login
    And Navigate to Country page
    And Click on add Button
    And Enter "2e66ir" as country name and "h661" as country code
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete a new country
    Given Navigate to Campus
    And Enter username and password
    And Click on login Button
    And Navigate to Country page
    And Search for "h661" as code
    When Click on Delete and Confirm
    Then Success message should be displayed