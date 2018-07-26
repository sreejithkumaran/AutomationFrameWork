package com.Core;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvProperties {

	public static String Datapath;
	public static String WebDriverPath;  
	public static String ScreenShotPath;
	public static String ExtendReportPath;
	public static String Browser;
	public static String URL;
	public static String ExtentReport;
	public static String ExtendReportConfig;
	public static String Img;

	static{
		Properties prop = new Properties();		
		InputStream input = null;
		try {

			input = new FileInputStream("env.properties");
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			Datapath = prop.getProperty("ExcelPath");
			WebDriverPath=prop.getProperty("WebDriverPath");
			ScreenShotPath=prop.getProperty("ScreenShotPath");
			ExtendReportPath=prop.getProperty("ExtendReportPath");
			Browser = prop.getProperty("Browser");
			URL = prop.getProperty("URL");
			ExtentReport = prop.getProperty("ExtendReportPath");
			ExtendReportConfig=prop.getProperty("ExtendReportConfig");
			Img=prop.getProperty("ImgPath");
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}


