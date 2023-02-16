package com.phptravels.agentfrontend;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.baseclass.*;

public class Agent_Sidemenu extends BaseClass{
	@FindBy(xpath = "//a[@href='https://phptravels.net/account/bookings'][@class=' waves-effect']")
	private WebElement AgentBookings_Link;
	@FindBy(xpath = ".//*[text()=' View Voucher']")
	private WebElement viewvoucher;
	
	@FindBy(xpath = "//a[@href='https://phptravels.net/account/add_funds'][@class=' waves-effect']")
	private WebElement AgentAddfunds_Link;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement paynow;
	
	@FindBy(xpath = "//a[@href= 'https://phptravels.net/account/profile'][@class=' waves-effect']")
	private WebElement AgentProfile_Link;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement update;
	
	@FindBy(xpath = "//a[@href=\"https://phptravels.net/account/logout\"][@class=' waves-effect']")
	private WebElement AgentLogout_Link;
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement login;
	
	boolean actual=true;
	
	public Agent_Sidemenu(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	public boolean AgentMyBookings() {
		AgentBookings_Link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(viewvoucher));
    	actual=viewvoucher.isDisplayed();
    	return actual;
		
	}
	public boolean AgentFunds() {

		AgentAddfunds_Link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(paynow));
    	 actual=paynow.isDisplayed();
    	return actual;

	}

	public boolean AgentProfile() {
		AgentProfile_Link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(update));
    	 actual=paynow.isDisplayed();
    	return actual;
    }
		

	
	public boolean AgentLogout() {
		AgentLogout_Link.click();
		 
		   	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(login));
			actual=login.isDisplayed();
		   	return actual;
	}
	}
