Feature: Verifying Login functionality of tutorialninja application

    Scenario: User give valid username and password and logged into the application
    Given User is on LoginPage
    When User enters valid username
    And User enters valid password
    And User click on Login button
    Then User should be on accountpage


 