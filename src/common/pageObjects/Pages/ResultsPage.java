package common.pageObjects.Pages;

import org.openqa.selenium.By;

import common.pageObjects.*;
import common.pageObjects.Elements.Label;

public class ResultsPage extends BasePage {
	
	public ResultsPage() {
		super();
	}
	
	public Label labelResultsStats() {
		
		return new Label(By.id("resultStats"));
	}

}
