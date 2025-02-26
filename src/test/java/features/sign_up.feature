Feature: Sign Up feature

  Scenario: As a user I want to successfully sign up
    Given Login page is displayed
    When I click sign up button
    Then SignUp form is displayed
    When I fill email field
    And I fill password field
    And I confirm my password
    And I click register button
