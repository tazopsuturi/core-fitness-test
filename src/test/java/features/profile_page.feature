Feature: User goes to profile page and subscribes

  Scenario: User goes to profile page
    When I click menu arrow button
    And I click profile button
    Then User goes to Profile page
    When I click subscribe button
    Then User is subscribed
    When I click unsubscribe button
    Then User is unsubscribed