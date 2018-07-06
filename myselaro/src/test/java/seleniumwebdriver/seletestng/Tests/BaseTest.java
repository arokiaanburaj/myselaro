package seleniumwebdriver.seletestng.Tests;
import seleniumwebdriver.seletestng.Pages.*;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;


public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	 
	  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
		FirefoxOptions opts = new FirefoxOptions().setLogLevel(FirefoxDriverLogLevel.TRACE);
		  driver = new FirefoxDriver(opts);
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	      	 
	  }
	
	@AfterMethod
	 
	  public void afterMethod() {
	 
		  driver.quit();
	}
	
}
