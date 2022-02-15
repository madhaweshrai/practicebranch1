package NaveenSelenium.July21Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowsersUtil obj = new BrowsersUtil();
		
		obj.launchBrowser("firefox");
		//obj.launchurl();
		obj.getpagetitle();
		obj.getpageSource();
		obj.close();
		
		WebDriver dr = new ChromeDriver();
		
		
	}
	
	

}
