Feature: Hesap Functionality

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Checking Testing their account data.

    Given Click on the Element in leftNav
    When  select account checking
    Then Success message should be displayed

  Scenario:  savings Testing their account data.

    Given Click on the Element in leftNav
    When  select account savings
    Then Success message should be displayed


