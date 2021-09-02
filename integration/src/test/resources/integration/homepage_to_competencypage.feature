Feature: Viewing the competency page
  Scenario: Employee can click from the homepage to the competency page
    Given as a kainos employee I want to get to the competencies per band page from the home page
    When I click on the bands button
    When I click on the <band> heading
    Then I should be on the competencies page for that band

    Examples:
    |band       |
    |Apprentice |
    |Trainee    |