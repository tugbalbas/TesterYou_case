@SmokeTest
Feature: The Circus Movie Functionality

  Scenario: Movie_2 check

    Given Navigate to website
    And Click the Menu button
    When Click the Oscars button under the Award & Events"heading.
    Then Under the Event History heading, the value 1929 is selected.

    And The Jazz Singer is selected under the Honorary Award
    And Save the The Jazz Singer movie's Director Writer and Stars
    And Click on the imdb button at the top left of the screen
    And Type The Jazz Singer in the search bar
    And Click the first result
    And Compares The Jazz Singer movie's Director Writer and Stars values
    When Click on The Jazz Singer movie's See all photos link
    Then Verify the visibility of all photos


