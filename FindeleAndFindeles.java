package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindeleAndFindeles {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		/*
		// findElement()---- Returns the Single element
		//1
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Raipur");
		//2 multiple webelements
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='footerBottom']//a"));// only first ele will returns
		System.out.println(footer.getTagName());
		//3
		WebElement search = driver.findElement(By.xpath("//a[normalize-space()='Searcha']"));//false ele returns noelementfiundexception
		

		*/
		
		//findElements()  ---returns multile webelements
		//1
		List<WebElement> links =driver.findElements(By.xpath("//div[@class='landingContainer makeFlex whiteText']//a"));//list of web elements
		System.out.println("no of ele " + links.size());
		
		//2
		/*List<WebElement> link =driver.findElements(By.xpath("//img[@alt=\"MMT's LOGO\"]"));//returns one single element	
		System.out.println("no of ele " + link.size());*/
		
		
		//iterate these multple elements
		for(WebElement ele: links)
		{
			
			System.out.println(ele.getText());
			
			
		}
		
		

		
						
		
		
		
		
		
	}
	
	

}
