Feature: Wikipedia search and navigation

  Scenario: User should be able to search and navigate Wikipedia
    Given the user opens Wikipedia homepage
    When the user searches for "Python (programming language)"
    And the user clicks the search button
    And the user clicks the first search result
    And the user navigates to the "History" section
    Then the page should display "History"
