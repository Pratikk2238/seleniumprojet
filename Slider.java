package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("location of the minimum slider :"+min_slider.getLocation());//(59,250)//gives the location of the element
		
		System.out.println("Height and width of the element :"+min_slider.getSize());//(21,21)//gives the size of the element
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider,100, 0).perform();//for sliding
		

		System.out.println("location of the minimum slider :"+min_slider.getLocation());//(59,250)
		System.out.println("Height and width of the element :"+min_slider.getSize());//(21,21)
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -100, 0).perform();
		

	}

}
