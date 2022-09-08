Feature: As a user I should be able to see all the available items in the home page according to the current filter

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario : Products are available in the home
    When I am in the home page
    And I click on the filter icon
    And I click on the filter Price low to high
    Then I verify that product is displayed
