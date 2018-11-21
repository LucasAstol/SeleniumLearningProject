package common.pageObjects.Pages;

import org.openqa.selenium.By;

import common.pageObjects.BasePage;
import common.pageObjects.Elements.*;

public class HomePage extends BasePage{
	
	public HomePage() {
		super();
	}
	
	public Button buttonSubmit() {
		
		return new Button(By.cssSelector("div.FPdoLc.VlcLAe input[name='btnK']"));
	}
	
	public InputField inputSearch(){
		
		return new InputField(By.cssSelector("input.gLFyf.gsfi"));
	}
	

}
