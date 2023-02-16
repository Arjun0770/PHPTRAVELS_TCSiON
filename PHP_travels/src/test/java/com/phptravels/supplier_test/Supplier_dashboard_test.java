package com.phptravels.supplier_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;

import com.phptravels.supplierbackend.Supplier_dashboard;

import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Supplier_dashboard_test extends BaseClass {
	@BeforeMethod
	public void Login() throws Exception{
		Login_Util.supplierLogin();
	}
	@Test
	public void verifyDashboard() throws InterruptedException {
		
		Supplier_dashboard objDash=new Supplier_dashboard(driver);
		
		boolean[] actual=new boolean[2];
		
		boolean actual1=objDash.salesOverviewTextDisplay();
		assertTrue(actual1);
		
		boolean actual2=objDash.RevBkDwnbarchartDisplay();
		assertTrue(actual2);
		
		boolean actual3=objDash.pieChartDisplay();
		assertTrue(actual3);
		
		actual=objDash.confirmBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
		
	    actual=objDash.pendBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
		
		actual=objDash.CancelBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
		
	    actual=objDash.paidBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
		
	    actual=objDash.unPaidBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
		
	    actual=objDash.RefundBookDisplay();
		assertTrue(actual[0]);
		assertTrue(actual[1]);
				}
		
		@AfterMethod
		public void logout() throws Exception {
		Logout_Util.sLogout();
		}
		
		
		
		
		
	}
