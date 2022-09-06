package Mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) {
		
		String location=System.getProperty("user.dir")+"\\Downloads\\";
		//chrome
		/*HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
		//above are browser level settings and are different for different browsers

		//Edge 
	/*	HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
	//firefox
		
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/msword" );//Mime type of the word file
		profile.setPreference("browser.download.folderList", 2);//0-desktop//1-downloads/2-desired location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver(options); 
		
		driver.get("https://file-example.com/en/sample-documents-files/sample-doc-download");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();//this will download file in the default location
		
		
		
		
	}

}
