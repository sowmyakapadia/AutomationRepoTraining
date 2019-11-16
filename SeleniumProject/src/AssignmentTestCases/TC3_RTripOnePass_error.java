package AssignmentTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TC3_RTripOnePass_error {
	WebDriver dr;
	
//Creating object of Class TC1_LoginLogout to call the login and launch webpage function	
//	TC1_LoginLogout obj=new TC1_LoginLogout();
		
	public void launchwebpage()
	{
//		obj.LaunchWebpage();
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
	}
		
	public void Login()
	{	
		dr.get("http://newtours.demoaut.com//");
		WebElement uname=dr.findElement(By.xpath("//input[@name='userName']"));
		uname.sendKeys("sowmya29");
		WebElement pword=dr.findElement(By.xpath("//input[@name='password']"));
		pword.sendKeys("sowmya29");
		dr.findElement(By.xpath("//input[@name='//input[@name='login']']")).click();
	}
//		
//	public void rwayopass() 
//	{
//		WebElement rway=dr.findElement(By.xpath("//input[@name='tripType']"));
//		System.out.println(rway.isSelected());
//		
//		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
//		Select sel1=new Select(pass);
//		sel1.selectByVisibleText("1");
//		
//		WebElement depart=dr.findElement(By.xpath("//select[@name='fromPort']"));
//		Select sel2=new Select(depart);
//		sel2.selectByVisibleText("London");
//		
//		WebElement departmnth=dr.findElement(By.xpath("//select[@name='fromMonth']"));
//		Select sel3=new Select(departmnth);
//		sel3.selectByVisibleText("September");
//		
//		WebElement departday=dr.findElement(By.xpath("//select[@name='fromDay']"));
//		Select sel4=new Select(departday);
//		sel4.selectByVisibleText("16");
//		
//		WebElement arrive=dr.findElement(By.xpath(""));
//		Select sel5=new Select(arrive);
//		sel5.selectByVisibleText("Portland");
//		
//		WebElement returnmnt=dr.findElement(By.xpath("//select[@name='toMonth']"));
//		Select sel6=new Select(returnmnt);
//		sel6.selectByVisibleText("December");
//		
//		WebElement returnday=dr.findElement(By.xpath("//select[@name='toDay']"));
//		Select sel7=new Select(returnday);
//		sel7.selectByVisibleText("20");
//		
//		WebElement serclass=dr.findElement(By.xpath("//input[@value='First']"));
//		System.out.println(serclass.isSelected());
//		serclass.click();
//		System.out.println(serclass.isSelected());
//		
//		WebElement airline=dr.findElement(By.xpath("//select[@name='airline']"));
//		Select sel8=new Select(airline);
//		sel8.selectByVisibleText("Blue Skies Airlines");
//		
//		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
////Next page validation using image 			
//		By pg1=By.xpath("//img[@src='/images/masts/mast_selectflight.gif']");
//		boolean res1=nxtpageverify(pg1);
//		Assert.assertEquals(true, res1);
//		
//	}
//	
	public boolean nxtpageverify(By element)
	{
		int size=dr.findElements(element).size();
		if(size>0)
			{
			return true;
			}else{
			return false;
			}
	}
}
