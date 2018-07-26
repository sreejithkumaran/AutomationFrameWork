package com.PageObjects.DemoAutomationTestingIn;

import org.openqa.selenium.By;

public interface AlertPage {
	
	By linkAlert1=By.xpath("//a[text()='Alert with OK ']");
	By button1=By.xpath("//button[contains(text(),'click the button to display an  alert box:')]");
	By linkAlert2=By.xpath("//a[text()='Alert with OK & Cancel ']");
	By button2=By.xpath("//button[text()='click the button to display a confirm box ']");
	By msg2=By.id("//p[@id='demo']");	
	By linkAlert3=By.xpath("//a[text()='Alert with Textbox ']");
	By button3=By.xpath("//button[text()='click the button to demonstrate the prompt box ']");
	By msg3=By.id("//p[@id='demo1']");
	
	
	                          
	
	
	

}
