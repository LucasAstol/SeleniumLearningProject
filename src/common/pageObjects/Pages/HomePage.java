package common.pageObjects.Pages;

import org.openqa.selenium.By;

import common.pageObjects.BasePage;
import common.pageObjects.Elements.*;

public class HomePage extends BasePage{
	
	public HomePage() {
		super();
	}
	
	public InputField inputUserDNI() {
		
		return new InputField(By.cssSelector("#usuarioNoConectado #input-placeholder"));
	}
	
	public InputField inputPassword(){
		
		return new InputField(By.cssSelector("#usuarioNoConectado input[name='pinDNI']"));
	}
	
	public Button buttonEnter(){
		
		return new Button(By.cssSelector("#usuarioNoConectado input.bs-login"));
	}
	

}

