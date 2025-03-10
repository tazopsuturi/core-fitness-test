Feature: User wants to delete account

  Scenario: User deletes account
    When I click menu arrow button
    And I click profile button
    Then User goes to Profile page
    When User presses delete account button
    When User confirms deletion
    Then User account is deleted