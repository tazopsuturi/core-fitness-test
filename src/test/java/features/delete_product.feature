Feature: As a user I want to delete product I created

  Scenario: User chooses product which he created and the deletes
    When I click menu arrow button
    And I click product category
    Then User goes to Product page
    When I choose product
    Then Delete Product page is displayed
    And I click delete product button
    And I click confirm delete product button
    Then User goes to Product page