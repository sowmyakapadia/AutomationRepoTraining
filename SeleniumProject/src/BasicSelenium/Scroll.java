package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	WebDriver dr;
	@Test
	public void test(){
	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.get("https://www.flipkart.com/");
	
	dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

//Thi is typecast	
	JavascriptExecutor js=(JavascriptExecutor) dr;
	
//This is another alternate to .click when	
	WebElement ele=dr.findElement(By.xpath("//a[text()='Contact Us']"));
		
	js.executeScript("arguments[0].scrollIntoView();", ele);
	ele.click();
	
	}
}
