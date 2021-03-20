Feature: As a guest user, I want to be able to add an item to cart and checkout without logging into account

  Scenario: As a guest user, I want to be able to add an item to cart and checkout without logging into account Addintional Line

    Given Hover over in "MainPage"
    | DepartmentsButton |
    And User clicks in "SubCategoryPage"
    | Bestsellers|
    And User selects random element from dropdown in "SubCategoryPage"
      |ItemsPerPageSelector|
    And User waits for "1" seconds
    And User selects random element from dropdown in "SubCategoryPage"
      |SortBySelector|
    And User waits for "2" seconds
    And User randomly click on products in "SubCategoryPage"
    |ProductNameContainer|
    And User select randomly size or flavor in "ProductOrderPage"
    |flaworDropdown|
    And User selects random element from dropdown in "ProductOrderPage"
    |Quantity|
    And User waits for "1" seconds
    And User clicks in "ProductOrderPage"
    |AddToCartButton|
    And User waits for "2" seconds
    Then User verifies the product has been added to the cart


  #adding this line for testing git connection, can delete this once done

  