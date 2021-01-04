Feature: User is going to validate login functions in Facebook applications

  Scenario Outline: Validation by using username and password
    Given User is on Facebook application
    When User enters "<username>"
    And User enter "<password">"
    And User enter the login button
    Then User validates login functions

    Examples: 
      | username | password |
      | roja     | jithesh  |
      | jithesh  | sowmiya  |
