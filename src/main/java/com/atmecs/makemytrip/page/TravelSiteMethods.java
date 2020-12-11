package com.atmecs.makemytrip.page;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelSiteMethods 
{
	WebDriver driver;
	Properties properties;
	JavascriptExecutor js;
	
	public TravelSiteMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickRadiButton(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void enterPlaceText(String xpath, String value) throws InterruptedException
	{
		WebElement text = driver.findElement(By.xpath(xpath));
		Thread.sleep(2000);
		text.sendKeys(value);
		Thread.sleep(2000);
		text.sendKeys(Keys.DOWN);
		text.sendKeys(Keys.ENTER);
	}
	
	public void clickIcons(String xpath) throws InterruptedException
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().wait(3000);
	}
	
	public void clickLinkText(String xpath) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clickButton(String xpath) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(1000);
	}
	
	public void enterText(String xpath, String value) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void selectDate(String xpath) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void switchWindow()
	{
		Set<String> ids = driver.getWindowHandles(); 
		Iterator<String> windows = ids.iterator();
		String parentWindow = windows.next();
		String childwindow = windows.next(); 
		driver.switchTo().window(childwindow);
	}
}