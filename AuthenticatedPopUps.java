package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();;
       WebDriver driver=new ChromeDriver();
      // driver.get("https://the-internet.herokuapp.com/basic_auth");
       
       //to prvide and pssword
       //http://username:password@URL
       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       
	}

}
