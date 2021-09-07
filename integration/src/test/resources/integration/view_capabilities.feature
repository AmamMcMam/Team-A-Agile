Feature: Viewing capabilities page
  Scenario Outline: Employee can click on a capability and view a number of results
    Given The Kainos employee is on the capabilities page
    Then The client clicks on the <caps> capability
    And capability has <results> jobs

    Examples:
      | caps        | results |
      | Engineering | 3       |
      | Platforms   | 1       |

  Scenario Outline: Employee can click on a capability and view information about the capability lead
    Given The Kainos employee is on the capabilities page
    Then The client clicks on the <caps> capability
    And the capability lead <name>, <photo> and <message> is displayed

    Examples:
      | caps        | name | photo | message |
      | Engineering | Andy Malpass       | https://kainossoftwareltd.sharepoint.com/marketing/Shared%20Documents/Images/Website%20Images/Headshots/Andy-Malpass.jpg | Hi, I'm Andy the Engineering Lead. |
      | Platforms   | Grainne Thumb       | https://kainossoftwareltd.sharepoint.com/marketing/Shared%20Documents/Images/Website%20Images/Headshots/grainne-thumb.jpg | Hello I'm the Platforms Lead. |
