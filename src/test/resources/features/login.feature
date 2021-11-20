Feature: login feature
#Author Talha Ansari
  @login
  Scenario: login with valid credentials

    Given I open Browser
    And I navigate to the login page
    When I enter username as "joy123@gmail.com"
    And I enter password as "joy123"
    Then I should see the customer welcome page