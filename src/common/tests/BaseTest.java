package common.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import baseSetup.DriverHandler;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	@BeforeClass
	public void driversSetup() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
	}
	
	@BeforeMethod
	public void initialize() {
	DriverHandler.getDriver()
		.navigate()
		.to("https://www.bancsabadell.com/cs/Satellite/SabAtl/");	
	}
		
	@AfterMethod
	public void terminate() {
		
		DriverHandler.terminateDriver();
	}
	
	
}
