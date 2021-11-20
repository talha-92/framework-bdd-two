Feature: register info
  #Author: Talha Ansari
  @register
  Scenario: register with valid information
    Given I open Browser
    And I navigate to the register page
    When I enter username
    When I enter firstname
    When I enter lastname
    And I enter password
    And I confirm password
    When I click register
    Then I should be able to register