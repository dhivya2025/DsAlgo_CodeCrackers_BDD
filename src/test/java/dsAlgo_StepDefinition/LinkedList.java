package dsAlgo_StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.LinkedList_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList {
	private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();

	WebDriver driver;
    Home_PageFactory homePage;
    Login_PageFactory loginPage;
    LinkedList_PageFactory linkedListPage;
    TryEditor readTryEditor;
	
    public LinkedList() {
    	this.driver = Driver_Factory.getDriver(); 
    	homePage = new Home_PageFactory(driver);
        loginPage = new Login_PageFactory(driver);
        linkedListPage = new LinkedList_PageFactory(driver);
        readTryEditor = new TryEditor();
    }
	
	@Given("User is on the signIn page")
	public void user_is_on_the_sign_in_page() {
		logger.info("User is in the Sign in page");     
	}
	
	@When("User clicks on the Get Started button under Linked List section")
	public void user_clicks_on_the_get_started_button_under_linked_list_section()  {
		linkedListPage.getStartedLinkedListBtnClick();
	}
	
	@Then("User is navigated to Linked List page")
	public void user_is_navigated_to_linked_list_page() {
		Assert.assertEquals(linkedListPage.linkedListTitleDisplayed(),true);
	}

	@Given("The user is in the Linked List page after Sign-In")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		logger.info("Linked List Title is displayed");  
	}

	@When("The user checks whether the Introduction link is enabled")
	public void the_user_checks_whether_the_introduction_link_is_enabled() {
		Assert.assertEquals(linkedListPage.introductionLinkEnabled(),true);
	}

	@Then("The user should be able to see Introduction link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_introduction_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.introductionLinkEnabled(),true);
	}

	@When("The user checks whether the Creating Linked List link is enabled")
	public void the_user_checks_whether_the_creating_linked_list_link_is_enabled() {
		Assert.assertEquals(linkedListPage.creatingLinkedListLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Creating Linked List link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_creating_linked_list_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.creatingLinkedListLinkEnabled(),true);
	}

	@When("The user checks whether the Types of Linked List link is enabled")
	public void the_user_checks_whether_the_types_of_linked_list_link_is_enabled() {
		Assert.assertEquals(linkedListPage.typesOfLinkedListLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Types of Linked List link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_types_of_linked_list_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.typesOfLinkedListLinkEnabled(),true);
	}
	
	@When("The user checks whether the Implement Linked List in Python link is enabled")
	public void the_user_checks_whether_the_implement_linked_list_in_python_link_is_enabled() {
		Assert.assertEquals(linkedListPage.implementLinkedListLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Implement Linked List in Python link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_implement_linked_list_in_python_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.implementLinkedListLinkEnabled(),true);
	}
	
	@When("The user checks whether the Traversal link is enabled")
	public void the_user_checks_whether_the_traversal_link_is_enabled() {
		Assert.assertEquals(linkedListPage.traversalLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Traversal link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_traversal_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.traversalLinkEnabled(),true);
	}
	
	@When("The user checks whether the Insertion link is enabled")
	public void the_user_checks_whether_the_insertion_link_is_enabled() {
		Assert.assertEquals(linkedListPage.insertionLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Insertion link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_insertion_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.insertionLinkEnabled(),true);
	}
	
	@When("The user checks whether the Deletion link is enabled")
	public void the_user_checks_whether_the_deletion_link_is_enabled() {
		Assert.assertEquals(linkedListPage.deletionLinkEnabled(),true);
	}
	
	@Then("The user should be able to see Deletion link enabled in the Linked List page")
	public void the_user_should_be_able_to_see_deletion_link_enabled_in_the_linked_list_page() {
		Assert.assertEquals(linkedListPage.deletionLinkEnabled(),true);
	}

	@When("The user clicks Introduction link in the Linked List page")
	public void the_user_clicks_introduction_link_in_the_linked_list_page() {
	   linkedListPage.introductionLinkClick();
	}

	@Given("The user is in the Introduction page")
	public void the_user_is_in_the_introduction_page() {
		logger.info("Introduction Title is displayed");  
	}

	@When("The user clicks Try Here >>> button in the Introduction page")
	public void the_user_clicks_try_here_button_in_the_introduction_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@Then("The user should be able to navigate to Try Editor page with Run button to test")
	public void the_user_should_be_able_to_navigate_to_try_editor_page_with_run_button_to_test() {
		Assert.assertEquals(linkedListPage.runBtnDisplayed(),true);
	}

	@Given("The user is in the Try Editor page for the Introduction page")
	public void the_user_is_in_the_try_editor_page_for_the_introduction_page() {
		logger.info("Run button is displayed");  
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Introduction page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_introduction_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber);
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Introduction page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_introduction_page() {
	  logger.info("User is in Try Editor window");
	}

	@Given("The user is in the Try Editor page for the Linked List page")
	public void the_user_is_in_the_try_editor_page_for_the_Linked_List_page() {
		logger.info("Run button is displayed");  
	}

	@When("The user clicks <- in the Try Editor screen for the Linked List page")
	public void the_user_clicks_in_the_try_editor_screen_for_the_Linked_List_page() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to Introduction page")
	public void the_user_should_be_able_to_navigate_to_introduction_page() {
		Assert.assertEquals(linkedListPage.introductionTitleDisplayed(),true);
	}

	@When("The user clicks Creating Linked List link in the Linked List page")
	public void the_user_clicks_creating_linked_list_link_in_the_linked_list_page() {
		linkedListPage.creatingLinkedListLinkClick();
	}

	@Then("The user should be able to navigate to Creating Linked List page")
	public void the_user_should_be_able_to_navigate_to_creating_linked_list_page() {
		Assert.assertEquals(linkedListPage.creatingLinkedListTitleDisplayed(),true);
	}

	@Given("The user is in the Creating Linked List page")
	public void the_user_is_in_the_creating_linked_list_page() {
		logger.info("Creating Linked List Title is displayed");  
	}

	@When("The user clicks Try Here >>> button in the Creating Linked List page")
	public void the_user_clicks_try_here_button_in_the_creating_linked_list_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@When("User selects Linked List option from Data Structures drop-down")
	public void user_selects_linked_list_option_from_data_structures_drop_down() {
		loginPage.signInClick();
		loginPage.LoginBtnClick();  
		homePage.dataStructureDropDownClick(); 
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Creating Linked List page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_creating_linked_list_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber);  
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Creating Linked List page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_creating_linked_list_page() {
		  logger.info("User is in Try Editor window");  
	}

	@When("The user clicks Types of Linked List link in the Linked List page")
	public void the_user_clicks_types_of_linked_list_link_in_the_linked_list_page() {
		linkedListPage.typesOfLinkedListLinkClick();
	}

	@Then("The user should be able to navigate to Types of Linked List page")
	public void the_user_should_be_able_to_navigate_to_types_of_linked_list_page() {
		Assert.assertEquals(linkedListPage.typesOfLinkedListTitleDisplayed(),true);
	}

	@Given("The user is in the Types of Linked List page")
	public void the_user_is_in_the_types_of_linked_list_page() {
		logger.info("Types of Linked List Title is displayed");  
	}
	
	@When("The user clicks Try Here >>> button in the Types of Linked List page")
	public void the_user_clicks_try_here_button_in_the_types_of_linked_list_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@Given("The user is in the Try Editor page for the Types of Linked List page")
	public void the_user_is_in_the_try_editor_page_for_the_types_of_linked_list_page() {
		logger.info("Run button is displayed");  
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Types of Linked List page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_types_of_linked_list_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber);    
	}

	@Given("The user is in the Try Editor page for the Creating Linked List page")
	public void the_user_is_in_the_try_editor_page_for_the_creating_linked_list_page() {
		logger.info("Run button is displayed");  
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Types of Linked List page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_types_of_linked_list_page() {
		  logger.info("User is in Try Editor window");
	}

	@When("The user clicks Implement Linked List in Python link in the Linked List page")
	public void the_user_clicks_implement_linked_list_in_python_link_in_the_linked_list_page() {
		linkedListPage.implementLinkedListLinkClick();
	}

	@Then("The user should be able to navigate to Implement Linked List in Python page")
	public void the_user_should_be_able_to_navigate_to_implement_linked_list_in_python_page() {
		Assert.assertEquals(linkedListPage.implementLinkedListTitleDisplayed(),true);
	}

	@Given("The user is in the Implement Linked List in Python page")
	public void the_user_is_in_the_implement_linked_list_in_python_page() {
		logger.info("Implement Linked List Title is displayed");  
	}

	@When("The user clicks Try Here >>> button in the Implement Linked List in Python page")
	public void the_user_clicks_try_here_button_in_the_implement_linked_list_in_python_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@Given("The user is in the Try Editor page for the Implement Linked List in Python page")
	public void the_user_is_in_the_try_editor_page_for_the_implement_linked_list_in_python_page() {
		logger.info("Run button is displayed");  
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Implement Linked List in Python page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_implement_linked_list_in_python_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber);
	}

	@Then("The user should be able to get an output in the Try Editor screen for the Implement Linked List in Python page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implement_linked_list_in_python_page() {
		  logger.info("User is in Try Editor window");
	}

	@When("The user clicks Traversal link in the Linked List page")
	public void the_user_clicks_traversal_link_in_the_linked_list_page() {
		linkedListPage.traversalLinkClick();
	}
	
	@Then("The user should be able to navigate to Traversal page")
	public void the_user_should_be_able_to_navigate_to_traversal_page() {
		Assert.assertEquals(linkedListPage.traversalTitleDisplayed(),true);
	}

	@Given("The user is in the Traversal page")
	public void the_user_is_in_the_traversal_page() {
		logger.info("Traversal Title is displayed");  
	}
	
	@When("The user clicks Try Here >>> button in the Traversal page")
	public void the_user_clicks_try_here_button_in_the_traversal_page() {
		linkedListPage.tryHereBtnClick(); 
	}
	
	@Given("The user is in the Try Editor page for the Traversal page")
	public void the_user_is_in_the_try_editor_page_for_the_traversal_page() {
		logger.info("Run button is displayed");  
	}
	
	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Traversal page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_traversal_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber);  
	}
	@Then("The user should be able to get an output in the Try Editor screen for the Traversal page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_traversal_page() {
		  logger.info("User is in Try Editor window");
	}

	@When("The user clicks Insertion link in the Linked List page")
	public void the_user_clicks_insertion_link_in_the_linked_list_page() {
		linkedListPage.insertionLinkClick();
	}
	
	@Then("The user should be able to navigate to Insertion page")
	public void the_user_should_be_able_to_navigate_to_insertion_page() {
		Assert.assertEquals(linkedListPage.insertionTitleDisplayed(),true);
	}
	
	@Given("The user is in the Insertion page")
	public void the_user_is_in_the_insertion_page() {
		logger.info("Insertion Title is displayed");  
	}
	
	@When("The user clicks Try Here >>> button in the Insertion page")
	public void the_user_clicks_try_here_button_in_the_insertion_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@Given("The user is in the Try Editor page for the Insertion page")
	public void the_user_is_in_the_try_editor_page_for_the_insertion_page() {
		logger.info("Run button is displayed");  
	}
	
	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Insertion page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_insertion_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber); 
	}
	
	@Then("The user should be able to get an output in the Try Editor screen for the Insertion page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_insertion_page() {
		  logger.info("User is in Try Editor window");    
	}
	
	@When("The user clicks Deletion link in the Linked List page")
	public void the_user_clicks_deletion_link_in_the_linked_list_page() {
		linkedListPage.deletionLinkClick();
	}
	
	@Then("The user should be able to navigate to Deletion page")
	public void the_user_should_be_able_to_navigate_to_deletion_page() {
		Assert.assertEquals(linkedListPage.deletionTitleDisplayed(),true);
	}

	@Given("The user is in the Deletion page")
	public void the_user_is_in_the_deletion_page() {
		logger.info("Deletion Title is displayed");  
	}
	
	@When("The user clicks Try Here >>> button in the Deletion page")
	public void the_user_clicks_try_here_button_in_the_deletion_page() {
		linkedListPage.tryHereBtnClick(); 
	}

	@Given("The user is in the Try Editor page for the Deletion page")
	public void the_user_is_in_the_try_editor_page_for_the_deletion_page() {
		logger.info("Run button is displayed");  
	}
	
	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for the Deletion page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_the_deletion_page(String sheetName, int rowNumber) throws IOException, InterruptedException {
		linkedListPage.tryEditorWindow(sheetName, rowNumber); 
	}
	
	@Then("The user should be able to get an output in the Try Editor screen for the Deletion page")
	public void the_user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_deletion_page() {
		  logger.info("User is in Try Editor window");    
	}

	@When("The user clicks Practice Questions link in the Deletion page")
	public void the_user_clicks_practice_questions_link_in_the_deletion_page() {
		linkedListPage.practiceQuestionsLinkClick();  
	}
	
	@Then("The user should be able to navigate to Practice Questions page")
	public void the_user_should_be_able_to_navigate_to_practice_questions_page() {
		  logger.info("User is in Practice Questions Page");
	}	
 }
