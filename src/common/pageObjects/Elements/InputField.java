package common.pageObjects.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import common.pageObjects.BaseElement;

public class InputField extends BaseElement{
	
	public InputField(By by) {		
		super(by);
	}
	
	public void inputText(String inputText) {
		
		this.getWebElement().click();
		this.getWebElement().clear();
		this.getWebElement().sendKeys(inputText);
	}
	
	public void focusOut() {
		
		this.getWebElement().sendKeys(Keys.TAB);
	}

}
