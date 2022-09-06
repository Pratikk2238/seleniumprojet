package Mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='block fs-11 mt10']")).click();
		//driver.findElement(By.xpath("//*[@id=\'file-upload\']")).sendKeys("C:\\Users\\hp\\Downloads\\files-sample_100kB(1).doc");
		//here sendKeys method is used because the element attribute (type='file')
		
		
		//using robot Class method // because selenium WebDriver cannot suuport window based application
		
		//driver.findElement(By.xpath("//*[@id=\'file-upload\']")).click();// this statement will throw InvalidRgumentException
		//so we have to pereform click action by using JavaScriptExecutor approach
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\'file-upload\']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);//perform the click acton on the button
		
		//now we have to perform the keyboard action By using Robot Class 
		//WE USE ROBOT CLASS WHEN THE ATTRIBUTE OF (type='file') IS NOT PRESENT
		//Step 1--copy the location of the file
		//step 2--CTRL +V
		//step 3--ENTER KEY
		
		Robot rb=new Robot();
		rb.delay(2000);//just to delay
		//put the file on the clipboard
		StringSelection ss=new StringSelection("C:\\Users\\hp\\Downloads\\files-sample_100kB(1).doc");//this class is for copying the path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//now just ctrl v and enter
		rb.keyPress(KeyEvent.VK_CONTROL);//THIS WILL PRESS ON CONTROL KEY ON KEYBOARD
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//NOW PRESS ENTER KEY
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
