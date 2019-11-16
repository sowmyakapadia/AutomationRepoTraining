package AssignmentTestCases;

import javax.jws.Oneway;

import org.apache.poi.ss.formula.functions.NumericFunction.OneArg;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TC4_OTripTwoPass {
	
	WebDriver dr;
//	TC_Login login=new TC_Login();
	
	public void launch()
	{
//		login.launchpage();
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
			}
	
	public void login()
	{
//		login.login();
		dr.get("http://newtours.demoaut.com/");
		WebElement name=dr.findElement(By.xpath("//input[@name='userName']"));
		name.sendKeys("sowmya29");
		WebElement password=dr.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("sowmya29");
		dr.findElement(By.xpath("//input[@name='login']")).click();
			
		By page1=By.xpath("//input[@value='roundtrip']");
		boolean result1= pagevalid(page1);
		Assert.assertEquals(true, result1);
		
	}
	
	public void page1()
	{
	
		WebElement onway=dr.findElement(By.xpath("//input[@name='tripType']"));
		System.out.println(onway.isSelected());
		onway.click();
		
		WebElement passno=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select pnum=new Select(passno);
		pnum.selectByVisibleText("2");
		
		WebElement from=dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select dfrom=new Select(from);
		dfrom.selectByVisibleText("Zurich");
		
		WebElement dMonth=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select dmnth=new Select(dMonth);
		dmnth.selectByVisibleText("June");
				
		WebElement dDay=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select dd=new Select(dDay);
		dd.selectByVisibleText("17");
		
		WebElement toport=dr.findElement(By.xpath("//select[@name='toPort']"));
		Select dest=new Select(toport);
		dest.selectByVisibleText("Sydney");
		
		WebElement tMonth=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select arrmnth=new Select(tMonth);
		arrmnth.selectByVisibleText("May");
				
		WebElement tDay=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select arrday=new Select(tDay);
		arrday.selectByVisibleText("17");
		
		WebElement flightclass=dr.findElement(By.xpath("//input[@value='First']"));
		System.out.println(flightclass.isSelected());
		flightclass.click();
		
		WebElement flightpref=dr.findElement(By.xpath("//select[@name='airline']"));
		Select fpref=new Select(flightpref);
		fpref.selectByVisibleText("Pangea Airlines");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		By p1=By.xpath("//img[@src='/images/masts/mast_selectflight.gif']");
		boolean pres1=pagevalid(p1);
		Assert.assertEquals(true, pres1);
		
		WebElement dAirline=dr.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		System.out.println(dAirline.isSelected());
		dAirline.click();
		
		WebElement rAirline=dr.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
		System.out.println(rAirline.isSelected());
		rAirline.click();
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		By p2=By.xpath("//img[@src='/images/masts/mast_book.gif']");
		boolean pres2=pagevalid(p2);
		Assert.assertEquals(true, pres2);
		
		WebElement fname=dr.findElement(By.xpath("//input[@name='passFirst0']"));
		fname.sendKeys("Ira");
		
		WebElement lname=dr.findElement(By.xpath("//input[@name='passLast0']"));
		lname.sendKeys("Kapadia");
		
		WebElement meal=dr.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select mpref=new Select(meal);
		mpref.selectByVisibleText("Vegetarian");
		
		WebElement fname1=dr.findElement(By.xpath("//input[@name='passFirst1']"));
		fname1.sendKeys("Ira");
		
		WebElement lname1=dr.findElement(By.xpath("//input[@name='passLast1']"));
		lname1.sendKeys("Kapadia");
		
		WebElement mPref1=dr.findElement(By.xpath("//select[@name='pass.1.meal']"));
		Select meal1=new Select(mPref1);
		meal1.selectByVisibleText("Kosher");
		
		WebElement crcd=dr.findElement(By.xpath("//select[@name='creditCard']"));
		Select cr=new Select(crcd);
		cr.selectByVisibleText("Visa");
		
		WebElement ccnum=dr.findElement(By.xpath("//input[@name='creditnumber']"));
		ccnum.sendKeys("787856562323");
		
		WebElement ccXmnth=dr.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		Select ccxm=new Select (ccXmnth);
		ccxm.selectByVisibleText("03");
		
		WebElement ccXyr=dr.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		Select ccxy=new Select(ccXyr);
		ccxy.selectByVisibleText("2004");
		
		WebElement ccFName=dr.findElement(By.xpath("//input[@name='cc_frst_name']"));
		ccFName.sendKeys("Ira");
		
		WebElement ccMName=dr.findElement(By.xpath("//input[@name='cc_mid_name']"));
		ccMName.sendKeys("Gautam");
		
		WebElement ccLName=dr.findElement(By.xpath("//input[@name='cc_last_name']"));
		ccLName.sendKeys("Kapadia");
		
		WebElement cBox=dr.findElement(By.xpath("//input[@name='ticketLess']"));
		System.out.println(cBox.isSelected());
		cBox.click();
		System.out.println(cBox.isSelected());
		
		WebElement billAdd1=dr.findElement(By.xpath("//input[@name='billAddress1']"));
		billAdd1.clear();
		billAdd1.sendKeys("This is billing address 1");
		
		WebElement billAdd2=dr.findElement(By.xpath("//input[@name='billAddress2']"));
		billAdd2.clear();
		billAdd2.sendKeys("This billing address 2");
		
		WebElement billCity=dr.findElement(By.xpath("//input[@name='billCity']"));
		billCity.clear();
		billCity.sendKeys("Nevada");
		
		WebElement billState=dr.findElement(By.xpath("//input[@name='billState']"));
		billState.clear();
		billState.sendKeys("NJ");
		
		WebElement pCode=dr.findElement(By.xpath("//input[@name='billZip']"));
		pCode.clear();
		pCode.sendKeys("88888");
		
		WebElement billCountry=dr.findElement(By.xpath("//select[@name='billCountry']"));
		Select country=new Select(billCountry);
		country.selectByVisibleText("BAKER ISLAND");

//		WebElement cBox2=dr.findElement(By.xpath("//input[@value='checkbox']"));
////		By text=By.xpath("//input[contains(text(),'"+Billing+""+Address+"')]");
//		System.out.println(cBox2.isSelected());
//		cBox.click();
//		System.out.println(cBox2.isSelected());
		
		WebElement DelAdd1=dr.findElement(By.xpath("//input[@name='delAddress1']"));
		DelAdd1.clear();
		DelAdd1.sendKeys("This is Delivery address 1");
		
		WebElement delAdd2=dr.findElement(By.xpath("//input[@name='delAddress2']"));
		delAdd2.clear();
		delAdd2.sendKeys("This Delivery billing address 2");
		
		WebElement delCity=dr.findElement(By.xpath("//input[@name='delCity']"));
		delCity.clear();
		delCity.sendKeys("Iowa");
		
		WebElement delState=dr.findElement(By.xpath("//input[@name='delState']"));
		delState.clear();
		delState.sendKeys("IW");
		
		WebElement dpCode=dr.findElement(By.xpath("//input[@name='delZip']"));
		dpCode.clear();
		dpCode.sendKeys("676767");
		
		WebElement delCountry=dr.findElement(By.xpath("//select[@name='delCountry']"));
		Select dcountry=new Select(delCountry);
		dcountry.selectByVisibleText("SOVIET UNION");
		
		Alert at=dr.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		By confirm=By.xpath("img[@src='/images/masts/mast_confirmation.gif']");
		boolean msg=pagevalid(confirm);
		Assert.assertEquals(true, msg);
	}
	
	
	
	public boolean pagevalid(By nxtpage)
	{
		int size=dr.findElements(nxtpage).size();
		if (size>0)
		{
			return true;
		}else{
			return false;
		}
	}

}
