package com.phptravels.admin_test;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.adminbackend.Admin_Statusupdate;

import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;

public class Admin_Statusupdate_test extends BaseClass {
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.adminLogin();
	}
	@Test
	public void dashboard()  {
	Admin_Statusupdate objconfirm= new Admin_Statusupdate(driver);
	int pendcount=objconfirm.dashBoardCount();
	if(pendcount>0) {
	objconfirm.clickPendBook();
	objconfirm.clickConfirm();
	boolean actual=objconfirm.clickDashBoard();
	assertTrue(actual);
	}
	}
	@AfterMethod
	public void verifyLogin() throws Exception {
		Logout_Util.AdminLogout();
	}
	
	



}



