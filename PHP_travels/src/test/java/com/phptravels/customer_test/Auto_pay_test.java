package com.phptravels.customer_test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.Auto_pay;
import com.phptravels.customerfrontend.customer_page;
import com.phptravels.utilities.Login_Util;

public class Auto_pay_test extends BaseClass{
	@BeforeMethod 
	public void Login() throws Exception {
		
		Login_Util.customerLogin();

}
	@Test (priority = 1)
	public void autoPay() throws Exception {
		Auto_pay autoPay;
		autoPay = new Auto_pay(driver);
		
		autoPay.funds();
		autoPay.payPal();
		autoPay.payClick();
		

	}
	

}
