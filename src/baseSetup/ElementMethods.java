package baseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementMethods {
	
	
	private static final long WAIT_TIMEOUT = 60;
	
	public static void clickWait(WebElement element) {
		
		new WebDriverWait(DriverHandler.getDriver(), WAIT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public static boolean isClickable(By locator) {
		
		return ExpectedConditions.elementToBeClickable(locator) != null;
	}	
	
	public static boolean isVisible (By locator) {
		
		return ExpectedConditions.visibilityOfElementLocated(locator) != null;
	}
	
	public static void scrollToElement(WebElement element) {
		
		((JavascriptExecutor) DriverHandler.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static WebElement findChildElementWait(WebElement element, By locator) {
		
		WebElement childElement = (new WebDriverWait(DriverHandler.getDriver(), WAIT_TIMEOUT)
				.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, locator)));
		
		return childElement;
	}
}
