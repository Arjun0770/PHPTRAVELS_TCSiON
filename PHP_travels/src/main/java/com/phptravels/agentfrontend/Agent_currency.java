package com.phptravels.agentfrontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Agent_currency extends BaseClass {
	@FindBy(xpath="//button[@id='currency'][contains(text(),'USD')]")
	private WebElement USD ;
	//@FindBy(xpath = "//a[@href='https://phptravels.net/currency-INR'][contains(text(),' INR')]")
	@FindBy(xpath = " //*[@class='dropdown-item waves-effect'][text()=' INR']")
	private WebElement INR ;
	@FindBy(xpath="//button[@id='currency'][contains(text(),'INR')]")
	private WebElement inr ;

	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle waves-effect']")
	private WebElement lgaccount;
	@FindBy(xpath = "//a[@class='dropdown-item waves-effect' and @href='https://phptravels.net/account/dashboard']")
	private WebElement logout;

	public Agent_currency(WebDriver driver) {

		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void USD() {
	
		USD.click();
	}
	public String INR() throws InterruptedException {
		INR.click();
		Thread.sleep(2000);
		String actual= inr.getText();	
		System.out.println("inr="+actual);
		return actual;

	}

	public void logout() {
		lgaccount.click();
		logout.click();
	}
	

}




