package com.phptravels.supplierbackend;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import com.phptravels.baseclass.*;

public class Supplier_statusUpdate extends BaseClass {
	@FindBy(xpath = "//*[text()='Pending Bookings']")
	private WebElement pendbook ;
	@FindBy(xpath = "//*[@id='booking_status'] ")
	private WebElement pending ;
	@FindBy(xpath=" //*[text()='Pending Bookings']//preceding::div[1]")
	private WebElement pendcount ;
	@FindBy(xpath="//*[text()='Confrimed Bookings']//preceding::div[1]")
	private WebElement confirmcount;
	//@FindBy(xpath="//*[text()='Dashboard']")
	@FindBy(xpath="//*[text()='Dashboard']//parent::a")
	private WebElement dashboard;
	
	int confirmCounExp,pCountExp,confirmCountAct,pCountAct,PCountNow;
	boolean actual;
	public Supplier_statusUpdate(WebDriver driver)
	{
		BaseClass.driver=driver;
		PageFactory.initElements(driver,this);
		 
	}
	public int dashBoardCount() {
		
		String confirmCount=confirmcount.getText();
	
		int confirmCountNow=Integer.parseInt(confirmCount);
		confirmCounExp=confirmCountNow+1;
		
		String pendCount=pendcount.getText();
		int pCountNow=Integer.parseInt(pendCount);
		
		if(pCountNow>0) {
			 pCountExp=pCountNow-1;
			System.out.println("pExp="+pCountExp);
			}
			else {
				System.out.println("No Record in the Pending Booking");
			}
			return pCountNow;
		
	}
	public void clickPendBook() {
			pendbook.click();
		
	}
		
	public void clickConfirm() {
		
		Select sel=new Select(pending);
		sel.selectByVisibleText("Confirmed");		
	}
	public boolean clickDashBoard() {

		driver.navigate().back();
		driver.navigate().refresh();
		
		String confirmCount=confirmcount.getText();
		confirmCountAct=Integer.parseInt(confirmCount);
		
		
		String pendCount=pendcount.getText();
		 pCountAct=Integer.parseInt(pendCount);
		
		if((confirmCounExp==confirmCountAct) && (pCountExp==pCountAct )) {
		   actual=true;
		}
		else {
			actual=false;
			
		}
		System.out.println("actual="+ actual);
			return actual;	
		
	}
	}

