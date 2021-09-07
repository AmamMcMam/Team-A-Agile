Feature: Viewing the competency page

  Scenario Outline: Employee can click from the homepage to the competency page
    Given I am on the Home page
    When I click on the bands button
    And I click on the <band> heading
    Then I should be on the competencies page

    Examples:
      | band       |
      | Apprentice |
      | Trainee    |