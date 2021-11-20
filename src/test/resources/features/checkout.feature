Feature: checkout item

  Scenario: check out item
    Given I open Browser
    When I click on checkout
    And I enter full name
    And I enter address
    And I enter address part two
    And I input the city
    And I enter the state
    And I enter phone
    And I selected shipping method
    Then I should continue

