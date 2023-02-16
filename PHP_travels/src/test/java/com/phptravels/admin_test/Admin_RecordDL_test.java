package com.phptravels.admin_test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.adminbackend.Admin_RecordDL;

import com.phptravels.utilities.Login_Util;

import com.phptravels.utilities.Logout_Util;


public class Admin_RecordDL_test extends BaseClass {
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.adminLogin();
	}
	@Test
	public void verifyRecordDL() throws Exception {
		
			Admin_RecordDL objDelete=new Admin_RecordDL(driver);
			objDelete.clickCancel();
			String actualMsg=objDelete.clickDelete();
			if(actualMsg!=null) {
			assertTrue(actualMsg.contains("Are you sure to delete?"));
			}
	}	
	
	@AfterMethod
	public void verifyLogin() throws Exception {
		Logout_Util.AdminLogout();
	}
		
		
	}
	
	

