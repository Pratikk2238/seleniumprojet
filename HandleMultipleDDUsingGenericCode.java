package Mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDDUsingGenericCode {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//Approach 1
		//Select noOfEmp=new Select(driver.findElement(By.className("NoOfEmployes")));
		//noOfEmp.selectByVisibleText("16-20");
	
		//Select industryDrp=new Select(driver.findElement(By.className("Industry")));
		//industryDrp.selectByVisibleText("Travel");
		//Select countryDrp=new Select(driver.findElement(By.className("Country")));
		//countryDrp.selectByVisibleText("India");
		
		//insted of writing multiple select statement writing the generic method
		
		//Approach 2
		
		WebElement noOfEmp = driver.findElement(By.name("Industry"));
		selectOptionFromDD(noOfEmp,"16-20");
		
		WebElement industryDrp	=	driver.findElement(By.name("Industry"));
		selectOptionFromDD(industryDrp,"Travel");
		
		WebElement	countryDrp=		driver.findElement(By.name("Country"));
		selectOptionFromDD(countryDrp, "India");
		
	}
	
	public static void selectOptionFromDD(WebElement ele , String value) {
		Select drp=new Select(ele);
		
		List<WebElement> allelements =drp.getOptions();	 
		
		for(WebElement option:allelements){
		  
			if(option.getText().equals(value))
			{
				option.click();
				break;
				
			}
			
			
			
		}

		
		
		
		
	}

}
