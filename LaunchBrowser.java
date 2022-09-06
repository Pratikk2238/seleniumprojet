package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	/*System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");	
	 // ChromeDriver driver=new ChromeDriver();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://frontend.nopcommerce.com/");*/
	  
	  
		
	/*System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.31.0-win64//geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://frontend.nopcommerce.com/");
	  */
		

	/*System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64//msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://frontend.nopcommerce.com/");*/
		
		
	// BY USING WEBDRIVER MANAGER API
	//BY ADDING WEBDRIVEREMANAGER DEPENDENCIES
		
		
	/*WebDriverManager.chromedriver().setup(); 
	WebDriver driver=new ChromeDriver();
    driver.get("https://frontend.nopcommerce.com/");*/
		
	/*WebDriverManager.firefoxdriver().setup(); 
	WebDriver driver=new FirefoxDriver();
	driver.get("https://frontend.nopcommerce.com/");*/
		
	    WebDriverManager.edgedriver().setup(); 
		WebDriver driver=new EdgeDriver();
		driver.get("https://frontend.nopcommerce.com/");
			 
			 System.out.println("Title of the page "+driver.getTitle());
			 System.out.println("url of the page "+driver.getCurrentUrl());
			 System.out.println("url of the page "+driver.getPageSource());

			 
		
		
		
		
		
	}

}
