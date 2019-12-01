package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import configuration.Config;
import library.applicationLibrary;
import pages.pages;
import utilities.Xls_Reader;

public class TC_NewTours_LoginSignOff {
	
//creating global variables
	
//we create WebDriver object as the WebDriver launch browser can launch any browser if we give
//All browser drivers classes (chrome, firefox, ect, implement WebDriver Interface so we 
//dont declare specific drivers such as ChromeDriver, FireFox Driver etc
	WebDriver dr;
	applicationLibrary lib;
	pages pages;
	Xls_Reader xl;
	
	@BeforeClass
	public void Setup() throws IOException
	{
//creating an object of application Library and initailizing it with lib
		lib=new applicationLibrary();
		
//Calling launch browser from application library initialised in lib that returns 
// a WebDriver obj saved in application lib and this Webdriver reference is saved in dr		
		dr=lib.launchBrowser("Chrome");
//creating object of pages constructor and pass it the reference of the WebDriver(dr) 
//**check the constructor "page" and its parameter.
		pages=new pages(dr);
		
//Creating an object of XLs_Reader and initialising XL reader
		xl=new Xls_Reader(Config.testDataPath);
		
//To ensure that the WebDriver reference returns a correct browser. So incase the
		Assert.assertNotNull(dr);
//calling function to take screen shot
		//lib.captureScreenShot(dr, "Launch Browser");
						
	}
	@Test
	public void logintest() throws IOException{
//To navigate to application user "get function" call "config" class and its final static
//variable "url". Check "Config.java" class under Framework project
		dr.get(Config.url);
		
//To Login to URL launched through "Config.url", we create a string return type "ret" and first
//Step 1: call homepage instance vairalble within pages class(pages.HomePage). This will launch the homepage		
//Step2: call "config" class and its final static variable "globalusername", "globalpassword"
//the values stored in these variables are passed into webpages login and pwd textboxes	
	String ret=pages.HomePage.login(Config.globalUsername, Config.globalPassword);
	
//To validation successful login i.e. next page title verification
	
	Assert.assertEquals(ret, "Find a Flight: Mercury Tours:");
	lib.captureScreenShot(dr, "login");
	
	}
	
	@Test(dependsOnMethods={"logintest"})
	public void logout() throws IOException{
//click on signoff button which is a method defined in Flight finder class whose
//	instance is created within pages class
		pages.flightFinder.signOff();
		
//Validation using webelement
		boolean ret=lib.isElementPresent(dr,pages.HomePage.username);
		Assert.assertEquals(ret, true);
		lib.captureScreenShot(dr, "logout");
	}
	
	@AfterClass
	public void tearDown()
	{
		
	}
}
