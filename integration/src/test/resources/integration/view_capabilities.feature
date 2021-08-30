Feature: View Capability a role belongs to
  Scenario Outline: want to be able to see what capability each role falls within
    Given The Kainos employee is on the capabilities page
    Then The client clicks on the <caps> capability
    And capability has <results> jobs

    Examples:
      | caps         | results |
      | Engineering | 3       |
      | Platforms   | 1       |