Feature: Hesap Functionality

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button
    Then User should login successfully
  Scenario: Update Contact Info

    When Navigate to Update Contact Info
    Then User should update Contact Info
    And User should be displayed success message


    Scenario: Missing Information
      When Navigate to Update Contact Info
      Then User information must be entered incompletely
      And User displayed missing info message
