package dsAlgo_PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_Reader.TryEditor;

import java.io.IOException;
import java.time.Duration;


public class Queue_PageFactory {
	
		@FindBy ( linkText = "Implementation of Queue in Python") WebElement ImplementationofQueueinPythonlink;
		@FindBy ( linkText = "Implementation using collections.deque") WebElement Implementationusingcollectionsdequelink;
		@FindBy ( linkText = "Implementation using array") WebElement ImplementationusingarrayLink;
		@FindBy ( linkText = "Queue Operations") WebElement QueueOperationslink;
			
		@FindBy(xpath="//a[contains(@href,'queue')]/..//a[text()='Get Started']")WebElement QueueGetStarted;
		@FindBy(xpath="//a[text()='Implementation of Queue in Python']")WebElement Implementation_of_Queue_in_Python;		
		@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement Queue_Implementation;			
		@FindBy(xpath="//a[text()='Implementation using array']")WebElement Implementation_Using_Array;					
		@FindBy(xpath="//a[text()='Queue Operations']")WebElement Queue_Operations;			
	    @FindBy(xpath="//a[text()='Practice Questions']")WebElement Practice_Questions;
	    
	    @FindBy (xpath ="//a[text()='Try here>>>']") WebElement TryHere;
	    @FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement QueueTryEditor;
	    @FindBy (xpath="//button[text()='Run']") WebElement RunButton;
		@FindBy (id="output") WebElement OutputWindow;
		
		@FindBy (className = "CodeMirror-scroll") WebElement textWindow;
	
		@FindBy (xpath="//a[text()='Search the Queue']")WebElement PracticeQuestionsQueue;
		
		WebDriver driver;
		TryEditor readTryEditor = new TryEditor();
		WebDriverWait wait;

			public Queue_PageFactory(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			
			
	public void QueueGetStarted() {
		QueueGetStarted.click();
	}
	public boolean ImplementationofQueueinPythonlinkEnabled() {
		return ImplementationofQueueinPythonlink.isEnabled();
	}
	public boolean ImplementationusingcollectionsdequelinkEnabled() {
		return Implementationusingcollectionsdequelink.isEnabled();
	}
	public boolean ImplementationusingarrayLinkEnabled() {
		return ImplementationusingarrayLink.isEnabled();
	}
	public boolean QueueOperationslinkEnabled() {
		return QueueOperationslink.isEnabled();
	}
	
	
	public boolean Implementation_of_Queue_in_Python_visible(){
		return Implementation_of_Queue_in_Python.isDisplayed();
	}
	
	
	public boolean PracticeQuestionsQueueDisplayed() {
		return PracticeQuestionsQueue.isDisplayed();
	}
	
	public void Implementation_Of_Queue_In_Python_Click() {
		Implementation_of_Queue_in_Python.click();
	}


	public void Implementation_Using_Collection_deque_Click() {
		driver.navigate().back();
		Queue_Implementation.click();
	}

	public void Implementation_Using_Array_Click() {
		driver.navigate().back();
		Implementation_Using_Array.click();
	}

	public void Queue_Operations_Click() {
		driver.navigate().back();
		Queue_Operations.click();
	}

	public void TryHere_Click() {
		TryHere.click();
	}
	
	public void RunButton_Click() {
		RunButton.click();
	}
	

	public void Practice_Questions_Click() {
	  	driver.navigate().back();
		Practice_Questions.click();
	}
	
	public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
		String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
		System.out.println(editor[0]);
		System.out.println(editor[1]);
		textWindow.sendKeys(editor[0]);
		RunButton_Click(); 
	
}
		

}
