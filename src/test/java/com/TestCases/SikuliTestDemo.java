package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.Core.EnvProperties;

public class SikuliTestDemo {
  @Test
  public void  CickImg() throws InterruptedException, FindFailed {
	  
	  System.setProperty("webdriver.gecko.driver",EnvProperties.WebDriverPath+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gooogle.com");
		Thread.sleep(3000);
 		Screen screen = new Screen();
 		System.out.println(EnvProperties.Img+"GoogleSearch.png");
		screen.click("C:\\Users\\sreejith\\Desktop\\XXX\\FinlabAccelerators\\src\\test\\resources\\Img\\GoogleSearch.png");
		Thread.sleep(3000);
		screen.click("C:\\Users\\sreejith\\Desktop\\XXX\\FinlabAccelerators\\src\\test\\resources\\Img\\SignIn.PNG");
//		driver.close();
//		driver.quit();
  }
}
