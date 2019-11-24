package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardAction {
	
	WebDriver dr;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		
		Action key;
		Actions mouse=new Actions(dr);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).sendKeys(Keys.ESCAPE);
		mouse.moveToElement(dr.findElement(By.xpath("//div[@class='_2aUbKa']"))).build().perform();
//		dr.findElement(By.xpath("//div[@class='_2aUbKa']")).sendKeys(Keys.ENTER);
//		mouse.keyDown(dr.findElement(By.xpath("//div[@class='_2aUbKa']")), Keys.PAGE_DOWN);
		
//		mouse.contextClick(dr.findElement(By.xpath("//a[text()='Login & Signup']")));
//		mouse.clickAndHold(dr.findElement(By.xpath("//input[@name='q']")));
		
	}

}
