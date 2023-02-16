package com.phptravels.customer_test;

import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.customer_page;

public class customer_test extends BaseClass {
	@Test
	public void verifyLogin() {
		customer_page CLogin;
		CLogin = new customer_page(driver);
		CLogin.Cname();
		CLogin.Cpass();
		CLogin.CloginBTN();
	}
}
