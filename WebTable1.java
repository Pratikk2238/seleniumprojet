package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*1. how many rows in table
2. how many coloums in a table
3  retrive the specific row/column data
4. retrive all the data from the table
5. print relese data , version no of java language of selenium
*/

public class WebTable1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		//how to find the rows in the table// here table will be the tag name//tr tag
		
		int rows=driver.findElements(By.xpath("xpath")).size();
		System.out.println("no of rows in table  "+rows);
		
		//how to find no of columns thead//tr//th
		int columns =driver.findElements(By.xpath("xpath")).size();
		System.out.println("no of coumns  "+columns);
		
		
		//specific row and column data
		
		//sample xpath //table[@class='data_list']//tr[2]/td[1]
		
		String value =driver.findElement(By.xpath("xpath")).getText();
		System.out.println(value);
		
		//retrive all the data from the table
		/*System.out.println("data from the table");
		
		for(int r=1;r<=rows;r++) {
			
			for(int c=1;c<=columns;c++) {

				iString data =driver.findElement(By.xpath("table[@class='data_list']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data+"    ");
				
			
			}
			System.out.println();
			
		}*/
		
		
		//print relese data , version no of java language of selenium
		
		
		for(int r=1;r<=rows;r++) {
			
			String language=driver.findElement(By.xpath("//table[@class='data_list']/tbody/tr["+r+"]/td[1]")).getText();
			if(language.equals("Java")) {
				
				String version=driver.findElement(By.xpath("//table[@class='data_list']/tbody/tr["+r+"]/td[2]")).getText();
				String relese=driver.findElement(By.xpath("//table[@class='data_list']/tbody/tr["+r+"]/td[3]")).getText();
                System.out.println(language+"     "+version+"      "+relese  );
				
				
			}
		}
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
