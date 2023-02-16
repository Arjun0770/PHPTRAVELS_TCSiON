package com.phptravels.supplier_test;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.baseclass.BaseClass;
import com.phptravels.supplierbackend.Supplier_Login;
import com.phptravels.utilities.DP;
import com.phptravels.utilities.Excel_Util;
import com.phptravels.utilities.Logout_Util;


public class Supplier_login_test extends BaseClass {
	

	Supplier_Login objLogin;
@BeforeMethod
	public void loginObject() {
		objLogin=new Supplier_Login(driver);
	}

@Test(priority=0,dataProvider = "logintestdata",dataProviderClass = DP.class)
public void verifyInvalidLogin(String email, String password) throws Exception {
	
	objLogin.Sname(email);
	objLogin.Spass(password);;
	objLogin.SloginBTN();

	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password' and @type='password']"))).isDisplayed());
	
}
	@Test
	public void verifyLogin() throws Exception {

		String email = Excel_Util.getCellValue("supplierlogin", 0 , 0);
		System.out.println(email);
		String password = Excel_Util.getCellValue("supplierLogin", 0 , 1);
		System.out.println(password);
		objLogin.Sname(email);
		objLogin.Spass(password);
		objLogin.SloginBTN();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Website']"))).isDisplayed());
		Logout_Util.sLogout();
		
	}
	
}
