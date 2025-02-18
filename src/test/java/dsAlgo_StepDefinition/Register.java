package dsAlgo_StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_PageFactory.Register_PageFactory;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	WebDriver driver;
    Home_PageFactory homePage;
    Login_PageFactory loginPage;
    Register_PageFactory registerPage;
    ExcelReader readExcel;
	private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();

    public Register() {
    	this.driver = Driver_Factory.getDriver(); 
    	homePage = new Home_PageFactory(driver);
        loginPage = new Login_PageFactory(driver);
        registerPage = new Register_PageFactory(driver);
        readExcel = new ExcelReader();
    }

	@Given("User is in the home page after launching ds-algo portal page")
	public void user_is_in_the_home_page_after_launching_ds_algo_portal_page() {
		logger.info("Register link is displayed");  
	}

	@When("User clicks Register link in the home page")
	public void user_clicks_register_link_in_the_home_page() {
		registerPage.registerLinkClick();
	}

	@Then("User should be able to navigate to Register page")
	public void user_should_be_able_to_navigate_to_register_page() {
		Assert.assertEquals(registerPage.registerBtnDisplayed(),true);
	}
	
	@Given("User is in the Register page after clicking Register link in the home page")
	public void user_is_in_the_register_page_after_clicking_register_link_in_the_home_page() {
		logger.info("Register Button is displayed");  
	}

	@When("User wants to enter data from excel sheet {string} and {int} for the username field")
	public void user_wants_to_enter_data_from_excel_sheet_and_for_the_username_field(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[0]);		
	}

	@Then("User should be able to enter username after clicking Register button in the Register page")
	public void user_should_be_able_to_enter_username_after_clicking_register_button_in_the_register_page() {
		registerPage.registerBtnClick();  
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the username field")
	public void user_enters_invalid_data_from_excel_sheet_and_for_the_username_field(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[0]); 
		registerPage.passwordRegisterBtn.sendKeys(credentials[1]);
		registerPage.passwordConfirmRegisterBtn.sendKeys(credentials[2]);
	}

	@Then("User should be able to get error message for username in the Register page")
	public void user_should_be_able_to_get_error_message_for_username_in_the_register_page() throws InterruptedException {
		registerPage.registerBtnClick();
		String invalidMsg = registerPage.invalidMessageDisplayed();    
	   System.out.println(invalidMsg);
	}

	@When("User wants to enter data from excel sheet {string} and {int} for the password field")
	public void user_wants_to_enter_data_from_excel_sheet_and_for_the_password_field(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[1]); 
	}

	@Then("User should be able to enter password after clicking Register button in the Register page")
	public void user_should_be_able_to_enter_password_after_clicking_register_button_in_the_register_page() {
		registerPage.registerBtnClick();     
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the password field")
	public void user_enters_invalid_data_from_excel_sheet_and_for_the_password_field(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[0]); 
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(credentials[1]);
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(credentials[2]);
		registerPage.registerBtnClick();
	}

	@Then("User should be able to get an error message for password in the Register page")
	public void user_should_be_able_to_get_an_error_message_for_password_in_the_register_page() {
		String invalidMsg = registerPage.invalidMessageDisplayed();    
	   System.out.println(invalidMsg);  
	}

	@When("The user enters data from excel sheet {string} and {int} for all the fields to be left blank")
	public void the_user_enters_data_from_excel_sheet_and_for_all_the_fields_to_be_left_blank(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[0]); 
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(credentials[1]);
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(credentials[2]);
		registerPage.registerBtnClick();
	}

	@Then("The user should be able to get this pop-up message in the Register page")
	public void the_user_should_be_able_to_get_this_pop_up_message_in_the_register_page() {
		String actualmessage = loginPage.getPopUpMessage();
		System.out.println(actualmessage);
	}

	@Given("User is in the Register page to enter username, password and password confirmation")
	public void user_is_in_the_register_page_to_enter_username_password_and_password_confirmation() {
		logger.info("Register button is displayed");  
	}

	@When("User enters data from excel sheet {string} and {int} for all the fields and click RegisterButton")
	public void user_enters_data_from_excel_sheet_and_for_all_the_fields_and_click_register_button(String sheetName, int rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber); 
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(credentials[0]); 
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(credentials[1]); 
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(credentials[2]); 
		registerPage.registerBtnClick();
	}

	@Then("User should be able to naviagte to home page and get the success message")
	public void user_should_be_able_to_naviagte_to_home_page_and_get_the_success_message() {
		String sucessGetText = registerPage.successMessageDisplayed();
		System.out.println(sucessGetText);  
	}
}
