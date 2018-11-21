package common.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.pageObjects.Pages.HomePage;
import common.pageObjects.Pages.ResultsPage;

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

}
