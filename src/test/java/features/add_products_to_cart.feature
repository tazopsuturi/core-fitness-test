Feature: User wants to add multiple products to cart and then check it

  Scenario: User adds products to cart and checks
    When I click menu arrow button
    And I click product category
    Then User goes to Product page
    When I click add to cart button
#    Then Product is added to cart
#    When I click right arrow button
#    And I click view cart button
#    Then I check the products in the cart and total price