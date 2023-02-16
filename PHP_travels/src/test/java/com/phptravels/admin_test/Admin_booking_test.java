package com.phptravels.admin_test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.phptravels.baseclass.*;
import com.phptravels.adminbackend.Admin_bookings;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;

public class Admin_booking_test extends BaseClass{
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.adminLogin();
}
	@Test
	public void verifyInvoice() throws Exception {
	 
	Admin_bookings invoice = new Admin_bookings(driver);
	
	invoice.bookingBtn();
	int confirmBookCount=invoice.confirmBookCount();
	
	if(confirmBookCount>0) {
		
	boolean actual= invoice.invoiceBtn();
	System.out.println("actual = " + actual);
	assertTrue(actual);	
	}
	
	}
	@AfterMethod
	public void verifyLogin() throws Exception {
		Logout_Util.AdminLogout();
	}
}
