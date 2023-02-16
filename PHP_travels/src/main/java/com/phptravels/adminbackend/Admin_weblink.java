package com.phptravels.adminbackend;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.baseclass.*;

public class Admin_weblink extends BaseClass {
	@FindBy(xpath = "//a[contains(text(),\"Website\")]")
	private WebElement Website;

	public Admin_weblink(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		adminURL();
	}

	public String website() {
		Website.click();
		String actual = null;
		String mainWindow = driver.getWindowHandle();
		Set<String> S1 = driver.getWindowHandles();
		Iterator<String> win = S1.iterator();
		
		while (win.hasNext()) {
			String childwindow = win.next();
			if (!mainWindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				actual = driver.getCurrentUrl();
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		return actual;
	}

}
