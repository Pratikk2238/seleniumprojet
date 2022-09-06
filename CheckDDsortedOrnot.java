package Mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDDsortedOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.twoplugs.com/newsearchserviceneed");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
     WebElement drpElement= driver.findElement(By.name("category_id"));
     Select drpselect=new Select(drpElement);
      List<WebElement> options= drpselect.getOptions();
      
      ArrayList originalList=new ArrayList();
      ArrayList tempList= new ArrayList();
      
      for(WebElement option:options) {
    	  
    	  originalList.add(option.getText());    	  
    	  tempList.add(option.getText());
    	  
    	  
    	  
      }
      
      System.out.println("Original list"+originalList);
      System.out.println("temp list"+tempList);
      Collections.sort(tempList);
      
      System.out.println("Original list after sorting"+originalList);
      System.out.println("temp list after sorting"+tempList);
      
      if(originalList.equals(tempList)) {
    	  
          System.out.println("Dropdown sorted");
 
    	  
      }
      else {
    	  
          System.out.println("not sorted");

    	  
      }
      
      
      
      
	}

}
