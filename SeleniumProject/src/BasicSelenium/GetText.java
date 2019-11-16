package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText {
	WebDriver dr;
	
	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
//To get dynamic text from website
		String date=dr.findElement(By.xpath("//td/font[@face='Arial, Helvetica, sans-serif, Verdana']/b")).getText();
		System.out.println(date);
	}
}
