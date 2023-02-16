package com.phptravels.agent_test;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.agentfrontend.Agent_Login;
import com.phptravels.baseclass.*;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excel_Util;

import com.phptravels.utilities.Logout_Util;


public class Agent_Login_test extends BaseClass{
	Agent_Login objLogin;
	@BeforeMethod
	public void loginObject() {
		objLogin=new Agent_Login(driver);
	}
	@Test(priority=0,dataProvider = "logintestdata",dataProviderClass = DP.class)
	public void verifyInvalidLogin2(String email, String password) throws IOException {
		
		objLogin.Aname(email);
		objLogin.Apass(password);
		objLogin.AloginBTN();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60)); 
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password' and @placeholder='Password']"))).isDisplayed());			
	}
	
	@Test(priority =1)
	public void verifyLogin() throws Exception {
		
		String email=Excel_Util.getCellValue("agentlogin", 0, 0);
		String password=Excel_Util.getCellValue("agentlogin", 0, 1);
		objLogin.Aname(email);
		objLogin.Apass(password);
		objLogin.AloginBTN();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=' waves-effect'][text()=' My Bookings']"))).isDisplayed());
		Logout_Util.caLogout();	

	}
}
