package library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

import configuration.Config;

public class applicationLibrary {
//	author
//	date
//	descrp

//	creating a method Webdriver
	public WebDriver launchBrowser(String browserName)
	{
//as this is local varialble we need to pass Null. Global Varialble are default Null
		WebDriver dr=null;
//		String browserName = null;
		
		if(browserName.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
		dr =new ChromeDriver();
		dr.manage().window().maximize();
		}else if (browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", Config.iePath);
			dr =new InternetExplorerDriver();
			dr.manage().window().maximize();
		}else if (browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", Config.firefoxPath);
			dr =new FirefoxDriver();
			dr.manage().window().maximize();
		}
		
//		to screen shot of next page
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//This return will return the browser according to the drivers selected i.e dr=chrome/Ie/Firefox
		return dr;
//			else if (browserName.equals("Edge")){
//			System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
//			dr =new EdgeDriver();
//			dr.manage().window().maximize();
//		}else if (browserName.equals("Opera")){
//			System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
//			dr =new OperaDriver();
//			dr.manage().window().maximize();
//		}
	}
	
//	Author:Sowmya 
//	Date:30/11/2019
//	Description: This func will help us check if the element is present
//	parameters: WebDriver instance and by Object
//	Return Value: Boolean
		
	public boolean isElementPresent(WebDriver dr, By element)
	{
	int size =dr.findElements(element).size();
	if(size>0)
	{
		return true;
	}else
		return false;
	}
	

public String captureScreenShot(WebDriver dr, String name) throws IOException
{
	String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	String path=Config.screenshotPath+timestamp+".png";
	
	TakesScreenshot scrShot= (TakesScreenshot) dr;
	File ScrFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile = new File(path);
	FileHandler.copy(ScrFile, DestFile);	
	return path;
	
}
}