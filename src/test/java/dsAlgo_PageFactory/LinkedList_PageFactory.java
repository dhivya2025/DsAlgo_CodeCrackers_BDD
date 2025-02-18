package dsAlgo_PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_Reader.TryEditor;

public class LinkedList_PageFactory {

	@FindBy ( xpath = "//div[h5[text()='Linked List']]//a[text()='Get Started']") WebElement getStartedLinkedListBtn;
	@FindBy ( xpath = "//h4[text()='Linked List']") WebElement linkedListTitle;
	@FindBy ( linkText = "Introduction") WebElement introductionLink;
	@FindBy ( xpath = "//a[text()='Creating Linked LIst']") WebElement creatingLinkedListLink;
	@FindBy ( linkText = "Types of Linked List") WebElement typesOfLinkedListLink;
	@FindBy ( linkText = "Implement Linked List in Python") WebElement implementLinkedListLink;
	@FindBy ( linkText = "Traversal") WebElement traversalLink;
	@FindBy ( linkText = "Insertion") WebElement insertionLink;
	@FindBy ( linkText = "Deletion") WebElement deletionLink;
	
	@FindBy ( xpath = "//p[text()='Introduction']") WebElement introductionTitle;
	@FindBy ( xpath = "//p[text()='Creating Linked LIst']") WebElement creatingLinkedListTitle;
	@FindBy ( xpath = "//p[text()='Types of Linked List']") WebElement typesOfLinkedListTitle;
	@FindBy ( xpath = "//p[text()='Implement Linked List in Python']") WebElement implementLinkedListTitle;
	@FindBy ( xpath = "//p[text()='Traversal']") WebElement traversalTitle;
	@FindBy ( xpath = "//p[text()='Insertion']") WebElement insertionTitle;
	@FindBy ( xpath = "//p[text()='Deletion']") WebElement deletionTitle;
	
	@FindBy ( xpath = "//a[text()='Try here>>>']") WebElement tryHereBtn;
	@FindBy (className = "CodeMirror-scroll") WebElement textWindow;
	@FindBy ( xpath = "//button[text()='Run']") WebElement runBtn;
	@FindBy ( linkText = "Practice Questions") WebElement practiceQuestionsLink;
	
WebDriver driver;
TryEditor readTryEditor = new TryEditor();

	public LinkedList_PageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getStartedLinkedListBtnClick() {
		getStartedLinkedListBtn.click();
	}
	public boolean linkedListTitleDisplayed() {
		return linkedListTitle.isDisplayed();
	}
	public boolean introductionLinkEnabled() {
		return introductionLink.isEnabled();
	}
	public boolean creatingLinkedListLinkEnabled() {
		return creatingLinkedListLink.isEnabled();
	}
	public boolean typesOfLinkedListLinkEnabled() {
		return typesOfLinkedListLink.isEnabled();
	}
	public boolean implementLinkedListLinkEnabled() {
		return implementLinkedListLink.isEnabled();
	}
	public boolean traversalLinkEnabled() {
		return traversalLink.isEnabled();
	}
	public boolean insertionLinkEnabled() {
		return insertionLink.isEnabled();
	}
	public boolean deletionLinkEnabled() {
		return deletionLink.isEnabled();
	}
	public void introductionLinkClick() {
		introductionLink.click();
	}
	public void creatingLinkedListLinkClick() {
		creatingLinkedListLink.click();
	}
	public void typesOfLinkedListLinkClick() {
		typesOfLinkedListLink.click();
	}
	public void implementLinkedListLinkClick() {
		implementLinkedListLink.click();
	}
	public void traversalLinkClick() {
		traversalLink.click();
	}
	public void insertionLinkClick() {
		insertionLink.click();
	}
	public void deletionLinkClick() {
		deletionLink.click();
	}
	public boolean introductionTitleDisplayed() {
		return introductionTitle.isDisplayed();
	}
	public boolean creatingLinkedListTitleDisplayed() {
		return creatingLinkedListTitle.isDisplayed();
	}
	public boolean typesOfLinkedListTitleDisplayed() {
		return typesOfLinkedListTitle.isDisplayed();
	}
	public boolean implementLinkedListTitleDisplayed() {
		return implementLinkedListTitle.isDisplayed();
	}
	public boolean traversalTitleDisplayed() {
		return traversalTitle.isDisplayed();
	}
	public boolean insertionTitleDisplayed() {
		return insertionTitle.isDisplayed();
	}
	public boolean deletionTitleDisplayed() {
		return deletionTitle.isDisplayed();
	}
	public void tryHereBtnClick() {
		tryHereBtn.click();
	}
	public void runBtnClick() {
		runBtn.click();
	}
	public boolean runBtnDisplayed() {
		return runBtn.isDisplayed();
	}
	public void practiceQuestionsLinkClick() {
		practiceQuestionsLink.click();
	}
	public boolean practiceQuestionsLinkDisplayed() {
		return practiceQuestionsLink.isDisplayed();
	}
	public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
		String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
		System.out.println(editor[0]);
		System.out.println(editor[1]);
		textWindow.sendKeys(editor[0]);
		runBtnClick(); 
	}
}
