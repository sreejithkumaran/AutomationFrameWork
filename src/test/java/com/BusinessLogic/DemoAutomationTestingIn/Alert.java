package com.BusinessLogic.DemoAutomationTestingIn;

import com.Core.SeleniumBase;
import com.PageObjects.DemoAutomationTestingIn.AlertPage;

public class Alert extends SeleniumBase implements AlertPage{
	
	public void Alert1() throws InterruptedException {
		click(linkAlert1, "Aert With OK");
		Thread.sleep(300);
		click(button1, "click the button to display an alert box");
		switchToAlert(AlertOptions.CANCEL);
		click(button1, "click the button to display an alert box");
		switchToAlert(AlertOptions.ACCEPT);
		
	}
	
	public void Alert2() throws InterruptedException {
		click(linkAlert2, "Aert With OK");
		Thread.sleep(300);
		click(button2, "click the button to display an alert box");
		switchToAlert(AlertOptions.CANCEL);
		click(button2, "click the button to display an alert box");
		switchToAlert(AlertOptions.ACCEPT);
		if(isDisplayed(msg2)) {
			String msg = getText(msg2);
		}
	}
	
	
}
