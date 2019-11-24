package AssignmentTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_flipKart {

	WebDriver dr;
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
//Explicit wait
		WebDriverWait wait= new WebDriverWait(dr, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _29YdH8']"))).click();
//Sign-up option
//		dr.findElement(By.xpath("//div[@class='dHGf8H'][1]")).click();
//		dr.findElement(By.xpath("//div[@class='V7ZJ4E']")).click();
//		WebElement mobileno=dr.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
//		mobileno.sendKeys("9960606445");

//Mouse Hover option for Women
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Women']"))).build().perform();
		dr.findElement(By.xpath("//a[text()='Heels']")).click();
		
		
//drag n drop
		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 67, 0).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='_3aQU3C'])[2]")));
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -80, 0).build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='_3togXc'])[3]"))).click();
	}

}
