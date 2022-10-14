Feature: Search and add to fav functionality

  Scenario: Remove from favorites and verify
    Given Navigate to web site and verify
    When Enter username and password and click login button
    Then User should login successfully

    And Search samsung and click the search button and verify
    When Click on the second page and verify
    Then Add the third product to favorites
    And Click on my favorites link
    And Verify the same product exists
    When Remove product from favorites
    Then Confirm product not found in favorites





