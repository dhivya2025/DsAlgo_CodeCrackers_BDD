@Order3
Feature: Tree Module
Background: User logs into dsalgo portal with valid Username and Password

Scenario Outline: Verify user enters username and password for SignIn
  Given The user clicks the Sign In link from the portal
  When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
  Then The user is in Home Page
Examples:
      |Sheetname |RowNumber |
      |Login | 5|

Scenario: Verify that the user is able to click on Get Started button under Tree section
Given User is on the Home page of dsalgo portal for testing Tree module
When User clicks on Get Started button under Tree section
Then User is navigated to Tree page

@OverviewofTrees

Scenario: Verify that Overview of Trees link is enabled
Given User is on Tree page
When User checks if Overview of Trees link is enabled
Then Overview of Trees link should be enabled

Scenario: Verify that the user is able to navigate to Overview of Trees page
Given User is on Tree page
When User clicks on Overview of Trees link
Then User is navigated to Overview of Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Overview of Trees page
When User clicks on Try here>>> button of Overview of Trees page
Then User is navigated to tryEditor page of Overview of Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Overview of Trees page
  Given The user is in the Try Editor page for the Overview of Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Overview of Trees page
  Then The user should be able to get an output in the Try Editor screen for the Overview of Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Overview of Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Overview of Trees page
  When The user clicks <- in the Try Editor screen of Overview of Trees page
  Then The user should be able to navigate to Overview of Trees page

@Terminologies
     
Scenario: Verify that Terminologies link is enabled
Given User is on Tree page
When User checks if Terminologies link is enabled
Then Terminologies link should be enabled

Scenario: Verify that the user is able to navigate to Terminologies page
Given User is on Tree page
When User clicks on Terminologies link
Then User is navigated to Terminologies page


Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Terminologies page
When User clicks on Try here>>> button of Terminologies page
Then User is navigated to tryEditor page of Terminologies page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Terminologies page
  Given The user is in the Try Editor page for the Terminologies page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Terminologies page
  Then The user should be able to get an output in the Try Editor screen for the Terminologies page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
Scenario: Verify that the user is able to navigate to Terminologies page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Terminologies page
  When The user clicks <- in the Try Editor screen of Terminologies page
  Then The user should be able to navigate to Terminologies page
  
@TypesofTrees

Scenario: Verify that Types of Trees link is enabled
Given User is on Tree page
When User checks if Types of Trees link is enabled
Then Types of Trees link should be enabled

Scenario: Verify that the user is able to navigate to Types of Trees page
Given User is on Tree page
When User clicks on Types of Trees link
Then User is navigated to Types of Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Types of Trees page
When User clicks on Try here>>> button of Types of Trees page
Then User is navigated to tryEditor page of Types of Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Types of Trees page
  Given The user is in the Try Editor page for the Types of Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Types of Trees page
  Then The user should be able to get an output in the Try Editor screen for the Types of Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Types of Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Types of Trees page
  When The user clicks <- in the Try Editor screen of Types of Trees page
  Then The user should be able to navigate to Types of Trees page
  
@TreeTraversals

Scenario: Verify that Tree Traversals link is enabled
Given User is on Tree page
When User checks if Tree Traversals link is enabled
Then Tree Traversals link should be enabled

Scenario: Verify that the user is able to navigate to Tree Traversals page
Given User is on Tree page
When User clicks on Tree Traversals link
Then User is navigated to Tree Traversals page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Tree Traversals page
When User clicks on Try here>>> button of Tree Traversals page
Then User is navigated to tryEditor page of Tree Traversals page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Tree Traversals page
  Given The user is in the Try Editor page for the Tree Traversals page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Tree Traversals page
  Then The user should be able to get an output in the Try Editor screen for the Tree Traversals page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Tree Traversals page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Tree Traversals page
  When The user clicks <- in the Try Editor screen of Tree Traversals page
  Then The user should be able to navigate to Tree Traversals page
  
@Traversals-Illustration
      
Scenario: Verify that Traversals-Illustration link is enabled
Given User is on Tree page
When User checks if Traversals-Illustration link is enabled
Then Traversals-Illustration link should be enabled

Scenario: Verify that the user is able to navigate to Traversals-Illustration page
Given User is on Tree page
When User clicks on Traversals-Illustration link
Then User is navigated to Traversals-Illustration page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Traversals-Illustration page
When User clicks on Try here>>> button of Traversals-Illustration page
Then User is navigated to tryEditor page of Traversals-Illustration page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Traversals-Illustration page
  Given The user is in the Try Editor page for the Traversals-Illustration page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Traversals-Illustration page
  Then The user should be able to get an output in the Try Editor screen for the Traversals-Illustration page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

Scenario: Verify that the user is able to navigate to Traversals-Illustration page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Traversals-Illustration page
  When The user clicks <- in the Try Editor screen of Traversals-Illustration page
  Then The user should be able to navigate to Traversals-Illustration page
  
@BinaryTrees
      
Scenario: Verify that Binary Trees link is enabled
Given User is on Tree page
When User checks if Binary Trees link is enabled
Then Binary Trees link should be enabled

Scenario: Verify that the user is able to navigate to Binary Trees page
Given User is on Tree page
When User clicks on Binary Trees link
Then User is navigated to Binary Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Binary Trees page
When User clicks on Try here>>> button of Binary Trees page
Then User is navigated to tryEditor page of Binary Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Binary Trees page
  Given The user is in the Try Editor page for the Binary Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Binary Trees page
  Then The user should be able to get an output in the Try Editor screen for the Binary Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
Scenario: Verify that the user is able to navigate to Binary Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Binary Trees page
  When The user clicks <- in the Try Editor screen of Binary Trees page
  Then The user should be able to navigate to Binary Trees page
  
@TypesofBinaryTrees 

Scenario: Verify that Types of Binary Trees link is enabled
Given User is on Tree page
When User checks if Types of Binary Trees link is enabled
Then Types of Binary Trees link should be enabled

Scenario: Verify that the user is able to navigate to Types of Binary Trees page
Given User is on Tree page
When User clicks on Types of Binary Trees link
Then User is navigated to Types of Binary Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Types of Binary Trees page
When User clicks on Try here>>> button of Types of Binary Trees page
Then User is navigated to tryEditor page of Types of Binary Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Types of Binary Trees page
  Given The user is in the Try Editor page for the Types of Binary Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Types of Binary Trees page
  Then The user should be able to get an output in the Try Editor screen for the Types of Binary Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
Scenario: Verify that the user is able to navigate to Types of Binary Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Types of Binary Trees page
  When The user clicks <- in the Try Editor screen of Types of Binary Trees page
  Then The user should be able to navigate to Types of Binary Trees page
  
@ImplementationinPython   
  
Scenario: Verify that Implementation in Python link is enabled
Given User is on Tree page
When User checks if Implementation in Python link is enabled
Then Implementation in Python link should be enabled

Scenario: Verify that the user is able to navigate to Implementation in Python page
Given User is on Tree page
When User clicks on Implementation in Python link
Then User is navigated to Implementation in Python page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Implementation in Python page
When User clicks on Try here>>> button of Implementation in Python page
Then User is navigated to tryEditor page of Implementation in Python page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Implementation in Python page
  Given The user is in the Try Editor page for the Implementation in Python page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation in Python page
  Then The user should be able to get an output in the Try Editor screen for the Implementation in Python page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
 
 Scenario: Verify that the user is able to navigate to Implementation in Python page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Implementation in Python page
  When The user clicks <- in the Try Editor screen of Implementation in Python page
  Then The user should be able to navigate to Implementation in Python page
       
@TreeTraversals

Scenario: Verify that Binary Tree Traversals link is enabled
Given User is on Tree page
When User checks if Binary Tree Traversals link is enabled
Then Binary Tree Traversals link should be enabled

Scenario: Verify that the user is able to navigate to Binary Tree Traversals page
Given User is on Tree page
When User clicks on Binary Tree Traversals link
Then User is navigated to Binary Tree Traversals page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Binary Tree Traversals page
When User clicks on Try here>>> button of Binary Tree Traversals page 
Then User is navigated to tryEditor page of Binary Tree Traversals page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Binary Tree Traversals page
  Given The user is in the Try Editor page for the Binary Tree Traversals page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Binary Tree Traversals page
  Then The user should be able to get an output in the Try Editor screen for the Binary Tree Traversals page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

 Scenario: Verify that the user is able to navigate to Binary Tree Traversals page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Binary Tree Traversals page
  When The user clicks <- in the Try Editor screen of Binary Tree Traversals page
  Then The user should be able to navigate to Binary Tree Traversals page
  
@ImplementationofBinaryTrees

Scenario: Verify that Implementation of Binary Trees link is enabled
Given User is on Tree page
When User checks if Implementation of Binary Trees link is enabled
Then Implementation of Binary Trees link should be enabled

Scenario: Verify that the user is able to navigate to Implementation of Binary Trees page
Given User is on Tree page
When User clicks on Implementation of Binary Trees link
Then User is navigated to Implementation of Binary Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Implementation of Binary Trees page
When User clicks on Try here>>> button of Implementation of Binary Trees page
Then User is navigated to tryEditor page of Implementation of Binary Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Implementation of Binary Trees page
  Given The user is in the Try Editor page for the Implementation of Binary Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation of Binary Trees page
  Then The user should be able to get an output in the Try Editor screen for the Implementation of Binary Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

 Scenario: Verify that the user is able to navigate to Implementation of Binary Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Implementation of Binary Trees page
  When The user clicks <- in the Try Editor screen of Implementation of Binary Trees page
  Then The user should be able to navigate to Implementation of Binary Trees page
  
@ApplicationsofBinarytrees
      
Scenario: Verify that Applications of Binary trees link is enabled
Given User is on Tree page
When User checks if Applications of Binary trees link is enabled
Then Applications of Binary trees link should be enabled

Scenario: Verify that the user is able to navigate to Applications of Binary trees page
Given User is on Tree page
When User clicks on Applications of Binary trees link
Then User is navigated to Applications of Binary trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Applications of Binary trees page
When User clicks on Try here>>> button of Applications of Binary trees page
Then User is navigated to tryEditor page of Applications of Binary trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Applications of Binary trees page
  Given The user is in the Try Editor page for the Applications of Binary trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Applications of Binary trees page
  Then The user should be able to get an output in the Try Editor screen for the Applications of Binary trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

  Scenario: Verify that the user is able to navigate to Applications of Binary trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Applications of Binary trees page
  When The user clicks <- in the Try Editor screen of Applications of Binary trees page
  Then The user should be able to navigate to Applications of Binary trees page
       
@BinarySearchTrees
      
Scenario: Verify that Binary Search Trees link is enabled
Given User is on Tree page
When User checks if Binary Search Trees link is enabled
Then Binary Search Trees link should be enabled

Scenario: Verify that the user is able to navigate to Binary Search Trees page
Given User is on Tree page
When User clicks on Binary Search Trees link
Then User is navigated to Binary Search Trees page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Binary Search Trees page
When User clicks on Try here>>> button of Binary Search Trees page
Then User is navigated to tryEditor page of Binary Search Trees page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Binary Search Trees page
  Given The user is in the Try Editor page for the Binary Search Trees page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Binary Search Trees page
  Then The user should be able to get an output in the Try Editor screen for the Binary Search Trees page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|

 Scenario: Verify that the user is able to navigate to Binary Search Trees page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Binary Search Trees page
  When The user clicks <- in the Try Editor screen of Binary Search Trees page
  Then The user should be able to navigate to Binary Search Trees page
        
@ImplementationOfBST      
      
Scenario: Verify that Implementation Of BST link is enabled
Given User is on Tree page
When User checks if Implementation Of BST link is enabled
Then Implementation Of BST link should be enabled

Scenario: Verify that the user is able to navigate to Implementation Of BST page
Given User is on Tree page
When User clicks on Implementation Of BST link
Then User is navigated to Implementation Of BST page

Scenario: Verify that the user is able to click on Try here>>> button
Given User is on Implementation Of BST page
When User clicks on Try here>>> button of Implementation Of BST page
Then User is navigated to tryEditor page of Implementation Of BST page

Scenario Outline: Verify that the user is able to see output for valid, invalid and incorrect syntax Python code entered for the Implementation Of BST page
  Given The user is in the Try Editor page for the Implementation Of BST page
  When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for the Implementation Of BST page
  Then The user should be able to get an output in the Try Editor screen for the Implementation Of BST page

Examples: 
  |Sheetname |RowNumber |
  |TryEditor | 1|
  |TryEditor | 2| 
  |TryEditor | 3|
  
 Scenario: Verify that the user is able to navigate to Implementation Of BST page after clicking <- in the Try Editor window
  Given The user is in the Try Editor page of Implementation Of BST page
  When The user clicks <- in the Try Editor screen of Implementation Of BST page
  Then The user should be able to navigate to Implementation Of BST page
  
@PracticeQuestions
   
Scenario: Verify that the user is redirected to Practice Questions page of Tree module
Given User is on Implementation Of BST page
When User clicks on Practice Questions link of Tree module
Then User is navigated to Practice Questions page of Tree module

Scenario: Verify that user is able to sign out successfully
Given The user is in the Home page after Sign In
When The user clicks Sign Out
Then The user should be redirected to home page with message "Logged out successfully"