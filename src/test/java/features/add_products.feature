Feature: Create product

  Scenario: As a user, I want to add products to cart
    When I click menu arrow button
    And I click product category
    Then User goes to Product page
    When I click add product button
    And I enter product title(en)
    And I enter product title(ka)
    And I enter product description(en)
    And I enter product description(ka)
    And I enter product price
    And I choose product category
    And I choose file1
    And I choose file2
    And I press create product button
    Then Product is created