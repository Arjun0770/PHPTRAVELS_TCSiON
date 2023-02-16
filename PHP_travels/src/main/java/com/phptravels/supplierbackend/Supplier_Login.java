package com.phptravels.supplierbackend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Supplier_Login extends BaseClass {
	@FindBy(xpath = "//input[@name=\"email\"][@type=\"text\"]")
	private WebElement EmailField;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement PassField;
	@FindBy(xpath = "//span[contains(text(), \"Login\")]")
	private WebElement LoginButton;
	
	public Supplier_Login(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		supplierURL();
		
	}
	public void Sname(String setemail) {
		EmailField.sendKeys(setemail);
	}
	public void Spass(String setpassword){
		PassField.sendKeys(setpassword);
		
	}
	public void SloginBTN(){
		LoginButton.click();	
	}
}
