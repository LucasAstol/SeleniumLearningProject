package baseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementMethods {
	
	
	private static final long WAIT_TIMEOUT = 60;
	
	public static void clickWait (WebElement element) {
		
		new WebDriverWait(DriverHandler.getDriver(), WAIT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static boolean isClickable (By locator) {
		
		return ExpectedConditions.elementToBeClickable(locator) != null;
	}	
	
	public static boolean isVisible (By locator) {
		
		return ExpectedConditions.visibilityOfElementLocated(locator) != null;
	}
	
}
