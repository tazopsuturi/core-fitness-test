Feature: Sign Up feature

  Scenario Outline: As a user, I want to successfully sign up
    Given Login page is displayed
    When I click sign up button
    Then SignUp form is displayed
    When I enter my "<email>"
    And I fill my "<password>"
    And I confirm my "<password>"
    And I click register button

    Examples:
      | email               | password  |
      | tester@example1.com  | Pass12345  |
