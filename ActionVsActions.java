package Mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionVsActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act=new Actions(driver);
		//act.moveToElement(women).perform();
		//act.moveToElement(women).build().perform();//here build method will be called two times
		//act.moveToElement(women).build();//here build will just return the action but not perform the action

		Action action=act.moveToElement(women).build();//here the action veriable is storing the actual action to be performed
		action.perform();//to complete the action
		
		
	}

}
