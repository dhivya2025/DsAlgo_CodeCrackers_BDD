package dsAlgo_StepDefinition;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import dsAlgo_Reader.LoggerReader;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Graph_PageFactory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph {
	private static final Logger logger = LogManager.getLogger(LoggerReader.class);
	WebDriver driver;
	Home_PageFactory homePage;
	Login_PageFactory loginPage;
	Graph_PageFactory graphPage;
	TryEditor tryeditor;
	    
    public Graph() {
 	this.driver = Driver_Factory.getDriver();
 	homePage = new Home_PageFactory(driver);
    loginPage = new Login_PageFactory(driver);
    graphPage = new Graph_PageFactory(driver);
    tryeditor = new TryEditor();
    }


	@Given("User is on the Home page of dsalgo portal for testing Graph module")
	public void user_is_on_the_home_page_of_dsalgo_portalfor_testing_Graph_module() {
		logger.info("User is on the Home page of dsalgo portal for testing Graph module"); 
	}

    @When("User clicks on Get Started button under Graph section")
	public void user_clicks_on_get_started_button_under_graph_section() {
	   graphPage.GetStartedGraph(); 
	}

	@Then("User is navigated to Graph home page")
	public void user_is_navigated_to_graph_home_page() {
		logger.info("User is navigated to Graph home page"); 
    }

	@Given("User is on Graph home page")
	public void user_is_on_graph_home_page() {
		logger.info("User is on Graph home page");  
	}

	@When("User checks if Graph link is enabled")
	public void user_checks_if_graph_link_is_enabled() {
		graphPage.Graph_linkenabled();
	}

	@Then("Graph link should be enabled")
	public void graph_link_should_be_enabled() {
		Assert.assertEquals(graphPage.Graph_linkenabled(),true);  
	}
	
	@When("User clicks on Graph link")
	public void user_clicks_on_graph_link() {
	    graphPage.Graph();
	}
	
	@Then("User is navigated to Graph page")
	public void user_is_navigated_to_graph_page() {
		Assert.assertEquals(graphPage.Graph_linkenabled(),true); 
	}
	
	@Given("User is on Graph page")
	public void user_is_on_graph_page() {
		logger.info("User is on Graph page"); 
	}
	
	@When("User clicks on Try here>>> button of Graph page")
	public void user_clicks_on_try_here_button_of_graph_page() {
	     graphPage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Graph page")
	public void user_is_navigated_to_try_editor_page_of_graph_page() {
		logger.info("User is navigated to tryEditor page of Graph page");     
	}

	@Given("The user is in the Try Editor page for the Graph page")
	public void the_user_is_in_the_try_editor_page_for_the_graph_page() {
		logger.info("The user is in the Try Editor page for the Graph page"); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Graph page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_graph_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		graphPage.tryEditorWindow(sheetName,rowNumber);
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Graph page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_graph_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Graph page"); 
	}
	
	@Given("The user is in the Try Editor page of Graph page")
	public void the_user_is_in_the_try_editor_page_of_graph_page() {
		logger.info("The user is in the Try Editor page of Graph page"); 
	}

	@When("The user clicks <- in the Try Editor screen of Graph page")
	public void the_user_clicks_in_the_try_editor_screen_of_graph_page() {
		driver.navigate().back();  
	}

	@Then("The user should be able to navigate to Graph page")
	public void the_user_should_be_able_to_navigate_to_graph_page() {
		Assert.assertEquals(graphPage.Graph_linkenabled(),true);
	}
	
	@When("User checks if Graph Representations link is enabled")
	public void user_checks_if_graph_representations_link_is_enabled() {
		graphPage.GraphRepresentations_linkenabled();
	}
	
    @Then("Graph Representations link should be enabled")
	public void graph_representations_link_should_be_enabled() {
    	Assert.assertEquals(graphPage.GraphRepresentations_linkenabled(),true);
	}
	
    @When("User clicks on Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
		graphPage.GraphRepresentations();
	}

	@Then("User is navigated to Graph Representations page")
	public void user_is_navigated_to_graph_representations_page() {
		Assert.assertEquals(graphPage.GraphRepresentations_linkenabled(),true);  
	}
	
	@Given("User is on Graph Representations page")
	public void user_is_on_graph_representations_page() {
		logger.info("User is on Graph Representations page");   
	}
	
	@When("User clicks on Try here>>> button of Graph Representations page")
	public void user_clicks_on_try_here_button_of_graph_representations_page() {
		 graphPage.Tryhere();
	}

	@Then("User is navigated to tryEditor page of Graph Representations page")
	public void user_is_navigated_to_try_editor_page_of_graph_representations_page() {
		logger.info("User is navigated to tryEditor page of Graph Representations page");  
	}

	@Given("The user is in the Try Editor page for the Graph Representations page")
	public void the_user_is_in_the_try_editor_page_for_the_graph_representations_page() {
		logger.info("The user is in the Try Editor page for the Graph Representations page");    
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Graph Representations page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_graph_representations_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		graphPage.tryEditorWindow(sheetName,rowNumber);
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Graph Representations page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_graph_representations_page() {
		logger.info("The user should be able to get an output in the Try Editor screen for the Graph Representations page"); 
	}
	
	@Given("The user is in the Try Editor page of Graph Representations page")
	public void the_user_is_in_the_try_editor_page_of_graph_representations_page() {
		logger.info("The user is in the Try Editor page of Graph Representations page");  
	}

	@When("The user clicks <- in the Try Editor screen of Graph Representations page")
	public void the_user_clicks_in_the_try_editor_screen_of_graph_representations_page() {
		driver.navigate().back();   
	}

	@Then("The user should be able to navigate to Graph Representations page")
	public void the_user_should_be_able_to_navigate_to_graph_representations_page() {
		Assert.assertEquals(graphPage.GraphRepresentations_linkenabled(),true);
	}
    
	@When("User clicks on Practice Questions link of Graph module")
	public void user_clicks_on_practice_questions_link_of_graph_module() throws InterruptedException {
	   graphPage.PracticeQuestions(); 
	}
    
	@Then("User is navigated to Practice Questions page of Graph module")
	public void user_is_navigated_to_practice_questions_page_of_graph_module() {
		logger.info("User is navigated to Practice Questions page of Graph module"); 
	}
}
