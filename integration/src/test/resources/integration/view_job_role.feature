Feature: Viewing individual job role

  Scenario: Tests for Kainos employee viewing each job role
    Given as a Kainos employee I want to see each role
    When I select a role
    Then I can view the role page
    And I can click on the sharepoint page