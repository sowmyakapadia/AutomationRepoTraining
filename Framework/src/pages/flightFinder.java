package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  flightFinder{
	
WebDriver dr;
	
	public flightFinder(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public By oneWaytripTYpe=By.xpath("//input[@value='oneway']");
	public By signOff=By.xpath("//a[text()='SIGN-OFF']");
	
	
	public boolean selectOneWay()
	{
		dr.findElement(oneWaytripTYpe).click();
		return dr.findElement(oneWaytripTYpe).isSelected();
		
	}
	
	public void signOff()
	{
		dr.findElement(signOff).click();
	}
}
