package Mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadPDFfile {

	public static void main(String[] args) {

		String location=System.getProperty("user.dir")+"\\Downloads\\";//set the location
//setting up the preferences
		//for chrome
		/*HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally", true);//this is addtional preferences we have to add for the pdf document	//by default this key is false
		
		preferences.put("download.default_directory", location);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
		
		//for Edge
	/*	HashMap preferences=new HashMap();
		preferences.put("plugins.always_open_pdf_externally", true);//this is addtional preferences we have to add for the pdf document	//by default this key is false
		preferences.put("plugins.always_open_pdf_externally", true);
		preferences.put("download.default_directory", location);
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);*/
		
		//for FireFox
		
		
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);//extra preference for pdf file
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf" );//Mime type of the word file
		profile.setPreference("browser.download.folderList", 2);//0-desktop//1-downloads/2-desired location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(options); 
				
		driver.get("https://file-example.com/en/sample-documents-files/sample-pdf-download");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'table-files\']/tbody/tr[1]/td[3]/a")).click();//this will download file in the default location
		
	}

}
