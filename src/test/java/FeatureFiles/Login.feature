
  Feature: Login Functionality

    Scenario: Login with valid username and password

      Given Navigate to Para Bank
      When Enter username and password and click login button
      Then User should login successfully

    Scenario Outline: Login with invalid username and password

      Given Navigate to Para Bank
      When Enter invalid username as "<userName>" and invalid password as "<password>" and click login button
      Then User should Failed login
      Examples:
        | userName   | password    |
        |             |invalidPass  |
        |invalisName  |             |
        |             |             |
        | invalisName | invalidPass |

