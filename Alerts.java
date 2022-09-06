package Mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      // alert window with ok button
     /* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
      Thread.sleep(3000);// need to read on this later
      driver.switchTo().alert().accept();*/
      
      //alert window with ok and cancel button
      /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
      Thread.sleep(3000);
      //driver.switchTo().alert().accept();//closes the alert by usng ok button
      driver.switchTo().alert().dismiss();//closes the alert by cancel button*/
     
     
     // Alert window with input box and ho to capture text from alert
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
     Thread.sleep(3000);
    Alert alertwindow= driver.switchTo().alert();
    System.out.println("messagedisplyaed on alert :" +alertwindow.getText());
    alertwindow.sendKeys("Welcome");
    alertwindow.accept();
    
      
      
      

	}

}
