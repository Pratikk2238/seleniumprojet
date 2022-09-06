package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDD {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	WebElement category	= driver.findElement(By.id("searchDropdownBox"));
	 Select searchcategory= new Select(category);
	 
	 //searchcategory.selectByVisibleText("Amazon Fashion");
	// searchcategory.selectByValue("search-alias=appliances");
	// searchcategory.selectByIndex(10);
	// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ias");
	// driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	 
	 //selecting options from dd without using methods
	List<WebElement> allelements =searchcategory.getOptions();	 
	
	for(WebElement option:allelements){
	  
		if(option.getText().equals("Amazon Fashion"))
		{
			option.click();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("women fashion");

			
			break;
			
		}
		
		
		
	}

	}

}
