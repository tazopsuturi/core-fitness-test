Feature: Add product to cart


  Scenario: As a user, I want to add products to cart
    When I click menu arrow button
    And I click menu arrow button
    And I click product category
    Then products page is displayed
    And I enter product title(ka)
    And I enter product description(en)
    And I enter product description(ka)
    And I enter product price
    And I choose product category
    And I press create product button
    Then Product is created