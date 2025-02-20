Feature: Create blog post

  Scenario: As a user, I want to create a blog
    Given Login page is displayed
    When I click sign up button
    Then SignUp form is displayed
    When I enter my "username"
    And I fill my "password"
    And I confirm my "password"
    And I click register button
