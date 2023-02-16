package com.phptravels.customer_test;

import static org.testng.Assert.assertEquals;
import com.phptravels.customerfrontend.*;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.baseclass.BaseClass;

import com.phptravels.utilities.Login_Util;


public class LogoutTest extends BaseClass {
	
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.customerLogin();;
	}
	@Test
	public void logout() {
		Logout objlog=new Logout(driver);
		String Actual=objlog.clickLogout();
		assertEquals(Actual,"https://phptravels.net/login");
	}

}
