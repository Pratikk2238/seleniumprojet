package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrames2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");//switch to outer iframe
		driver.switchTo().frame(0);//switch to inner iframe because outer iframe has only one inner iframe
		System.out.println("text present inside the inner frame " +driver.findElement(By.xpath("//h1")).getText());
		
		//now go to parent frame and capture text their
		driver.switchTo().parentFrame();
		String s=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		System.out.println("text present in outer iframe :" +s);
	}

}
