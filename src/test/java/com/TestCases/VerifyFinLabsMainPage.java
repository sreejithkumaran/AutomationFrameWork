package com.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BusinessLogic.MenuFlow;
import com.Core.ExtentManager;
import com.Core.TestNGBase;

import com.PageObjects.FinlabsMainPage;

public class VerifyFinLabsMainPage extends TestNGBase implements FinlabsMainPage  {

	MenuFlow menu = new MenuFlow();

	@Test
	public void VerifyRoboticsMenu() throws InterruptedException {	  
		
		Boolean result = menu.verifyRobotics();
		if(result == true) {
			ExtentManager.logPass("TestCase Passed .. ");
		}else {
			ExtentManager.logFail("TestCase Failed .. ");
		}
		
	}


	@Test
	public void verifyNLPNLGMenu() throws InterruptedException {	  
		Boolean result = menu.verifyNLPNLGMenu();
		if(result == true) {
			ExtentManager.logPass("TestCase Passed .. ");
		}else {
			ExtentManager.logFail("TestCase Failed .. ");
		}
	}


	@Test
	public void VerifyChatBotsMenu() throws InterruptedException {	  
	
		Boolean result = menu.VerifyChatBotsMenu();
		if(result == true) {
			ExtentManager.logPass("TestCase Passed .. ");
		}else {
			ExtentManager.logFail("TestCase Failed .. ");
		}
	}


	@Test
	public void VerifyRoboAdvisorMenu() throws InterruptedException {	  
		Boolean result = menu.VerifyRoboAdvisorMenu();
		if(result == true) {
			ExtentManager.logPass("TestCase Passed .. ");
		}else {
			Assert.fail();
			ExtentManager.logFail("TestCase Failed .. ");
		}
		
	}






}
