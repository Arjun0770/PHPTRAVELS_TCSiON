package com.phptravels.customerfrontend;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;


public class login_page extends BaseClass{
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement EmailField;

	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement PassField;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement LoginButton;

	
	public login_page(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		customerURL();
	}

	public void Uname(String setemail) {
		EmailField.sendKeys(setemail);
	}

	public void Upass(String setpassword){

		PassField.sendKeys(setpassword);
		

	}

	

	public void LoginBTN(){
		LoginButton.click();
	
	}

	
	

//	public String clickSendMessagebtn() throws InterruptedException {
//		
//		SendMessagebtn.submit();
//		Alert alert = driver.switchTo().alert();
//		String actual = alert.getText();
//		alert.accept();
//		return actual;
//
//	}

}
