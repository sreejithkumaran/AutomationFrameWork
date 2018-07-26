package com.TestCases;

import org.testng.annotations.Test;

import com.BusinessLogic.DemoAutomationTestingIn.Index;
import com.BusinessLogic.DemoAutomationTestingIn.Register;
import com.Core.EnvProperties;
import com.Core.TestNGBase;

public class RegisterUserFlow extends TestNGBase{

	@Test
	public void RegisterUser() throws InterruptedException {
		openURL(EnvProperties.URL);
		waitForPageToLoad(10);
		Index index = new Index();
		index.singInUsingEmail();
		Thread.sleep(500);
		Register register = new Register();
		register.registerUser();
	}
}
