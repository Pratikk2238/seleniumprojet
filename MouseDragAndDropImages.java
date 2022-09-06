package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDropImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']")));
		WebElement item1=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement item2=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(item1, trash).perform();
		act.dragAndDrop(item2, trash).perform();
		
		

		
	}

}
