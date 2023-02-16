package com.phptravels.adminbackend;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.phptravels.baseclass.*;

public class Admin_login extends BaseClass{

	@FindBy(xpath = "//input[@name=\"email\"][@type=\"text\"]")
	private WebElement EmailField;
	@FindBy(xpath = "//input[@name=\"password\"][@type=\"password\"]")
	private WebElement PassField;
	@FindBy(xpath = "//span[contains(text(),\"Login\")]")
	private WebElement LoginButton;
	public Admin_login(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		adminURL();
	}
	public void Aname(String setemail) throws Exception {
	
		EmailField.sendKeys(setemail);
	
	}
	public void Apass(String setpassword) throws Exception{

		PassField.sendKeys(setpassword);
		
	}
	public void AloginBTN() throws Exception{

		LoginButton.click();	
	}
}
