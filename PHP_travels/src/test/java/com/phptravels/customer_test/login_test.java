package com.phptravels.customer_test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.baseclass.*;
import com.phptravels.customerfrontend.login_page;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excel_Util;
import com.phptravels.utilities.Logout_Util;


public class login_test extends BaseClass{
	login_page objLogin;
	@BeforeMethod
		public void loginObject() {
			objLogin=new login_page(driver);
		}

	@Test(priority=0,dataProvider = "logintestdata",dataProviderClass = DP.class)
	public void verifyInvalidLogin2(String email, String password) throws Exception {
		
		objLogin.Uname(email);
		objLogin.Upass(password);;
		objLogin.LoginBTN();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20)); 
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password' and @placeholder='Password']"))).isDisplayed());	
		
	}
		@Test
		public void verifyLogin() throws Exception {
			
			String email = Excel_Util.getCellValue("customerlogin", 0 , 0);
			String password = Excel_Util.getCellValue("customerlogin", 0 , 1);
			objLogin.Uname(email);
			objLogin.Upass(password);
			objLogin.LoginBTN();
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=' waves-effect'][text()=' My Bookings']"))).isDisplayed());
			Logout_Util.caLogout();
		}
		
}
