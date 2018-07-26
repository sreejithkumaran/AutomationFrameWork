package com.Core;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBase extends SeleniumBase {
  @BeforeSuite
  public void setup() {
	// Configuring Log4j logs,
	  DOMConfigurator.configure("log4j.xml");
  }

  @BeforeTest
  public void startReport() {
	  /* Initialize Extend Report */	  
	  ExtentManager.GetExtent();
	  ExtentManager.UserInfo();
	  
  }


  @BeforeClass
  public void beforeClass() {
	  /* launch Browser & Maximize Window */
	  Initialize(EnvProperties.Browser);
      MaximizeWindow();  
  }
  
  @BeforeMethod
  public void beforeMethod(Method method) {
	  ExtentManager.createTest((this.getClass().getSimpleName()+ "--"+ method.getName()), method.getName());
	  Log.startTestCase(method.getName());
  }

  @AfterMethod
  public void getResult(ITestResult result,Method method) throws IOException {
	  if(result.getStatus() == ITestResult.FAILURE){
          ExtentManager.logFail(result);
		  String ScreenShotPath = CommonFunctions.capture(result.getName());
		  ExtentManager.logFailDetails(result);
		  ExtentManager.logScreenShot(ScreenShotPath);
      }
      else if(result.getStatus() == ITestResult.SUCCESS){
    	   ExtentManager.logPass(result);
      }
      else{
    	  ExtentManager.logSkip(result);
      }
	  Log.endTestCase(method.getName());
  }

  @AfterClass
  public void afterClass() {  
	  Close(); 
  }

  @AfterTest
  public void tearDown() {
	  ExtentManager.flush();
  }

  @AfterSuite
  public void afterSuite() {
	Quit(); 
  }
  
}
