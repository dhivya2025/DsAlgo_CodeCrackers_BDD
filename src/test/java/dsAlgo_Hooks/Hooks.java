package dsAlgo_Hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import driver_Factory.Driver_Factory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(LoggerReader.class);
    private static WebDriver driver;
    private static Driver_Factory driverfactory; 
	ConfigReader configFileReader = new ConfigReader();

    
    @Before
    public void setup() {
//    	String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");	
        String browser = System.getProperty("browser", "chrome");
		
			//LoggerLoad.info("Testing on chrome");
    	if (browser==null) {
			System.out.println(" about to open browser" + "chrome");
			driverfactory = new Driver_Factory();
			driver = driverfactory.initDriver("chrome");
			driver.get(ConfigReader.getApplicationUrl());
			//LoggerLoad.info("Initializing driver for : "+ "chrome");
    	}
    	else {
    		driverfactory = new Driver_Factory();
			driver = driverfactory.initDriver(browser);
			driver.get(ConfigReader.getApplicationUrl());
    	}
    }
    
   
/*
    @Before
    public void beforeScenario(Scenario scenario) {
        logger.info("Running scenario: " + scenario.getName());
        driver.manage().deleteAllCookies();  // Clear cookies before each scenario to maintain state
    }
*/
    @After
    public static void teardown() throws Throwable {  // Static because @AfterAll runs once after everything
        if (driver != null) {
            logger.info("Closing browser after all tests");
            Driver_Factory.quitDriver();
        }
    }
}









