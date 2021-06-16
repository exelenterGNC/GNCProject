Feature: User cart with less than $49

  Scenario: User is charged shipping fee

    Given user is on "MainPage" and clicks on
      | DepartmentsMenuLink |
    And user hovers on the "MainPage" over the
      | preWorkoutSupplementsLink |
    And user selects a product from the list in "PreWorkoutSupplementsPage"
      | unbreakablePerformanceProduct |
