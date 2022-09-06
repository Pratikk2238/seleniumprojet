package Mypackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//full page screenshot
		
		//TakesScreenshot ts=(TakesScreenshot)driver;    //TakeScreenShot is an interface
														//here typecasting required because WebDriver and TakesScreenshot are two different interfaces
		//if we use the ChromeDriver class to launch the driver then typecasting is not required beacuse chromedriver class ectends to remoteWebDriver class
		
		/*File src +=ts.getScreenshotAs(OutputType.FILE);//here file will save the screenshot in memory(harddrive) somewhere with src veriable
		File trg=new File(".\\Screenshots\\homepage.png");//setting the target(our own location)
		FileUtils.copyFile(src, trg);//now copy src into trg*/
		
		//ScreenShot of the section/portion of the page
		WebElement section=driver.findElement(By.xpath("//div[@class='col']//div[@class='row']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshot\\section.png");
		FileUtils.copyFile(src, trg);
		//here no need to use TakesScreenshot interface
		
		
		
	}

}
