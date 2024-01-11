Feature: Login with valid Credentials

  Scenario: Successful Login with valid credentials
    Given User Launch Browser
    And opens URL "https://www.pinterest.com/"
    When User click on Login
    And User enters email as "mailatp.pallavi@gmail.com" and password as "Pallavi@123"
    And click on Login button
    Then User navigates to Home Page
