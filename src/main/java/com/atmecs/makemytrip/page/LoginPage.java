package com.atmecs.makemytrip.page;

import java.util.Properties;
import org.openqa.selenium.WebDriver;

import com.atmecs.makemytrip.constants.FilePathConstants;
import com.atmecs.makemytrip.util.Logging;
import com.atmecs.makemytrip.util.PropertyReader;

public class LoginPage 
{
	public WebDriver driver;

	TravelSiteMethods helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	Logging log;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void login(String username, String password) throws InterruptedException
	{
		helpers = new TravelSiteMethods(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(FilePathConstants.LOCATORS);
		
		log.info("Clickingt the login/create account button");
		
		helpers.clickLinkText(locatorsFile.getProperty("account_link"));
		
		log.info("Login with google");
		
		helpers.clickLinkText(locatorsFile.getProperty("login_with_google"));
		
		helpers.switchWindow();
		
		log.info("Entering user mail");
		
		helpers.enterText(locatorsFile.getProperty("user_mail"), username);
		
		log.info("Clicking next");
		
		helpers.clickButton(locatorsFile.getProperty("click_next1_button"));
		
		log.info("Entering user password");
		
		helpers.enterText(locatorsFile.getProperty("user_password"), password);
		
		log.info("Clicking next");
		
		helpers.clickButton(locatorsFile.getProperty("click_next1_button"));
		
	}
	
}