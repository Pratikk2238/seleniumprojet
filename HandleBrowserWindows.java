package Mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//how to get the id of the browser window
		//getWindowHandle()
		//String windowid=driver.getWindowHandle();
		//System.out.println(windowid);//CDwindow-224479AF26AA91F7179FDC8353928620
		                              // CDwindow-3DA34B1456206D5732542CA64EB2EC41 everytime widow id will be differnt
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		//getWindowHandles()
		Set<String> windowids=driver.getWindowHandles();//returns ids of multiple windows
		// first methods  SET COLLECTiONs
		
		/*Iterator<String> it	= windowids.iterator();
		String parentwid=it.next();
		String childwid=it.next();		
		System.out.println(parentwid);
		System.out.println(childwid);*/
		
		//SECOnd method using List/ArrayList
		List<String> windowList=new ArrayList(windowids);//converting set into list
		
		/*String parentwid=windowList.get(0);
		String childwid=windowList.get(1);*/
		
		/*System.out.println(parentwid);
		System.out.println(childwid);
		
// how to use window ids for switching purpose
		driver.switchTo().window(parentwid);
		System.out.println("parent window title " +driver.getTitle());
		
		driver.switchTo().window(childwid);
		System.out.println("child window title " +driver.getTitle());*/
		
		//for each loop
		
		for(String winids:windowList)
		{
			
			//System.out.println(winids);
			String title =driver.switchTo().window(winids).getTitle();
			System.out.println(title);
			
			
		}
		
		//driver.close();//will close single window where the driver is pointing
		               // here it will close child window
		//driver.quit();// both the windows will close, close all the browser windows
		
		// to close specific window
		
   for(String winids:windowList)
		{
			
			//System.out.println(winids);
			String title =driver.switchTo().window(winids).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				
				driver.close();
				
				}
			//System.out.println(title);
			
			
		}
		
	}

}
