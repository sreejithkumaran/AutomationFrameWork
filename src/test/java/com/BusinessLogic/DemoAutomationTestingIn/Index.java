package com.BusinessLogic.DemoAutomationTestingIn;

import com.Core.SeleniumBase;
import com.PageObjects.DemoAutomationTestingIn.IndexPage;

public class Index extends SeleniumBase implements IndexPage {
	
	public void singInUsingEmail() {
		sendKeys(inputSignUpEmailId, "Email id for SignUp", "sreejith0607@yahoo.com");
		click(btnSearchEmail, "Search Email Button");
	}
	
	public void clickEmailIdSignUpButton() {
		
	}

}
