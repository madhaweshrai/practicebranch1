package NaveenSelenium.July21Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowsersUtil {
	
	WebDriver driver;
	
	/**
	 * return type is webdriver bcz this driver is passsed to different utilities
	 * @param browser
	 * @return driver
	 */
	public WebDriver launchBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
			
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("NO Browser found");
		}
		
		return driver;
	}
	
	public void launchurl(String url)
	{
		driver.get(url);
		
	}
	public String getpagetitle()
	{
		return driver.getTitle();
		
	}
	
	public String getpageSource()
	{
		return driver.getPageSource();
	}
  public void close()
  {
	  driver.close();
	  
  }
}
