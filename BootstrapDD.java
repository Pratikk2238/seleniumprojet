package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDD {

	public static void main(String[] args) {
		//How to handle bootstrap dropdowns becuse the dont have select tag 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();//maximise the window
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		//product type
		List<WebElement> productType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));//here user list type of xpath is se;lected
		System.out.println("number of options " + productType.size());
		
		for(WebElement product:productType) {
			
			if(product.getText().equals("Accounts")) {
				
				product.click();
				break;
				
				
			}
			
			
		}
		
		//also we can write a generic method for selecting the options from the dropdowns
		

	}

}
