package com.Core;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonFunctions {
	
	public static String capture(String screenShotName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)DriverClass.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
//		String des = System.getProperty("user.dir")+"\\ScreenShots"+screenShotName+".png";
		String des = EnvProperties.ScreenShotPath+screenShotName+".png";
		File destination = new File(des);
		FileUtils.copyFile(source, destination);	
		return des;
		
	}
	
	public static  void upload() {
		
	}
	
	public static void download() {
		
	}

}
