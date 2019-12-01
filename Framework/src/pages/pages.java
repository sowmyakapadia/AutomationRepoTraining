package pages;

import org.openqa.selenium.WebDriver;

public class pages {
	
	WebDriver dr;
//	Creating instance variable/object of "homepage" which can hold objects within homepage class
//	public int a; where int is datatype and a reference
	public homePage HomePage;
	public flightFinder flightFinder;
	public selectFlight selectflight;
	public bookAFlight bookAFlight;
	public flightConfirmtion flightConfirmtion;

	
//creating constructor of pages which is has Webdriver as its parameter
	public pages(WebDriver dr)
	{
//	we are passing the value from homepage constructor class into variable "HomePage".
	HomePage =new homePage(dr);
	flightFinder=new flightFinder(dr);
	selectflight = new selectFlight(dr);
	bookAFlight = new bookAFlight(dr);
	flightConfirmtion=new flightConfirmtion(dr);
	}	
}