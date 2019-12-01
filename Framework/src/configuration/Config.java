package configuration;

public class Config {
	
//Initializing variables with final keyword so that they aren't re-initialized
//	anywhere again since they will bee reused throughout the project
	public final static String url="http://newtours.demoaut.com/";
	public final static String globalUsername="mercury";
	public final static String globalPassword="mercury";
	public final static String testDataPath=System.getProperty("user.dir")+"\\src\\testData\\TestData.xls";
	public final static String chromeDriverPath=System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe";
	public final static String firefoxPath=System.getProperty("user.dir")+"\\BrowserDriver\\geckodriver.exe";
	public final static String iePath=System.getProperty("user.dir")+"\\BrowserDriver\\IEDriverServer.exe";
	public final static String screenshotPath=System.getProperty("user.dir")+"\\src\\ScreenShot\\";
//
//	Running the below main function will ensure that correct test data file and chrome.exe path is shown	
//	public static void main(String[] args) {
//		System.out.println(testDataPath);
//		System.out.println(chromeDriverPath);
//	}
}
