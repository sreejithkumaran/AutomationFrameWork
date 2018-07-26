package com.PageObjects.DemoAutomationTestingIn;

import org.openqa.selenium.By;

public interface RegisterPage {
	
	String strHobbies = "";
	String strGender = "";
	
	By firstName=By.xpath("//input[@placeholder='First Name']");
	By lastName=By.xpath("//input[@placeholder='Last Name']");
	By address=By.xpath("//textarea[@ng-model='Adress']");
	By phone=By.xpath("//input[@ng-model='Phone']");
	By male=By.xpath("//input[@type='radio' and @value='Male']");
	By feMale=By.xpath("//input[@type='radio' and @value='"+strGender+"']");
	By hobbies=By.xpath("//input[@type='checkbox' and @value='"+strHobbies+"']");
	By languages=By.xpath("//div[@id='msdd']");
	//li/a[text()='English']
	By skill=By.xpath("//select[@id='Skills']");
	By country=By.xpath("//select[@id='countries']");
	By searchCountry=By.xpath("//input[@type='search']");

	By year=By.xpath("//select[@id='yearbox']");
	By month=By.xpath("//select[@placeholder='Month']");
	By day=By.xpath("//select[@id='daybox']");
	
	By firstPassword=By.xpath("//input[@id='firstpassword']");
	By secondPassword=By.xpath("//input[@id='secondpassword']");
	By submitBtn=By.xpath("//button[@id='submitbtn']");
	By refreshBtn=By.xpath("//button[@value='Refresh']");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
