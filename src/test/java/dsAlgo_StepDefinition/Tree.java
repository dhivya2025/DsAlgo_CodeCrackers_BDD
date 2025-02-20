package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import java.io.IOException;

import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_PageFactory.Tree_PageFactory;
import dsAlgo_Reader.TryEditor;

//import org.openqa.selenium.WebDriver;

//import dsAlgo_PageFactory.Tree_PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import dsAlgo_Reader.LoggerReader;

public class Tree {
	   private static final Logger logger = LogManager.getLogger(LoggerReader.class);
	   WebDriver driver;
	   Home_PageFactory homePage;
	   Login_PageFactory loginPage;
	   Tree_PageFactory treePage;
	   TryEditor tryeditor;
	    
       public Tree() {
       this.driver = Driver_Factory.getDriver();
       homePage = new Home_PageFactory(driver);
       loginPage = new Login_PageFactory(driver);
       treePage = new Tree_PageFactory(driver);
       tryeditor = new TryEditor();
       }
    
	@Given("User is on the Home page of dsalgo portal for testing Tree module")
	public void user_is_on_the_home_page_of_dsalgo_portal_for_testing_Tree_module() {
		logger.info("User is on the Home page");
	}

	@When("User clicks on Get Started button under Tree section")
	public void user_clicks_on_get_started_button_under_tree_section() throws InterruptedException {
	    treePage.GetStartedTree(); 
	}

	@Then("User is navigated to Tree page")
	public void user_is_navigated_to_tree_page() {
		Assert.assertEquals(treePage.OverviewOfTrees_linkenabled(),true);  
	}

	@Given("User is on Tree page")
	public void user_is_on_tree_page() {
		logger.info("User is on Tree page"); 
	}

	@When("User checks if Overview of Trees link is enabled")
	public void user_checks_if_overview_of_trees_link_is_enabled() {
		treePage.OverviewOfTrees_linkenabled();
	}

	@Then("Overview of Trees link should be enabled")
	public void overview_of_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.OverviewOfTrees_linkenabled(),true);  
	}

	@When("User clicks on Overview of Trees link")
	public void user_clicks_on_overview_of_trees_link() {
		treePage.OverviewOfTrees();
	}

	@Then("User is navigated to Overview of Trees page")
	public void user_is_navigated_to_overview_of_trees_page() {
		logger.info("User is navigated to Overview of Trees page");	
	}

	@Given("User is on Overview of Trees page")
	public void user_is_on_overview_of_trees_page() {
		logger.info("User is on Overview of Trees page");   
	}

	@When("User clicks on Try here>>> button of Overview of Trees page")
	public void user_clicks_on_try_here_button_of_overview_of_trees_page() {
	     treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Overview of Trees page")
	public void user_is_navigated_to_try_editor_page_of_overview_of_trees_page() {
		logger.info("User is navigated to tryEditor page of Overview of Trees page");	
	}

	@Given("The user is in the Try Editor page for the Overview of Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_overview_of_trees_page() {
		logger.info("The user is in the Try Editor page for the Overview of Trees page"); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Overview of Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_overview_of_trees_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Overview of Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_overview_of_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Overview of Trees page");		
	}

	@Given("The user is in the Try Editor page of Overview of Trees page")
	public void the_user_is_in_the_try_editor_page_of_overview_of_trees_page() {
		logger.info("The user is in the Try Editor page of Overview of Trees page"); 
	}

	@When("The user clicks <- in the Try Editor screen of Overview of Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_overview_of_trees_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Overview of Trees page")
	public void the_user_should_be_able_to_navigate_to_overview_of_trees_page() {
		logger.info("The user should be able to navigate to Overview of Trees page");		
	}
	
	@When("User checks if Terminologies link is enabled")
	public void user_checks_if_terminologies_link_is_enabled() {
		treePage.Terminologies_linkenabled(); 
	}

	@Then("Terminologies link should be enabled")
	public void terminologies_link_should_be_enabled() {
		Assert.assertEquals(treePage.Terminologies_linkenabled(),true); 
	}

	@When("User clicks on Terminologies link")
	public void user_clicks_on_terminologies_link() {
		treePage.Terminologies();
	}

	@Then("User is navigated to Terminologies page")
	public void user_is_navigated_to_terminologies_page() {
		Assert.assertEquals(treePage.Terminologies_linkenabled(),true);	
	}

	@Given("User is on Terminologies page")
	public void user_is_on_terminologies_page() {
		logger.info("User is on Terminologies page"); 
    }
	
	@When("User clicks on Try here>>> button of Terminologies page")
	public void user_clicks_on_try_here_button_of_terminologies_page() {
	    treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Terminologies page")
	public void user_is_navigated_to_try_editor_page_of_terminologies_page() {
		logger.info("User is navigated to tryEditor page of Terminologies page"); 
	}

	@Given("The user is in the Try Editor page for the Terminologies page")
	public void the_user_is_in_the_try_editor_page_for_the_terminologies_page() {
		logger.info("The user is in the Try Editor page for the Terminologies page");     
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Terminologies page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_terminologies_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);  
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Terminologies page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_terminologies_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Terminologies page");    
	}
  
	@Given("The user is in the Try Editor page of Terminologies page")
	public void the_user_is_in_the_try_editor_page_of_terminologies_page() {
		logger.info("The user is in the Try Editor page of Terminologies page");  
	}

	@When("The user clicks <- in the Try Editor screen of Terminologies page")
	public void the_user_clicks_in_the_try_editor_screen_of_terminologies_page() {
		driver.navigate().back();  
	}

	@Then("The user should be able to navigate to Terminologies page")
	public void the_user_should_be_able_to_navigate_to_terminologies_page() {
		Assert.assertEquals(treePage.Terminologies_linkenabled(),true);   
	}
	
	@When("User checks if Types of Trees link is enabled")
	public void user_checks_if_types_of_trees_link_is_enabled() {
		treePage.TypesOfTrees_linkenabled();
	}

	@Then("Types of Trees link should be enabled")
	public void types_of_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.TypesOfTrees_linkenabled(),true);   
	}

	@When("User clicks on Types of Trees link")
	public void user_clicks_on_types_of_trees_link() {
		treePage.TypesOfTrees();
	}

	@Then("User is navigated to Types of Trees page")
	public void user_is_navigated_to_types_of_trees_page() {
		Assert.assertEquals(treePage.TypesOfTrees_linkenabled(),true);   
	}

	@Given("User is on Types of Trees page")
	public void user_is_on_types_of_trees_page() {
		logger.info("User is on Types of Trees page");    
	}
	
	@When("User clicks on Try here>>> button of Types of Trees page")
	public void user_clicks_on_try_here_button_of_types_of_trees_page() {
		 treePage.Tryhere();
	}
	
	@Then("User is navigated to tryEditor page of Types of Trees page")
	public void user_is_navigated_to_try_editor_page_of_types_of_trees_page() {
		logger.info("User is navigated to tryEditor page of Types of Trees page"); 	
	}

	@Given("The user is in the Try Editor page for the Types of Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_types_of_trees_page() {
		logger.info("The user is in the Try Editor page for the Types of Trees page"); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Types of Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_types_of_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);  
    }

	@Then("The user should be able to get an output in the Try Editor screen for the Types of Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_types_of_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Types of Trees page"); 	 
    }
	
	@Given("The user is in the Try Editor page of Types of Trees page")
	public void the_user_is_in_the_try_editor_page_of_types_of_trees_page() {
		logger.info("The user is in the Try Editor page of Types of Trees page");   
	}

	@When("The user clicks <- in the Try Editor screen of Types of Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_types_of_trees_page() {
		driver.navigate().back();   
	}

	@Then("The user should be able to navigate to Types of Trees page")
	public void the_user_should_be_able_to_navigate_to_types_of_trees_page() {
		logger.info("The user should be able to navigate to Types of Trees page");   
	}
	
	@When("User checks if Tree Traversals link is enabled")
	public void user_checks_if_tree_traversals_link_is_enabled() {
		treePage.TreeTraversals_linkenabled();
	}

	@Then("Tree Traversals link should be enabled")
	public void tree_traversals_link_should_be_enabled() {
		Assert.assertEquals(treePage.TreeTraversals_linkenabled(),true); 
	}

	@When("User clicks on Tree Traversals link")
	public void user_clicks_on_tree_traversals_link() {
		treePage.TreeTraversals();
	}

	@Then("User is navigated to Tree Traversals page")
	public void user_is_navigated_to_tree_traversals_page() {
		Assert.assertEquals(treePage.TreeTraversals_linkenabled(),true);    
	}

	@Given("User is on Tree Traversals page")
	public void user_is_on_tree_traversals_page() {
		logger.info("User is on Tree Traversals page");     
	}

	@When("User clicks on Try here>>> button of Tree Traversals page")
	public void user_clicks_on_try_here_button_of_tree_traversals_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Tree Traversals page")
	public void user_is_navigated_to_try_editor_page_of_tree_traversals_page() {
		logger.info("User is navigated to tryEditor page of Tree Traversals page"); 	
	}
	
	@Given("The user is in the Try Editor page for the Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_for_the_tree_traversals_page() {
		logger.info("The user is in the Try Editor page for the Tree Traversals page");     
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Tree Traversals page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_tree_traversals_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);    
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Tree Traversals page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_tree_traversals_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Tree Traversals page"); 	 
	}
	
	@Given("The user is in the Try Editor page of Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_of_tree_traversals_page() {
		logger.info("The user is in the Try Editor page of Tree Traversals page");    
	}

	@When("The user clicks <- in the Try Editor screen of Tree Traversals page")
	public void the_user_clicks_in_the_try_editor_screen_of_tree_traversals_page() {
		driver.navigate().back(); 
	}

	@Then("The user should be able to navigate to Tree Traversals page")
	public void the_user_should_be_able_to_navigate_to_tree_traversals_page() {
		Assert.assertEquals(treePage.TreeTraversals_linkenabled(),true);    
	}
	
	@When("User checks if Traversals-Illustration link is enabled")
	public void user_checks_if_traversals_illustration_link_is_enabled() {
		treePage.TraversalsIllustration_linkenabled();
	}

	@Then("Traversals-Illustration link should be enabled")
	public void traversals_illustration_link_should_be_enabled() {
		Assert.assertEquals(treePage.TraversalsIllustration_linkenabled(),true);   
	}

	@When("User clicks on Traversals-Illustration link")
	public void user_clicks_on_traversals_illustration_link() {
		treePage.TraversalsIllustration();
	}

	@Then("User is navigated to Traversals-Illustration page")
	public void user_is_navigated_to_traversals_illustration_page() {
		Assert.assertEquals(treePage.TraversalsIllustration_linkenabled(),true);  
	}

	@Given("User is on Traversals-Illustration page")
	public void user_is_on_traversals_illustration_page() {
		logger.info("User is on Traversals-Illustration page");    
	}
	
	@When("User clicks on Try here>>> button of Traversals-Illustration page")
	public void user_clicks_on_try_here_button_of_traversals_illustration_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Traversals-Illustration page")
	public void user_is_navigated_to_try_editor_page_of_traversals_illustration_page() {
		logger.info("User is navigated to tryEditor page of Traversals-Illustration page"); 	    
	}

	@Given("The user is in the Try Editor page for the Traversals-Illustration page")
	public void the_user_is_in_the_try_editor_page_for_the_traversals_illustration_page() {
	   logger.info("The user is in the Try Editor page for the Traversals-Illustration page"); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Traversals-Illustration page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_traversals_illustration_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);    
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Traversals-Illustration page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_traversals_illustration_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Traversals-Illustration page"); 	 
	}
	
	@Given("The user is in the Try Editor page of Traversals-Illustration page")
	public void the_user_is_in_the_try_editor_page_of_traversals_illustration_page() {
		 logger.info("The user is in the Try Editor page of Traversals-Illustration page");    
	}

	@When("The user clicks <- in the Try Editor screen of Traversals-Illustration page")
	public void the_user_clicks_in_the_try_editor_screen_of_traversals_illustration_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Traversals-Illustration page")
	public void the_user_should_be_able_to_navigate_to_traversals_illustration_page() {
		Assert.assertEquals(treePage.TraversalsIllustration_linkenabled(),true);    
	}

	@When("User checks if Binary Trees link is enabled")
	public void user_checks_if_binary_trees_link_is_enabled() {
		treePage.BinaryTrees_linkenabled();
	}

	@Then("Binary Trees link should be enabled")
	public void binary_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.BinaryTrees_linkenabled(),true); 
	}

	@When("User clicks on Binary Trees link")
	public void user_clicks_on_binary_trees_link() {
		treePage.BinaryTrees();
	}

	@Then("User is navigated to Binary Trees page")
	public void user_is_navigated_to_binary_trees_page() {
		Assert.assertEquals(treePage.BinaryTrees_linkenabled(),true);   
	}

	@Given("User is on Binary Trees page")
	public void user_is_on_binary_trees_page() {
	    logger.info("User is on Binary Trees page");    
	}

	@When("User clicks on Try here>>> button of Binary Trees page")
	public void user_clicks_on_try_here_button_of_binary_trees_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Binary Trees page")
	public void user_is_navigated_to_try_editor_page_of_binary_trees_page() {
		logger.info("User is navigated to tryEditor page of Binary Trees page"); 	
	}
	
	@Given("The user is in the Try Editor page for the Binary Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_binary_trees_page() {
		logger.info("The user is in the Try Editor page for the Binary Trees page");   
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Binary Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_binary_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);   
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Binary Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_binary_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Binary Trees page");   
	}

	@Given("The user is in the Try Editor page of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page of Binary Trees page");   
	}

	@When("The user clicks <- in the Try Editor screen of Binary Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_binary_trees_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Binary Trees page")
	public void the_user_should_be_able_to_navigate_to_binary_trees_page() {
		Assert.assertEquals(treePage.BinaryTrees_linkenabled(),true);    
	}
	
	@When("User checks if Types of Binary Trees link is enabled")
	public void user_checks_if_types_of_binary_trees_link_is_enabled() {
		treePage.TypesOfBinaryTrees_linkenabled();
	}

	@Then("Types of Binary Trees link should be enabled")
	public void types_of_binary_trees_link_should_be_enabled() {
	    Assert.assertEquals(treePage.TypesOfBinaryTrees_linkenabled(),true);
	}

	@When("User clicks on Types of Binary Trees link")
	public void user_clicks_on_types_of_binary_trees_link() {
		treePage.TypesOfBinaryTrees();
	}

	@Then("User is navigated to Types of Binary Trees page")
	public void user_is_navigated_to_types_of_binary_trees_page() {
		Assert.assertEquals(treePage.TypesOfBinaryTrees_linkenabled(),true);   
	}

	@Given("User is on Types of Binary Trees page")
	public void user_is_on_types_of_binary_trees_page() {
		logger.info("User is on Types of Binary Trees page");    
	}
    
	@When("User clicks on Try here>>> button of Types of Binary Trees page")
	public void user_clicks_on_try_here_button_of_types_of_binary_trees_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Types of Binary Trees page")
	public void user_is_navigated_to_try_editor_page_of_types_of_binary_trees_page() {
		logger.info("User is navigated to tryEditor page of Types of Binary Trees page");
	}
	
	@Given("The user is in the Try Editor page for the Types of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_types_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page for the Types of Binary Trees page");   
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Types of Binary Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_types_of_binary_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);    
    }

	@Then("The user should be able to get an output in the Try Editor screen for the Types of Binary Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_types_of_binary_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Types of Binary Trees page"); 
	}
	
	@Given("The user is in the Try Editor page of Types of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_of_types_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page of Types of Binary Trees page");    
	 }

	@When("The user clicks <- in the Try Editor screen of Types of Binary Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_types_of_binary_trees_page() {
		driver.navigate().back();  
	}

	@Then("The user should be able to navigate to Types of Binary Trees page")
	public void the_user_should_be_able_to_navigate_to_types_of_binary_trees_page() {
		Assert.assertEquals(treePage.TypesOfBinaryTrees_linkenabled(),true);   
	}
	
	@When("User checks if Implementation in Python link is enabled")
	public void user_checks_if_implementation_in_python_link_is_enabled() {
		treePage.ImplementationInPython_linkenabled();
	}

	@Then("Implementation in Python link should be enabled")
	public void implementation_in_python_link_should_be_enabled() {
		  Assert.assertEquals(treePage.ImplementationInPython_linkenabled(),true);	    
	}

	@When("User clicks on Implementation in Python link")
	public void user_clicks_on_implementation_in_python_link() {
	   treePage.ImplementationInPython();
	}

	@Then("User is navigated to Implementation in Python page")
	public void user_is_navigated_to_implementation_in_python_page() {
		Assert.assertEquals(treePage.ImplementationInPython_linkenabled(),true);   
	 }

	@Given("User is on Implementation in Python page")
	public void user_is_on_implementation_in_python_page() {
		logger.info("User is on Implementation in Python page");     
	}
	
	@When("User clicks on Try here>>> button of Implementation in Python page")
	public void user_clicks_on_try_here_button_of_implementation_in_python_page() {
		 treePage.Tryhere(); 
	}

	@Then("User is navigated to tryEditor page of Implementation in Python page")
	public void user_is_navigated_to_try_editor_page_of_implementation_in_python_page() {
		logger.info("User is navigated to tryEditor page of Implementation in Python page");  
	}
	
	@Given("The user is in the Try Editor page for the Implementation in Python page")
	public void the_user_is_in_the_try_editor_page_for_the_implementation_in_python_page() {
		logger.info("The user is in the Try Editor page for the Implementation in Python page");  
	 }

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation in Python page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_in_python_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);
    }

	@Then("The user should be able to get an output in the Try Editor screen for the Implementation in Python page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_in_python_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Implementation in Python page");  	  
	}

	@Given("The user is in the Try Editor page of Implementation in Python page")
	public void the_user_is_in_the_try_editor_page_of_implementation_in_python_page() {
		logger.info("The user is in the Try Editor page of Implementation in Python page");   
	}

	@When("The user clicks <- in the Try Editor screen of Implementation in Python page")
	public void the_user_clicks_in_the_try_editor_screen_of_implementation_in_python_page() {
		driver.navigate().back();   
	}

	@Then("The user should be able to navigate to Implementation in Python page")
	public void the_user_should_be_able_to_navigate_to_implementation_in_python_page() {
		Assert.assertEquals(treePage.ImplementationInPython_linkenabled(),true);		     
	}
	
	@When("User checks if Binary Tree Traversals link is enabled")
	public void user_checks_if_binary_tree_traversals_link_is_enabled() {
		treePage.BinaryTreeTraversals_linkenabled();
	}

	@Then("Binary Tree Traversals link should be enabled")
	public void binary_tree_traversals_link_should_be_enabled() {
		Assert.assertEquals(treePage.BinaryTreeTraversals_linkenabled(),true);	    
	}

	@When("User clicks on Binary Tree Traversals link")
	public void user_clicks_on_binary_tree_traversals_link() {
		treePage.BinaryTreeTraversals();
    }

	@Then("User is navigated to Binary Tree Traversals page")
	public void user_is_navigated_to_binary_tree_traversals_page() {
		Assert.assertEquals(treePage.BinaryTreeTraversals_linkenabled(),true);   
	}

	@Given("User is on Binary Tree Traversals page")
	public void user_is_on_binary_tree_traversals_page() {
		logger.info("User is on Binary Tree Traversals page");   
	}
	
	@When("User clicks on Try here>>> button of Binary Tree Traversals page")
	public void user_clicks_on_try_here_button_of_binary_tree_traversals_page() {
		 treePage.Tryhere(); 
	}

	@Then("User is navigated to tryEditor page of Binary Tree Traversals page")
	public void user_is_navigated_to_try_editor_page_of_binary_tree_traversals_page() {
		logger.info("User is navigated to tryEditor page of Binary Tree Traversals page");   
	}

	@Given("The user is in the Try Editor page for the Binary Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_for_the_binary_tree_traversals_page() {
		logger.info("The user is in the Try Editor page for the Binary Tree Traversals page");     
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Binary Tree Traversals page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_binary_tree_traversals_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber); 
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Binary Tree Traversals page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_binary_tree_traversals_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Binary Tree Traversals page"); 
    }
	
    @Given("The user is in the Try Editor page of Binary Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_of_binary_tree_traversals_page() {
		logger.info("The user is in the Try Editor page of Binary Tree Traversals page");   
	}

	@When("The user clicks <- in the Try Editor screen of Binary Tree Traversals page")
	public void the_user_clicks_in_the_try_editor_screen_of_binary_tree_traversals_page() {
		driver.navigate().back();  
	}

	@Then("The user should be able to navigate to Binary Tree Traversals page")
	public void the_user_should_be_able_to_navigate_to_binary_tree_traversals_page() {
		Assert.assertEquals(treePage.BinaryTreeTraversals_linkenabled(),true);  
	}
	
	@When("User checks if Implementation of Binary Trees link is enabled")
	public void user_checks_if_implementation_of_binary_trees_link_is_enabled() {
		treePage.ImplementationOfBinaryTrees_linkenabled(); 
	}

	@Then("Implementation of Binary Trees link should be enabled")
	public void implementation_of_binary_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.ImplementationOfBinaryTrees_linkenabled(),true);		    
	}

	@When("User clicks on Implementation of Binary Trees link")
	public void user_clicks_on_implementation_of_binary_trees_link() {
	    treePage.ImplementationOfBinaryTrees();
	}

	@Then("User is navigated to Implementation of Binary Trees page")
	public void user_is_navigated_to_implementation_of_binary_trees_page() {
		Assert.assertEquals(treePage.ImplementationOfBinaryTrees_linkenabled(),true);   
	}

	@Given("User is on Implementation of Binary Trees page")
	public void user_is_on_implementation_of_binary_trees_page() {
		logger.info("User is on Implementation of Binary Trees page");    
	}
 
	@When("User clicks on Try here>>> button of Implementation of Binary Trees page")
	public void user_clicks_on_try_here_button_of_implementation_of_binary_trees_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Implementation of Binary Trees page")
	public void user_is_navigated_to_try_editor_page_of_implementation_of_binary_trees_page() {
		logger.info("User is navigated to tryEditor page of Implementation of Binary Trees page"); 
	}
	
	@Given("The user is in the Try Editor page for the Implementation of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_implementation_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page for the Implementation of Binary Trees page");  
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation of Binary Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_of_binary_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);   
    }

	@Then("The user should be able to get an output in the Try Editor screen for the Implementation of Binary Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_of_binary_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Implementation of Binary Trees page");
	}
	
	@Given("The user is in the Try Editor page of Implementation of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_of_implementation_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page of Implementation of Binary Trees page");    
	}

	@When("The user clicks <- in the Try Editor screen of Implementation of Binary Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_implementation_of_binary_trees_page() {
		driver.navigate().back(); 
	}

	@Then("The user should be able to navigate to Implementation of Binary Trees page")
	public void the_user_should_be_able_to_navigate_to_implementation_of_binary_trees_page() {
		Assert.assertEquals(treePage.ImplementationOfBinaryTrees_linkenabled(),true);   
	}
	
	@When("User checks if Applications of Binary trees link is enabled")
	public void user_checks_if_applications_of_binary_trees_link_is_enabled() {
	    treePage.ApplicationsOfBinaryTrees_linkenabled();
	}

	@Then("Applications of Binary trees link should be enabled")
	public void applications_of_binary_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.ApplicationsOfBinaryTrees_linkenabled(),true);
	    
	}

	@When("User clicks on Applications of Binary trees link")
	public void user_clicks_on_applications_of_binary_trees_link() {
		treePage.ApplicationsOfBinaryTrees();
	}

	@Then("User is navigated to Applications of Binary trees page")
	public void user_is_navigated_to_applications_of_binary_trees_page() {
		Assert.assertEquals(treePage.ApplicationsOfBinaryTrees_linkenabled(),true);   
	}

	@Given("User is on Applications of Binary trees page")
	public void user_is_on_applications_of_binary_trees_page() {
		logger.info("User is on Applications of Binary trees page");     
	}

	@When("User clicks on Try here>>> button of Applications of Binary trees page")
	public void user_clicks_on_try_here_button_of_applications_of_binary_trees_page() {
		 treePage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Applications of Binary trees page")
	public void user_is_navigated_to_try_editor_page_of_applications_of_binary_trees_page() {
		logger.info("User is navigated to tryEditor page of Applications of Binary trees page");
	}
	
	@Given("The user is in the Try Editor page for the Applications of Binary trees page")
	public void the_user_is_in_the_try_editor_page_for_the_applications_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page for the Applications of Binary trees page");     
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Applications of Binary trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_applications_of_binary_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Applications of Binary trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_applications_of_binary_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Applications of Binary trees page"); 
	}
	
	@Given("The user is in the Try Editor page of Applications of Binary trees page")
	public void the_user_is_in_the_try_editor_page_of_applications_of_binary_trees_page() {
		logger.info("The user is in the Try Editor page of Applications of Binary trees page");    
	}

	@When("The user clicks <- in the Try Editor screen of Applications of Binary trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_applications_of_binary_trees_page() {
		driver.navigate().back(); 
	 }

	@Then("The user should be able to navigate to Applications of Binary trees page")
	public void the_user_should_be_able_to_navigate_to_applications_of_binary_trees_page() {
		Assert.assertEquals(treePage.ApplicationsOfBinaryTrees_linkenabled(),true);   
	}
	
	@When("User checks if Binary Search Trees link is enabled")
	public void user_checks_if_binary_search_trees_link_is_enabled() {
		treePage.BinarySearchTrees_linkenabled();
	}

	@Then("Binary Search Trees link should be enabled")
	public void binary_search_trees_link_should_be_enabled() {
		Assert.assertEquals(treePage.BinarySearchTrees_linkenabled(),true); 
	}

	@When("User clicks on Binary Search Trees link")
	public void user_clicks_on_binary_search_trees_link() {
		treePage.BinarySearchTrees();
	}

	@Then("User is navigated to Binary Search Trees page")
	public void user_is_navigated_to_binary_search_trees_page() {
		Assert.assertEquals(treePage.BinarySearchTrees_linkenabled(),true);  
	}

	@Given("User is on Binary Search Trees page")
	public void user_is_on_binary_search_trees_page() {
		logger.info("User is on Binary Search Trees page");       
	}

	@When("User clicks on Try here>>> button of Binary Search Trees page")
	public void user_clicks_on_try_here_button_of_binary_search_trees_page() {
		 treePage.Tryhere();  
	}

	@Then("User is navigated to tryEditor page of Binary Search Trees page")
	public void user_is_navigated_to_try_editor_page_of_binary_search_trees_page() {
		logger.info("User is navigated to tryEditor page of Binary Search Trees page"); 
	}

	@Given("The user is in the Try Editor page for the Binary Search Trees page")
	public void the_user_is_in_the_try_editor_page_for_the_binary_search_trees_page() {
		logger.info("The user is in the Try Editor page for the Binary Search Trees page");   
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Binary Search Trees page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_binary_search_trees_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);   
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Binary Search Trees page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_binary_search_trees_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Binary Search Trees page"); 
	}
	
	@Given("The user is in the Try Editor page of Binary Search Trees page")
	public void the_user_is_in_the_try_editor_page_of_binary_search_trees_page() {
		logger.info("The user is in the Try Editor page of Binary Search Trees page");  
	}

	@When("The user clicks <- in the Try Editor screen of Binary Search Trees page")
	public void the_user_clicks_in_the_try_editor_screen_of_binary_search_trees_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Binary Search Trees page")
	public void the_user_should_be_able_to_navigate_to_binary_search_trees_page() {
		Assert.assertEquals(treePage.BinarySearchTrees_linkenabled(),true); 
	}

	@When("User checks if Implementation Of BST link is enabled")
	public void user_checks_if_implementation_of_bst_link_is_enabled() {
	    treePage.ImplementationOfBST_linkenabled();
	}

	@Then("Implementation Of BST link should be enabled")
	public void implementation_of_bst_link_should_be_enabled() {
		Assert.assertEquals(treePage.ImplementationOfBST_linkenabled(),true); 	    
	}

	@When("User clicks on Implementation Of BST link")
	public void user_clicks_on_implementation_of_bst_link() {
		treePage.ImplementationOfBST();  
	}

	@Then("User is navigated to Implementation Of BST page")
	public void user_is_navigated_to_implementation_of_bst_page() {
		Assert.assertEquals(treePage.ImplementationOfBST_linkenabled(),true);  
	}

	@Given("User is on Implementation Of BST page")
	public void user_is_on_implementation_of_bst_page() {
		logger.info("User is on Implementation Of BST page");     
	}

	@When("User clicks on Try here>>> button of Implementation Of BST page")
	public void user_clicks_on_try_here_button_of_implementation_of_bst_page() {
		 treePage.Tryhere(); 
	}

	@Then("User is navigated to tryEditor page of Implementation Of BST page")
	public void user_is_navigated_to_try_editor_page_of_implementation_of_bst_page() {
		logger.info("User is navigated to tryEditor page of Implementation Of BST page");	
	}

	@Given("The user is in the Try Editor page for the Implementation Of BST page")
	public void the_user_is_in_the_try_editor_page_for_the_implementation_of_bst_page() {
		logger.info("The user is in the Try Editor page for the Implementation Of BST page"); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implementation Of BST page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implementation_of_bst_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		treePage.tryEditorWindow(sheetName,rowNumber);    
     }

	@Then("The user should be able to get an output in the Try Editor screen for the Implementation Of BST page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_of_bst_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Implementation Of BST page");	  
	}

	@Given("The user is in the Try Editor page of Implementation Of BST page")
	public void the_user_is_in_the_try_editor_page_of_implementation_of_bst_page() {
		logger.info("The user is in the Try Editor page of Implementation Of BST page");     
	}

	@When("The user clicks <- in the Try Editor screen of Implementation Of BST page")
	public void the_user_clicks_in_the_try_editor_screen_of_implementation_of_bst_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Implementation Of BST page")
	public void the_user_should_be_able_to_navigate_to_implementation_of_bst_page() {
		Assert.assertEquals(treePage.ImplementationOfBST_linkenabled(),true);  
	}

	@When("User clicks on Practice Questions link of Tree module")
	public void user_clicks_on_practice_questions_link_of_tree_module() {
	   treePage.PracticeQuestions(); 
	}
	
	@Then("User is navigated to Practice Questions page of Tree module")
	public void user_is_navigated_to_practice_questions_page_of_tree_module() {
		logger.info("User is navigated to Practice Questions page of Tree module"); 
	}
}

