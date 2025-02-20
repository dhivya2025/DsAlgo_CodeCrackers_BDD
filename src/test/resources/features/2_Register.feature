@Order2
Feature: Register Page

  Scenario: Verify that the user is able to navigate to the home page
    Given User is in the ds-algo launch page
    When User clicks the Get Started button in the launch page
    Then User should be able to navigate to the home page

  Scenario: Verify that User is able to launch ds-algo portal
    Given User is in the home page after launching ds-algo portal page
    When User clicks Register link in the home page
    Then User should be able to navigate to Register page

  Scenario Outline: Verify that the user is able to enter username in the username field
    Given User is in the Register page after clicking Register link in the home page
    When User wants to enter data from excel sheet '<Sheetname>' and <RowNumber> for the username field
    Then User should be able to enter username after clicking Register button in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         1 |
      | Register  |         2 |
      | Register  |         3 |
      | Register  |         4 |

  Scenario Outline: Verify that the user is able to get an error message when username (with special characters other than @) in the username field in the Register page is entered
    Given User is in the Register page after clicking Register link in the home page
    When User enters invalid data from excel sheet '<Sheetname>' and <RowNumber> for the username field
    Then User should be able to get error message for username in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         5 |
      | Register  |         6 |

  Scenario Outline: Verify that the user is able to enter password in the field
    Given User is in the Register page after clicking Register link in the home page
    When User wants to enter data from excel sheet '<Sheetname>' and <RowNumber> for the password field
    Then User should be able to enter password after clicking Register button in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         7 |
      | Register  |         8 |
      | Register  |         9 |
      | Register  |        10 |

  Scenario Outline: Verify that the user is able to get an error message
    Given User is in the Register page after clicking Register link in the home page
    When User enters invalid data from excel sheet '<Sheetname>' and <RowNumber> for the password field
    Then User should be able to get an error message for password in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |        11 |
      | Register  |        12 |
      | Register  |        13 |

  Scenario Outline: Verify that the user is able to get a pop-up message when username, password and password confirmation field are left blank
    When The user enters data from excel sheet '<Sheetname>' and <RowNumber> for all the fields to be left blank
    Then The user should be able to get this pop-up message in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |        14 |
      | Register  |        15 |
      | Register  |        16 |

  Scenario Outline: Verify that the user is able to naviagte to home page with the message
    Given User is in the Register page to enter username, password and password confirmation
    When User enters data from excel sheet '<Sheetname>' and <RowNumber> for all the fields and click RegisterButton
    Then User should be able to naviagte to home page and get the success message

    Examples: 
      | Sheetname | RowNumber |
      | Register  |        17 |