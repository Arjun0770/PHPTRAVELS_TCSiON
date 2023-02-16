package com.phptravels.supplierbackend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.phptravels.baseclass.BaseClass;

public class Supplier_dashboard extends BaseClass{
	
	@FindBy(xpath = "//*[text()='Sales overview & summary']")
	private WebElement salestext ;
	@FindBy(xpath = "//*[text()='Confrimed Bookings'] ")
	private WebElement confmbook ;
	@FindBy(xpath="//*[text()='Pending Bookings'] ")
	private WebElement pendbook ;
	@FindBy(xpath="//*[text()='Cancelled Bookings']")
	private WebElement cancelbook ;
	@FindBy(xpath="//*[text()='Paid Bookings']")
	private WebElement paidbook;
	@FindBy(xpath="//*[text()='Unpaid Bookings']")
	private WebElement unpaidbook;
	@FindBy(xpath="//*[text()='Refunded Bookings']")
	private WebElement refundbook;
	@FindBy(xpath="//*[@id='dashboardBarChart']")
	private WebElement revbkdwn ;
	@FindBy(xpath="//*[@id='myPieChart']")
	private WebElement piechart ;
	@FindBy(xpath="//*[@id='data']")
	private WebElement atable ;
	
	boolean[] actual=new boolean[2];
	
	public Supplier_dashboard(WebDriver driver)
	{
		 BaseClass.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	 public boolean salesOverviewTextDisplay() {
		 
		 boolean actual=salestext.isDisplayed();
			return actual;
			
		}
	public boolean RevBkDwnbarchartDisplay() {
		boolean actual=revbkdwn.isDisplayed();
		return actual;
			
	}
	public boolean pieChartDisplay() {
		boolean actual=revbkdwn.isDisplayed();
		return actual;
	}
	
     public boolean[] confirmBookDisplay() {
    	 actual[0]=confmbook.isDisplayed();
    	 confmbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;

	}
     public boolean[] pendBookDisplay() {
    	 actual[0]=pendbook.isDisplayed();
    	 pendbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;
		
	}
     public boolean[] CancelBookDisplay() {
    	 actual[0]=cancelbook.isDisplayed();
    	 cancelbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;
		
	}
     public boolean[] paidBookDisplay() {
    	 actual[0]=paidbook.isDisplayed();
    	 paidbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;
		
	}
     public boolean[] unPaidBookDisplay() {
    	 actual[0]=unpaidbook.isDisplayed();
    	 unpaidbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;

	}
     public boolean[] RefundBookDisplay() {
    	 actual[0]=refundbook.isDisplayed();
    	 refundbook.click();
    	 actual[1]=atable.isDisplayed();
    	 return actual;	
	}
    

}
