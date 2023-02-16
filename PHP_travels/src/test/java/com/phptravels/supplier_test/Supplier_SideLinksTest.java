package com.phptravels.supplier_test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.phptravels.baseclass.BaseClass;
import com.phptravels.supplierbackend.*;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Supplier_SideLinksTest extends BaseClass {
	
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.supplierLogin();
	}
	@Test
	public void leftSideLink() throws InterruptedException  {
		
	
		Supplier_SideLinks objLink=new Supplier_SideLinks(driver);
	boolean[] a=new boolean[2];
	a=objLink.booking();
	assertTrue(a[0]);
	a=objLink.hotel();
	assertTrue(a[0]);
	assertTrue(a[1]);
	a= objLink.tour();
	assertTrue(a[0]);
	assertTrue(a[1]);
	
			}
	@AfterMethod
	public void logout() throws Exception {
	Logout_Util.sLogout();
	}
	
	
	

}
