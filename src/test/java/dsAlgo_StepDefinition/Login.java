package dsAlgo_StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
    Home_PageFactory homePage;
    Login_PageFactory loginPage = new Login_PageFactory();
   ExcelReader readExcel = new ExcelReader();

    private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();

	@Given("user is on the DS Algo Sign in Page")
	public void user_is_on_the_ds_algo_sign_in_page() {
//		homePage = new Home_PageFactory(); 
		homePage.launchURL();
		homePage.getStartedHomeBtnClick();

	}
	
//	@When("^The user clicks login button after entering valid (.*) and (.*)$")
////	@When("^The user clicks login button after entering valid \"([^\"]*)\" and (\\d+)$")
//
//	public void the_user_clicks_login_button_after_entering_valid_sheetname_and_row_number(String sheetName, int rowNumber) throws IOException {
//		loginPage.signInClick();
//		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
//	    loginPage.userNameLoginBtn.sendKeys(username);
//		loginPage.passwordLoginBtn.sendKeys(password);
//		loginPage.LoginBtnClick();   
//	}

    @Given("The user clicks the Sign In link")
	public void the_user_clicks_the_sign_in_link() {
//		homePage.getStartedHomeBtnClick();
	   loginPage.signInClick();
	}
    
	@When("The user gets data from excel sheet {string} and {int} for the login page")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page(String sheetName, int rowNumber) throws IOException {
//		loginPage.signInClick();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userNameLoginBtn.sendKeys(credentials[0]);
		loginPage.passwordLoginBtn.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();   
	}
	
	@Given("The user is in the Home page after Sign In")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    logger.info("Sign Out link is displayed");
	}
	
	@And("The user clicks Sign Out")
	public void the_user_clicks_sign_out() { 
	  loginPage.signOutBtnClick();  
	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String loggedOutMessage) {
		loginPage.LoggedMessageSignOut(loggedOutMessage);		
	}
	    
	@Given("The user is on the DS Algo Sign In page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
	    logger.info("Login button is displayed");
	}  

	@Then("The error message appears below Username and Password textbox like {string}")
	public void the_error_message_appears_below_username_and_password_textbox_like(String message) {
		String actualmessage = loginPage.getPopUpMessage();
		Assert.assertEquals(actualmessage, message);
	}
	
	@When("The user gets invalid data from excel sheet {string} and {int} for the login page")
	public void the_user_gets_invalid_data_from_excel_sheet_and_for_the_login_page(String sheetName, int rowNumber) throws IOException {
		loginPage.signInClick();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userNameLoginBtn.sendKeys(credentials[0]);
		loginPage.passwordLoginBtn.sendKeys(credentials[1]);
		loginPage.LoginBtnClick(); 
	}

	@Then("The user should be able to see an error message {string}")
	public void the_user_should_be_able_to_see_an_error_message(String errorMessage) {
		loginPage.invalidMessage(errorMessage);
	}
	
	@Given("The user clicks the Sign In link from the portal")
	public void the_user_clicks_the_sign_in_link_from_the_portal() {
		homePage.launchURL();
		homePage.getStartedHomeBtnClick();
	}
	
	@When("^login with \"([^\"]*)\" and (\\d+)$")
	public void login_with_and(String sheetName, int rowNumber) throws IOException {
		loginPage.signInClick();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userNameLoginBtn.sendKeys(credentials[0]);
		loginPage.passwordLoginBtn.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();   
	}
}
