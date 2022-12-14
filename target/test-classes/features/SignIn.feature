@TestSignIn

Feature: Sign In Feature

Background: 
Given User is on retail website
When User click on Sign in option

  @Test
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'sameer.temori2100@gmail.com' and password 'Tek@44556'
    And User click on login button
    Then User should be logged in into Account

  @Test2
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                 | password  | confirmPassword |
      | Samir | tek.test123@gmail.com | Test@1234 | Test@1234       |
    And User click on SignUp button
    Then User should be logged into account page
