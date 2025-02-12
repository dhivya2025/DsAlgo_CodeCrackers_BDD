Feature: Linked List Functionality

  Scenario Outline: Verify user enters username and password for SignIn 
  Given The user clicks the Sign In link from the portal
  When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
  Then The user is in Home Page
  
Examples: 
      |Sheetname |RowNumber |
      |Login | 5|
      
Scenario: Verify that the user is able to click on Get Started button under Linked List section
 Given User is on the signIn page
  When User clicks on the Get Started button under Linked List section
  Then User is navigated to Linked List page

Scenario: Verify that the Introduction link is enabled in the Linked List page
  Given The user is in the Linked List page after Sign-In
  When The user checks whether the Introduction link is enabled
  Then The user should be able to see Introduction link enabled in the Linked List page

  Scenario: Verify that the Creating Linked List link is enabled in the Linked List page
  When The user checks whether the Creating Linked List link is enabled
  Then The user should be able to see Creating Linked List link enabled in the Linked List page

Scenario: Verify that the Types of Linked List link is enabled in the Linked List page
  When The user checks whether the Types of Linked List link is enabled
  Then The user should be able to see Types of Linked List link enabled in the Linked List page

Scenario: Verify that the Implement Linked List in Python link is enabled in the Linked List page
  When The user checks whether the Implement Linked List in Python link is enabled
  Then The user should be able to see Implement Linked List in Python link enabled in the Linked List page

Scenario: Verify that the Traversal link is enabled in the Linked List page
  When The user checks whether the Traversal link is enabled
  Then The user should be able to see Traversal link enabled in the Linked List page

Scenario: Verify that the Insertion link is enabled in the Linked List page
  When The user checks whether the Insertion link is enabled
  Then The user should be able to see Insertion link enabled in the Linked List page

Scenario: Verify that the Deletion link is enabled in the Linked List page
  When The user checks whether the Deletion link is enabled
  Then The user should be able to see Deletion link enabled in the Linked List page
  
  Scenario: Verify that the user is able to navigate to Introduction page
  When The user clicks Introduction link in the Linked List page
  Then The user should be able to navigate to Introduction page
  
  Scenario: Verify that the user is able to navigate to Try Here >>> page for Introduction page
  Given The user is in the Introduction page
  When The user clicks Try Here >>> button in the Introduction page
  Then The user should be able to navigate to Try Editor page with Run button to test
  
  Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code is entered for the Introduction page
  Given The user is in the Try Editor page for the Introduction page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Introduction page
  Then The user should be able to get an output in the Try Editor screen for the Introduction page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|