package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HnadleiFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		//1sr frame
		driver.switchTo().frame("packageListFrame");//by name of the frame 
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();//to go back to the maon frmae
		Thread.sleep(5000);
		
		//2nd frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='Capabilities']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//3rd iframe
		driver.switchTo().frame("classFrame");
		//driver.findElement(By.xpath("//div[@clas;s='topNav']//li[@class='navBarCell1Rev'][normalize-space()='Help']")).click();
		driver.findElement(By.xpath("//div[@class='topNav']//a[text()='Help']")).click();
	}

}
