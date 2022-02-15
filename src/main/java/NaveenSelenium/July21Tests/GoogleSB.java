package NaveenSelenium.July21Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSB {
	
	static WebDriver dr;
	
	public static List<WebElement> allsearch(By locator)
	{
		return dr.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	}
	
	public static WebElement dofind(By locator)
	{
		return dr.findElement(locator);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		
		WebDriverWait w= new WebDriverWait(dr,10);
	
		
		By search= By.xpath("//input[@name='q']");
		//dr.findElement(search).sendKeys("Naveen automation");
		String value="naveen automation labs selenium";
		By allitems= By.xpath("//ul[@class='G43f7e']//li");
		String searchkey= "Naveen automation";
	//	w.until(ExpectedCondition.presenceOfElementLocated(search));
		
		doSearch(search,allitems,searchkey,value);
		
	}

	
	public static void doSearch(By locator,By locator1, String searchkey,String value) throws InterruptedException
	{
		
		dofind(locator).sendKeys(searchkey);
		Thread.sleep(2000);
		List<WebElement> el=allsearch(locator1);
		for(WebElement e: el)
		{
			//System.out.println(allsearch.size());
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("naveen automation labs selenium"))
			{
				e.click();
				
				System.out.println("TC passed");
				break;
			}
		}
		dr.close();
	}

}
