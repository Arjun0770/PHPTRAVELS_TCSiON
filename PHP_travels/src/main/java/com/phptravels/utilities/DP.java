package com.phptravels.utilities;

import org.testng.annotations.DataProvider;

public class DP {
	@DataProvider(name="logintestdata")
	public Object[][] testdatafeed(){
		Object[][] credentials=new Object[4][2];
		//incorrect login
		credentials[0][0]="test@phpravels.com";
		credentials[0][1]="test";
		//empty password
		credentials[1][0]="test@phpravels.com";
		credentials[1][1]="";
		//empty login
		credentials[2][0]="";
		credentials[2][1]="";
		//empty email
		credentials[3][0]="";
		credentials[3][1]="test";
		return credentials;
	}
}
