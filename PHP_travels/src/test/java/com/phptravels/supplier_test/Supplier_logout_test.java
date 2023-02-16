package com.phptravels.supplier_test;

import static org.testng.Assert.assertEquals;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.phptravels.baseclass.BaseClass;
import com.phptravels.supplierbackend.Supplier_logout;

import com.phptravels.utilities.Login_Util;

public class Supplier_logout_test extends BaseClass {
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.supplierLogin();;
	}
	@Test
	public void logout() throws Exception {
		Supplier_logout objLogout=new Supplier_logout(driver);
		objLogout.profileBtn();
		String Actual=objLogout.logoutBtn();
		assertEquals(Actual, "https://phptravels.net/api/supplier");
	}

}
