package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiplwWindow2 {
	WebDriver dr;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.naukri.com/");
		String parentwin=dr.getWindowHandle();
		
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins)
		{
//This will close only Tech Mahindra window			
			dr.switchTo().window(w);
			if(dr.getTitle().equals("Tech Mahindra"))
			dr.close();
		}
		
		dr.switchTo().window(parentwin);
	
	}
}
