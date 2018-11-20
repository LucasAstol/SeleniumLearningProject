package common.tests;

import org.testng.annotations.*;
import baseSetUp.DriverHandler;


public class BaseTest {
	
	public BaseTest() {
		
		DriverHandler.getDriver()
		.navigate()
		.to("https://www.google.com/");
	}
	
	@BeforeClass
	public void initialize() {
		
	}
	
	@AfterClass
	public void terminate() {
		
		DriverHandler.terminateDriver();
	}
	
	
}
