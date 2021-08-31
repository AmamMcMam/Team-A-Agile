Feature: View that capabilities can show results
  Scenario Outline: Employee can click on a capability and view a number of results
    Given The Kainos employee is on the capabilities page
    Then The client clicks on the <caps> capability
    And capability has <results> jobs

    Examples:
      | caps        | results |
      | Engineering | 3       |
      | Platforms   | 1       |
