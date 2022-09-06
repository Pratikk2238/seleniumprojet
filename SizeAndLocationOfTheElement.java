package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfTheElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/");
		WebElement logo=driver.findElement(By.id("selenium_logo"));
		
		//location--1st method
		System.out.println("Location(x,y)"+logo.getLocation());
		System.out.println("Location(x)"+logo.getLocation().getX());
		System.out.println("Location(y)"+logo.getLocation().getY());

		//location --2nd method
		System.out.println("Location(x)"+logo.getRect().getX());
		System.out.println("Location(y)"+logo.getRect().getY());
		
		//Size of the element--method 1
		System.out.println("Size(width,Height)"+logo.getSize());//will return the dimention objet
		System.out.println("Size(width)"+logo.getSize().getWidth());
		System.out.println("Size(Height)"+logo.getSize().getHeight());
		
		//Size of the element--method 

		System.out.println("Size(width)"+logo.getRect().getDimension().getWidth());
		System.out.println("Size(Height)"+logo.getRect().getDimension().getHeight());
		
		driver.close();
		
		
		
	}

}
