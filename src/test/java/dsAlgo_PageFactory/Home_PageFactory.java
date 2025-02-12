package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_PageFactory {
		
	@FindBy ( xpath = "//button[text()='Get Started']")  WebElement getStartedHomeBtn;
	@FindBy ( xpath = "//h1[text()='Preparing for the Interviews']") WebElement randomClick;
	@FindBy ( xpath = "//a[text()='Data Structures']") WebElement dataStructureDropDown;
	@FindBy ( xpath = "//a[text()='Arrays']") WebElement arraysBtn;
	@FindBy ( xpath = "//a[text()='Linked List']") WebElement linkedListBtn;
	@FindBy ( xpath = "//a[text()='Stack']") WebElement stackBtn;
	@FindBy ( xpath = "//a[text()='Queue']") WebElement queueBtn;
	@FindBy ( xpath = "//a[text()='Tree']") WebElement treeBtn;
	@FindBy ( xpath = "//a[text()='Graph']") WebElement graphBtn;
	@FindBy ( xpath = "//div[contains(text(),'logged in')]") WebElement homeLogMessage;
	
	@FindBy ( xpath = "//div[h5[text()='Data Structures-Introduction']]//a[text()='Get Started']") WebElement dataStructureGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Array']]//a[text()='Get Started']") WebElement arrayGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Linked List']]//a[text()='Get Started']") WebElement linkedListGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Stack']]//a[text()='Get Started']") WebElement stackGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Queue']]//a[text()='Get Started']") WebElement queueGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Tree']]//a[text()='Get Started']") WebElement treeGetStartedBtn;
	@FindBy ( xpath = "//div[h5[text()='Graph']]//a[text()='Get Started']") WebElement graphGetStartedBtn;
	
	@FindBy ( xpath = "//h4[text()='Data Structures-Introduction']") WebElement dataStructuresTitle;
	@FindBy (xpath = "//h4[text()='Array']") WebElement arrayTitle;
	@FindBy (xpath = "//h4[text()='Linked List']") WebElement linkedListTitle;
	@FindBy (xpath = "//h4[text()='Stack']") WebElement stackTitle;
	@FindBy (xpath = "//h4[text()='Queue']") WebElement queueTitle;
	@FindBy (xpath = "//h4[text()='Tree']") WebElement treeTitle;
	@FindBy (xpath = "//h4[text()='Graph']") WebElement graphTitle;
	
	WebDriver driver;
	
	public Home_PageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchURL() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	public void getStartedHomeBtnClick() {
		getStartedHomeBtn.click();
	}
	
	public boolean dataStructureDropDownDisplayed() {
		return dataStructureDropDown.isDisplayed();
	}
		
	public String getHomeLogMessage() {
	    return homeLogMessage.getText();
	}
	
	public void dataStructureDropDownClick() {
		dataStructureDropDown.click();
	}
	
	public void arraysBtnClick() {
		arraysBtn.click();
	}
	
	public void linkedListBtnClick() {
		linkedListBtn.click();
	}
	
	public void stackBtnClick() {
		stackBtn.click();
	}
	
	public void queueBtnClick() {
		queueBtn.click();
	}
	
	public void treeBtnClick() {
		treeBtn.click();
	}
	
	public void graphBtnClick() {
		graphBtn.click();
	}
	
	public void randomClickMethod() {
		randomClick.click();
	}
	
	public void dataStructureGetStartedBtnClick() {
		dataStructureGetStartedBtn.click();
	}
	
	public void arrayGetStartedBtnClick() {
		arrayGetStartedBtn.click();
	}
	
	public void linkedListGetStartedBtnClick() {
		linkedListGetStartedBtn.click();
	}
	
	public void stackGetStartedBtnClick() {
		stackGetStartedBtn.click();
	}
	
	public void queueGetStartedBtnClick() {
		queueGetStartedBtn.click();
	}
	
	public void treeGetStartedBtnClick() {
		treeGetStartedBtn.click();
	}
	
	public void graphGetStartedBtnClick() {
		graphGetStartedBtn.click();
	}
	
	public boolean dataStructuresTitleDisplayed() {
		return dataStructuresTitle.isDisplayed();
	}
	
	public boolean arrayTitleDisplayed() {
		return arrayTitle.isDisplayed();
	}
	
	public boolean linkedListTitleDisplayed() {
		return linkedListTitle.isDisplayed();
	}
	
	public boolean stackTitleDisplayed() {
		return stackTitle.isDisplayed();
	}
	
	public boolean queueTitleDisplayed() {
		return queueTitle.isDisplayed();
	}
	
	public boolean treeTitleDisplayed() {
		return treeTitle.isDisplayed();
	}
	
	public boolean graphTitleDisplayed() {
		return graphTitle.isDisplayed();
	}
}
