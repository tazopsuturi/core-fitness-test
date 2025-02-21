Feature: User wants to create a blog

  Scenario: As a user I want to successfully create a blog
    When I fill email field
    And I fill password field
    And I click login button
    Then Main page is displayed
    When I click menu arrow button
    And I click blog category
    Then blog page is opened
    When I press add blog button
    Then add blog form is displayed
    When I enter blog title(en)
    And I enter blog title(ka)
    And I enter blog description(en)
    And I enter blog description(ka)
    And I choose blog category
    And I click create blog button
    Then blog is created successfully
    When I choose the first blog
    Then blog settings page is opened
    When I click delete blog button
    And I click confirm delete button
    Then blog is deleted successfully
