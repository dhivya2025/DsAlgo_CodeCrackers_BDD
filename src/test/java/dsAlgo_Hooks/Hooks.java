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
    public static void setup() {  // Static because @BeforeAll runs once before everything
        String browser = System.getProperty("browser", "chrome"); 
        logger.info("Starting tests on browser: " + browser);
        Driver_Factory.initDriver(browser);
        driver = Driver_Factory.getDriver();  // Store the WebDriver instance
    }

//    @Before
//    public void beforeScenario(Scenario scenario) {
//        logger.info("Running scenario: " + scenario.getName());
//        driver.manage().deleteAllCookies();  // Clear cookies before each scenario to maintain state
//    }

    @AfterAll
    public static void teardown() {  // Static because @AfterAll runs once after everything
        if (driver != null) {
            logger.info("Closing browser after all tests");
            Driver_Factory.quitDriver();
        }
    }
}
