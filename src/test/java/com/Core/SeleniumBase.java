package com.Core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase extends DriverClass {

	Alert alert;

	public enum AlertOptions {
		ACCEPT,DISPLAY_MESSAGE,CANCEL
	}




	/******************** SendKeys   *************** */
	public void sendKeys(By Selector ,String locator ,String text){

		try {
			DriverClass.driver.findElement(Selector).clear();
			DriverClass.driver.findElement(Selector).sendKeys(text);
			ExtentManager.logInfo(locator +" entered "+" - "+text);	
			Log.info("Entered text ::"+text+"in textbox"+locator);

		}catch(Exception ex) {
			Log.error("Unable to find :: "+locator);
			ExtentManager.logFail("Unable to find Locator :: "+locator);
		}

	}

	/******************** Click   *************** */
	public void click(By Selector ,String locator){

		try {
			DriverClass.driver.findElement(Selector).click();
			Log.info("Clicked - "+locator +"");
			ExtentManager.logInfo(locator+" clicked ..  ");	
		}catch (Exception e) {
			Log.error("Unable to Ciclk Locator :: "+locator);
			ExtentManager.logFail("Unable to Cick Locator :: "+locator);
		}

	}

	/******************************************** Select **********************************************/

	public void SelelctByVisibleText(By Selector , String visibleText){
		Select sel = new Select(DriverClass.driver.findElement(Selector));
		sel.selectByVisibleText(visibleText);
	}

	public void SelelctByValue(By Selector , String value){
		Select sel = new Select(DriverClass.driver.findElement(Selector));
		sel.selectByValue(value);
	}

	public void SelelctByIndex(By Selector , int index){
		Select sel = new Select(DriverClass.driver.findElement(Selector));
		sel.selectByIndex(index);
	}

	/******************************************** Get Text  **********************************************/
	public String getText(By Selector) {	
		String text = null;
		try {
			text = driver.findElement(Selector).getText();
		}catch(Exception ex) {

		}
		return text;
	}



	/******************************************** IsDisplayed **********************************************/
	public boolean isDisplayed(By Selector) {
		boolean isDisplayedFlag = false;
		try {	
			if(driver.findElement(Selector).isDisplayed()) {
				isDisplayedFlag = true;
				ExtentManager.logInfo(driver.findElement(Selector).getText() +" is Displayed ..");	
				Log.info(driver.findElement(Selector).getText() +" is Displayed ..");
			}
		}catch(Exception ex) {
			Log.error("Unable to find :: "+Selector);
			ExtentManager.logFail("Unable to find Locator :: "+Selector);
		}
		return isDisplayedFlag;	
	}


	/******************************************** IsEnabled **********************************************/
	public boolean isEnabled(By Selector) {
		boolean isEnabledFlag = false;
		if(driver.findElement(Selector).isEnabled()) {
			isEnabledFlag = true;
		}
		return isEnabledFlag;	
	}

	/******************************************** IsSelected **********************************************/
	public boolean isSelected(By Selector) {
		boolean isSelected = false;
		if(driver.findElement(Selector).isSelected()) {
			isSelected = true;
		}
		return isSelected;	
	}

	/******************************************** getURL **********************************************/
	public void getCurrentURL() {
		try {
			driver.getCurrentUrl();
			Log.info("Navigated to url : "+driver.getCurrentUrl());
			ExtentManager.logInfo("Navigated to url : "+driver.getCurrentUrl());	
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void waitForPageToLoad(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public boolean isElementDispayed(By Selector) {
		boolean flag = false;


		return flag;

	}


	/***********************************  ALerts *********************************/
	public void switchToAlert(Enum<?> operation) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		if(wait.until(ExpectedConditions.alertIsPresent())!= null){
			ExtentManager.logInfo("Alert Is Displayed ..");	
			Log.info("Alert Is Dsplayed ..");

			alert = driver.switchTo().alert();
			if(operation.name().equalsIgnoreCase("ACCEPT")) {
				ExtentManager.logInfo("Message<b>" +alert.getText()+"</b> Displayed in Alert Box");
				alert.accept();
				ExtentManager.logInfo("Clicked on <b>OK </b> Button in Alert Box");	
				Log.info("Clicked on <b>OK </b> Button in Alert Box");
			}else if(operation.name().equalsIgnoreCase("DISPLAY_MESSAGE")) {
				alert.getText();
				ExtentManager.logInfo("Message<b>" +alert.getText()+"</b> Displayed in Alert Box");	
				Log.info("Message<b>" +alert.getText()+"</b> Displayed in Alert Box");

			}else if(operation.name().equalsIgnoreCase("CANCEL")) {
				ExtentManager.logInfo("Message<b>" +alert.getText()+"</b> Displayed in Alert Box");
				alert.dismiss();
				ExtentManager.logInfo("Clicked on <b>Cancel </b> Button in Alert Box");	
				Log.info("Clicked on <b>Cancel </b> Button in Alert Box");
			}else {

			}
		}else {
			ExtentManager.logInfo("Alert NOT Displayed ..");	
			Log.info("Alert NOT Dsplayed ..");
		}


	}

	public void switchToAlert(String operation,String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		if(wait.until(ExpectedConditions.alertIsPresent())!= null){
			ExtentManager.logInfo("Alert Is Displayed ..");	
			Log.info("Alert Is Dsplayed ..");
			alert.sendKeys(text);
			ExtentManager.logInfo("Entered Text : <b>"+text+"</b> in Alert Box");	
			Log.info("Alert Is Dsplayed ..");
		}else {
			ExtentManager.logInfo("Alert NOT Displayed ..");	
			Log.info("Alert NOT Dsplayed ..");
		}
	}


	/**************************************** Windows *******************************/



	/************************************** IFrames *********************************/






}
