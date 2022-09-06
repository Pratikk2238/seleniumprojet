package Mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Today's"));
		
		// how to capture all the links from the web page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("no of links present  "+links.size());
		
		// normal for loop to reach each link
		/*for(int i=0;i<=links.size();i++)
			
		{
			System.out.println(links.get(i).getText());
			System.out.println( links.get(i).getAttribute("href"));
			
			
			
		}*/
		
		for(WebElement link:links) {
			
			System.out.println(link.getText());
			System.out.println( link.getAttribute("href"));
			
			
		}
		
		
	}

}
