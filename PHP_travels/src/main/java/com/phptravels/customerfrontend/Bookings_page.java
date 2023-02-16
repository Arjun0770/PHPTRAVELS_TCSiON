package com.phptravels.customerfrontend;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;


public class Bookings_page extends BaseClass {
@FindBy(xpath = "//a[contains(text(),\" My Bookings\")][@class=\" waves-effect\"]")
private WebElement Bookings;
@FindBy(xpath = "//a[contains(text(),\"View Voucher\")][@class=\"theme-btn theme-btn-small waves-effect\"]")
private WebElement Voucher;
@FindBy(xpath = "//button[@id='download']")
private WebElement download;

public Bookings_page(WebDriver driver) {
	BaseClass.driver = driver;
	PageFactory.initElements(driver, this);


}
public void Bookings() {
	Bookings.click();
	
}
public boolean Switchweb() {
	boolean actual=false;
	Voucher.click();

	String mainWindow = driver.getWindowHandle();
	Set<String> S1 = driver.getWindowHandles();
	Iterator<String>win = S1.iterator();
	
	while(win.hasNext()) {
		String childwindow = win.next();
		
		if(!mainWindow.equalsIgnoreCase(childwindow)) {
			
			driver.switchTo().window(childwindow);
			actual = download.isDisplayed();
            driver.close();
		}
	}
	driver.switchTo().window(mainWindow);
	return actual;
}
}
