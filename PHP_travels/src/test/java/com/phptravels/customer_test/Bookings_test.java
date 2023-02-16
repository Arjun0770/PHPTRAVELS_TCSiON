package com.phptravels.customer_test;


import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.Bookings_page;

import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Bookings_test extends BaseClass {
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.customerLogin();

}
	@Test
	public void verifyBookings() throws Exception {
		Bookings_page BookingPage;
		BookingPage = new Bookings_page(driver);
		
		BookingPage.Bookings();
		boolean actual= BookingPage.Switchweb();
		System.out.println("actual = " + actual);
		assertTrue(actual);
		
	}
	
	@AfterMethod
	public void logout() {
		Logout_Util.caLogout();
	}
}
