package common.pageObjects.Pages;

import org.openqa.selenium.By;
import common.pageObjects.BasePage;
import common.pageObjects.Elements.Button;
import common.pageObjects.Elements.Label;

public class Popup extends BasePage {
	
	public Popup() { 
		super();
	}
	
	public Button getButtonClosePopup() {
		
		return new Button(By.cssSelector("#ayudaCAM #closebox"));
	}
	
	public Label getLabelErrorTitle() {
		
		return new Label(By.cssSelector("#principal span.lightbox-title"));
	}
	
	
	

	
}
