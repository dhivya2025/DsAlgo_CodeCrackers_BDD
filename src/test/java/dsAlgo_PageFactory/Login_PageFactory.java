package dsAlgo_PageFactory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver_Factory.Driver_Factory;
import dsAlgo_Reader.ConfigReader;

public class Login_PageFactory {

	WebDriver driver= Driver_Factory.getDriver();
	ConfigReader configFileReader=Driver_Factory.configReader();
	
	@FindBy ( linkText = "Sign in") WebElement signInLoginBtn;
	@FindBy ( xpath = "//input[@id='id_username']") public WebElement userNameLoginBtn;
	@FindBy ( xpath = "//input[@id='id_password']") public WebElement passwordLoginBtn;
	@FindBy ( xpath = "//input[@value='Login']") WebElement LoginBtn;
	@FindBy ( xpath = "//div[contains(text(),'logged in')]") WebElement loggedInMessage;
	@FindBy ( xpath = "//div[contains(text(),'successfully')]") WebElement loggedOutMessage;
	@FindBy ( xpath = "//div[contains(text(),'Invalid')]") WebElement invalidMessage;
	@FindBy ( xpath = "//a[text()='Sign out']") WebElement signOutBtn;
			
	public Login_PageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	public void signInClick() {
		signInLoginBtn.click();
	}
	
	public boolean signInLoginBtnDisplayed() {
		return signInLoginBtn.isDisplayed();
	}
	
	public void LoginBtnClick() {
		LoginBtn.click();
	}
	
	public void signOutBtnClick() {
		signOutBtn.click();
	}

	public boolean signOutBtnDisplayed() {
		return signOutBtn.isDisplayed();
	}
	
	public void LoggedMessageSignIn(String loggedInMsg) {
		String verifyLogMessage = loggedInMessage.getText();
		assertTrue(verifyLogMessage.contains(loggedInMsg));    
	}
	
	public void LoggedMessageSignOut(String loggedOutMsg) {
		String verifyLogMessage = loggedOutMessage.getText();
		assertTrue(verifyLogMessage.contains(loggedOutMsg));    
	}
		
	public void invalidMessage(String invalidMsg) {
		String verifyLogMessage = invalidMessage.getText();
		assertTrue(verifyLogMessage.contains(invalidMsg));    
	}
	
	public String getPopUpMessage() {
		WebElement activeElement = driver.switchTo().activeElement();
		String actualMessage = activeElement.getDomProperty("validationMessage").trim();
		return actualMessage;
	}
}
