Feature: Billing information

  Scenario: Billing method
    Given I open Browser
    And I click on same Shipping address
    And I click on credit card
    When I enter the card number
    And I enter security code
    And I enter the expiration of the card
    And I save the card for next time
    And I click on continue
    Then I should be able to complete the transaction