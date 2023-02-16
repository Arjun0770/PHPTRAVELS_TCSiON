package com.phptravels.customerfrontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class customer_page extends BaseClass{
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement EmailField;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement PassField;
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement LoginButton;
	public customer_page(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		customerURL();
	}
	public void Cname() {
		EmailField.sendKeys("kaz@king.com");
	}
	public void Cpass(){
		PassField.sendKeys("12345");
		
	}
	public void CloginBTN(){
		LoginButton.click();	
	}
}
