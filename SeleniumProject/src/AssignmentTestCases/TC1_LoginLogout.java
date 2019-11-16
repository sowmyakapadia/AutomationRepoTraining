package AssignmentTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TC1_LoginLogout {
	WebDriver dr;
	String username ="sowmya29";
	String password ="sowmya29";
	
	public void LaunchWebpage()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.manage().window().maximize();
	}

	public void registeration()
	{
	dr.get("http://newtours.demoaut.com/");
	dr.findElement(By.linkText("REGISTER")).click();
	dr.findElement(By.xpath("//input[@name='email']")).sendKeys(username);	
	dr.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	dr.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);
	dr.findElement(By.xpath("//input[@name='register']")).click();
	
	By message=By.xpath("//b[contains(text(),'"+username+"')]");
	boolean result = validation(message);
	Assert.assertEquals(true, result);
	
	}

@Test(dependsOnMethods={"registeration"})
	public void login()
	{
	dr.get("http://newtours.demoaut.com/");
	dr.findElement(By.xpath("//input[@name='userName']")).sendKeys(this.username);
	dr.findElement(By.xpath("//input[@name='password']")).sendKeys(this.password);
	dr.findElement(By.xpath("//input[@name='login']")).click();
	
	By nxtpage = By.xpath("//input[@value='roundtrip']");
	boolean result = validation(nxtpage);
	Assert.assertEquals(true, result);
	
	}

@Test(dependsOnMethods={"login"})
	public void logout()
	{
	dr.findElement(By.linkText("SIGN-OFF")).click();
	
//	By signout=By.xpath("//img[src='/images/nav/logo.gif]");
//	boolean image =validation(signout);
//	Assert.assertEquals(true, image);
	
	}

	public boolean validation(By element)
	{
		int size = dr.findElements(element).size();
		if (size>0)
		{
			return true;
		}else 
			return false;	
	}

}
