package com.phptravels.customerfrontend;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.phptravels.baseclass.*;

public class Auto_pay extends BaseClass {
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Add Funds']")
	private WebElement funds;
	
 
	@FindBy(xpath = "//input[@id=\"gateway_paypal\"][@type=\"radio\"]")
	private WebElement payPal;
	
	@FindBy(xpath = "//button[text()='Pay Now '][@type=\"submit\"]")
	private WebElement Pay;
	
	@FindBy(xpath = "//img[@class='paypal-logo paypal-logo-paypal paypal-logo-color-white'][@role=\"presentation\"]")
	private WebElement ConfirmPay;

	public  Auto_pay(WebDriver driver) {
	BaseClass.driver = driver;
	PageFactory.initElements(driver, this);

}
	
	public void funds() {

		funds.click();
	}
	public void payPal(){
		
		payPal.click();
		
	}
	public void payClick(){
		Pay.click();
	}


}
