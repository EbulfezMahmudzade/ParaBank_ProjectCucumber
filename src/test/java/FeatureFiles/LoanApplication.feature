Feature: Request Loan Functionality

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: User Credit Loan
    When User clicks on the loan request link
    Then User applies for loan
    Then User confirms that the loan request has been processed
    Then User validates approval message
    Then User clicks on the credit account number link
    Then Verifies information in user account details
    And User confirms message below account activity