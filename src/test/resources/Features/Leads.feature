Feature: Lead functionality
  Background:
    Given user should be on login page
    When  user enters valid Userid
    And   user enters valid password
    And   user click on login button

@lead
    Scenario: Create_lead_with_mandatory_fields_TC03
  When user click on new lead link
  And user enters the last name and company and click on login button
  Then lead should be created successfully




