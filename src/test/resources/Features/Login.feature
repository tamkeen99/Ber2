Feature: Login fuctionality

  Scenario Outline: verifying login functionality with valid credentials
    Given Opening the browser
    And user is on login page
    When user enters <username> and <password>
    And click on log in button
    Then user navigate to home page
    And Close the browser

    Examples:
    | username | password |
    | student | Password123 |
    | student | Password12 |
    | student | Password125 |
    | student | Password128 |
    
    