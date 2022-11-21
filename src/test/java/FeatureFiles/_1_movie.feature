Feature: The Circus Movie Functionality

  Scenario: Movie check

    Given Navigate to website
    And Click the Menu button
    When Click the Oscars button under the Award & Events"heading.
    Then Under the Event History heading, the value 1929 is selected.

    And The Circus (Charles Chaplin) is selected under the Honorary Award
    And Save the Director Writer and Stars
    And Click on the imdb button at the top left of the screen
    And Type The Circus in the search bar.
    And Click the result
    And Compares Director Writer and Stars values
    When Click on See all photos link
    Then Validate the visibility of all photos


