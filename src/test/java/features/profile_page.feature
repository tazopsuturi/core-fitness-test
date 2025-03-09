Feature: User goes to profile page and subscribes

  Scenario: User goes to profile page
    When I click menu arrow button
    And I click profile button
    Then User goes to Profile page
    When User fills display name
    And User clicks update button
    Then Display name is updated
    When I click subscribe button
    Then User goes to subscription page