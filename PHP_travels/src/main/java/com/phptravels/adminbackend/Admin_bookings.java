package com.phptravels.adminbackend;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Admin_bookings extends BaseClass {
	@FindBy(xpath = "//a[contains(text(),\"Bookings\")][@href=\"https://phptravels.net/api/admin/bookings\"]")
	private WebElement Bookings;
	@FindBy(xpath = "//*[text()='Confrimed Bookings']")
	private WebElement confirmedbooking;
	@FindBy(xpath = "//*[contains(text(),'Confrimed Bookings')]//preceding::div[1]")
	private WebElement confirmbookCount;
	@FindBy(xpath = "//a[contains(text(),\"Invoice\")][@target=\"_blank\"]")
	private WebElement Invoice;
	@FindBy(xpath="//button[@id='download']")
	private WebElement download;
	@FindBy(xpath="//*[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	public Admin_bookings(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		adminURL();
	}
	public void bookingBtn() throws Exception{
		Bookings.click();	
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
	
		
	}
	
public int confirmBookCount() {
		
		String confirmBookCount=confirmbookCount.getText();
		int confirmBookingCountInt=Integer.parseInt(confirmBookCount);
		
		if(confirmBookingCountInt>0) {
			confirmedbooking.click();
		}
		else {
			System.out.println("No Suceessful Bookings in the list");
			driver.navigate().back();
			
		}
		
		return confirmBookingCountInt;
	}
	public boolean invoiceBtn(){
		boolean actual=false;
		Invoice.click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> S1 = driver.getWindowHandles();
		Iterator<String>win = S1.iterator();
		
		while(win.hasNext()) {
			String childwindow = win.next();

			if(!mainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				actual=download.isDisplayed();
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		return actual;
	}

}













//a[contains(text(),"Invoice")][@href="https://phptravels.net/api/../hotels/booking/invoice/1785/97"]
//select[@id="booking_status"]
//option[contains(text(),"pending")][@value="92,flights,pending"]