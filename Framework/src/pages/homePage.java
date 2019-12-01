package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import library.applicationLibrary;

public class homePage {
	
	WebDriver dr;
	pages page;
	
	applicationLibrary lib= new applicationLibrary();
//	creating a constructor homepage
	public homePage(WebDriver dr)
	{
		this.dr=dr;
	}
//	"userName", "password" & "login" are name attributes we get from DOM on inspecting Webpage
	public By username=By.name("userName");
	public By password=By.name("password");
	public By login=By.name("login");
//	By triptype=By.xpath("//input[@value='roundtrip']");
	
	public String login(String Username, String Password)
	{
		dr.findElement(this.username).sendKeys(Username);
		dr.findElement(this.password).sendKeys(Password);
		dr.findElement(login).click();
//In return you can give any web-element on the next page such as a field or image		
		return dr.getTitle();
		
//	dr.findElement(this.triptype);
//	System.out.println(triptype.isSelected());
//	return triptype ;
		
	}
	
	public WebElement login1(String Username, String Password)
	{
		dr.findElement(this.username).sendKeys(Username);
		dr.findElement(this.password).sendKeys(Password);
		dr.findElement(login).click();
		return dr.findElement(page.flightFinder.signOff);		
	}
	
	
	public boolean isUserNamePreset()
	{
		return lib.isElementPresent(dr, username);
	}
	
	
}
