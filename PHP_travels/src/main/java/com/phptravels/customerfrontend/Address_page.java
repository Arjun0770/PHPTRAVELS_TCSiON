package com.phptravels.customerfrontend;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.baseclass.*;

public class Address_page extends BaseClass{
	@FindBy(xpath = "//a[contains(text(),\" My Profile\")][@class=\" waves-effect\"]")
	private WebElement ProfileClk;
	@FindBy(xpath = "//input[@name=\"address1\"]")
	private WebElement Address1;
	@FindBy(xpath = "//input[@name=\"address2\"]")
	private WebElement Address2;
	@FindBy(xpath = "//button[contains(text(),\"Update Profile\")] [@type=\"submit\"]")
	private WebElement UpdateBtn;
	@FindBy (xpath = "//*[text()=' Profile updated successfully.                                ']")
	private WebElement sucmsg;
	
	
	public Address_page(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Profile() {
		ProfileClk.click();
	}
	public void Address1(String setAdr1) {
		Address1.sendKeys(setAdr1);
	}
	public void Address2(String setAdr2) {
		ProfileClk.sendKeys(setAdr2);
	}
	public boolean updateBtn() {
		//UpdateBtn.click();
		Actions act=new Actions(driver);
	      act.moveToElement(UpdateBtn);
	      UpdateBtn.sendKeys(Keys.ENTER);
	      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	      wait.until(ExpectedConditions.visibilityOf(sucmsg));
	      boolean a= sucmsg.isDisplayed();
	      return a;
		
		
	}
}
