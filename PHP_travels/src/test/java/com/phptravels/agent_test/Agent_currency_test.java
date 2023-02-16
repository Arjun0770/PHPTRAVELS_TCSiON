package com.phptravels.agent_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import com.phptravels.baseclass.*;

import com.phptravels.agentfrontend.Agent_currency;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Agent_currency_test extends BaseClass {
	@BeforeMethod
	public void Login() throws Exception {
		Login_Util.agentLogin();
		
		
	}
	@Test
	public void Currency() throws Exception {
	
		Agent_currency 	currency = new Agent_currency(driver);
		
		    currency.USD();
		    
		     String actual=currency.INR();
			assertTrue(actual.contains("INR"));
			currency.logout();


	}
	@AfterMethod
	public void logout() {
		Logout_Util.caLogout();
	}
}
