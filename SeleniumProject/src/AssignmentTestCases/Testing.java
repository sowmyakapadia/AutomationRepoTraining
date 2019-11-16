package AssignmentTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testing {
	WebDriver dr;
//	String name="sowmya29";
//	String password="sowmya29";
	@Test
	public void launchPage()
	{
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
			
	}
	@Test
	public void login()
	{
		dr.get("http://newtours.demoaut.com/");
		WebElement name=dr.findElement(By.xpath("//input[@name='userName']"));
		name.sendKeys("sowmya29");
		WebElement password=dr.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("sowmya29");
		dr.findElement(By.xpath("//input[@name='login']")).click();
			
		By page1=By.xpath("//input[@value='roundtrip']");
		boolean result1= validation(page1);
		Assert.assertEquals(true, result1);
		
		}

	@Test
	public void owayopass()
	{
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		oneway.click();
		System.out.println(oneway.isSelected());
		
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel1 =new Select(pass);
		sel1.selectByVisibleText("1");
		
		WebElement depart = dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel2=new Select(depart);
		sel2.selectByVisibleText("Seattle");
		
		WebElement departmnth=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select sel3=new Select(departmnth);
		sel3.selectByVisibleText("August");
		
		WebElement departday=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select sel4=new Select (departday);
		sel4.selectByVisibleText("26");
		
		WebElement arrive =dr.findElement(By.xpath("//select[@name='toPort']"));
		Select sel5=new Select(arrive);
		sel5.selectByVisibleText("Zurich");
		
		WebElement returnmth=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select sel6=new Select(returnmth);
		sel6.selectByVisibleText("April");
		
		WebElement returnday=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select sel7=new Select(returnday);
		sel7.selectByVisibleText("15");
		
		WebElement serclass=dr.findElement(By.xpath("//input[@value='First']"));
		System.out.println(serclass.isSelected());
		serclass.click();
		System.out.println(serclass.isSelected());
		
		WebElement airline=dr.findElement(By.xpath("//select[@name='airline']"));
		Select sel8=new Select(airline);
		sel8.selectByVisibleText("Unified Airlines");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		By page2= By.xpath("//input[@name='outFlight']");
		boolean result2=validation(page2);
		Assert.assertEquals(true, result2);
		
		WebElement departAir=dr.findElement(By.xpath("//input[@value='Pangea Airlines$762$126$9:17']"));
		System.out.println(departAir.isSelected());
		departAir.click();
		System.out.println(departAir.isSelected());
		
		WebElement returnAir=dr.findElement(By.xpath("//input[@value='Unified Airlines$673$157$18:44']"));
		System.out.println(returnAir.isSelected());
		returnAir.click();
		System.out.println(returnAir.isSelected());
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		By page3=By.xpath("//input[@name='passFirst0']");
		boolean result3=validation(page3);
		Assert.assertEquals(true, result3);
		
		
	
	}
	
	public boolean validation(By element)
	{
		int size=dr.findElements(element).size();
		if (size>0)
		{
			return true;
		}else{
			return false;
		}
	}
}
