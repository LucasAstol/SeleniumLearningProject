package common.pageObjects.Pages;

import org.openqa.selenium.By;
import common.pageObjects.BasePage;
import common.pageObjects.Elements.Label;

public class LoginDo extends BasePage {

	public LoginDo() {
		super();
	}
	
	public Label getErrorText() {
		
		return new Label(By.id("errorName"));
	}
	
	
}
