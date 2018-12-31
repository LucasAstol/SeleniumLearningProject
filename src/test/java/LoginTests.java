package test.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.pageObjects.Pages.HomePage;
import common.pageObjects.Pages.Popup;
import common.tests.BaseTest;

public class LoginTests extends BaseTest {
	
	private HomePage home = new HomePage();
	
	@Test (description = "Verifies that error is thrown when trying to login with incorrect credentials", 
			testName = "Unsuccessful login with incorrect credentials ")
	public void testSearchClickingSearchOnGoogle() {
		
		Assert.assertTrue(home.inputPassword().isVisible(), "Banc Sabadell home page is not displayed");
		
		home.inputUserDNI().inputText("36524897");
		home.inputPassword().inputText("34636346");
		home.buttonEnter().click();
		
		Popup popUp = new Popup();
		
		Assert.assertTrue(popUp.getLabelErrorTitle().text().equals("Connection error") );
		
		
	}
	
	

}
