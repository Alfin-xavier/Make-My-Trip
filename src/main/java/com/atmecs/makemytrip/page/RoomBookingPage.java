package com.atmecs.makemytrip.page;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.makemytrip.constants.FilePathConstants;
import com.atmecs.makemytrip.util.Logging;
import com.atmecs.makemytrip.util.PropertyReader;

public class RoomBookingPage 
{
	public WebDriver driver;

	TravelSiteMethods helpers;

	Properties locatorsFile;
	
	Properties datas;
	
	Logging log;
	
	public RoomBookingPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void roomBooking(String city) throws InterruptedException
	{
		helpers = new TravelSiteMethods(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(FilePathConstants.LOCATORS);

		log.info("Clicking the hotels linktext");

		helpers.clickLinkText(locatorsFile.getProperty("hotel_linktext"));

		log.info("Entering source");

		helpers.enterText(locatorsFile.getProperty("source_input"), city);

		log.info("Clicking check-in date picker");
		
		helpers.selectDate(locatorsFile.getProperty("check-in_date_picker"));
		
		log.info("Selecting check-in date");
		
		helpers.selectDate(locatorsFile.getProperty("check-in_date"));
		
		log.info("Clicking check-out date picker");
		
		helpers.selectDate(locatorsFile.getProperty("check-out_date_picker"));
		
		log.info("Selecting checck-out date");
		
		helpers.selectDate(locatorsFile.getProperty("check-out_date"));
		
		log.info("Clicking rooms and guests");
		
		helpers.clickButton(locatorsFile.getProperty("rooms"));
		
		log.info("Selecting no.of adults");
		
		helpers.clickButton(locatorsFile.getProperty("adult_guest"));
		
		log.info("Selecting no.of infants");
		
		helpers.clickButton(locatorsFile.getProperty("infant_guest"));
		
		log.info("Selecting travelling reason");
		
		helpers.clickButton(locatorsFile.getProperty("travelling_reason"));

		log.info("Clicking search button");

		helpers.clickButton(locatorsFile.getProperty("search_button"));
	}

}
