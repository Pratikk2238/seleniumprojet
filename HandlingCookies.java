package Mypackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//to capture cookies from broser
		Set<Cookie> cookies=driver.manage().getCookies(); //this will return the set of cookies
		System.out.println("size of cookies  "+cookies.size());//3
		
		//how to print cookies from the broser
		for(Cookie cookie:cookies) {
			
			System.out.println(cookie.getName()+"  "+cookie.getValue());
		}
		
		//how to add cookie to the broser
		//lets create one cookie object
		Cookie cookieobj=new Cookie("Mycookie123","123456789");
		driver.manage().addCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println("size of the cookies after adding  "+cookies.size());//4
		
		//delete the cookies from the browser
		//driver.manage().deleteCookie(cookieobj);//by the object
		driver.manage().deleteCookieNamed("Mycookie123");//delete by name
		cookies=driver.manage().getCookies();
		System.out.println("size of the cookies after deletion  "+cookies.size());//3
		
		//delete all the cookies from the broser
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		System.out.println("size of the cookies after deleting all  "+cookies.size());//3
				
	}

}
