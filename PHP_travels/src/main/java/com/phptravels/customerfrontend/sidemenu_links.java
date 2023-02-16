package com.phptravels.customerfrontend;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.baseclass.*;

public class sidemenu_links extends BaseClass {
	@FindBy(xpath = "//a[@href='https://phptravels.net/account/bookings'][@class=' waves-effect']")
	private WebElement Bookings_Link;
	@FindBy(xpath = ".//*[text()=' View Voucher']")
	private WebElement viewvoucher;
	
	@FindBy(xpath = "//a[@class=' waves-effect'][text()=' Add Funds']")
	private WebElement Addfunds_Link;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement paynow;
	
	@FindBy(xpath = "//a[@href= 'https://phptravels.net/account/profile'][@class=' waves-effect']")
	private WebElement Profile_Link;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement update;
	
	@FindBy(xpath = "//a[@href=\"https://phptravels.net/account/logout\"][@class=' waves-effect']")
	private WebElement Logout_Link;
	@FindBy (xpath = "//span[text()='Login']")
	private WebElement login;
	
	boolean actual=false;
	
	public sidemenu_links(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean Bookings() {
		
	Bookings_Link.click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(viewvoucher));
    actual=viewvoucher.isDisplayed();
	return actual;
}

	

	public boolean Funds() {

		Addfunds_Link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(paynow));
    	actual=paynow.isDisplayed();
    	return actual;

	}

	public boolean Profile() {
		Profile_Link.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(update));
    	 actual=paynow.isDisplayed();
    	return actual;
		

	}
	public boolean Logout() {
		Logout_Link.click();
	   	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(login));
    	 actual=login.isDisplayed();
	   	return actual;


	}
}
