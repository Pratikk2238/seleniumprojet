package Mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePckerDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		//month and year selection
		driver.findElement(By.xpath("//input[@id='dob']")).click();//open the datepicker
		Select month_drp=new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month_drp.selectByVisibleText("Oct");
		
		Select year_drp=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));

		year_drp.selectByVisibleText("1990");
		
		//date selection
		String date="15";
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:alldates) {
			
			String dt=ele.getText();
			if(dt.equals(date)) {
				
				ele.click();
				break;
				
			}
			
			
		}
	}

}
