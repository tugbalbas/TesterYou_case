@SmokeTest
Feature: Search and add to fav functionality

  Scenario: Search and add to fav

    Given Navigate to web site and verify
    When Enter username and password and click login button
    Then User should login successfully

    And Search samsung and click the search button and verify
    When Click on the second page and verify
    Then Add the third product to favorites

