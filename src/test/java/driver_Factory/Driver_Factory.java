package driver_Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsAlgo_Reader.ConfigReader;

public class Driver_Factory {
public static WebDriver driver;
	
	public static  ConfigReader configFileReader = new ConfigReader();
	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>() ;
	//Thread local
	public static WebDriver initDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			//LoggerLoad.info("Testing on firefox");
			
			tldriver.set(new FirefoxDriver());
			
		} else if (browser.equalsIgnoreCase("chrome")) {
			//LoggerLoad.info("Testing on chrome");
			
			tldriver.set(new ChromeDriver());
			
		
		} else if (browser.equalsIgnoreCase("edge")) {
			//LoggerLoad.info("Testing on Edge");
			
			tldriver.set(new EdgeDriver());
		}
		
		getDriver().manage().deleteAllCookies();
//		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
	}
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	public static void quitDriver() throws Throwable {
		
		if (tldriver.get() != null) {
			tldriver.get().quit();
			tldriver.remove();
		}
	}
//	public void closeallDriver() {
//		driver.quit();
//	}
	public static ConfigReader configReader() {
		return configFileReader;
	}

}