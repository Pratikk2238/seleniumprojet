package Mypackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		//syntax
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(Script, args);*/
		
		//usage1--flashing an element
		//usage2=--highlighting //draw the bordor around the element
		/*WebElement logo=driver.findElement(By.xpath("//*[@id=\'selenium_logo\']"));
		javaScripUtil.drawBorder(logo, driver);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\scrennshots\\logo.png");
		FileUtils.copyFile(src, trg);*/
		
	
		//usage3--getting the title of the page		
		/*String title=javaScripUtil.getTitleByJS(driver);
		System.out.println(title);*/
						
		//to perform the click 
		/*WebElement downloads=driver.findElement(By.linkText("Downloads"));
		javaScripUtil.clickElementByJS(downloads, driver);*/
		
		
		
		//Genarte an Alert
		//javaScripUtil.genarateAlert(driver, "This Alert is genarated");
		
		
		//to refresh the page
		//javaScripUtil.refreshBrowserByJS(driver);
		//scroll down/up the page 
		/*javaScripUtil.scrollPageDown(driver);
		Thread.sleep(4000);
		javaScripUtil.scrollPageUp(driver);*/
		
		
		
		//zoom in zoom uot
		//javaScripUtil.zoomPageByJS(driver);
		
		
        //flash 
		WebElement logo= driver.findElement(By.id("selenium_logo"));
		javaScripUtil.flash(logo, driver);
		
		
		
	}

}
