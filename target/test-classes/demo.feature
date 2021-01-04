Feature: User is going to fetch and book the product

  Scenario Outline: User is going to purchase the product
    Given Open the url link of demoblaze application
    When User going to click the product
    And User giving add to cart product and click alert
    And User go to the cart page
    And User going to place order by "<name>" , "<country>" , "<city>" , "<credit card>" , "<month>" , "<year>"

    Examples: 
      | name    | country | city    | credit card      | month | year |
      | sowmiya | India   | Chennai | 1234567812345678 |  2022 |      |
