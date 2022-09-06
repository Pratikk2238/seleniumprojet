package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableWithPagination {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		//login
		WebElement user= driver.findElement(By.id("input-username"));
		user.sendKeys("demo");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
		
		//sales--orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//find out the totle no of pages
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		
		System.out.println(text);//Showing 1 to 10 of 57 (6 Pages)
		// to find exact no of pages we need to write a string metods logic//indexOf(),subString()
		
		//text.indexOf("(");
		
		//text.indexOf("Pages");
		
		//text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
		int total_pages=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));//to convert string into number
		System.out.println("total no of pages: "+total_pages);
		
		//no. of rows in each page
		for(int p=1;p<=2;p++) {
			
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active page :"+active_page.getText());
			active_page.click();
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("no of rows   "+rows);
			
			//read allthe rows from the table
			for(int r=1;r<=rows;r++) {
				
				String orderid=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				
				String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				
				System.out.println(orderid+"   "+customername+"    "+status);
			}	
			

			String pageno=Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
			
			
			
			
		}
		//driver.quit();
		
	
		
		}

}
