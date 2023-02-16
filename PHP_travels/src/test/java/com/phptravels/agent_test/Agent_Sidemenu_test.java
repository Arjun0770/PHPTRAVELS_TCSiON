package com.phptravels.agent_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.agentfrontend.Agent_Sidemenu;

import com.phptravels.utilities.Login_Util;

public class Agent_Sidemenu_test extends BaseClass {
	@Test (priority = 0)
	public void Alogin() throws Exception {
		Login_Util.agentLogin();
		
		
	}
	@Test (priority = 1)
	public void Agentsidemenu() throws Exception {
		
		boolean actual=false;
		
		Agent_Sidemenu menu = new Agent_Sidemenu(driver);
	
		actual=menu.AgentMyBookings();
		assertTrue(actual);
		
		actual=menu.AgentFunds();
		assertTrue(actual);
		
		actual=menu.AgentProfile();
		assertTrue(actual);
		
		actual=menu.AgentLogout();
		assertTrue(actual);
	}
}
