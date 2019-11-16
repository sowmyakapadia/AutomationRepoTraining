package AssignmentTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC5_RTripTwoPass {

	WebDriver dr;
	
	public void launchWP()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		
	}
	
	public void login()
	{
		WebElement uname=dr.findElement(By.xpath("//input[@name='userName']"));
		uname.sendKeys("sowmya29");
		WebElement pword=dr.findElement(By.xpath("//input[@name='password']"));
		pword.sendKeys("sowmya29");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		
		By pg1=By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");
		boolean res1=nxtpageverify(pg1);
		Assert.assertEquals(true, res1);
	}
	
	public void rwayopass() 
	{
		WebElement rway=dr.findElement(By.xpath("//input[@name='tripType']"));
		System.out.println(rway.isSelected());
		
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel1=new Select(pass);
		sel1.selectByVisibleText("2");
		
		WebElement depart=dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel2=new Select(depart);
		sel2.selectByVisibleText("London");
		
		WebElement departmnth=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select sel3=new Select(departmnth);
		sel3.selectByVisibleText("September");
		
		WebElement departday=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select sel4=new Select(departday);
		sel4.selectByVisibleText("16");
		
		WebElement arrive=dr.findElement(By.xpath("//select[@name='toPort']"));
		Select sel5=new Select(arrive);
		sel5.selectByVisibleText("Frankfurt");
		
		WebElement returnmnt=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select sel6=new Select(returnmnt);
		sel6.selectByVisibleText("December");
		
		WebElement returnday=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select sel7=new Select(returnday);
		sel7.selectByVisibleText("20");
		
		WebElement serclass=dr.findElement(By.xpath("//input[@value='First']"));
		System.out.println(serclass.isSelected());
		serclass.click();
		System.out.println(serclass.isSelected());
		
		WebElement airline=dr.findElement(By.xpath("//select[@name='airline']"));
		Select sel8=new Select(airline);
		sel8.selectByVisibleText("Blue Skies Airlines");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
//Next page validation using image 			
		By pg1=By.xpath("//img[@src='/images/masts/mast_selectflight.gif']");
		boolean res1=nxtpageverify(pg1);
		Assert.assertEquals(true, res1);
		
		WebElement outflight=dr.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		System.out.println(outflight.isSelected());
		outflight.click();
		
		WebElement inflight=dr.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']"));
		System.out.println(inflight.isSelected());
		inflight.click();

		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
//next page validation
		By pg2 = By.xpath("//img[@src='/images/masts/mast_book.gif']");
		boolean res2=nxtpageverify(pg2);
		Assert.assertEquals(true, res2);
		
		WebElement fname=dr.findElement(By.xpath("//input[@name='passFirst0']"));
		fname.sendKeys("Ishnavi");
		
		WebElement lname=dr.findElement(By.xpath("//input[@name='passLast0']"));
		lname.sendKeys("Kapadia");
		
		WebElement mPref=dr.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select meal=new Select(mPref);
		meal.selectByVisibleText("Kosher");
		
		WebElement fname1=dr.findElement(By.xpath("//input[@name='passFirst1']"));
		fname1.sendKeys("Ira");
		
		WebElement lname1=dr.findElement(By.xpath("//input[@name='passLast1']"));
		lname1.sendKeys("Kapadia");
		
		WebElement mPref1=dr.findElement(By.xpath("//select[@name='pass.1.meal']"));
		Select meal1=new Select(mPref1);
		meal1.selectByVisibleText("Kosher");
		
		WebElement Ccard=dr.findElement(By.xpath("//select[@name='creditCard']"));
		Select cc=new Select(Ccard);
		cc.selectByVisibleText("Diners Club");
		
		WebElement ccNum=dr.findElement(By.xpath("//input[@name='creditnumber']"));
		ccNum.clear();
		ccNum.sendKeys("999999999999");
		
		WebElement cardXmnth=dr.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		Select ccxm=new Select(cardXmnth);
		ccxm.selectByVisibleText("08");
		
		WebElement cardXyr=dr.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		Select ccxy=new Select(cardXyr);
		ccxy.selectByVisibleText("2010");
		
		WebElement ccfname=dr.findElement(By.xpath("//input[@name='cc_frst_name']"));
		ccfname.sendKeys("Ishnavi");
		
		WebElement ccmname=dr.findElement(By.xpath("//input[@name='cc_mid_name']"));
		ccmname.sendKeys("Kapadia");
		
		WebElement cclname=dr.findElement(By.xpath("//input[@name='cc_last_name']"));
		cclname.sendKeys("Kapadia");
		
		WebElement ticketless=dr.findElement(By.xpath("//input[@name='ticketLess']"));
		System.out.println(ticketless.isSelected());
		ticketless.click();
		
		WebElement billAdd1=dr.findElement(By.xpath("//input[@name='billAddress1']"));
		billAdd1.clear();
		billAdd1.sendKeys("ticketless travel address 1");
				
		WebElement billAdd2=dr.findElement(By.xpath("//input[@name='billAddress2']"));
		billAdd2.clear();
		billAdd2.sendKeys("ticketless travel address 2");
		
		WebElement billcity=dr.findElement(By.xpath("//input[@name='billCity']"));
		billcity.clear();
		billcity.sendKeys("Texas");
		
		WebElement billstate=dr.findElement(By.xpath("//input[@name='billState']"));
		billstate.clear();
		billstate.sendKeys("TX");
		
		WebElement pcode=dr.findElement(By.xpath("//input[@name='billZip']"));
		pcode.clear();
		pcode.sendKeys("12121");
		
		WebElement country=dr.findElement(By.xpath("//select[@name='billCountry']"));
		Select billcountry= new Select(country);
		billcountry.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
		
//		Alert alert=dr.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		WebElement delAdd1=dr.findElement(By.xpath("//input[@name='delAddress1']"));
		delAdd1.clear();
		delAdd1.sendKeys("Billing address 1");
				
		WebElement delAdd2=dr.findElement(By.xpath("//input[@name='delAddress2']"));
		delAdd2.clear();
		delAdd2.sendKeys("Billing address 2");
		
		WebElement dcity=dr.findElement(By.xpath("//input[@name='delCity']"));
		dcity.clear();
		dcity.sendKeys("Wisconson");
		
		WebElement delstate=dr.findElement(By.xpath("//input[@name='delState']"));
		delstate.clear();
		delstate.sendKeys("WS");
		
		WebElement dpcode=dr.findElement(By.xpath("//input[@name='delZip']"));
		dpcode.clear();
		dpcode.sendKeys("56565");
		
		WebElement dcountry=dr.findElement(By.xpath("//select[@name='delCountry']"));
		Select dcount= new Select(dcountry);
		dcount.selectByVisibleText("UGANDA");
		
		Alert alt=dr.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		By pg3=By.xpath("//img[@src='/images/masts/mast_confirmation.gif']");
		boolean res3=nxtpageverify(pg3);
		Assert.assertEquals(true, res3);
		
		dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
		
		By pg4=By.xpath("//img[@src='//img[@src='/images/masts/mast_signon.gif']']");
		boolean res4=nxtpageverify(pg4);
		Assert.assertEquals(true, res4);
	}
	
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
