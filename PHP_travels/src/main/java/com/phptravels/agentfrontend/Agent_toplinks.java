package com.phptravels.agentfrontend;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.phptravels.baseclass.*;

public class Agent_toplinks extends BaseClass {
	@FindBy(xpath = "//a[@title=\"hotels\"][contains(text(),\"Hotels\")]")
	private WebElement Hotels;
	@FindBy(xpath = "//span[@id='select2-hotels_city-container']")
	private WebElement ahcity ;
	
	@FindBy(xpath = "//a[@title=\"tours\"][contains(text(),\"Tours\")]")
	private WebElement Tours;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement atsearch ;
	
	@FindBy(xpath = "//a[@title=\"flights\"][contains(text(),\"flights\")]")
	private WebElement Flights;
	@FindBy(xpath="//button[@id='flights-search']")
	private WebElement affrom ;
	
	@FindBy(xpath = "//a[@title=\"visa\"][contains(text(),\"visa\")]")
	private WebElement Visa;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement avsubmit;
	
	@FindBy(xpath = "//a[@title=\"blog\"][contains(text(),\"Blog\")]")
	private WebElement Blog;
	@FindBy(xpath = "//button[@id='loadMore']")
	private WebElement abviewmore ;
	
	@FindBy(xpath = "//a[@title=\"offers\"][contains(text(),\"Offers\")]")
	private WebElement Offers;
	@FindBy(xpath = ".//*[text()='PHPTRAVELS Offers']")
	private WebElement aotext ;
	
	@FindBy(xpath = "//*[@class='btn btn-primary dropdown-toggle waves-effect']")
	private WebElement lgaccount;
	@FindBy(xpath = "//a[@class='dropdown-item waves-effect' and @href='https://phptravels.net/account/dashboard']")
	private WebElement logout;
	
	boolean actual=false;
	
	public Agent_toplinks(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean Ahotel() {
		Hotels.click();
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ahcity));
    	actual=ahcity.isDisplayed();
		return actual;
		
	}
	public boolean Atours() {
		Tours.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(atsearch));
    	 actual=atsearch.isDisplayed();
		return actual;
		
	}
	public boolean Aflights() {
		Flights.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(affrom));
		 actual=affrom.isDisplayed();
		return actual;
	}
	public boolean Avisa() {
		Visa.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(avsubmit));
        actual=avsubmit.isDisplayed();
		return actual;
	}
	public boolean Ablog() {
		Blog.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(abviewmore));
    	 actual=abviewmore.isDisplayed();
		return actual;
	}
	public boolean Aoffers() {
		Offers.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(aotext));
    	actual=aotext.isDisplayed();
		return actual;
		
	}
	
	public void logout() {
		lgaccount.click();
		logout.click();
	}
}
