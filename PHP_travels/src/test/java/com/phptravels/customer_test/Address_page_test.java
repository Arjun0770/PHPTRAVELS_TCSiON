package com.phptravels.customer_test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;

import com.phptravels.customerfrontend.Address_page;

import com.phptravels.utilities.Excel_Util;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Address_page_test extends BaseClass {
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.customerLogin();

}
	@Test
	public void verifyAddress() throws Exception {
		Address_page customerAddress;
		String adr1 = Excel_Util.getCellValue("customeraddress",0, 0);
		String adr2 = Excel_Util.getCellValue("customeraddress",0, 1);
		
		customerAddress = new Address_page(driver);
		customerAddress.Profile();
		customerAddress.Address1(adr1);
		customerAddress.Address2(adr2);
		
		boolean actual=customerAddress.updateBtn();
		assertTrue(actual);

	}
	@AfterMethod
	public void logut() {
		Logout_Util.caLogout();
	}
}
