package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	WebDriver dr;
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
//This is to manage exception "element not found" and waits to check for element in DOM. 
//This happens when page is unavailable to perform the action.		
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
//to Close a pop window using'x' tagname 'button' and attribute 'class'		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
// Click on MegaMenu 'Men' to see the options on website flipKart. Actions are for mouse related activities		
		Actions act=new Actions(dr);
		
//build() & perform() are required for Actions class to execute		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
//Explicit Wait	for price drag an drop option on webpage
		WebDriverWait wait=new WebDriverWait(dr,5);
//		act.dragAndDropBy(source, xOffset, yOffset)
//This is for left drag		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
//		Thread.sleep(2000);
//This is for right drag		
//		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
		
//Explict wait given for a shirt selection on page
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='_3togXc']"))).click();
		
		
	}
}
