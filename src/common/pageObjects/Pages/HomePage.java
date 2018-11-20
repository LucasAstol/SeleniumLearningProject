package common.pageObjects.Pages;

import org.openqa.selenium.By;
import common.pageObjects.Elements.*;

public class HomePage {
	
	public HomePage() {
		super();
	}
	
	public Button buttonSubmit() {
		
		return new Button(By.cssSelector("input[name='btnK']"));
	}
	
	public InputField inputSearch(){
		
		return new InputField(By.id("lst-ib"));
	}
	

}
