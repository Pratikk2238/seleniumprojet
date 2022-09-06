package Mypackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScripUtil {
	
	
	public static void drawBorder(WebElement element ,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);		
		
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
			
	}
	
	public static void clickElementByJS(WebElement element , WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	public static void genarateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
			
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}
	
	public static void scrollPageUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		
	}
	
	public static void zoomPageByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		
		
	}
	
	public static void flash(WebElement element , WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String bgcolour=element.getCssValue("backgroundColour");
		
		for(int i=0;i<10;i++) {
			changeColour("#000000", element,driver);
			changeColour(bgcolour , element , driver);		
		}
		
	}
	
	public static void changeColour(String colour , WebElement element , WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + colour + "'" ,element);
		
		try {
			Thread.sleep(20);
		}catch(Exception e) {}
		
	}
	

}
