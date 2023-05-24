Feature: Customer orders a product in sauce site

  Scenario: Customer purchasek a dress in Sauce site
    Given Customer launches the page and login to sauce demo page
    When Customer navigates to home page and select the product to purchase
    And Customer visits the cart and checkout the product
    And Cutomer enters the contact information and gets payment info
    Then Customer got an order confirmation message
