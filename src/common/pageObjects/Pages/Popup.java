package common.pageObjects.Pages;

import org.openqa.selenium.By;

import baseSetup.DriverHandler;
import common.pageObjects.BasePage;
import common.pageObjects.Elements.Button;
import common.pageObjects.Elements.Label;

public class Popup extends BasePage {
	
	protected String locator;
	
	public Popup() { 
		super();
	}
	
	public Popup(String _locator) { 
		super();
		
		this.locator = _locator;
	}
	
	public Button getButtonClosePopup() {
		
		return new Button(By.cssSelector("#ayudaCAM #closebox"));
	}
	
	public Label getLabelErrorTitle() {
		
		return new Label(By.cssSelector("#principal span.lightbox-title"));
	}
	
	 
	
	
	

	
}
