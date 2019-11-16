package AssignmentTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TC_Login {
	WebDriver dr;
	String username="sowmya29";
	String password="sowmya29";
	
	public void launchpage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
	}
	
	public void login()
	{
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys(this.username);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(this.password);
		dr.findElement(By.xpath("//input[@name='login']")).click();
	}

}
