package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	//driver.get("https://www.amazon.in/");   
	            //or
	driver.navigate().to("https://www.makemytrip.com/");
	/* differnce between these two methodes
    get(): is used to navigate to perticular url and wait till page load 
    navigate().to() is used to navigate to erticullar url and does not wait to page load 
    it maintains browser history or cookies to navigate back or forword*/
	//seee webdriver heirachy in notes
	// BUT PRACTICALLY WHATEVER GET() IS DOING THE NAVIGATE().TO() IS ALSO DOING THE SAME
	// NAVIGATE.TO METHOD INTERNALLY INVOKING THE GET METJOD ONLY AS PART TO OTHER METHODS OF NAVIGATE METHOD
	// GET METHOD ACCEPS ONLY STRING PARAMETER WHERE NAVIGATE ACCEPT TWO PARAMETERS THAT IS STRING AND URL INSTACE AS A PARAMETER
	
	driver.navigate().to("https://www.amazon.in/");
	            	
	// now go back to makemytrip
	driver.navigate().back();//mmt
	driver.navigate().forward();
	driver.navigate().refresh();// refresh or reload the page
	
	
	
	
	
	
	
	}

}
