Feature: Login Functionality
    @login
  Scenario: Login with valid username and password

    Given Navigate to web site and verify
    When Enter username and password and click login button
    Then User should login successfully