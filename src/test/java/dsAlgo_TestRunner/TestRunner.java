package dsAlgo_TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber1.html"},
		features = "src/test/resources/features",
		glue = "dsAlgo_StepDefinition",
       monochrome=true
		//this is for html report
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
)

public class TestRunner extends AbstractTestNGCucumberTests{
	  
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
}
