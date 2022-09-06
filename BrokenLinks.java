package Mypackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.deadlinkcity.com/");
     int brokenlinks=0;
     List<WebElement> allLinks =driver.findElements(By.tagName("a"));
     
     for(WebElement ele:allLinks) {
    	 
    	String url= ele.getAttribute("href");
    	if(url==null || url.isEmpty()) {
    		
    		System.out.println("url is empty");
    		continue;
    		
    	}
    	
    	URL link=new URL(url);
    	try {
    		HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
    		httpconn.connect();
    		
    		if(httpconn.getResponseCode()>=400) {
    			 
    		System.out.println(httpconn.getResponseCode()+ url+" is " + " Broken link Link  ");
    		brokenlinks++;
    				
    		}
    		else {
    			System.out.println(httpconn.getResponseCode()+ url+ "is" + "Valid link");
    			
    			
    		}
    		
    	}catch(Exception e) { }
    	
    	
    	
    	 
     }
     System.out.println("no of broken links " +brokenlinks);
     
     driver.quit();
     
	}

}
