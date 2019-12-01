package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handelIFrame {
	WebDriver dr;
	
	@Test
	public void test() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://paytm.com/");
		
		Thread.sleep(10000);
		dr.findElement(By.xpath("//div[@class='_3ac-']")).click();
	
		Thread.sleep(3000);
//frame in= index value; frame.string=iframe windownname; 		
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
	}

}
