Feature: Country Functionality
  As a user, I want to be able to create and update countries
  so that I can update the country list

  Background: bac
    Given Navigate to Campus
    And Enter username and password
    And Click on login Button

  Scenario: Create a new country
    And I change the title
    And I click on update
    And I click on home
    And Verify change

#  Scenario: Delete a new country
#    And Navigate to Country page
#    And Search for "h661" as code
#    When Click on Delete and Confirm
#    Then Success message should be displayed

    # Exploring API Testing with Postman: Get List of Users