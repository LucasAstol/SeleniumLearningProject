package common.pageObjects;

import org.openqa.selenium.WebDriver;

import baseSetUp.DriverHandler;

public class BasePage { 
	
	public BasePage() {};
	
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
