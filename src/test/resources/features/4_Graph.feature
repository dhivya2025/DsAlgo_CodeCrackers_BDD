@Order4
Feature: Graph Module

Scenario Outline: Verify user enters username and password for SignIn
  Given The user clicks the Sign In link from the portal
  When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
  Then The user is in Home Page
Examples:
      |Sheetname |RowNumber |
      |Login | 5|

Scenario: Verify that the user is able to click on Get Started button under Graph section
Given User is on the Home page of dsalgo portal for testing Graph module
When User clicks on Get Started button under Graph section
Then User is navigated to Graph home page

@Graph

Scenario: Verify that Graph link is enabled
Given User is on Graph home page
When User checks if Graph link is enabled
Then Graph link should be enabled

Scenario: Verify that the user is able to navigate to Graph page
Given User is on Graph page
When User clicks on Graph link
Then User is navigated to Graph page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Graph page
When User clicks on Try here>>> button of Graph page
Then User is navigated to tryEditor page of Graph page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Graph page
  Given The user is in the Try Editor page for the Graph page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Graph page
  Then The user should be able to get an output in the Try Editor screen for the Graph page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Graph page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Graph page
  When The user clicks <- in the Try Editor screen of Graph page
  Then The user should be able to navigate to Graph page
      
@GraphRepresentations

Scenario: Verify that Graph Representations link is enabled
Given User is on Graph Representations page
When User checks if Graph Representations link is enabled
Then Graph Representations link should be enabled

Scenario: Verify that the user is able to navigate to Graph Representations page
Given User is on Graph Representations page
When User clicks on Graph Representations link
Then User is navigated to Graph Representations page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Graph Representations page
When User clicks on Try here>>> button of Graph Representations page
Then User is navigated to tryEditor page of Graph Representations page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Graph Representations page
  Given The user is in the Try Editor page for the Graph Representations page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Graph Representations page
  Then The user should be able to get an output in the Try Editor screen for the Graph Representations page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Graph Representations page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Graph Representations page
  When The user clicks <- in the Try Editor screen of Graph Representations page
  Then The user should be able to navigate to Graph Representations page
  
@PracticeQuestions
   
Scenario: Verify that the user is redirected to Practice Questions page of Graph module
Given User is on Graph Representations page
When User clicks on Practice Questions link of Graph module
Then User is navigated to Practice Questions page of Graph module

Scenario: Verify that user is able to sign out successfully
Given The user is in the Home page after Sign In
When The user clicks Sign Out
Then The user should be redirected to home page with message "Logged out successfully"