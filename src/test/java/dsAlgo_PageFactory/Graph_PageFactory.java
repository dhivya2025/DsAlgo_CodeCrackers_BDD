package dsAlgo_PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsAlgo_Reader.TryEditor;

public class Graph_PageFactory {
	   @FindBy (xpath = "//a[contains(@href,'graph')]/..//a[text()='Get Started']") WebElement getstartedGraph;
	   @FindBy (xpath = "//a[@class='list-group-item']/..//a[text()='Graph']") WebElement graphlink;
	   @FindBy (linkText = "Graph") WebElement Graph_link;
       @FindBy (xpath = "//a[text()='Graph Representations']") WebElement graphrepresentations;
	   @FindBy (xpath = "//a[normalize-space()='Graph Representations']") WebElement GraphRepresentations_link;
	   @FindBy (xpath ="//a[text()='Try here>>>']") WebElement tryhere;
	   @FindBy (xpath = "//a[text()='Practice Questions']") WebElement practicequestions;
	   @FindBy (xpath="//button[text()='Run']") WebElement RunButton;

	   @FindBy (className = "CodeMirror-scroll") WebElement textWindow;
	   TryEditor readTryEditor = new TryEditor();
	   WebDriver driver;
	   public Graph_PageFactory(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	   }

       public void GetStartedGraph() {
       getstartedGraph.click();
       }
     
       public boolean Graph_linkenabled() {
	   return Graph_link.isEnabled();
	   }
     
       public void Graph() {
       graphlink.click();
       }
       
       public boolean GraphRepresentations_linkenabled() {
       return GraphRepresentations_link.isEnabled();
       }
      
       public void GraphRepresentations() {
       graphrepresentations.click(); 
       }

       public void PracticeQuestions() throws InterruptedException {
       practicequestions.click();
       }
     
       public void Tryhere() {
  	   tryhere.click();
       }
     
       public void RunButton() {
  	   RunButton.click();
       }
     
       public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
 	   String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
 	   System.out.println(editor[0]);
 	   System.out.println(editor[1]);
 	   textWindow.sendKeys(editor[0]);
 	   RunButton();
 	   }
}
