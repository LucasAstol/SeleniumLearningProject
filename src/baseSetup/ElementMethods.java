package baseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementMethods {
	
	private static WebDriver driver = DriverHandler.getDriver();
	private static final long waitTimeout = 60;
	
	public static void clickWait (WebElement element) {
		
		new WebDriverWait(driver, waitTimeout).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static boolean isClickable (By locator) {
		
		return ExpectedConditions.elementToBeClickable(locator) != null;
	}	
	
	public static boolean isVisible (By locator) {
		
		return ExpectedConditions.visibilityOfElementLocated(locator) != null;
	}
	
}
