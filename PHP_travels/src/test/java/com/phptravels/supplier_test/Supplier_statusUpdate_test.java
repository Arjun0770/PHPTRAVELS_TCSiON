package com.phptravels.supplier_test;

import static org.testng.Assert.assertTrue;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.BaseClass;
import com.phptravels.supplierbackend.Supplier_statusUpdate;

import com.phptravels.utilities.Login_Util;

import com.phptravels.utilities.Logout_Util;


public class Supplier_statusUpdate_test extends BaseClass {
	
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.supplierLogin();
	}
	@Test
	public void dashboard()  {
	Supplier_statusUpdate objconfirm=new Supplier_statusUpdate(driver);
	int PCountNow=objconfirm.dashBoardCount();
	if(PCountNow >0) {
	objconfirm.clickPendBook();
	objconfirm.clickConfirm();
	boolean actual=objconfirm.clickDashBoard();
	assertTrue(actual);
	}
	}
	@AfterMethod
	public void logout() throws Exception {
		Logout_Util.sLogout();
	}

}
