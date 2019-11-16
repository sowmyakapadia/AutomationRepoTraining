package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewToursBasicTestCases {
//Webdriver is an interface instance initialized it with chrome drive. we are creating
//a global variable "dr" so that every method within the Class can use the same variable
	WebDriver dr;
	String username ="sowmya23";
	String password ="sowmya23";
	
	@BeforeClass
	public void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr =new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	@AfterClass
//Quit will close all the windows opened using Webdriver.
//Close will close only the windows opened using Webdriver.	
	public void closeApplication()
	{
//		dr.quit();
	}
	
	@Test(dependsOnMethods={"registration"})
public void login()
	{
//This will navigate to URL		
		dr.get("http://newtours.demoaut.com/");
//userName is the attiribute/element we gt in DOM using inspect
		WebElement username =dr.findElement(By.name("userName"));
		username.sendKeys(this.username);
		
		WebElement password =dr.findElement(By.name("password"));
		password.sendKeys(this.password);
		
		WebElement signin =dr.findElement(By.name("login"));
		signin.click();
		By logout = By.xpath("//a[text()='SIGN-OFF']");
		boolean res=isElementPresent(logout);
		Assert.assertEquals(true, res);
			
		
	}
//DependsonMethods will ensure that until login method is executed login will not execute	
	@Test(dependsOnMethods={"selectpassengers"})
public void logout()
{
		dr.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		}
	@Test
public void registration()
{	
		dr.get("http://newtours.demoaut.com/");
		
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.name("email")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("confirmPassword")).sendKeys(password);
		
		dr.findElement(By.name("register")).click();
//using by as reference to check username is unique at runtim		
		By message=By.xpath("//b[contains(text(),'"+username +"')]");
//Store the value of message is res		
		boolean res=isElementPresent(message);
//Validation of username is done using assertEquals	
		Assert.assertEquals(true, res);
}
	@Test(dependsOnMethods={"logout"})
public void support()
{
		dr.findElement(By.linkText("SUPPORT")).click();
		
}
	@Test(dependsOnMethods={"login"})
public void selectoneway()
{
		WebElement oneway =dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		oneway.click();
			
}
	@Test(dependsOnMethods={"login","selectoneway"})
public void selectpassengers()
{
		WebElement pass =dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel1=new Select(pass);
		sel1.selectByVisibleText("2");
	}
	
//Making isElementPresent function dynamic	
	public boolean isElementPresent(By element)
	{
	int size =dr.findElements(element).size();
	if(size>0)
	{
		return true;
	}else
		return false;
	}
}
