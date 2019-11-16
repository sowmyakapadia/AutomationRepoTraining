package AssignmentTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC2_OTripOnePass {
	WebDriver dr;
//	String name="sowmya29";
//	String password="sowmya29";
	@Test
	public void launchPage()
	{
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
			
	}
	@Test
	public void login()
	{
		dr.get("http://newtours.demoaut.com/");
		WebElement name=dr.findElement(By.xpath("//input[@name='userName']"));
		name.sendKeys("sowmya29");
		WebElement password=dr.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("sowmya29");
		dr.findElement(By.xpath("//input[@name='login']")).click();
			
		By page1=By.xpath("//input[@value='roundtrip']");
		boolean result1= validation(page1);
		Assert.assertEquals(true, result1);
		
		}

	@Test
	public void owayopass()
	{
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected());
		oneway.click();
		System.out.println(oneway.isSelected());
		
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel1 =new Select(pass);
		sel1.selectByVisibleText("1");
		
		WebElement depart = dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel2=new Select(depart);
		sel2.selectByVisibleText("Seattle");
		
		WebElement departmnth=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select sel3=new Select(departmnth);
		sel3.selectByVisibleText("August");
		
		WebElement departday=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select sel4=new Select (departday);
		sel4.selectByVisibleText("26");
		
		WebElement arrive =dr.findElement(By.xpath("//select[@name='toPort']"));
		Select sel5=new Select(arrive);
		sel5.selectByVisibleText("Zurich");
		
		WebElement returnmth=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select sel6=new Select(returnmth);
		sel6.selectByVisibleText("April");
		
		WebElement returnday=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select sel7=new Select(returnday);
		sel7.selectByVisibleText("15");
		
		WebElement serclass=dr.findElement(By.xpath("//input[@value='First']"));
		System.out.println(serclass.isSelected());
		serclass.click();
		System.out.println(serclass.isSelected());
		
		WebElement airline=dr.findElement(By.xpath("//select[@name='airline']"));
		Select sel8=new Select(airline);
		sel8.selectByVisibleText("Unified Airlines");
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		
//FLight selection page		
		By page2= By.xpath("//input[@name='outFlight']");
		boolean result2=validation(page2);
		Assert.assertEquals(true, result2);
		
		WebElement departAir=dr.findElement(By.xpath("//input[@value='Pangea Airlines$762$126$9:17']"));
		System.out.println(departAir.isSelected());
		departAir.click();
		System.out.println(departAir.isSelected());
		
		WebElement returnAir=dr.findElement(By.xpath("//input[@value='Unified Airlines$673$157$18:44']"));
		System.out.println(returnAir.isSelected());
		returnAir.click();
		System.out.println(returnAir.isSelected());
		
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		By page3=By.xpath("//input[@name='passFirst0']");
		boolean result3=validation(page3);
		Assert.assertEquals(true, result3);
		
//Passenger details page		
		WebElement fName=dr.findElement(By.xpath("//input[@name='passFirst0']"));
		fName.sendKeys("Sowmya");
		
		WebElement lName=dr.findElement(By.xpath("//input[@name='passLast0']"));
		lName.sendKeys("Shetty");
		
		WebElement meal=dr.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select m1=new Select(meal);
		m1.selectByVisibleText("Low Calorie");
		
		WebElement cc=dr.findElement(By.xpath("//select[@name='creditCard']"));
		Select cc1=new Select(cc);
		cc1.selectByVisibleText("Visa");
		
		WebElement ccNum=dr.findElement(By.xpath("//input[@name='creditnumber']"));
		ccNum.sendKeys("123456789000");
		
		WebElement ccXmnth=dr.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		Select ccxm=new Select (ccXmnth);
		ccxm.selectByVisibleText("10");
		
		WebElement ccXyr=dr.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		Select ccxy=new Select(ccXyr);
		ccxy.selectByVisibleText("2006");
		
		WebElement ccFName=dr.findElement(By.xpath("//input[@name='cc_frst_name']"));
		ccFName.sendKeys("Sowmya");
		
		WebElement ccMName=dr.findElement(By.xpath("//input[@name='cc_mid_name']"));
		ccMName.sendKeys("Vishwanath");
		
		WebElement ccLName=dr.findElement(By.xpath("//input[@name='cc_last_name']"));
		ccLName.sendKeys("Shetty");
		
		WebElement cBox=dr.findElement(By.xpath("//input[@name='ticketLess']"));
		System.out.println(cBox.isSelected());
		cBox.click();
		
		WebElement billAdd1=dr.findElement(By.xpath("//input[@name='billAddress1']"));
		billAdd1.clear();
		billAdd1.sendKeys("billing address 1");
		
		WebElement billAdd2=dr.findElement(By.xpath("//input[@name='billAddress2']"));
		billAdd2.clear();
		billAdd2.sendKeys("billing address 2");
		
		WebElement billCity=dr.findElement(By.xpath("//input[@name='billCity']"));
		billCity.clear();
		billCity.sendKeys("New York");
		
		WebElement billState=dr.findElement(By.xpath("//input[@name='billState']"));
		billState.clear();
		billState.sendKeys("NY");
		
		WebElement pCode=dr.findElement(By.xpath("//input[@name='billZip']"));
		pCode.clear();
		pCode.sendKeys("55555");
		
		WebElement billCountry=dr.findElement(By.xpath("//select[@name='billCountry']"));
		Select country=new Select(billCountry);
		country.selectByVisibleText("UNITED KINGDOM");
//Handle Alert message for choosing country other than US
		
//		Alert alertwin=dr.switchTo().alert();
//		System.out.println(alertwin.getText());
//		alertwin.accept();
		
		dr.findElement(By.xpath("//input[@src='/images/forms/purchase.gif']")).click();
		
		By page4 =By.xpath("//img[@src='/images/nav/logo.gif']");
		boolean result4=validation(page4);
		Assert.assertEquals(true, result4);
	}
	
	public boolean validation(By element)
	{
		int size=dr.findElements(element).size();
		if (size>0)
		{
			return true;
		}else{
			return false;
		}
	}
	
	}
