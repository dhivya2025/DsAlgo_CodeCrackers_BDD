Feature: Queue Module

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
      
Scenario: Verify that the user is able to click on Get Started button under Queue section
  When User clicks on the Get Started button under Queue section
  Then User is navigated to Queue page

Scenario: Verify that the Implementation of Queue in Python link is enabled in the Queue page
  Given The user is in the Queue page after Sign-In
  When The user checks whether the Implementation of Queue in Python link is enabled
  Then The user should be able to see Implementation of Queue in Python link enabled in the Queue page
  
  Scenario: Verify that the Implementation using collections.deque link is enabled in the Queue page
  Given The user is in the Queue page after Sign-In
  When The user checks whether the Implementation using collections.deque link is enabled
  Then The user should be able to see Implementation using collections.deque link enabled in the Queue page
  
  Scenario: Verify that the Implementation using Array link is enabled in the Queue page
  Given The user is in the Queue page after Sign-In
  When The user checks whether the Implementation using Array link is enabled
  Then The user should be able to see Implementation using Array link enabled in the Queue page
  
  Scenario: Verify that the Queue Operations link is enabled in the Queue page
  Given The user is in the Queue page after Sign-In
  When The user checks whether the Queue Operations link is enabled
  Then The user should be able to see Queue Operations link enabled in the Queue page
  
  Scenario: Verify that the user is able to navigate to Implementation of Queue in Python page
  When The user clicks Implementation of Queue in Python link in the Queue page
  Then The user should be able to navigate to Implementation of Queue in Python page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Implementation of Queue in Python page
  Given The user is in the Implementation of Queue in Python page
  When The user clicks Try Here >>> button in the Implementation of Queue in Python page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Implementation of Queue in Python page
  Given The user is in the Try Editor page for the Implementation of Queue in Python page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation of Queue in Python page
  Then The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
  Scenario: Verify that the user is able to navigate to Implementation using collections.deque in Python page
  When The user clicks Implementation using collections.deque link in the Queue page
  Then The user should be able to navigate to Implementation using collections.deque page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Implementation using collections.deque page
  Given The user is in the Implementation using collections.deque page
  When The user clicks Try Here >>> button in the Implementation using collections.deque page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Implementation using collections.deque page
  Given The user is in the Try Editor page for the Implementation using collections.deque page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation using collections.deque page
  Then The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
   Scenario: Verify that the user is able to navigate to Implementation using Array page
  When The user clicks Implementation using Array link in the Queue page
  Then The user should be able to navigate to Implementation using Array page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Implementation using Array page
  Given The user is in the Implementation using Array page
  When The user clicks Try Here >>> button in the Implementation using Array page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Implementation using Array page
  Given The user is in the Try Editor page for the Implementation using Array page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation using Array page
  Then The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
   Scenario: Verify that the user is able to navigate to Queue Operations page
  When The user clicks Queue Operations link in the Queue page
  Then The user should be able to navigate to Queue Operations page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Queue Operations page
  Given The user is in the Queue Operations page
  When The user clicks Try Here >>> button in the Queue Operations page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Queue Operations page
  Given The user is in the Try Editor page for the Queue Operations page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Queue Operations page
  Then The user should be able to get an output in the Try Editor screen for the Implementation of Queue in Python page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
   Scenario: Verify that user is able to navigate to Practice Questions for operations in Queue Page 
   When The User clicks Practice questions link in Queue page
   Then The user should be redirected to Practice page of Queue



 

 