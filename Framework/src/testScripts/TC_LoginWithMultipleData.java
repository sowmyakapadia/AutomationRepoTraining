package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
import library.applicationLibrary;
import pages.pages;
import utilities.Xls_Reader;

public class TC_LoginWithMultipleData {
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
//		lib.captureScreenShot(dr, "Launch Browser");
						
	}
	@Test(dataProvider="getData")
	public void logintest(String username, String password) throws IOException
	{
		dr.get(Config.url);
		String ret=pages.HomePage.login(username, password);
	
		Assert.assertEquals(ret, "Find a Flight: Mercury Tours:");
		lib.captureScreenShot(dr, "login");
	
		System.out.println(username);
		System.out.println(password);
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
		dr.close();
	}
	
	@DataProvider
	public String[][] getData() throws IOException{
		
		int rows=xl.getRowCount("Login");
		int cols=xl.getColumnCount("Login");
//rows - 1 is coz data is there only in 2 rows minus the header
		String[][]data =new String[rows-1][cols];
		
		for (int r=2; r<=rows; r++)
		{
			for (int c=1; c<=cols; c++){
				data[r-2][c-1]=xl.getCellData("Login", r, c);
		}
		}
		return data;
	}
	
}
