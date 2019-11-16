package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClasstwo {
@Test
	public void test() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
			ChromeDriver dr =new ChromeDriver();
			
			dr.manage().window().maximize();
			
			 dr.get("http://newtours.demoaut.com/");
			
			WebElement username =dr.findElement(By.name("userName"));
			username.sendKeys("mercury");
//Alternate way to write 
//dr.findElement(By.name("userName")).click();			
		
			WebElement password =dr.findElement(By.name("password"));
			password.sendKeys("mercury");
			
			WebElement signin =dr.findElement(By.name("login"));
			signin.click();
//for Selection of radio button "trip" from webpage
			WebElement oneway =dr.findElement(By.xpath("//input[@value='oneway']"));
//is selected function checks if oneway webElement is selected			
			System.out.println(oneway.isSelected());
//as this will be false click will check the one way radio button	
			oneway.click();
			System.out.println(oneway.isSelected());
			
//Dropdown WebElement for Passenger field on webpage and relative Xpath from DOM
			WebElement pass =dr.findElement(By.xpath("//select[@name='passCount']"));
			
//creating Objects of Select Class. Import CLass
			Select sel1=new Select (pass);
//This will select the 3rd value as index starts from 0. we can select values in dropdown using Index, value and visibile value		
//<option value="1">1</option> here Index starts always with 0, "1" is value and >1 is visible value
			sel1.selectByIndex(2);
			Thread.sleep(3000);
			sel1.selectByValue("1");
			Thread.sleep(3000);
			sel1.selectByVisibleText("4");

//This will click Continue button and navigate to nxt page. "click()"Click on Continue button to next page		
			dr.findElement(By.xpath("//input[@name='findFlights']")).click();

			dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();

//Checkbox option on page 3 of webpage			
			WebElement ticketless =dr.findElement(By.xpath("//input[@value='checkbox']"));
			System.out.println(ticketless.isSelected());
			ticketless.click();
			System.out.println(ticketless.isSelected());
						
//For alert message displayed on webpage
			WebElement count =dr.findElement(By.xpath("//select[@name='delCountry']"));
			Select sel2=new Select (count);
			sel2.selectByIndex(2);
			
//To give control to alert msg window and check the test displayed 
			Alert alt= dr.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
//to click cancel alt.dismiss() and click ok alt.accept();
	}
}
