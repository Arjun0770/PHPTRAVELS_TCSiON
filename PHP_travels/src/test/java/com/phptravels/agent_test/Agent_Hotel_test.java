package com.phptravels.agent_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.baseclass.*;
import com.phptravels.agentfrontend.Agent_Hotel;
import com.phptravels.utilities.Excel_Util;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;


public class Agent_Hotel_test extends BaseClass{
	@BeforeMethod 
	public void Login() throws Exception {
		Login_Util.agentLogin();	
	}
	@Test
	public void VerifySearch() throws IOException, InterruptedException {
		
		Agent_Hotel Search = new Agent_Hotel(driver);
		String cityName = Excel_Util.getCellValue("cityname", 0, 0);
		Search.clickHotel();
		Search.clickName();
		Search.setName(cityName);
		boolean actual=Search.clickSearch();
		System.out.println(actual);
     	assertTrue(actual);
     	Search.logout();
		
	}
	@AfterMethod
	public void logout() {
		Logout_Util.caLogout();
	}

}