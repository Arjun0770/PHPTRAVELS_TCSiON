package com.phptravels.customer_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.login_page;
import com.phptravels.customerfrontend.sidemenu_links;
import com.phptravels.utilities.Login_Util;

public class sidemenu_test extends BaseClass{
@BeforeMethod 
public void Alogin() throws Exception {
	Login_Util.customerLogin();
	
}
@Test 
public void sidemenu() throws Exception {
	
	boolean actual=false;  
    sidemenu_links sidemenu = new sidemenu_links(driver);
    
	actual=sidemenu.Bookings();
	assertTrue(actual);
	
	actual=sidemenu.Funds();
	assertTrue(actual);

	actual=sidemenu.Profile();
	assertTrue(actual);

	actual=sidemenu.Logout();
	assertTrue(actual);
}
}	
