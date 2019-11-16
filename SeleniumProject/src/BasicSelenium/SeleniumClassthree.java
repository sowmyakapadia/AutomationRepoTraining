package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClassthree {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		WebElement username =dr.findElement(By.name("userName"));
		username.sendKeys("mercury");
		
		WebElement password =dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement signin =dr.findElement(By.name("login"));
		signin.click();
		
		WebElement oneway =dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		oneway.click();
		System.out.println(oneway.isSelected());
//Dropdown for passenger
		WebElement pass =dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel1=new Select (pass);
		sel1.selectByVisibleText("4");
		
//Dropdown for Departing from
		WebElement depart =dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel=new Select (depart);
		sel.selectByVisibleText("Frankfurt");
		
//Dropdown for Departing month
				WebElement Dmnt =dr.findElement(By.xpath("//select[@name='fromMonth']"));
				Select selm=new Select (Dmnt);
				selm.selectByVisibleText("April");
				
//Dropdown for Departing date
				WebElement Dday =dr.findElement(By.xpath("//select[@name='fromDay']"));
				Select seld=new Select (Dday);
				seld.selectByVisibleText("4");

//Dropdown for Arrival port
				WebElement Aport =dr.findElement(By.xpath("//select[@name='toPort']"));
				Select aport=new Select (Aport);
				aport.selectByVisibleText("Paris");				
		
//Dropdown for Arriving month
				WebElement Amnt =dr.findElement(By.xpath("//select[@name='toMonth']"));
				Select amth=new Select (Amnt);
				amth.selectByVisibleText("July");
				
//Dropdown for Arriving date
				WebElement Aday =dr.findElement(By.xpath("//select[@name='toDay']"));
				Select aday=new Select (Aday);
				aday.selectByVisibleText("12");
				
// Preference Section Radio and dropdown
				WebElement servClass =dr.findElement(By.xpath("//input[@value='Business']"));
				System.out.println(servClass.isSelected());
				servClass.click();
				System.out.println(servClass.isSelected());
				
//Dropdown for Airline
				WebElement Air =dr.findElement(By.xpath("//select[@name='airline']"));
				Select aline=new Select (Air);
				aline.selectByVisibleText("Pangea Airlines");
				
//Click Continue
				WebElement Con1 =dr.findElement(By.name("findFlights"));
				Con1.click();
				
				
				
				
	}

}
