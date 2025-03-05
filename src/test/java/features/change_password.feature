Feature: User wants to change password

  Scenario: User changes password
    When I click menu arrow button
    And I click profile button
    Then User goes to Profile page
    When User clicks change password field
    And User enters current password
    And User enters new password
    And User enters confirm password
    And User clicks change password button
#    Then User sees password changed message