package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_PageFactory {
	@FindBy ( xpath = "//a[text()=' Register ']") WebElement registerLink;	
	@FindBy (id = "id_username") public WebElement userNameRegisterBtn;
	@FindBy (id = "id_password1") public WebElement passwordRegisterBtn;
	@FindBy (id = "id_password2") public WebElement passwordConfirmRegisterBtn;
	@FindBy (xpath = "//input[@type='submit']") WebElement registerBtn;
	@FindBy ( xpath = "//div[contains(text(),'Account Created')]") WebElement successMessage;
	@FindBy ( xpath = "//div[contains(text(),'password_mismatch')]") WebElement invalidMessage;
	
	WebDriver driver;
	
	public Register_PageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean registerLinkDisplayed() {
		return registerLink.isDisplayed();
	}
	
	public void registerLinkClick() {
		registerLink.click();
	}
	
	public void registerBtnClick() {
		registerBtn.click();
	}
	
	public boolean registerBtnDisplayed() {
		return registerBtn.isDisplayed();
	}
	
	public void userNameRegisterBtnClick() {
		userNameRegisterBtn.click();
	}
	
	public void passwordRegisterBtnClick() {
		passwordRegisterBtn.click();
	}
	
	public void passwordConfirmRegisterBtnClick() {
		passwordConfirmRegisterBtn.click();
	}
	
	public String invalidMessageDisplayed() {
		return invalidMessage.getText();
	}
	
	public String successMessageDisplayed() {
		 String homeSuccessMessage = successMessage.getText();
		 return homeSuccessMessage;
	}
}
