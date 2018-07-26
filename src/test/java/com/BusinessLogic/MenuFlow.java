package com.BusinessLogic;
import com.Core.EnvProperties;
import com.Core.SeleniumBase;
import com.PageObjects.FinlabsMainPage;


public class MenuFlow extends SeleniumBase implements FinlabsMainPage{

	public Boolean verifyRobotics() {
		Boolean flag = false;	
		try {
			openURL(EnvProperties.URL);
			waitForPageToLoad(10);
			click(HomePage_Robotics, "Robotics Menu");	
			flag = true;
		}catch(Exception ex) {
			
		}
		return flag;
	}

	public Boolean verifyNLPNLGMenu() {
		Boolean flag = false;	
		try {
			openURL(EnvProperties.URL);
			waitForPageToLoad(10);
			click(HomePage_NLPNLG, "NLP & NLG Menu");
			flag = true;
		}catch(Exception ex) {
			flag = false;
		}
		return flag;
	}


	public Boolean VerifyChatBotsMenu() {
		Boolean flag = false;	
		try {
			openURL(EnvProperties.URL);
			waitForPageToLoad(10);
			click(HomePage_ChatBots, "Chat Bots Menu");
			flag = true;
		}catch(Exception ex) {
			flag = false;
		}
		return flag;
	}

	public Boolean VerifyRoboAdvisorMenu() {
		Boolean flag = false;	
		try {
			openURL(EnvProperties.URL);
			waitForPageToLoad(10);
			click(HomePage_RoboAdvisor, "Robo Adivsor");
		}catch(Exception ex) {

		}
		return flag;
	}




}
