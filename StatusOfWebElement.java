package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.makemytrip.com/");
		
	//isDisplayed() isEnabled()   used for all kinds of elements
		WebElement searchFlight=driver.findElement(By.xpath("//a[normalize-space()='Search']"));
		System.out.println("Display Status " + searchFlight.isDisplayed());//true
		System.out.println("Enabled  Status " + searchFlight.isEnabled());//true whether the ele is able to pass the value or not
		
		
		//isSelected()   whether the element is selecter or not for Radio buttons , checkboxes and dropdowns
		WebElement roundTrip =driver.findElement(By.xpath("//li[@class='selected']"));
		WebElement oneway =driver.findElement(By.xpath("//li[@class='selected']"));

		
		oneway.click();
		System.out.println("one way selected   Status " + oneway.isSelected());
		
		roundTrip.click();
		System.out.println("selected statutys " + roundTrip.isSelected());
		
		
			

	}

}
