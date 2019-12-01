package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenShots {

	WebDriver dr;
	@Test
	public void test() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.flipkart.com/");
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

//rt click on Basic Selenium Folder/prooerties/location/file name i.e. test.jpg	
		String path="D:\\SeleniumRepoFolder\\AutomationRepoTraining\\SeleniumProject\\src\\BasicSelenium\\test1.jpg";
		
		
		TakesScreenshot scrShot= (TakesScreenshot) dr;
		File ScrFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File(path);
		FileHandler.copy(ScrFile, DestFile);
		
		
	}
	
}
