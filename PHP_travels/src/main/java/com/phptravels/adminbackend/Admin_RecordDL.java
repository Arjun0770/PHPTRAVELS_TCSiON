package com.phptravels.adminbackend;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Admin_RecordDL extends BaseClass {
	@FindBy(xpath = "//div[@class='card-text'][text()='Cancelled Bookings']")
	private WebElement cancelbook;
	@FindBy (xpath="//*[@id=\"data\"]/tbody/tr[1]/td[15]/button")
	private WebElement deleteicon;
	@FindBy(xpath = "//table[@id='data']/tbody")
	private WebElement rows;
	@FindBy(xpath = "//table[@id='data']/tbody/tr")
	private WebElement cols;
	@FindBy(xpath = "//*[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	public Admin_RecordDL(WebDriver driver)
	{
		 BaseClass.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	}
	public void clickCancel() {
		cancelbook.click();
	}
	public String clickDelete() {	
		String alertMsg = null;
		
			List<WebElement>TotalRowsList = rows.findElements(By.tagName("tr"));
			int rowCount=TotalRowsList.size();
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());

		
		List<WebElement> TotalColsList = cols.findElements(By.tagName("td"));
		int colCount=TotalColsList.size();

		System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());
			
		try {
			
			if (rowCount>=1) {
				
				System.out.println("hai");
				if(rowCount>1 && colCount>1)
				{
			
				deleteicon.click();
				Alert alert=driver.switchTo().alert();
				   alertMsg=alert.getText();
					System.out.println("msg="+alertMsg);
					alert.accept();
					//alert.dismiss();		
							
			}
				else {
					System.out.println("No Record in the Cancel Booking");
				}
				dashboard.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No Record in the List");
		}
		
	   return alertMsg;
	
		
	}
	
	
	
}
