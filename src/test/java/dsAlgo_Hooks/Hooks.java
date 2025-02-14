package dsAlgo_Hooks;

import org.openqa.selenium.WebDriver;

import driver_Factory.Driver_Factory;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {  
    	System.setProperty("log4j2.configurationFile", "src/test/resources/log4j2.properties");
        String browser = System.getProperty("browser", "chrome"); 
        logger.info("Starting tests on browser: " + browser);
        Driver_Factory.initDriver(browser);
        driver = Driver_Factory.getDriver(); 
    }

    @AfterAll
    public static void teardown() {  
        if (driver != null) {
            logger.info("Closing browser after all tests");
            Driver_Factory.quitDriver();
        }
    }
}