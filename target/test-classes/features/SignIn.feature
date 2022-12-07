Feature: Sign In Feature

  @Test
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'sameer.temori2100@gmail.com' and password 'Sameer.l.p2100'
    And User click on login button
    Then User should be logged in into Account

  @Test2
  Scenario: Verify user can create an account into Retail Website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                       | password  | confirmPassword |
      | Samir | sameer.temori1221@gmail.com | Test@1234 | Test@1234       |
    And User click on SignUp button
    Then User should be logged into account page