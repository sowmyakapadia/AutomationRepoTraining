package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
//Add Testng Library and not JUnit
//Import Annotations	
	@Test
public void test() throws InterruptedException
	{
//This is standard key "webdriver.chrome.driver"for launching Chrome browser that
//This is the path "D:\\Drivers\\chromedriver.exe" where the Chrome.exe is on local D:\\Drive.
//This has to be in value "System.setProperty(key, value)"
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
//We are creating object of ChromeDriver extracted from SeleniumHQ>Download>ChromeDriver
//and saved in JarFiles. 
//We need to import these as these classes imported from Selenium by hovering mouse over"ChromeDriver"
//This class has the constructor which has the logic to run and launch browser	
		ChromeDriver dr =new ChromeDriver();
		
//this will maximise the launched browser		
		dr.manage().window().maximize();
		
//This "get" helps navigate to specific website		
		dr.get("http://newtours.demoaut.com/");
		
//find specific web element using locators.Delete (by)and Hover mouse over findElement and select option (By by)WebElement
//By.name is a class that gives you option to select your locator. As name is the unique locator
//we use that. Copy the attribute "userName" as it is from DOM (pg u get when u right click on webpage)	
//CReated a webElement as the return type for findElement is "WebElement"
//in this we create a varible username to store the values we get from findElement(By.name("userName"))		
		WebElement username =dr.findElement(By.name("userName"));
//We get methods within the interface "WebElement"		
		username.sendKeys("mercury");

//This will clear the username field and re-enter
//		Thread.sleep(3000);
//		username.clear();
//		Thread.sleep(3000);
//		username.sendKeys("mercury");
		
		WebElement password =dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		
//this is for Signin button on webpage		
		WebElement signin =dr.findElement(By.name("login"));
		signin.click();
		
//This helps close the browser		
//		dr.close();
	}
}
