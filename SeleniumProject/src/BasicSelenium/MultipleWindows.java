package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MultipleWindows {
	WebDriver dr;
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.naukri.com/");
		
		String parentwin=dr.getWindowHandle();

		
//this gives ID of all windows that have been opened using webdriver 'dr' as naukri website opens 4 windows when 
//opened through wendriver. If we need to switch control to a window other than default	
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins)
		{
//This will shift the control from other windows to parent window. ie. close other			
//			if(!w.equals(parentwin))
//			{
//				dr.switchTo().window(w);
//				dr.close();
//			}
//			System.out.println(w);
		}
//The below is another method of doing the same this		
//		Iterator<String> it =wins.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		System.out.println("**************************");
//		String parentwin=dr.getWindowHandle();
//		System.out.println(parentwin);
//		
		dr.switchTo().window(parentwin);
	}

}
