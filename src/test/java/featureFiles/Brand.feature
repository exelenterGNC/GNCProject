Feature: Brand Feature

  Scenario: As a user when I navigate to the brands I have to be able to see 10 brand svg images
    Given  Hover over in "MainPage"
      | BrandsButton |
    And User clicks in "BrandPage"
      | ViewAllBrandsButton|
    Then Verify the count of images equals to 10
    And  Verify the images are in SVG format
    And Verify images have the link