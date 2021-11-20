Feature: adding to cart
  @addtocart
  Scenario: Adding item to cart
    Given I open Browser
    And I navigate to login page
    When I enter username a username
    And I enter password the password
    And I click login
    And I click on image
    And I click add to cart
    Then I should be able to view the cart

