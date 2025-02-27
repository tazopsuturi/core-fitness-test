Feature: As a user I want to delete product I created

  Scenario: User chooses product which he created and the deletes
    Given Product page is displayed
    When I choose product
    And I click delete product button
    And I click confirm delete product button
    Then product is deleted successfully