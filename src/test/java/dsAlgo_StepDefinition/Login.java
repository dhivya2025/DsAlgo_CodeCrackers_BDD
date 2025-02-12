package dsAlgo_StepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_Factory.Driver_Factory;
import dsAlgo_PageFactory.Home_PageFactory;
import dsAlgo_PageFactory.Login_PageFactory;
import dsAlgo_Reader.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
    Home_PageFactory homePage;
    Login_PageFactory loginPage;
    ExcelReader readExcel;
    
    public Login() {
    	this.driver = Driver_Factory.getDriver(); 
    	homePage = new Home_PageFactory(driver);
        loginPage = new Login_PageFactory(driver);
        readExcel = new ExcelReader();
    }
    
	@Given("The user is on the DS Algo Home page")
	public void the_user_is_on_the_ds_algo_home_page() {
        homePage.launchURL();
		homePage.getStartedHomeBtnClick();

	    Assert.assertEquals(loginPage.signInLoginBtnDisplayed(),true);
		System.out.println("User is in Home Page"); 
	}

	@When("The user clicks the Sign In link")
	public void the_user_clicks_the_sign_in_link() {
	   loginPage.signInClick();
	}

	@Then("The user should be redirected to the Sign In page")
	public void the_user_should_be_redirected_to_the_sign_in_page() {
		assertTrue(loginPage.signInLoginBtnDisplayed());
	}

	@Given("The user is on the DS Algo Sign In page")
	public void the_user_is_on_the_ds_algo_sign_in_page() throws InterruptedException {
	    Assert.assertEquals(loginPage.signInLoginBtnDisplayed(),true);
		Thread.sleep(3000);
	}

	@When("The user gets data from excel sheet {string} and {int} for the login page")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page(String sheetName, int rowNumber) throws IOException {
		loginPage.signInClick();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userNameLoginBtn.sendKeys(credentials[0]);
		loginPage.passwordLoginBtn.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();   
	}

	@Then("The error message appears below Username and Password textbox like {string}")
	public void the_error_message_appears_below_username_and_password_textbox_like(String message) {
		String actualmessage = loginPage.getPopUpMessage();
		System.out.println(actualmessage);
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

	@Then("The user should land in Data Structure Home Page with valid {string}")
	public void the_user_should_land_in_data_structure_home_page_with_valid(String loggedInMessage) {
		loginPage.LoggedMessageSignIn(loggedInMessage);
	
	}
	

	@Given("The user is in the Home page after Sign In")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    Assert.assertEquals(loginPage.signOutBtnDisplayed(),true);

		
	}

	@When("The user clicks Sign Out")
	public void the_user_clicks_sign_out() {
	   
	  loginPage.signOutBtnClick();  
	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String loggedOutMessage) {
		loginPage.LoggedMessageSignOut(loggedOutMessage);
 
		
	}
	
	@Given("The user clicks the Sign In link from the portal")
	public void the_user_clicks_the_sign_in_link_from_the_portal() {
		homePage.launchURL();
		homePage.getStartedHomeBtnClick();
		
	}

}
