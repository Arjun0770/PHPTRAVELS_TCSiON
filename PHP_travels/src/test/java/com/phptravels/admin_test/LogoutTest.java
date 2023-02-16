package com.phptravels.admin_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminbackend.Admin_logout;

import com.phptravels.baseclass.BaseClass;
import com.phptravels.utilities.Login_Util;


public class LogoutTest extends BaseClass {
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.adminLogin();;
	}
	@Test
	public void logout() {
		Admin_logout objLogout=new Admin_logout(driver);
		objLogout.profileBtn();;
		String Actual=objLogout.logoutBtn();;
		System.out.println(Actual);
		String Expected="https://phptravels.net/api/admin";
		assertEquals(Actual, Expected);

	}

}
