Feature: Login  and Logout Functionality

  As a user I should login  and Log out successfully

  @Sanity
  Scenario: User should login successfully
    Given I am on Homepage
    And I enter Username "Admin"
    And I enter Password "admin123"
    When I click on Login Button
    Then I should successfully navigate to Admin Page and see message "WelcomeAdmin"


    @Smoke
    Scenario: User should logout successfully
      Given I am on Homepage
      And I enter Username "Admin"
      And I enter Password "admin123"
      And I click on Login Button
      And I should successfully navigate to Admin Page and see message "WelcomeAdmin"
      When I click on Logout Button
      Then I should Logout Successfully and see "LOGIN Panel"