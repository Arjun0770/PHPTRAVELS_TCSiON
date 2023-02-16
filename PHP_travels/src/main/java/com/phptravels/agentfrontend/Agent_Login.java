package com.phptravels.agentfrontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Agent_Login extends BaseClass{
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement EmailField;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement PassField;
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement LoginButton;
	
	public Agent_Login(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		customerURL();
	}
	public void Aname(String setemail) {
		EmailField.sendKeys(setemail);
	}
	public void Apass(String setpassword){
		PassField.sendKeys(setpassword);
		
	}
	public void AloginBTN(){
		LoginButton.click();	
	}
}
