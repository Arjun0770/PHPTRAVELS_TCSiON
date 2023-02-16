package com.phptravels.agent_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.BaseClass;
import com.phptravels.agentfrontend.Agent_toplinks;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;



public class Agent_toplink_test extends BaseClass {
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.agentLogin();
		
	}
	@Test
	public void Toplink() throws Exception {
		boolean actual=false;
		Agent_toplinks links = new Agent_toplinks(driver);
		
		actual=links.Ahotel();
		assertTrue(actual);
		
        actual=links.Aflights();
		assertTrue(actual);
		
        actual=links.Atours();
		assertTrue(actual);
		
		actual=links.Avisa();
		assertTrue(actual);
		
		actual=links.Ablog();
		assertTrue(actual);
		
		actual=links.Aoffers();
		assertTrue(actual);
		
		links.logout();

		
		
	}
	@AfterMethod
	public void logout() {
		Logout_Util.caLogout();
	}
	
}
