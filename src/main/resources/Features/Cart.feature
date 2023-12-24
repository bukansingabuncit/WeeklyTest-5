Feature: Add to Cart and Checkout
  Scenario: Adding Items to Cart
    Given User access the link saucedemo com
    When Product page display
    And Select 2 items to check out
    And Click the cart image in the top right corner
    Then Displays your cart page with added items


  Scenario: Check Out from Cart
    When Display on your cart page
    And Click the checkout button
    And Complete the personal data information form
    And Click the Continue button
    And Click the finish button
    Then Displays page complete thank you for your order