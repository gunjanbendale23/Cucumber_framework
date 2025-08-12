Feature: Leads functionality



  @lead2
  Scenario: Create_Lead_with mandatory_fields
    Given user should be on login page
    When  user enters valid Userid
    And   user enters valid password
    And   user click on login button

    And user click on new lead and enters the lastname and company and click on login button
      |lname | comp |
      |modi  | bjp  |
      |gandhi| Congress|
      |Sinde | SS      |
      |Pawar | NCP     |
    Then click logout
