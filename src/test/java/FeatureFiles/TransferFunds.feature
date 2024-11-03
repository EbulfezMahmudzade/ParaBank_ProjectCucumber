Feature: Transfer money between my accounts

  Background:Register with valid creat account

    Given Navigate to Para Bank
    When Fill out the registration form and click the register button
    Then User should register successfully

  Scenario: Transferring money between my accounts

    Given Click on the Transfer Funds link
    When Select amount and click Transfer button
    Then User should Transfer Funds successfully