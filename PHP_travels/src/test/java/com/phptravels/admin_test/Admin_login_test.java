package com.phptravels.admin_test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminbackend.Admin_login;

import com.phptravels.baseclass.*;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excel_Util;
import com.phptravels.utilities.Login_Util;
import com.phptravels.utilities.Logout_Util;

public class Admin_login_test extends BaseClass {
	
	
	Admin_login objLogin;
@BeforeMethod
	public void loginObject() {
		objLogin=new Admin_login(driver);
	}

@Test(priority=0,dataProvider = "logintestdata",dataProviderClass = DP.class)
public void verifyInvalidLogin2(String email, String password) throws Exception {
	
	objLogin.Aname(email);
	objLogin.Apass(password);;
	objLogin.AloginBTN();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password' and @type='password']"))).isDisplayed());
	
	
}
	@Test
	public void verifyLogin() throws Exception {
		
	
		String email = Excel_Util.getCellValue("adminlogin", 0 , 0);
		String password = Excel_Util.getCellValue("adminLogin", 0 , 1);
	
		objLogin.Aname(email);
		objLogin.Apass(password);
		objLogin.AloginBTN();
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Website']"))).isDisplayed());
		Logout_Util.AdminLogout();
	}
	
}
