package com.phptravels.utilities;

import java.io.IOException;

import com.phptravels.baseclass.*;
import com.phptravels.adminbackend.Admin_login;
import com.phptravels.agentfrontend.Agent_Login;
import com.phptravels.customerfrontend.login_page;
import com.phptravels.supplierbackend.Supplier_Login;

public class Login_Util extends BaseClass {
public static void customerLogin() throws Exception {
	login_page objLogin = new login_page(driver);
	String email = Excel_Util.getCellValue("customerlogin", 0 , 0);
	String password = Excel_Util.getCellValue("customerlogin", 0 , 1);
	objLogin.Uname(email);
	objLogin.Upass(password);
	objLogin.LoginBTN();
}
public static void agentLogin() throws Exception{
	Agent_Login objLogin = new Agent_Login(driver);
	String email = Excel_Util.getCellValue("agentlogin", 0 , 0);
	String password = Excel_Util.getCellValue("agentLogin", 0 , 1);
	objLogin.Aname(email);
	objLogin.Apass(password);
	objLogin.AloginBTN();
}
public static void adminLogin() throws Exception{
	Admin_login objLogin = new Admin_login(driver);
	String email = Excel_Util.getCellValue("adminlogin", 0 , 0);
	String password = Excel_Util.getCellValue("adminLogin", 0 , 1);
	objLogin.Aname(email);
	objLogin.Apass(password);
	objLogin.AloginBTN();
}
public static void supplierLogin() throws Exception{
	Supplier_Login objLogin = new Supplier_Login(driver);
	String email = Excel_Util.getCellValue("supplierlogin", 0 , 0);
	String password = Excel_Util.getCellValue("supplierLogin", 0 , 1);
	objLogin.Sname(email);
	objLogin.Spass(password);
	objLogin.SloginBTN();
}
}
