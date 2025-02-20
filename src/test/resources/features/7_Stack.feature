@Order7
Feature: Stack Module

Scenario: Verify that the user is able to navigate to the home page    
  	Given User is in the ds-algo launch page
    When User clicks the Get Started button in the launch page
    Then User should be able to navigate to the home page

Scenario Outline: Verify user enters username and password for SignIn 
  Given The user clicks the Sign In link from the portal
  When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
  Then The user is in Home Page
  
Examples: 
      |Sheetname |RowNumber |
      |Login | 5|
      
Scenario: Verify that the user is able to click on Get Started button under Stack section
  When User clicks on the Get Started button under Stack section
  Then User is navigated to Stack page

Scenario: Verify that the Operations in Stack link is enabled in the Stack page
  Given The user is in the Stack page after Sign-In
  When The user checks whether the Operations in Stack link is enabled
  Then The user should be able to see Operations in Stack link enabled in the Stack page
  
  Scenario: Verify that the Implementation link is enabled in the Stack page
  Given The user is in the Stack page after Sign-In
  When The user checks whether the Implementation link is enabled
  Then The user should be able to see Implementation link enabled in the Stack page
  
  Scenario: Verify that the Applications link is enabled in the Stack page
  Given The user is in the Stack page after Sign-In
  When The user checks whether the Applications link is enabled
  Then The user should be able to see Applications link enabled in the Stack page
  
  Scenario: Verify that the user is able to navigate to Operations in Stack page
  When The user clicks Operations in Stack link in the Stack page
  Then The user should be able to navigate to Operations in Stack page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Operations in Stack page
  Given The user is in the Operations in Stack page
  When The user clicks Try Here >>> button in the Operations in Stack page
  Then The user should be able to navigate to Stack Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Operations in Stack page
  Given The user is in the Try Editor page for the Operations in Stack page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Operations in Stack page
  Then The user should be able to get an output in the Try Editor screen for the Operations in Stack page

Examples:
	|Sheetname	|RowNumber	|
	|TryEditor	|1	|
	|TryEditor	|2	|
  |TryEditor  |3  |
 Scenario: Verify that the user is able to navigate to Implementation page
  When The user clicks Implementation link in the Stack page
  Then The user should be able to navigate to Implementation page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Implementation page
  Given The user is in the Implementation page
  When The user clicks Try Here >>> button in the Implementation page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Implementation page
  Given The user is in the Try Editor page for the Implementation page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation page
  Then The user should be able to get an output in the Try Editor screen for the Implementation page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3| 
  
  
   Scenario: Verify that the user is able to navigate to Applications page
  When The user clicks Applications link in the Stack page
  Then The user should be able to navigate to Applications page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Applications page
  Given The user is in the Applications page
  When The user clicks Try Here >>> button in the Applications page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Applications page
  Given The user is in the Try Editor page for the Applications page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Applications page
  Then The user should be able to get an output in the Try Editor screen for the Applications page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
 Scenario: Verify that user is able to navigate to Practice Questions for operations in stack Page 
    When The User clicks Practice questions link
    Then The user should be redirected to Practice page
    
 Scenario: Verify that user is able to sign out successfully
    Given The user is in the Home page after Sign In
    When The user clicks Sign Out
    Then The user should be redirected to home page with message "Logged out successfully"