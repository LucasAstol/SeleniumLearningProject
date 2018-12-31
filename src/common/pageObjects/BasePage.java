package common.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseSetup.DriverHandler;

public class BasePage { 
	
	protected By locator = null;
	
	public BasePage() {};
	
	public BasePage(By by) {};
	
	public WebDriver getDriver() {
		
		return DriverHandler.getDriver();
	}

	public String getUrl() {
		
		return getDriver().getCurrentUrl();
	}
	
	public String getPagetTitle() {
		
		return this.getDriver().getTitle();
	}

}
