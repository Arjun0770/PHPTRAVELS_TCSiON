package com.phptravels.supplier_test;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.supplierbackend.Supplier_revenue;

import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;

import com.phptravels.baseclass.BaseClass;
public class Supplier_revenue_test extends BaseClass {
	
	@BeforeMethod
	public void Login() throws Exception{
		Login_Util.supplierLogin();
	}
	@Test
	public void verifyReveBkDwn() throws InterruptedException {
		
Supplier_revenue objDispaly=new Supplier_revenue(driver);
		
		boolean actual=objDispaly.rbDisplay();
		System.out.println(actual);
		assertTrue(actual);
	}
	@AfterMethod
	public void logout() throws Exception {
		Logout_Util.sLogout();
	}

		
		
	}

	
	


