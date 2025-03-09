Feature: User wants to delete account

    Scenario: User deletes account
        Given User is logged in
        When User deletes account
        Then User is logged out
        And User is redirected to login page