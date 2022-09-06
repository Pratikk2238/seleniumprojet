package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsGetAttribute {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.in/");
     //WebElement from= driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
     //from.clear();
    // from.sendKeys("raipur");
     
     // capturing text from inputbox
    //System.out.println("result"+ from.getAttribute("type")); // for getting the attribute value
    //System.out.println("result"+ from.getText());//for getting the inner text
      
    		  WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    		  System.out.println("inner text" +logo.getText());
    		  System.out.println("inner text" +logo.getAttribute("class"));
    		  
	}

}
