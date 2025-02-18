package driver_Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;

public class Driver_Factory {
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	private static final org.apache.logging.log4j.Logger logger = LoggerReader.getLogger();
	
    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        tlDriver.set(driver);
    }

    public static void initDriver(String browser) {
    	   if (browser == null || browser.isEmpty()) {
               browser = ConfigReader.getProperty("browser");
           }
    	   
        WebDriver driver;
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        logger.info("Initializing WebDriver for browser: " + browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        setDriver(driver);
    }

    public static void quitDriver() {
        if (getDriver() != null) {
        	logger.info("Closing WebDriver for current thread.");
            getDriver().quit();
            tlDriver.remove();  
        }
    }
}