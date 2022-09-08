Feature: As a user I should be able to add available items in the home page

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario : Products are available in the home page of the inventory
    When I am in the home page
    And I add sauce labs back pack product to the cart
    And I add sauce labs onesie product to the cart
    Then I verify that product auce labs onesie is displayed