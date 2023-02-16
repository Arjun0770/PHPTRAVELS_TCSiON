package com.phptravels.supplierbackend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Supplier_revenue extends BaseClass{
	
	@FindBy(xpath = "//*[@id='dashboardBarChart']")
	private WebElement revbkdwn;
	
	public Supplier_revenue(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean rbDisplay()
	{
		boolean actual=revbkdwn.isDisplayed();
		return actual;
	}

}
