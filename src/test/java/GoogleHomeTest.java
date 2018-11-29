package test.java;

import org.testng.annotations.Test;
import org.testng.Assert;
import common.pageObjects.Pages.HomePage;
import common.pageObjects.Pages.ResultsPage;
import common.tests.BaseTest;

public class GoogleHomeTest extends BaseTest {
	
	private HomePage home = new HomePage();
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "Search by clicking on Search on Google button")
	public void testSearchClickingSearchOnGoogle() {
		
		Assert.assertTrue(home.inputSearch().isVisible(), "Google home page not displayed");
		
		home.inputSearch().inputText("selenium");
		home.inputSearch().focusOut();
		home.buttonSubmit().click();
		
		ResultsPage results = new ResultsPage();
		Assert.assertTrue(results.labelResultsStats().text().contains("resultados"), "Results page is not displayed");		
	}
	
	@Test (description = "Verifies that results page is displyed when doing search", 
			testName = "blabla")
	public void blabla() {
		
		Assert.assertTrue(home.inputSearch().isVisible(), "Google home page not displayed");
		
		home.inputSearch().inputText("blabla");
		home.inputSearch().focusOut();
		home.buttonSubmit().click();
		
		ResultsPage results = new ResultsPage();
		Assert.assertTrue(results.labelResultsStats().text().contains("resultados"), "Results page is not displayed");
	}
	

}
