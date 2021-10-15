package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.readConfigProperties;

public class BaseHooks {
	
	public static WebDriver driver;
	public AmzHomePage homeObj;
	public AmzProductListingPage listPageObj;
	public AmzProductPage prodPageObj;
	public readConfigProperties ocfg=new readConfigProperties("test");
	
	@BeforeMethod
	public void startBrowser()
	{
		String userDirPath=System.getProperty("user.dir");
		if(ocfg.getBrowserType().equalsIgnoreCase("chrome"))
		{
	    System.setProperty(ocfg.getBrowserDriver(),userDirPath+ocfg.getChromeDriverPath());
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("\n "+ocfg.getBrowserType()+" Browser Lauched !!!");
		}
		else if(ocfg.getBrowserType().equalsIgnoreCase("fireFox"))
		{
	    System.setProperty(ocfg.getBrowserDriver(),userDirPath+ocfg.getGekoDriverPath());
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    System.out.println("\n "+ocfg.getBrowserType()+" Browser Lauched !!!");
		}
		else if(ocfg.getBrowserType().equalsIgnoreCase("IE"))
		{
	    System.setProperty(ocfg.getBrowserDriver(),userDirPath+ocfg.getIExplorerDriverPath());
	    driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
		System.out.println("\n "+ocfg.getBrowserType()+" Browser Lauched !!!");	
		}
		else
		{
			System.out.println("Browser Type Not found!!!..");
		}
		
		driver.get(ocfg.getAppUrl());
		homeObj=new AmzHomePage(driver);
		if(homeObj.verifyHomePageLogo())
		{
		System.out.println("\n"+driver.getTitle()+" Home Page loaded successfully!!..");
		listPageObj=new AmzProductListingPage(driver);
		prodPageObj=new AmzProductPage(driver);
		}
		else
		{
		System.out.println("\nFailed to load Home Page!!..");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			System.out.println("\nBrowser Closed!!");
		}
	}
	
}