package NaveenSelenium.July21Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetallLinksAttributes {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement fn=driver.findElement(By.id("input-firstname"));
		WebElement ln=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.id("input-email"));
		WebElement tele=driver.findElement(By.xpath("//input[@type='tel']"));
		
		System.out.println(fn.getAttribute("placeholder"));
		System.out.println(ln.getAttribute("placeholder"));
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(tele.getAttribute("placeholder"));
		
       List<WebElement> links=  driver.findElements(By.tagName("a"));
       System.out.println(links.size());
       
       for(WebElement e: links)
    	   
       {
    	   String href= e.getAttribute("href");
    	   System.out.println("all scr "+ href);
       }
       
       
       //all textboxes
       
       List<WebElement> tb=  driver.findElements(By.tagName("input"));
       System.out.println(tb.size());
       
       for(WebElement e: tb)
    	   
       {
    	   String tbx= e.getAttribute("placeholder");
    	   System.out.println("all scr "+ tbx);
       }
       
       
       for(int i=0;i<tb.size();i++)
       {
    	   System.out.println("for loop  "+tb.get(i).getAttribute("placeholder"));
       }
       driver.close();
	}

}
