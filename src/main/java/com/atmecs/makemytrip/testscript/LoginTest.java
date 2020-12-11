package com.atmecs.makemytrip.testscript;

import org.testng.annotations.Test;

import com.atmecs.makemytrip.page.BasePage;
import com.atmecs.makemytrip.page.LoginPage;
import com.atmecs.makemytrip.util.DataProviderClass;

public class LoginTest extends BasePage
{

	@Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
	public void login(String username, String password) 
	{
	
		LoginPage login = new LoginPage(driver);
		
		try
		{
			login.login(username, password);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
