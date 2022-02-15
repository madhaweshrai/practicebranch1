package NaveenSelenium.July21Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver= driver;
	}

	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendkeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doCLick(By locator)
	{
		getElement(locator).click();
	}
}
