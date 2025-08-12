Feature:Login
  Background:
    Given user should be on login page

@valid
  Scenario: valid_login_TC01
    When  user enters valid Userid
    And   user enters valid password
    And   user click on login button
    Then  user should be navigated to home page
    And   user can see the logout link on home page

@xyz
  Scenario: invalid_login_TC02
    When  user enters invalid Userid
    And   user enters invalid password
    And   user click on login button
   Then   user should be navigated to login page
    Then  user can see the error massage on login page

@ddd
  Scenario Outline: invalid datadriven
    When  user enters  Userid as "<userid>"
    And   user enters  password as "<password>"
    And   user click on login button
    Then  user should be navigated to login page
    And   user can see the error massage on login page
    Examples:
      | userid  | password |
      | admin12 | pwd2     |
      |         | admin    |
      | admin   |          |
      | admin5  | null     |