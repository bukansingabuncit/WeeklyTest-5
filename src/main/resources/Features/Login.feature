Feature: Login Positive
  Scenario: User input username and password
    Given User access the link saucedemo com
    When Display the login page
    And Enter a valid username and password
    And Click the login button
    Then User successful login redirect products page display

  Scenario: User input username and password
    Given User access the link saucedemo com
    When Login with valid account
    And Click the list button in the top left corner
    And Click the logout menu
    Then Displays the login page or start page


  Scenario: Login with an invalid account and present a message/alert
    Given User access the link saucedemo com
    When Display the login page
    And Input invalid username and password
    And Click the login button
    Then Login fails and displays the message username and password are invalid


  Scenario: Login without input username and password
    Given User access the link saucedemo com
    When Display the login page
    And Click the login button
    Then Login fail and displays the message Username is required


  Scenario: Log out without agreeing to confirm the password change suggestion
    Given User access the link saucedemo com
    When Login with valid account
    And Click the list button in the top left corner
    Then The site or page does not respond


  Scenario: Log out when the device is not connected to the internet network
    Given User access the link saucedemo com
    When Login with valid account
    And Disconnect the internet network
    And Click the list button in the top left corner
    And Click register logout
    Then The page displays a notification No internet


