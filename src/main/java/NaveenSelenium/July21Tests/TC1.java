package NaveenSelenium.July21Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	
			
			BrowsersUtil br= new BrowsersUtil();
	  WebDriver dr=	 br.launchBrowser("chrome");
		 br.launchurl("https://demo.opencart.com/");
		 System.out.println(br.getpagetitle() + "  title of browser");
		 
		 By search= By.name("search");
		 By sbtn= By.xpath("//*[@id=\"search\"]/span/button");
		
		 
		 ElementUtil el= new ElementUtil(dr);
		 
		 el.getElement(search);
		 el.doSendkeys(search, "maddy");
		 el.doCLick(sbtn);
		 System.out.println("search done");
		 System.out.println(br.getpagetitle());
		 
		 br.close();
		 
		 
		 
		 
			
			
	}

}
