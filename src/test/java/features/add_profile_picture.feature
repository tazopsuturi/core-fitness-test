Feature: User wants to add profile picture and change password

  Scenario: User changes profile picture and password
    When I click menu arrow button
    And I click profile button
    Then User goes to Profile page
    When User clicks profile picture field
    And User uploads profile picture
    And User clicks change password field
    And User enters current password
    And User enters new password
    And User confirms new password
    And User clicks save button
    Then User goes to Profile page