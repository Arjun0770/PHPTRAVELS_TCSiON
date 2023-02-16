package com.phptravels.utilities;

import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.*;

import static org.testng.Assert.assertEquals;

import com.phptravels.adminbackend.Admin_logout;
import com.phptravels.supplierbackend.Supplier_logout;

public class Logout_Util extends BaseClass {
	
	
	public  static void  caLogout() {

		
		Logout objlog=new Logout(driver);
		String Actual=objlog.clickLogout();
		assertEquals(Actual,"https://phptravels.net/login");
	}
	public static void sLogout() throws Exception {
		Supplier_logout logout = new Supplier_logout(driver);
		logout.profileBtn();
		logout.logoutBtn();
	}
	public static void AdminLogout() {
		Admin_logout logout = new Admin_logout(driver);
		logout.profileBtn();
		logout.logoutBtn();
}
	
}
