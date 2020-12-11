package com.atmecs.makemytrip.testscript;

import org.testng.annotations.Test;

import com.atmecs.makemytrip.page.BasePage;
import com.atmecs.makemytrip.page.RoomBookingPage;
import com.atmecs.makemytrip.util.DataProviderClass;

public class RoomBookingTest extends BasePage
{
	@Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
	public void roomBooking(String city) throws InterruptedException 
	{
	
		RoomBookingPage roomBooking = new RoomBookingPage(driver);
		
		roomBooking.roomBooking(city);
	}
}
