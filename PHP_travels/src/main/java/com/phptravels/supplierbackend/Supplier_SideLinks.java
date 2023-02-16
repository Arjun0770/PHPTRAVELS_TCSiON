package com.phptravels.supplierbackend;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.phptravels.baseclass.BaseClass;

public class Supplier_SideLinks extends BaseClass{
	@FindBy(xpath = "//*[@aria-controls='toursmodule']")
	private WebElement tour;
	@FindBy(xpath = "//*[@id='toursmodule']")
	private WebElement tour1;
	@FindBy(xpath="//*[text()='Bookings']")
	private WebElement booking;
	@FindBy(xpath="//*[@aria-controls='hotelsmodule']")
	private WebElement hotel;
	@FindBy(xpath = "//*[@aria-controls='hotelsmodule']//following::a[1]")
	private WebElement hotel1;
	@FindBy(xpath = "//*[@aria-controls='hotelsmodule']//following::a[2]")
	private WebElement amanagehotel1;
	
	boolean[] a =new boolean[2];
	
	public Supplier_SideLinks(WebDriver driver)
	{
		 BaseClass.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public boolean[] booking() {
		 a[0]=booking.isDisplayed();
		System.out.println(a[0]);
		return a;
		//booking.click();
	}
	public boolean[] tour() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(tour));
		 a[0]=tour.isDisplayed();
		 System.out.println(a[0]);
		 tour.click();
		 WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait2.until(ExpectedConditions.visibilityOf(tour1));
		 a[1]=tour1.isDisplayed();
		 System.out.println(a[1]);
		 tour1.click();
		 Thread.sleep(2000);
		 return a;
	}
	
	public boolean[] hotel() throws InterruptedException {
		a[0]=hotel.isDisplayed();
		System.out.println(a[0]);
		hotel.click();
		 WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait2.until(ExpectedConditions.visibilityOf(hotel1));
		a[1]=hotel1.isDisplayed();
		System.out.println(a[1]);
		hotel1.click();
		Thread.sleep(2000);
		return a;
	}
	
	
	

}
