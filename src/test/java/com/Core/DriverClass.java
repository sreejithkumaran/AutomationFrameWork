package com.Core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass{
	public static WebDriver driver = null;	
	public static WebDriver Initialize(String browser) {
		if(driver == null) {
			if(browser.equalsIgnoreCase("FireFox")) {
				System.out.println("launching firefox browser"); 
				System.setProperty("webdriver.gecko.driver", EnvProperties.WebDriverPath+"geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("Chrome")) {
				System.out.println("launching chrome browser");
				System.setProperty("webdriver.chrome.driver", EnvProperties.WebDriverPath+"chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("IE")){
				System.out.println("launching chrome browser");
				System.setProperty("webdriver.ie.driver", EnvProperties.WebDriverPath+"IEDriverServer.exe");
				driver = new InternetExplorerDriver();	
			}else {
				System.out.println(" !!! Invalid Brower ....."); 
			}
		}
		return driver;
	}
	
	public static void MaximizeWindow() {	
		driver.manage().window().maximize();
		System.out.println("Window Maximized"); 
	}
	
	public static void openURL(String url) {	
		try {
			driver.get(url);
			ExtentManager.logInfo("Opened URL  : "+url);
			Log.info("Opened URl : "+url);
		}catch (Exception e) {
			ExtentManager.logFail("Unable to Opened URL  : "+url);
			Log.fatal("Unable to Opened URL  : "+url);
		}
		
	}
	
	public static void Navigate(String url) {	
		driver.navigate().to(url);
		System.out.println("URL ::"+url+"successfully.."); 
	}
		
	public static void NavigateForward() {	
		driver.navigate().forward();
	}
	
	public static void NavigateForward(String url) {	
		driver.navigate().back();
	}
	
	public static void Close() {
		driver.close();
	}
	
	public static void Quit() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
