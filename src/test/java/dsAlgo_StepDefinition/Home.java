package dsAlgo_StepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home{

	private WebDriver driver;
    private Home_PageFactory homePage;

    public Home() {
        this.driver = Driver_Factory.getDriver(); 
        homePage = new Home_PageFactory(driver); 
        System.out.println("Driver instance: " + Driver_Factory.getDriver());
    }
    
    @Given("User is in the ds-algo launch page")
    public void user_is_in_the_ds_algo_launch_page() {
        homePage.launchURL();
    }

	@When("User clicks the Get Started button in the launch page")
	public void user_clicks_the_get_started_button_in_the_launch_page() {
		homePage.getStartedHomeBtnClick();
	}

	@Then("User should be able to navigate to the home page")
	public void user_should_be_able_to_navigate_to_the_home_page() {
	    Assert.assertEquals(homePage.dataStructureDropDownDisplayed(),true);
		System.out.println("User is in Home Page");
	    
	}

	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		
	    System.out.println("User is in Home Page");
	}

	@When("User clicks on the Data Structures dropdown")
	public void user_clicks_on_the_data_structures_dropdown() {
		homePage.dataStructureDropDownClick();
	}

	@Then("User should be able to see the options: Arrays, Linked List, Stack, Queue, Tree, Graph in the dropdown menu")
	public void user_should_be_able_to_see_the_options_arrays_linked_list_stack_queue_tree_graph_in_the_dropdown_menu() {
	    Assert.assertEquals(homePage.dataStructureDropDownDisplayed(),true);
		System.out.println("DropDown with multiple options are displayed");
	}

	@When("User selects Arrays from the dropdown without signing in")
	public void user_selects_arrays_from_the_dropdown_without_signing_in() {
	   homePage.arraysBtnClick();
	}

	@Then("User should be able to see a warning message You are not logged in")
	public void user_should_be_able_to_see_a_warning_message_you_are_not_logged_in() {
		String homeText = homePage.getHomeLogMessage(); 
		assertEquals("You are not logged in", homeText);   
	    System.out.println(homeText);
	}

	@When("User selects Linked List from the dropdown without signing in")
	public void user_selects_linked_list_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.linkedListBtnClick();
	}

	@When("User selects Stack from the dropdown without signing in")
	public void user_selects_stack_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.stackBtnClick();
	}

	@When("User selects Queue from the dropdown without signing in")
	public void user_selects_queue_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.queueBtnClick();
	}

	@When("User selects Tree from the dropdown without signing in")
	public void user_selects_tree_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.treeBtnClick();
	}

	@When("User selects Graph from the dropdown without signing in")
	public void user_selects_graph_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.graphBtnClick();
	}

	@When("User clicks on the launch page other than the Get Started")
	public void user_clicks_on_the_launch_page_other_than_the_get_started() {
	   homePage.randomClickMethod();
	}

	@Then("User should stay in the same launch page")
	public void user_should_stay_in_the_same_launch_page() {
	    System.out.println("User is in Launch Page");
	}

	@When("User clicks on the launch page other than the Get Started button")
	public void user_clicks_on_the_launch_page_other_than_the_get_started_button() {
		homePage.randomClickMethod();
	}

	@Then("User should not be able to navigate to the home page")
	public void user_should_not_be_able_to_navigate_to_the_home_page() {
	    System.out.println("User is in Launch Page");
	}
	
	@Given("The user is on the Sign In page")
	public void the_user_is_on_the_sign_in_page() throws InterruptedException {
		Thread.sleep(3000);
		homePage.getStartedHomeBtnClick();
	}
	
	@Then("The user is in Home Page")
	public void the_user_is_in_home_page() {
	   
	}
	
	@Given("User is on the SignIn page")
	public void user_is_on_the_sign_in_page() {
	   
	}
	
	@When("User clicks on Get Started button under Data Structures-Introduction section")
	public void user_clicks_on_get_started_button_under_data_structures_introduction_section() throws InterruptedException {
	 Thread.sleep(3000);
		homePage.dataStructureGetStartedBtnClick();
		 Thread.sleep(3000);

	}

	@Then("User should be navigated to Data Structures-Introduction page")
	public void user_should_be_navigated_to_data_structures_introduction_page() {
	    Assert.assertEquals(homePage.dataStructuresTitleDisplayed(),true);

	}
	
	@When("User clicks on Get Started button under Array section")
	public void user_clicks_on_get_started_button_under_array_section() {
		driver.navigate().back();
		homePage.arrayGetStartedBtnClick();
	    
	}

	@Then("User should be navigated to Array page")
	public void user_should_be_navigated_to_array_page() {
	    Assert.assertEquals(homePage.arrayTitleDisplayed(),true);

	    
	}
	
	@When("User clicks on Get Started button under Linked List section")
	public void user_clicks_on_get_started_button_under_linked_list_section() {
		driver.navigate().back();
		homePage.linkedListGetStartedBtnClick();
	}
	

	@Then("User should be navigated to Linked List page")
	public void user_should_be_navigated_to_linked_list_page() {

		Assert.assertEquals(homePage.linkedListTitleDisplayed(),true);
	}

	@When("User clicks on Get Started button under Stack section")
	public void user_clicks_on_get_started_button_under_stack_section() {
		driver.navigate().back();
		homePage.stackGetStartedBtnClick();
  
	    
	}

	@Then("User should be navigated to Stack page")
	public void user_should_be_navigated_to_stack_page() {
		Assert.assertEquals(homePage.stackTitleDisplayed(),true);

	    
	}

	@When("User clicks on Get Started button under Queue section")
	public void user_clicks_on_get_started_button_under_queue_section() {
		driver.navigate().back();
		homePage.queueGetStartedBtnClick();

	    
	}

	@Then("User should be navigated to Queue page")
	public void user_should_be_navigated_to_queue_page() {
		Assert.assertEquals(homePage.queueTitleDisplayed(),true);

	    
	}

	@When("User clicks on Get Started button under Tree section")
	public void user_clicks_on_get_started_button_under_tree_section() {
		driver.navigate().back();
		homePage.treeGetStartedBtnClick();

	    
	}

	@Then("User should be navigated to Tree page")
	public void user_should_be_navigated_to_tree_page() {
		Assert.assertEquals(homePage.treeTitleDisplayed(),true);
 
	    
	}

	@When("User clicks on Get Started button under Graph section")
	public void user_clicks_on_get_started_button_under_graph_section() {
		driver.navigate().back();

		homePage.graphGetStartedBtnClick();
  
	}

	@Then("User should be navigated to Graph page")
	public void user_should_be_navigated_to_graph_page() {
		Assert.assertEquals(homePage.graphTitleDisplayed(),true);
 
	    
	}


}
