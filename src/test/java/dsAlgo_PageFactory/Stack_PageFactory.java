package dsAlgo_PageFactory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsAlgo_Reader.TryEditor;

public class Stack_PageFactory {

	WebDriver driver;
			
			@FindBy ( linkText = "Operations in Stack") WebElement OperationsinStacklink;
			@FindBy ( linkText = "Implementation") WebElement ImplementationLink;
			@FindBy ( linkText = "Applications") WebElement ApplicationLink;

	        @FindBy (xpath="//a[contains(@href,'stack')]/..//a[text()='Get Started']")WebElement StackGetStarted;
		    @FindBy (xpath="//a[@href='operations-in-stack']")WebElement OperationsInStack;
		    @FindBy (xpath="//a[normalize-space()='Implementation']")WebElement Implementation;
		    @FindBy (xpath="//a[normalize-space()='Applications']")WebElement Application;
		    @FindBy (xpath="//a[normalize-space()='Practice Questions']")WebElement Practice_Questions;

		    @FindBy (xpath ="//a[text()='Try here>>>']") WebElement TryHere;
		    @FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement StackTryEditor;
		    @FindBy (xpath="//button[text()='Run']") WebElement RunButton;
			@FindBy (id="output") WebElement OutputWindow;
			
			@FindBy (className = "CodeMirror-scroll") WebElement textWindow;
						
			@FindBy (xpath="//a[text()='Search the Stack']")WebElement PracticeQuestionsStack;
			

			TryEditor readTryEditor = new TryEditor();
			WebDriverWait wait;
			String ExpectedFromTestcaseOne;

				public Stack_PageFactory(WebDriver driver) {
					this.driver = driver;
					PageFactory.initElements(driver, this);
				}
				
				public void StackGetStarted() {
					StackGetStarted.click();
				}
				public boolean OperationsinStacklinkEnabled() {
					return OperationsinStacklink.isEnabled();
				}
				public boolean ImplementationLinkEnabled() {
					return ImplementationLink.isEnabled();
				}
				public boolean ApplicationLinkEnabled() {
					return ApplicationLink.isEnabled();
				}
				
				public boolean RunButtonEnabled() {
					return RunButton.isEnabled();
				}
				
				public boolean OutputWindowDisplayed() {
					return OutputWindow.isDisplayed();
				}
				
				public boolean PracticeQuestionsStackDisplayed() {
					return PracticeQuestionsStack.isDisplayed();
				}
				
		    
			public void Operations_Click() {
				OperationsInStack.click();
			}

			public void Implementation_Click() {
		    	driver.navigate().back();
				Implementation.click();
			}
			
			public void Stack_Applications_Click() {
		    	driver.navigate().back();
				Application.click();
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
/*
		public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
					String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
					System.out.println(editor[0]);
					System.out.println(editor[1]);
					//textWindow.sendKeys(editor[0]);
					ExpectedFromTestcaseOne = editor[1];
					
					WebElement codeMirror = driver.findElement(
							By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
					
					Actions actions = new Actions(driver);
					actions.moveToElement(codeMirror).click().perform();
					WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
					//textArea.clear();
					textArea.sendKeys(editor[0]);
				
					RunButton_Click(); 
				
			}
		
		public void ValidateExcelOutputMessage() {
			Assert.assertEquals(ExpectedFromTestcaseOne,OutputWindow.getText());

		}
*/

}
	
