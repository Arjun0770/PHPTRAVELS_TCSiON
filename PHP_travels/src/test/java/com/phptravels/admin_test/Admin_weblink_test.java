package com.phptravels.admin_test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.adminbackend.Admin_weblink;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;

public class Admin_weblink_test extends BaseClass {
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.adminLogin();
	}
	@Test
	public void verifyLink() throws Exception {
	Admin_weblink Web;
	 Web = new Admin_weblink(driver);
	Thread.sleep(2000);
	String actual= Web.website();
	System.out.println("actual = " + actual);
	String expected= "https://phptravels.net/sd";
	assertEquals(actual,expected);
	}
	
	@AfterMethod
	public void verifyLogin() throws Exception {
		Logout_Util.AdminLogout();
	}
}
