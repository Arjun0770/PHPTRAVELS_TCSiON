package com.phptravels.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = null;
	String Safari_driverPath = "/usr/bin/safaridriver";

	public static void TestBase() {

		try {
			prop = new Properties();
			
			//FileInputStream ip = new FileInputStream("/Users/arjun/Software Testing/PHP_travels/src/test/resources/configuration.properties");
			//FileInputStream ip = new FileInputStream("/Users/arjun/Software Testing/PHP_travels/src/test/resources/config.properties");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeTest

	public void onSetup() throws Exception {

		TestBase();
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();
	
		} else if (browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
		} else if (browserName.equals("safari")) {

		
			driver = new SafariDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void customerURL() {
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
	}
	public void agentURL() {
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
	}
	public void adminURL() {
		driver.get(prop.getProperty("url2"));
		driver.manage().window().maximize();
	}
	public void supplierURL() {
		driver.get(prop.getProperty("url3"));
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
}
